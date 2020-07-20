package xkt.personal.mgmt.bo;

import java.io.Serializable;
import java.util.Date;

public class TCHealthCodeApply implements Serializable {
	/**
	 * 主键
	 */
	private String id;

	/**
	 * uuid备用建
	 */
	private String uuid;

	/**
	 * 姓名
	 */
	private String userName;

	/**
	 * 证件类别身份证、护照、港澳台通行证、其他
	 */
	private String certType;

	/**
	 * 证件号
	 */
	private String certCode;

	/**
	 * 脱敏证件号
	 */
	private String certCodeHide;

	/**
	 * 加密证件号
	 */
	private String certCodeSecret;

	/**
	 * 国籍code值
	 */
	private String nationCode;

	private String openId;

	private String channelId;

	private String updateFlag;

	/**
	 * 手机号
	 */
	private String phone;

	/**
	 * 关联的父级别联系人身份证号
	 */
	private String relationCertSecret;

	/**
	 * 委托人与申请人关系
	 */
	private String applyEntrustRelation;

	/**
	 * 无锡居住类型。居家、宿舍、宾馆、通勤
	 */
	private String wxLiveType;

	/**
	 * 1未离开无锡，2外地入锡
	 */
	private String isLeaveWxType;

	/**
	 * 抵达无锡日期
	 */
	private Date arriveWxDate;

	/**
	 * 是否来至湖北。0否，1是
	 */
	private String isFromHb;

	/**
	 * 出发地名称
	 */
	private String departureAddr;

	/**
	 * 出发地代码值
	 */
	private String departureAddrCode;

	/**
	 * 到达无锡交通方式
	 */
	private String arriveWxTraffic;

	/**
	 * 车道航班
	 */
	private String arriveWxTrafficode;

	/**
	 * 是否十四日接触新型冠状病毒确诊者或疑似者
	 */
	private String isTwoWeekVirus;

	/**
	 * 区县代码
	 */
	private String householdCode;

	/**
	 * 户籍区划名称
	 */
	private String householdName;

	/**
	 * 紧急联系人
	 */
	private String emergencyPerson;

	/**
	 * 紧急联系热电话
	 */
	private String emergencyPhone;

	/**
	 * 区县代码
	 */
	private String districtCode;

	/**
	 * 目前在锡居住区县名称
	 */
	private String currentDistrict;

	/**
	 * 街道代码
	 */
	private String streetCode;

	/**
	 * 目前在锡居住街道
	 */
	private String currentStreet;

	/**
	 * 社区代码
	 */
	private String communityCode;

	/**
	 * 当前社区名称
	 */
	private String currentCommunity;

	/**
	 * 派出所代码 增加派出所代码（自动生成）
	 */
	private String policeStationCode;

	/**
	 * 派出所名称自动生成
	 */
	private String policeStation;

	/**
	 * 小区/新村/路名
	 */
	private String housingName;

	/**
	 * 异地居住code值
	 */
	private String allopatryCode;

	/**
	 * 异地居住地中文名
	 */
	private String allopatryName;

	/**
	 * 详细地址 门牌号+室号
	 */
	private String liveAddress;

	/**
	 * 是否发烧（0、否 1、是）
	 */
	private String isHot;

	/**
	 * 1月25日之后是否离开无锡（0、否 1、是）
	 */
	private String isLeave;

	/**
	 * 14日内是否湖北停留或与归来人员接触（0、否 1、是）
	 */
	private String isStay;

	/**
	 * 个人健康状态。0不健康，1健康，2异常，3红码待审核
	 */
	private String isHealthy;

	/**
	 * 隔离天数
	 */
	private Integer isolationDays;

	/**
	 * 隔离时间
	 */
	private Date isolationDate;

	/**
	 * 审查编码
	 */
	private String checkCode;

	/**
	 * 审查人员
	 */
	private String checkPerson;

	/**
	 * 打卡日期
	 */
	private Date punchDate;

	/**
	 * 打卡天数
	 */
	private Integer attenDays;

	/**
	 * 提示编码
	 */
	private String tipsCode;

	/**
	 * 红码警告编码
	 */
	private String alarmCode;

	/**
	 * 是否有呼吸道疾病
	 */
	private String isRespiraSick;

	/**
	 * 地址是否正确（0、否 1、是）
	 */
	private String isAddressRight;

