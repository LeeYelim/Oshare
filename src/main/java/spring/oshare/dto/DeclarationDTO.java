package spring.oshare.dto;

public class DeclarationDTO {
	private int declarationNo;
	private String declarationSubject;
	private String declarationReporter;
	private String declarationType;
	private String declarationReason;
	public int getDeclarationNo() {
		return declarationNo;
	}
	public void setDeclarationNo(int declarationNo) {
		this.declarationNo = declarationNo;
	}
	public String getDeclarationSubject() {
		return declarationSubject;
	}
	public void setDeclarationSubject(String declarationSubject) {
		this.declarationSubject = declarationSubject;
	}
	public String getDeclarationReporter() {
		return declarationReporter;
	}
	public void setDeclarationReporter(String declarationReporter) {
		this.declarationReporter = declarationReporter;
	}
	public String getDeclarationType() {
		return declarationType;
	}
	public void setDeclarationType(String declarationType) {
		this.declarationType = declarationType;
	}
	public String getDeclarationReason() {
		return declarationReason;
	}
	public void setDeclarationReason(String declarationReason) {
		this.declarationReason = declarationReason;
	}
	
	
}
