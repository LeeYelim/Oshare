package spring.oshare.dto;

import org.springframework.web.multipart.MultipartFile;

public class MemberDTO {

	   private int memberNo; // ȸ������ ����?
	   
	   private String memberId; //���̵�
	   
	      private String memberPwd1; //��й�ȣ
	      private String memberPwd2; //��й�ȣ Ȯ��
	   private String memberPwd; //��й�ȣ + ��й�ȣȮ��

	   private String memberName; //�̸�
	   
	      private String memberBirth1; //����
	      private String memberBirth2; // ��
	      private String memberBirth3; // ��
	   private String memberBirth; // ���� + �� + ��
	   
	      private String memberAddr1; // �����ȣ
	      private String memberAddr2; // �ּ�
	      private String memberAddr3; // ���ּ�
	   private String memberAddr; //�����ȣ + �ּ� + ���ּ�
	   
	   private String memberBank; // ī�弱��
	   
	      private String memberAccount1; //ī���ȣ1
	      private String memberAccount2; //ī���ȣ2
	      private String memberAccount3; //ī���ȣ3
	      private String memberAccount4; //ī���ȣ4
	   private String memberAccount; //ī���ȣ 1 + 2 + 3 + 4
	   
	   private int memberValidMonth; //��ȿ�Ⱓ ��
	   
	   private int memberValidYear; //��ȿ�Ⱓ ��
	   
	   private int memberSharingCount; // ���� Ƚ��
	   
	      private String memberPhone1; // ������ȣ
	      private String memberPhone2; // ��ȭ��ȣ1
	      private String memberPhone3; // ��ȭ��ȣ2
	   private String memberPhone; //������ȣ + ��ȭ��ȣ1 + ��ȭ��ȣ2
	   
	   private String fileName;
	   private String fileSize;
	   private MultipartFile file;
	   
	   //Constructor
	   public MemberDTO() {   }   
	   public MemberDTO(int memberNo, String memberId, String memberPwd1, String memberPwd2, String memberPwd,
	      String memberName, String memberBirth1, String memberBirth2, String memberBirth3, String memberBirth,
	      String memberAddr1, String memberAddr2, String memberAddr3, String memberAddr, String memberBank,
	      String memberAccount1, String memberAccount2, String memberAccount3, String memberAccount4,
	      String memberAccount, int memberValidMonth, int memberValidYear, int memberSharingCount, String memberPhone1,
	      String memberPhone2, String memberPhone3, String memberPhone) {
	   super();
	   this.memberNo = memberNo;
	   this.memberId = memberId;
	   this.memberPwd1 = memberPwd1;
	   this.memberPwd2 = memberPwd2;
	   this.memberPwd = memberPwd;
	   this.memberName = memberName;
	   this.memberBirth1 = memberBirth1;
	   this.memberBirth2 = memberBirth2;
	   this.memberBirth3 = memberBirth3;
	   this.memberBirth = memberBirth;
	   this.memberAddr1 = memberAddr1;
	   this.memberAddr2 = memberAddr2;
	   this.memberAddr3 = memberAddr3;
	   this.memberAddr = memberAddr;
	   this.memberBank = memberBank;
	   this.memberAccount1 = memberAccount1;
	   this.memberAccount2 = memberAccount2;
	   this.memberAccount3 = memberAccount3;
	   this.memberAccount4 = memberAccount4;
	   this.memberAccount = memberAccount;
	   this.memberValidMonth = memberValidMonth;
	   this.memberValidYear = memberValidYear;
	   this.memberSharingCount = memberSharingCount;
	   this.memberPhone1 = memberPhone1;
	   this.memberPhone2 = memberPhone2;
	   this.memberPhone3 = memberPhone3;
	   this.memberPhone = memberPhone;
	}
	   //getter/setter
	   public int getMemberNo() {
	      return memberNo;
	   }

	   public void setMemberNo(int memberNo) {
	      this.memberNo = memberNo;
	   }

	   public String getMemberId() {
	      return memberId;
	   }

	   public void setMemberId(String memberId) {
	      this.memberId = memberId;
	   }

	   public String getMemberPwd1() {
	      return memberPwd1;
	   }

	   public void setMemberPwd1(String memberPwd1) {
	      this.memberPwd1 = memberPwd1;
	   }

	   public String getMemberPwd2() {
	      return memberPwd2;
	   }

	   public void setMemberPwd2(String memberPwd2) {
	      this.memberPwd2 = memberPwd2;
	   }

	   public String getMemberPwd() {
	      return memberPwd;
	   }

	   public void setMemberPwd(String memberPwd) {
	      this.memberPwd = memberPwd;
	   }

	   public String getMemberName() {
	      return memberName;
	   }

	   public void setMemberName(String memberName) {
	      this.memberName = memberName;
	   }

	   public String getMemberBirth1() {
	      return memberBirth1;
	   }

	   public void setMemberBirth1(String memberBirth1) {
	      this.memberBirth1 = memberBirth1;
	   }

	   public String getMemberBirth2() {
	      return memberBirth2;
	   }

	   public void setMemberBirth2(String memberBirth2) {
	      this.memberBirth2 = memberBirth2;
	   }

	   public String getMemberBirth3() {
	      return memberBirth3;
	   }

	   public void setMemberBirth3(String memberBirth3) {
	      this.memberBirth3 = memberBirth3;
	   }

	   public String getMemberBirth() {
	      return memberBirth;
	   }