	/**
	 * 14日之内是否有旅行史
	 */
	private String twoWeekTravel;

	/**
	 * 途径地点名称
	 */
	private String passAddrName;

	/**
	 * 途径地点编码
	 */
	private String passAddrCode;

	/**
	 * 传输状态。0未传输，01更新待传输，1已传输。
	 */
	private String tranStatus;

	/**
	 * 状态码（0不可用 1可用）
	 */
	private String status;

	/**
	 * 标签码。 0初始 1回执 2通过 3 不通过
	 */
	private String flag;

	/**
	 * 是否返锡（0、否 1、是）
	 */
	private String isReturnWuxi;

	/**
	 * 标签码。 0初始 1回执 2通过 3 不通过
	 */
	private String communityFlag;

	/**
	 * 是否实人认证
	 */
	private String personAuthFlag;

	/**
	 * 实人认证渠道
	 */
	private String personAuthChannel;

	/**
	 * 实名认证时间
	 */
	private Date personAuthTime;

	/**
	 * 往返地code值
	 */
	private String roundTripCode;

	/**
	 * 往返地name
	 */
	private String roundTripName;

	/**
	 * 工作单位
	 */
	private String workUnit;

	/**
	 * 学校code值
	 */
	private String schoolCode;

	/**
	 * 预留字段1，近14天有国外旅行
	 */
	private String resOne;

	/**
	 * 预留字段2，回国时间
	 */
	private String resTwo;

	/**
	 * 预留字段3，出发国家
	 */
	private String resThree;

	/**
	 * 预留字段4，国外达到城市code值
	 */
	private String resFour;

	/**
	 * 预留字段5，国外达到城市中文
	 */
	private String resFive;

	/**
	 * 途径国家code值
	 */
	private String paaswayCodes;

	private Date imgUpdateTime;

	/**
	 * 打卡日期
	 */
	private Date punchTime;

	/**
	 * 响应时间
	 */
	private Date responseTime;

	/**
	 * flag刷新时间
	 */
	private Date flagFreshTime;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 更新时间
	 */
	private Date updateTime;

	/**
	 * 当前照片
	 */
	private String currentPersonImg;
	/**
	 * 是否定点医院隔离治疗的确认病人、疑似病人
	 */
	private String isIsolaVirusPsn;
	/**
	 * 是否实施居家观察未满14天的感染者
	 */
	
	private String isCureVirusPsn;
	/**
	 * 是否定点医疗机构隔离医学观察的无症状感染者
	 */
	
	private String isObserVirusPsn;
	/**
	 * 更新状态（01、手动提示更新照片）
	 */
	
	private String updateStatus;

	private static final long serialVersionUID = 1L;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid == null ? null : uuid.trim();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	public String getCertType() {
		return certType;
	}

	public void setCertType(String certType) {
		this.certType = certType == null ? null : certType.trim();
	}

	public String getCertCode() {
		return certCode;
	}

	public void setCertCode(String certCode) {
		this.certCode = certCode == null ? null : certCode.trim();
	}

	public String getCertCodeHide() {
		return certCodeHide;
	}

	public void setCertCodeHide(String certCodeHide) {
		this.certCodeHide = certCodeHide == null ? null : certCodeHide.trim();
	}

	public String getCertCodeSecret() {
		return certCodeSecret;
	}

	public void setCertCodeSecret(String certCodeSecret) {
		this.certCodeSecret = certCodeSecret == null ? null : certCodeSecret
				.trim();
	}

	public String getNationCode() {
		return nationCode;
	}

	public void setNationCode(String nationCode) {
		this.nationCode = nationCode == null ? null : nationCode.trim();
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId == null ? null : openId.trim();
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId == null ? null : channelId.trim();
	}

	public String getUpdateFlag() {
		return updateFlag;
	}

