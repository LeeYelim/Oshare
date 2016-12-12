package spring.oshare.dto;

import org.springframework.stereotype.Component;

public class MemberDTO {

	private int memberNo; // 회원가입 순서?
	
	private String memberId; //아이디
	
		private String memberPwd1; //비밀번호
		private String memberPwd2; //비밀번호 확인
	private String memberPwd; //비밀번호 + 비밀번호확인

	private String memberName; //이름
	
		private String memberBirth1; //생년
		private String memberBirth2; // 월
		private String memberBirth3; // 일
	private String memberBirth; // 생년 + 월 + 일
	
		private String memberAddr1; // 우편번호
		private String memberAddr2; // 주소
		private String memberAddr3; // 상세주소
	private String memberAddr; //우편번호 + 주소 + 상세주소
	
	private String memberBank; // 카드선택
	
		private String memberAccount1; //카드번호1
		private String memberAccount2; //카드번호2
		private String memberAccount3; //카드번호3
		private String memberAccount4; //카드번호4
	private String memberAccount; //카드번호 1 + 2 + 3 + 4
	
	private int memberValidMonth; //유효기간 월
	
	private int memberValidYear; //유효기간 연
	
	private int memberSharingCount; // 공유 횟수
	
		private String memberPhone1; // 지역번호
		private String memberPhone2; // 전화번호1
		private String memberPhone3; // 전화번호2
	private String memberPhone; //지역번호 + 전화번호1 + 전화번호2
	
	//Constructor
	public MemberDTO() {	}	
	public MemberDTO(int memberNo, String memberId, String memberPwd, String memberName, String memberBirth, 
					 String memberAddr, String memberBank, String memberAccount, int memberValidMonth, int memberValidYear,
					 int memberSharingCount, String memberPhone){
		this.memberNo = memberNo;
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.memberBirth = memberBirth;
		this.memberAddr = memberAddr;
		this.memberBank = memberBank;
		this.memberAccount = memberAccount;
		this.memberValidMonth = memberValidMonth;
		this.memberValidYear = memberValidYear;
		this.memberSharingCount = memberSharingCount;
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

	@Override
	public String toString() {
		return "MemberDTO ["
				+ "memberNo=" + memberNo 
				+ ", memberId=" + memberId 
				+ ", memberPwd=" + memberPwd1
				+ ", memberName=" + memberName 
				+ ", memberBirth=" + memberBirth1 + memberBirth2 + memberBirth3 
				+ ", memberAddr=" + memberAddr1 + memberAddr2 + memberAddr3
				+ ", memberBank=" + memberBank 
				+ ", memberAccount=" + memberAccount1 + memberAccount2 + memberAccount3 + memberAccount4
				+ ", memberValidMonth=" + memberValidMonth 
				+ ", memberValidYear=" + memberValidYear 
				+ ", memberSharingCount=" + memberSharingCount 
				+ ", memberPhone=" + memberPhone1 + memberPhone2 + memberPhone3
				+ "]";
	}

}
