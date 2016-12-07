package spring.oshare.dto;

import org.springframework.stereotype.Component;

public class MemberDTO {

	private int memberNo;
	private String memberId;
	private String memberPwd;
	private String memberName;
	private String memberBirth;
	private String memberAddr;
	private String memberBank;
	private String memberAccount;
	private int memberValidMonth;
	private int memeberValidYear;
	private int memberSharingCount;
	private String memberPhone;
	
	public MemberDTO() {	}
	public MemberDTO(int memberNo, String memberId, String memberPwd, String memberName, String memberBirth,
			String memberAddr, String memberBank, String memberAccount, int memberValidMonth, int memeberValidYear,
			int memberSharingCount, String memberPhone) {
		this.memberNo = memberNo;
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.memberBirth = memberBirth;
		this.memberAddr = memberAddr;
		this.memberBank = memberBank;
		this.memberAccount = memberAccount;
		this.memberValidMonth = memberValidMonth;
		this.memeberValidYear = memeberValidYear;
		this.memberSharingCount = memberSharingCount;
		this.memberPhone = memberPhone;
	}


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
	public String getMemberBirth() {
		return memberBirth;
	}
	public void setMemberBirth(String memberBirth) {
		this.memberBirth = memberBirth;
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
	public int getMemeberValidYear() {
		return memeberValidYear;
	}
	public void setMemeberValidYear(int memeberValidYear) {
		this.memeberValidYear = memeberValidYear;
	}
	public int getMemberSharingCount() {
		return memberSharingCount;
	}
	public void setMemberSharingCount(int memberSharingCount) {
		this.memberSharingCount = memberSharingCount;
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	
	
	@Override
	public String toString() {
		return "MemberDTO [memberNo=" + memberNo + ", memberId=" + memberId + ", memberPwd=" + memberPwd
				+ ", memberName=" + memberName + ", memberBirth=" + memberBirth + ", memberAddr=" + memberAddr
				+ ", memberBank=" + memberBank + ", memberAccount=" + memberAccount + ", memberValidMonth="
				+ memberValidMonth + ", memeberValidYear=" + memeberValidYear + ", memberSharingCount="
				+ memberSharingCount + ", memberPhone=" + memberPhone + "]";
	}
	
	

}