	public void setUpdateFlag(String updateFlag) {
		this.updateFlag = updateFlag == null ? null : updateFlag.trim();
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	public String getRelationCertSecret() {
		return relationCertSecret;
	}

	public void setRelationCertSecret(String relationCertSecret) {
		this.relationCertSecret = relationCertSecret == null ? null
				: relationCertSecret.trim();
	}

	public String getApplyEntrustRelation() {
		return applyEntrustRelation;
	}

	public void setApplyEntrustRelation(String applyEntrustRelation) {
		this.applyEntrustRelation = applyEntrustRelation == null ? null
				: applyEntrustRelation.trim();
	}

	public String getWxLiveType() {
		return wxLiveType;
	}

	public void setWxLiveType(String wxLiveType) {
		this.wxLiveType = wxLiveType == null ? null : wxLiveType.trim();
	}

	public String getIsLeaveWxType() {
		return isLeaveWxType;
	}

	public void setIsLeaveWxType(String isLeaveWxType) {
		this.isLeaveWxType = isLeaveWxType == null ? null : isLeaveWxType
				.trim();
	}

	public Date getArriveWxDate() {
		return arriveWxDate;
	}

	public void setArriveWxDate(Date arriveWxDate) {
		this.arriveWxDate = arriveWxDate;
	}

	public String getIsFromHb() {
		return isFromHb;
	}

	public void setIsFromHb(String isFromHb) {
		this.isFromHb = isFromHb == null ? null : isFromHb.trim();
	}

	public String getDepartureAddr() {
		return departureAddr;
	}

	public void setDepartureAddr(String departureAddr) {
		this.departureAddr = departureAddr == null ? null : departureAddr
				.trim();
	}

	public String getDepartureAddrCode() {
		return departureAddrCode;
	}

	public void setDepartureAddrCode(String departureAddrCode) {
		this.departureAddrCode = departureAddrCode == null ? null
				: departureAddrCode.trim();
	}

	public String getArriveWxTraffic() {
		return arriveWxTraffic;
	}

	public void setArriveWxTraffic(String arriveWxTraffic) {
		this.arriveWxTraffic = arriveWxTraffic == null ? null : arriveWxTraffic
				.trim();
	}

	public String getArriveWxTrafficode() {
		return arriveWxTrafficode;
	}

	public void setArriveWxTrafficode(String arriveWxTrafficode) {
		this.arriveWxTrafficode = arriveWxTrafficode == null ? null
				: arriveWxTrafficode.trim();
	}

	public String getIsTwoWeekVirus() {
		return isTwoWeekVirus;
	}

	public void setIsTwoWeekVirus(String isTwoWeekVirus) {
		this.isTwoWeekVirus = isTwoWeekVirus == null ? null : isTwoWeekVirus
				.trim();
	}

	public String getHouseholdCode() {
		return householdCode;
	}

	public void setHouseholdCode(String householdCode) {
		this.householdCode = householdCode == null ? null : householdCode
				.trim();
	}

	public String getHouseholdName() {
		return householdName;
	}

	public void setHouseholdName(String householdName) {
		this.householdName = householdName == null ? null : householdName
				.trim();
	}

	public String getEmergencyPerson() {
		return emergencyPerson;
	}

	public void setEmergencyPerson(String emergencyPerson) {
		this.emergencyPerson = emergencyPerson == null ? null : emergencyPerson
				.trim();
	}

	public String getEmergencyPhone() {
		return emergencyPhone;
	}

	public void setEmergencyPhone(String emergencyPhone) {
		this.emergencyPhone = emergencyPhone == null ? null : emergencyPhone
				.trim();
	}

	public String getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode == null ? null : districtCode.trim();
	}

	public String getCurrentDistrict() {
		return currentDistrict;
	}

	public void setCurrentDistrict(String currentDistrict) {
		this.currentDistrict = currentDistrict == null ? null : currentDistrict
				.trim();
	}

	public String getStreetCode() {
		return streetCode;
	}

	public void setStreetCode(String streetCode) {
		this.streetCode = streetCode == null ? null : streetCode.trim();
	}

	public String getCurrentStreet() {
		return currentStreet;
	}

	public void setCurrentStreet(String currentStreet) {
		this.currentStreet = currentStreet == null ? null : currentStreet
				.trim();
	}

	public String getCommunityCode() {
		return communityCode;
	}

	public void setCommunityCode(String communityCode) {
		this.communityCode = communityCode == null ? null : communityCode
				.trim();
	}

	public String getCurrentCommunity() {
		return currentCommunity;
	}

	public void setCurrentCommunity(String currentCommunity) {
		this.currentCommunity = currentCommunity == null ? null
				: currentCommunity.trim();
	}

	public String getPoliceStationCode() {
		return policeStationCode;
	}

