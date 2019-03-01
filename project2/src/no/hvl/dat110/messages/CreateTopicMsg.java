package no.hvl.dat110.messages;

public class CreateTopicMsg extends Message {
	
	// TODO: - DONE
	// Implement objectvariables, constructor, get/set-methods, and toString method
	
	private String topic;
	
	public CreateTopicMsg(String user, String topic) {
		super(MessageType.CREATETOPIC, user);
		this.topic = topic;
	}
	
	public String getTopic() {
		return topic;
	}
	
	public void setTopic(String topic) {
		this.topic = topic;
	}
	
	@Override
	public String toString() {
		return getType() + "topic= '" + topic + '\'' + "user: " + getUser() + '}';
	}
}
