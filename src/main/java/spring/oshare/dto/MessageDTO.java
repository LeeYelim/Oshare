package spring.oshare.dto;

public class MessageDTO {
	private int messageNo; // �޼��� ��ȣ
	private String sender; // �۽���
	private String receiver; // ������
	private String content; // ����
	private String sendingDate; // ���� ��¥
	
	
	public MessageDTO() {	}
	public MessageDTO(int messageNo, String sender, String receiver, String content, String sendingDate) {
		super();
		this.messageNo = messageNo;
		this.sender = sender;
		this.receiver = receiver;
		this.content = content;
		this.sendingDate = sendingDate;
	}
	
	
	public int getMessageNo() {
		return messageNo;
	}
	public void setMessageNo(int messageNo) {
		this.messageNo = messageNo;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getSendingDate() {
		return sendingDate;
	}
	public void setSendingDate(String sendingDate) {
		this.sendingDate = sendingDate;
	}
}