	public void setPoliceStationCode(String policeStationCode) {
		this.policeStationCode = policeStationCode == null ? null
				: policeStationCode.trim();
	}

	public String getPoliceStation() {
		return policeStation;
	}

	public void setPoliceStation(String policeStation) {
		this.policeStation = policeStation == null ? null : policeStation
				.trim();
	}

	public String getHousingName() {
		return housingName;
	}

	public void setHousingName(String housingName) {
		this.housingName = housingName == null ? null : housingName.trim();
	}

	public String getAllopatryCode() {
		return allopatryCode;
	}

	public void setAllopatryCode(String allopatryCode) {
		this.allopatryCode = allopatryCode == null ? null : allopatryCode
				.trim();
	}

	public String getAllopatryName() {
		return allopatryName;
	}

	public void setAllopatryName(String allopatryName) {
		this.allopatryName = allopatryName == null ? null : allopatryName
				.trim();
	}

	public String getLiveAddress() {
		return liveAddress;
	}

	public void setLiveAddress(String liveAddress) {
		this.liveAddress = liveAddress == null ? null : liveAddress.trim();
	}

	public String getIsHot() {
		return isHot;
	}

	public void setIsHot(String isHot) {
		this.isHot = isHot == null ? null : isHot.trim();
	}

	public String getIsLeave() {
		return isLeave;
	}

	public void setIsLeave(String isLeave) {
		this.isLeave = isLeave == null ? null : isLeave.trim();
	}

	public String getIsStay() {
		return isStay;
	}

	public void setIsStay(String isStay) {
		this.isStay = isStay == null ? null : isStay.trim();
	}

	public String getIsHealthy() {
		return isHealthy;
	}

	public void setIsHealthy(String isHealthy) {
		this.isHealthy = isHealthy == null ? null : isHealthy.trim();
	}

	public Integer getIsolationDays() {
		return isolationDays;
	}

	public void setIsolationDays(Integer isolationDays) {
		this.isolationDays = isolationDays;
	}

	public Date getIsolationDate() {
		return isolationDate;
	}

	public void setIsolationDate(Date isolationDate) {
		this.isolationDate = isolationDate;
	}