	   public void setMemberBirth(String memberBirth) {
	      this.memberBirth = memberBirth;
	   }

	   public String getMemberAddr1() {
	      return memberAddr1;
	   }

	   public void setMemberAddr1(String memberAddr1) {
	      this.memberAddr1 = memberAddr1;
	   }

	   public String getMemberAddr2() {
	      return memberAddr2;
	   }

	   public void setMemberAddr2(String memberAddr2) {
	      this.memberAddr2 = memberAddr2;
	   }

	   public String getMemberAddr3() {
	      return memberAddr3;
	   }

	   public void setMemberAddr3(String memberAddr3) {
	      this.memberAddr3 = memberAddr3;
	   }

	   public String getMemberAddr() {
	      return memberAddr;
	   }

	   public void setMemberAddr(String memberAddr) {
	      this.memberAddr = memberAddr;
	   }

	   public String getMemberBank() {
	      return memberBank;
	   }

	   public void setMemberBank(String memberBank) {
	      this.memberBank = memberBank;
	   }

	   public String getMemberAccount1() {
	      return memberAccount1;
	   }

	   public void setMemberAccount1(String memberAccount1) {
	      this.memberAccount1 = memberAccount1;
	   }

	   public String getMemberAccount2() {
	      return memberAccount2;
	   }

	   public void setMemberAccount2(String memberAccount2) {
	      this.memberAccount2 = memberAccount2;
	   }

	   public String getMemberAccount3() {
	      return memberAccount3;
	   }

	   public void setMemberAccount3(String memberAccount3) {
	      this.memberAccount3 = memberAccount3;
	   }

	   public String getMemberAccount4() {
	      return memberAccount4;
	   }

	   public void setMemberAccount4(String memberAccount4) {
	      this.memberAccount4 = memberAccount4;
	   }

	   public String getMemberAccount() {
	      return memberAccount;
	   }

	   public void setMemberAccount(String memberAccount) {
	      this.memberAccount = memberAccount;
	   }

	   public int getMemberValidMonth() {
	      return memberValidMonth;
	   }

	   public void setMemberValidMonth(int memberValidMonth) {
	      this.memberValidMonth = memberValidMonth;
	   }

	   public int getMemberValidYear() {
	      return memberValidYear;
	   }

	   public void setMemberValidYear(int memberValidYear) {
	      this.memberValidYear = memberValidYear;
	   }

	   public int getMemberSharingCount() {
	      return memberSharingCount;
	   }

	   public void setMemberSharingCount(int memberSharingCount) {
	      this.memberSharingCount = memberSharingCount;
	   }

	   public String getMemberPhone1() {
	      return memberPhone1;
	   }

	   public void setMemberPhone1(String memberPhone1) {
	      this.memberPhone1 = memberPhone1;
	   }

	   public String getMemberPhone2() {
	      return memberPhone2;
	   }

	   public void setMemberPhone2(String memberPhone2) {
	      this.memberPhone2 = memberPhone2;
	   }

	   public String getMemberPhone3() {
	      return memberPhone3;
	   }

	   public void setMemberPhone3(String memberPhone3) {
	      this.memberPhone3 = memberPhone3;
	   }

	   public String getMemberPhone() {
	      return memberPhone;
	   }

	   public void setMemberPhone(String memberPhone) {
	      this.memberPhone = memberPhone;
	   }
	   
	//////////////////////////////////////////////////////////////////////////////////////////////////   
	   public String getFileName() {
	      return fileName;
	   }
	   public void setFileName(String fileName) {
	      this.fileName = fileName;
	   }
	   public String getFileSize() {
	      return fileSize;
	   }
	   public void setFileSize(String fileSize) {
	      this.fileSize = fileSize;
	   }
	   public MultipartFile getFile() {
	      return file;
	   }
	   public void setFile(MultipartFile file) {
	      this.file = file;
	   }
	///////////////////////////////////////////////////////////////////////////////////////////////////   
	   
	   @Override
	   public String toString() {
	      return "MemberDTO ["
	            + "memberNo=" + memberNo 
	            + ", memberId=" + memberId 
	            + ", memberPwd1=" + memberPwd1
	            + ", memberPwd2=" + memberPwd2 
	            + ", memberPwd=" + memberPwd 
	            + ", memberName=" + memberName
	            + ", memberBirth1=" + memberBirth1 
	            + ", memberBirth2=" + memberBirth2 
	            + ", memberBirth3=" + memberBirth3
	            + ", memberBirth=" + memberBirth 
	            + ", memberAddr1=" + memberAddr1 
	            + ", memberAddr2=" + memberAddr2
	            + ", memberAddr3=" + memberAddr3 
	            + ", memberAddr=" + memberAddr 
	            + ", memberBank=" + memberBank
	            + ", memberAccount1=" + memberAccount1 
	            + ", memberAccount2=" + memberAccount2 
	            + ", memberAccount3=" + memberAccount3 
	            + ", memberAccount4=" + memberAccount4 
	            + ", memberAccount=" + memberAccount
	            + ", memberValidMonth=" + memberValidMonth 
	            + ", memberValidYear=" + memberValidYear
	            + ", memberSharingCount=" + memberSharingCount 
	            + ", memberPhone1=" + memberPhone1 
	            + ", memberPhone2=" + memberPhone2 
	            + ", memberPhone3=" + memberPhone3 
	            + ", memberPhone=" + memberPhone 
	            + "]";
	   }

	}