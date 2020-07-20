package xkt.personal.mgmt.bo;

public class TCHealthCodeAdminExt extends TCHealthCodeAdmin{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 小区类别
	 */
	private String cmmtyType;
	/**
	 * 小区名称
	 */
	private String commuityName;
	public String getCmmtyType() {
		return cmmtyType;
	}
	public void setCmmtyType(String cmmtyType) {
		this.cmmtyType = cmmtyType;
	}
	public String getCommuityName() {
		return commuityName;
	}
	public void setCommuityName(String commuityName) {
		this.commuityName = commuityName;
	}
	
}