	public String getCheckCode() {
		return checkCode;
	}

	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode == null ? null : checkCode.trim();
	}

	public String getCheckPerson() {
		return checkPerson;
	}

	public void setCheckPerson(String checkPerson) {
		this.checkPerson = checkPerson == null ? null : checkPerson.trim();
	}

	public Date getPunchDate() {
		return punchDate;
	}

	public void setPunchDate(Date punchDate) {
		this.punchDate = punchDate;
	}

	public Integer getAttenDays() {
		return attenDays;
	}

	public void setAttenDays(Integer attenDays) {
		this.attenDays = attenDays;
	}

	public String getTipsCode() {
		return tipsCode;
	}

	public void setTipsCode(String tipsCode) {
		this.tipsCode = tipsCode == null ? null : tipsCode.trim();
	}

	public String getAlarmCode() {
		return alarmCode;
	}

	public void setAlarmCode(String alarmCode) {
		this.alarmCode = alarmCode == null ? null : alarmCode.trim();
	}

	public String getIsRespiraSick() {
		return isRespiraSick;
	}

	public void setIsRespiraSick(String isRespiraSick) {
		this.isRespiraSick = isRespiraSick == null ? null : isRespiraSick
				.trim();
	}

	public String getIsAddressRight() {
		return isAddressRight;
	}

	public void setIsAddressRight(String isAddressRight) {
		this.isAddressRight = isAddressRight == null ? null : isAddressRight
				.trim();
	}

	public String getTwoWeekTravel() {
		return twoWeekTravel;
	}

	public void setTwoWeekTravel(String twoWeekTravel) {
		this.twoWeekTravel = twoWeekTravel == null ? null : twoWeekTravel
				.trim();
	}

	public String getPassAddrName() {
		return passAddrName;
	}

	public void setPassAddrName(String passAddrName) {
		this.passAddrName = passAddrName == null ? null : passAddrName.trim();
	}

	public String getPassAddrCode() {
		return passAddrCode;
	}

	public void setPassAddrCode(String passAddrCode) {
		this.passAddrCode = passAddrCode == null ? null : passAddrCode.trim();
	}

	public String getTranStatus() {
		return tranStatus;
	}

	public void setTranStatus(String tranStatus) {
		this.tranStatus = tranStatus == null ? null : tranStatus.trim();
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag == null ? null : flag.trim();
	}

	public String getIsReturnWuxi() {
		return isReturnWuxi;
	}

	public void setIsReturnWuxi(String isReturnWuxi) {
		this.isReturnWuxi = isReturnWuxi == null ? null : isReturnWuxi.trim();
	}

	public String getCommunityFlag() {
		return communityFlag;
	}

	public void setCommunityFlag(String communityFlag) {
		this.communityFlag = communityFlag == null ? null : communityFlag
				.trim();
	}

	public String getPersonAuthFlag() {
		return personAuthFlag;
	}

	public void setPersonAuthFlag(String personAuthFlag) {
		this.personAuthFlag = personAuthFlag == null ? null : personAuthFlag
				.trim();
	}

	public String getPersonAuthChannel() {
		return personAuthChannel;
	}

	public void setPersonAuthChannel(String personAuthChannel) {
		this.personAuthChannel = personAuthChannel == null ? null
				: personAuthChannel.trim();
	}

	public Date getPersonAuthTime() {
		return personAuthTime;
	}

	public void setPersonAuthTime(Date personAuthTime) {
		this.personAuthTime = personAuthTime;
	}

	public String getRoundTripCode() {
		return roundTripCode;
	}

	public void setRoundTripCode(String roundTripCode) {
		this.roundTripCode = roundTripCode == null ? null : roundTripCode
				.trim();
	}

	public String getRoundTripName() {
		return roundTripName;
	}

	public void setRoundTripName(String roundTripName) {
		this.roundTripName = roundTripName == null ? null : roundTripName
				.trim();
	}

	public String getWorkUnit() {
		return workUnit;
	}

	public void setWorkUnit(String workUnit) {
		this.workUnit = workUnit == null ? null : workUnit.trim();
	}

	public String getSchoolCode() {
		return schoolCode;
	}

	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode == null ? null : schoolCode.trim();
	}

	public String getResOne() {
		return resOne;
	}

	public void setResOne(String resOne) {
		this.resOne = resOne == null ? null : resOne.trim();
	}

	public String getResTwo() {
		return resTwo;
	}

	public void setResTwo(String resTwo) {
		this.resTwo = resTwo == null ? null : resTwo.trim();
	}

	public String getResThree() {
		return resThree;
	}

	public void setResThree(String resThree) {
		this.resThree = resThree == null ? null : resThree.trim();
	}

	public String getResFour() {
		return resFour;
	}

	public void setResFour(String resFour) {
		this.resFour = resFour == null ? null : resFour.trim();
	}

	public String getResFive() {
		return resFive;
	}

	public void setResFive(String resFive) {
		this.resFive = resFive == null ? null : resFive.trim();
	}

	public String getPaaswayCodes() {
		return paaswayCodes;
	}

	public void setPaaswayCodes(String paaswayCodes) {
		this.paaswayCodes = paaswayCodes == null ? null : paaswayCodes.trim();
	}

	public Date getImgUpdateTime() {
		return imgUpdateTime;
	}

	public void setImgUpdateTime(Date imgUpdateTime) {
		this.imgUpdateTime = imgUpdateTime;
	}

	public Date getPunchTime() {
		return punchTime;
	}

	public void setPunchTime(Date punchTime) {
		this.punchTime = punchTime;
	}

	public Date getResponseTime() {
		return responseTime;
	}

	public void setResponseTime(Date responseTime) {
		this.responseTime = responseTime;
	}

	public Date getFlagFreshTime() {
		return flagFreshTime;
	}

	public void setFlagFreshTime(Date flagFreshTime) {
		this.flagFreshTime = flagFreshTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getCurrentPersonImg() {
		return currentPersonImg;
	}

	public void setCurrentPersonImg(String currentPersonImg) {
		this.currentPersonImg = currentPersonImg == null ? null
				: currentPersonImg.trim();
	}

	public String getIsIsolaVirusPsn() {
		return isIsolaVirusPsn;
	}

	public void setIsIsolaVirusPsn(String isIsolaVirusPsn) {
		this.isIsolaVirusPsn = isIsolaVirusPsn;
	}

	public String getIsCureVirusPsn() {
		return isCureVirusPsn;
	}

	public void setIsCureVirusPsn(String isCureVirusPsn) {
		this.isCureVirusPsn = isCureVirusPsn;
	}

	public String getIsObserVirusPsn() {
		return isObserVirusPsn;
	}

	public void setIsObserVirusPsn(String isObserVirusPsn) {
		this.isObserVirusPsn = isObserVirusPsn;
	}

	public String getUpdateStatus() {
		return updateStatus;
	}

	public void setUpdateStatus(String updateStatus) {
		this.updateStatus = updateStatus;
	}

	@Override
	public String toString() {
		return "TCHealthCodeApply [id=" + id + ", uuid=" + uuid + ", userName="
				+ userName + ", certType=" + certType + ", certCode="
				+ certCode + ", certCodeHide=" + certCodeHide
				+ ", certCodeSecret=" + certCodeSecret + ", nationCode="
				+ nationCode + ", openId=" + openId + ", channelId="
				+ channelId + ", updateFlag=" + updateFlag + ", phone=" + phone
				+ ", relationCertSecret=" + relationCertSecret
				+ ", applyEntrustRelation=" + applyEntrustRelation
				+ ", wxLiveType=" + wxLiveType + ", isLeaveWxType="
				+ isLeaveWxType + ", arriveWxDate=" + arriveWxDate
				+ ", isFromHb=" + isFromHb + ", departureAddr=" + departureAddr
				+ ", departureAddrCode=" + departureAddrCode
				+ ", arriveWxTraffic=" + arriveWxTraffic
				+ ", arriveWxTrafficode=" + arriveWxTrafficode
				+ ", isTwoWeekVirus=" + isTwoWeekVirus + ", householdCode="
				+ householdCode + ", householdName=" + householdName
				+ ", emergencyPerson=" + emergencyPerson + ", emergencyPhone="
				+ emergencyPhone + ", districtCode=" + districtCode
				+ ", currentDistrict=" + currentDistrict + ", streetCode="
				+ streetCode + ", currentStreet=" + currentStreet
				+ ", communityCode=" + communityCode + ", currentCommunity="
				+ currentCommunity + ", policeStationCode=" + policeStationCode
				+ ", policeStation=" + policeStation + ", housingName="
				+ housingName + ", allopatryCode=" + allopatryCode
				+ ", allopatryName=" + allopatryName + ", liveAddress="
				+ liveAddress + ", isHot=" + isHot + ", isLeave=" + isLeave
				+ ", isStay=" + isStay + ", isHealthy=" + isHealthy
				+ ", isolationDays=" + isolationDays + ", isolationDate="
				+ isolationDate + ", checkCode=" + checkCode + ", checkPerson="
				+ checkPerson + ", punchDate=" + punchDate + ", attenDays="
				+ attenDays + ", tipsCode=" + tipsCode + ", alarmCode="
				+ alarmCode + ", isRespiraSick=" + isRespiraSick
				+ ", isAddressRight=" + isAddressRight + ", twoWeekTravel="
				+ twoWeekTravel + ", passAddrName=" + passAddrName
				+ ", passAddrCode=" + passAddrCode + ", tranStatus="
				+ tranStatus + ", status=" + status + ", flag=" + flag
				+ ", isReturnWuxi=" + isReturnWuxi + ", communityFlag="
				+ communityFlag + ", personAuthFlag=" + personAuthFlag
				+ ", personAuthChannel=" + personAuthChannel
				+ ", personAuthTime=" + personAuthTime + ", roundTripCode="
				+ roundTripCode + ", roundTripName=" + roundTripName
				+ ", workUnit=" + workUnit + ", schoolCode=" + schoolCode
				+ ", resOne=" + resOne + ", resTwo=" + resTwo + ", resThree="
				+ resThree + ", resFour=" + resFour + ", resFive=" + resFive
				+ ", paaswayCodes=" + paaswayCodes + ", imgUpdateTime="
				+ imgUpdateTime + ", punchTime=" + punchTime
				+ ", responseTime=" + responseTime + ", flagFreshTime="
				+ flagFreshTime + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + ", currentPersonImg="
				+ currentPersonImg + ", isIsolaVirusPsn=" + isIsolaVirusPsn
				+ ", isCureVirusPsn=" + isCureVirusPsn + ", isObserVirusPsn="
				+ isObserVirusPsn + ", updateStatus=" + updateStatus + "]";
	}

	
}