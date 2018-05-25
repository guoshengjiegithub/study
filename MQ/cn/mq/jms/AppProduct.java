package cn.mq.jms;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

public class AppProduct {
	
	private static final String url="tcp://127.0.0.1:61616";
	private static final String queueName="queue-test";
	
	public static void main(String[] args) throws JMSException {
		//����connectionFactory
		ConnectionFactory factory=new ActiveMQConnectionFactory(url);
		//����connection
		Connection createConnection = factory.createConnection();
		//��������
		createConnection.start();	
		//�����ػ�
		Session session = createConnection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		//����һ��Ŀ��
		Destination destination = session.createQueue(queueName);
		//����һ�������
		MessageProducer producer=session.createProducer(destination);
		
		for(int i=0;i<100;i++){
			//������Ϣ
			TextMessage textMessage=session.createTextMessage("test"+i);
			producer.send(textMessage);
			System.out.println("������Ϣ"+textMessage.getText());
		}
		//�ر�����
		createConnection.close();
	}
}
