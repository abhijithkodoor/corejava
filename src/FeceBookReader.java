
public class  FeceBookReader implements SocialFeedReader {

	@Override
	public Message pollForNewMessage() {
		Message m=new Message();
		m.setMessageId(1);
		m.setMessageSource("Facebook");
		m.setMessageType("String");
		m.setMessage("Hello all...i am sharing fb status");
		m.setSenderInfo("I am Ibin");
		return m;
	}

}
