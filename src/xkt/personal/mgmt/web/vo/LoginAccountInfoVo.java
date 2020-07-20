package xkt.personal.mgmt.web.vo;

import eeos.sp.core.base.vo.EBaseVo;

public class LoginAccountInfoVo extends EBaseVo{
	//序号
	private int id;
	//账号主键
	private String accountId;
	//区域类型
	private String districtType;
	//区域名称
	private String districtName;
	//区域编码
	private String districtCode;
	//登入账号
	private String accountName;
	//姓名
	private String staffName;
	//身份证号码
	private String staffIdentityCard;
	//手机号码
	private String staffMobile;
	//创建时间起
	private String createTimeFrom;
	//创建时间止
	private String createTimeTo;
	//创建时间
	private String accountCreateDate;
	//授权标志
	private String isMainAccount;
	//员工所属管理组织
	private String orgNo;
	//员工主键
	private String staffId;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStaffId() {
		return staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	public String getOrgNo() {
		return orgNo;
	}
	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getDistrictType() {
		return districtType;
	}
	public void setDistrictType(String districtType) {
		this.districtType = districtType;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public String getDistrictCode() {
		return districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getStaffIdentityCard() {
		return staffIdentityCard;
	}
	public void setStaffIdentityCard(String staffIdentityCard) {
		this.staffIdentityCard = staffIdentityCard;
	}
	public String getStaffMobile() {
		return staffMobile;
	}
	public void setStaffMobile(String staffMobile) {
		this.staffMobile = staffMobile;
	}
	public String getCreateTimeFrom() {
		return createTimeFrom;
	}
	public void setCreateTimeFrom(String createTimeFrom) {
		this.createTimeFrom = createTimeFrom;
	}
	public String getCreateTimeTo() {
		return createTimeTo;
	}
	public void setCreateTimeTo(String createTimeTo) {
		this.createTimeTo = createTimeTo;
	}
	public String getAccountCreateDate() {
		return accountCreateDate;
	}
	public void setAccountCreateDate(String accountCreateDate) {
		this.accountCreateDate = accountCreateDate;
	}
	public String getIsMainAccount() {
		return isMainAccount;
	}
	public void setIsMainAccount(String isMainAccount) {
		this.isMainAccount = isMainAccount;
	}
}
