interface SocialFeedReader{
	public Message pollForNewMessage();
}
class Message{
	int messageId;
	String messageSource;
	String messageType;
	String message;
	String senderInfo;
	public String getSenderInfo() {
		return senderInfo;
	}
	public void setSenderInfo(String senderInfo) {
		this.senderInfo = senderInfo;
	}
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public String getMessageSource() {
		return messageSource;
	}
	public void setMessageSource(String messageSource) {
		this.messageSource = messageSource;
	}
	public String getMessageType() {
		return messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
class TwitterFeedReader implements SocialFeedReader{

	@Override
	public Message pollForNewMessage() {
		Message m=new Message();
		m.setMessageId(1);
		m.setMessageSource("Twitter");
		m.setMessageType("String");
		m.setMessage("Hello all...i am tweeting");
		m.setSenderInfo("I am Abhijith");
		return m;
	}
	
}
public class InterfaceDemo1 {

	public static void main(String[] args) {
		TwitterFeedReader t=new TwitterFeedReader();
		Message m=t.pollForNewMessage();
		System.out.println(m.getMessageId());
		System.out.println(m.getMessageSource());
		System.out.println(m.getMessageType());
		System.out.println(m.getMessage());
		System.out.println(m.getSenderInfo());

		FeceBookReader t1=new FeceBookReader();
		Message m1=t1.pollForNewMessage();
		System.out.println(m1.getMessageId());
		System.out.println(m1.getMessageSource());
		System.out.println(m1.getMessageType());
		System.out.println(m1.getMessage());
		System.out.println(m1.getSenderInfo());

		
	}

}
