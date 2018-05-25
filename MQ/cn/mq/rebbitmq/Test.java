package cn.mq.rebbitmq;

public class Test {
	 public static void main(String[] args) throws Exception{
//	        Receiver receiver = new Receiver("test_Queue");
//	        Thread receiverThread = new Thread(receiver);
//	        receiverThread.start();
	        Sender sender = new Sender("test_Queue");
	        for (int i = 0; i < 5; i++) {
	            MessageInfo messageInfo = new MessageInfo();
	            messageInfo.setChannel("test");
	            messageInfo.setContent("msg" + i);
	            sender.sendMessage(messageInfo);
	        }
	    }
}
