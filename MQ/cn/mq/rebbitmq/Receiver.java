package cn.mq.rebbitmq;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

import org.apache.commons.lang.SerializationUtils;

import com.rabbitmq.client.BasicProperties;
import com.rabbitmq.client.Consumer;
import com.rabbitmq.client.Envelope;
import com.rabbitmq.client.ShutdownSignalException;

public class Receiver extends BaseConnector implements Runnable, Consumer {

    public Receiver(String queueName) throws IOException, TimeoutException {
        super(queueName);
    }

    //实现Runnable的run方法
    public void run() {
         try {
            channel.basicConsume(queueName, true,this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 下面这些方法都是实现Consumer接口的
     **/    
    //当消费者注册完成自动调用
    public void handleConsumeOk(String consumerTag) {
    	System.out.println("*");
        System.out.println("Consumer "+consumerTag +" registered");
    }
    //当消费者接收到消息会自动调用
    public void handleDelivery(String consumerTag, Envelope env,
                BasicProperties props, byte[] body) throws IOException {
    	System.out.println("**");
        MessageInfo messageInfo = (MessageInfo)SerializationUtils.deserialize(body);
        System.out.println("Message ( "
                + "channel : " + messageInfo.getChannel() 
                + " , content : " + messageInfo.getContent() 
                + " ) received.");

    }
    //下面这些方法可以暂时不用理会
    public void handleCancelOk(String consumerTag) {
    }
    public void handleCancel(String consumerTag) throws IOException {
    }
    public void handleShutdownSignal(String consumerTag,
            ShutdownSignalException sig) {
    }
    public void handleRecoverOk(String consumerTag) {
    }

	@Override
	public void handleDelivery(String arg0, Envelope arg1,
			com.rabbitmq.client.AMQP.BasicProperties arg2, byte[] arg3)
			throws IOException {
	}
}