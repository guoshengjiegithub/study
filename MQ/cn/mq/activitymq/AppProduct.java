package cn.mq.activitymq;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

public class AppProduct {
	
	private static final String url="tcp://127.0.0.1:61616";
	private static final String topicName="topic-test";
	
	public static void main(String[] args) throws JMSException {
		//创建connectionFactory
		ConnectionFactory factory=new ActiveMQConnectionFactory(url);
		//创建connection
		Connection createConnection = factory.createConnection();
		//启动链接
		createConnection.start();	
		//创建回话
		Session session = createConnection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		//创建一个目标
		Destination destination = session.createTopic(topicName);
		//创建一个生产者
		MessageProducer producer=session.createProducer(destination);
		
		for(int i=0;i<100;i++){
			//创建消息
			TextMessage textMessage=session.createTextMessage("test"+i);
			producer.send(textMessage);
			System.out.println("发送消息"+textMessage.getText());
		}
		//关闭链接
		createConnection.close();
	}
}
