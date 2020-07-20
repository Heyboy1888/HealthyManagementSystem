package xkt.personal.mgmt.web.vo;

import com.ls.pf.base.api.framework.DicAttribute;

import eeos.sp.core.base.vo.EBaseVo;

public class TCHealthCodeApplyVo extends EBaseVo{
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
    
    @DicAttribute(dicName = "syscode_code_dic", subType = "XKM_CertType", key = "certType")
    private String certTypeName;

    public String getCertTypeName() {
		return certTypeName;
	}

	public void setCertTypeName(String certTypeName) {
		this.certTypeName = certTypeName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

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
    
    @DicAttribute(dicName = "syscode_code_dic", subType = "XKM_IsOrNot", key = "updateFlag")
    private String updateFlagName;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 关联的父级别联系人身份证号
     */
    private String relationCertSecret;
    
    private String relationName;   

    public String getRelationName() {
		return relationName;
	}

	public void setRelationName(String relationName) {
		this.relationName = relationName;
	}

	/**
     * 委托人与申请人关系
     */
    private String applyEntrustRelation;

    /**
     * 无锡居住类型。居家、宿舍、宾馆、通勤
     */
		
	
    private String wxLiveType;
    
    @DicAttribute(dicName = "syscode_code_dic", subType = "XKM_LiveType", key = "wxLiveType")
	private String wxLiveTypeName;

    /**
     * 1未离开无锡，2外地入锡
     */
    private String isLeaveWxType;

    /**
     * 抵达无锡日期
     */
    private String arriveWxDate;

    /**
     * 是否来至湖北。0否，1是
     */
    private String isFromHb;
    
    @DicAttribute(dicName="syscode_code_dic",subType="XKM_IsOrNot",key="isFromHb")
    private String isFromHbName;

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
    
    @DicAttribute(dicName="syscode_code_dic",subType="XKM_IsOrNot",key="isTwoWeekVirus")
    private String isTwoWeekVirusName;

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
    
    

    public String getIsFromHbName() {
		return isFromHbName;
	}

	public void setIsFromHbName(String isFromHbName) {
		this.isFromHbName = isFromHbName;
	}

	public String getIsTwoWeekVirusName() {
		return isTwoWeekVirusName;
	}

	public void setIsTwoWeekVirusName(String isTwoWeekVirusName) {
		this.isTwoWeekVirusName = isTwoWeekVirusName;
	}

	

	public String getCommunityCodeNew() {
		return communityCodeNew;
	}

	public void setCommunityCodeNew(String communityCodeNew) {
		this.communityCodeNew = communityCodeNew;
	}

	public String getIsHealthyName() {
		return isHealthyName;
	}

	public void setIsHealthyName(String isHealthyName) {
		this.isHealthyName = isHealthyName;
	}

	public String getIsRespiraSickName() {
		return isRespiraSickName;
	}

	public void setIsRespiraSickName(String isRespiraSickName) {
		this.isRespiraSickName = isRespiraSickName;
	}

	public String getIsAddressRightName() {
		return isAddressRightName;
	}

	public void setIsAddressRightName(String isAddressRightName) {
		this.isAddressRightName = isAddressRightName;
	}

	public String getTwoWeekTravelName() {
		return twoWeekTravelName;
	}

	public void setTwoWeekTravelName(String twoWeekTravelName) {
		this.twoWeekTravelName = twoWeekTravelName;
	}

	private String communityCodeNew;
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
    
    //小区编号
    private String commuityNo;
    
    

    public String getCommuityNo() {
		return commuityNo;
	}

	public void setCommuityNo(String commuityNo) {
		this.commuityNo = commuityNo;
	}

	//小区分类
    private String cmmtyType;
    public String getCmmtyType() {
		return cmmtyType;
	}

	public void setCmmtyType(String cmmtyType) {
		this.cmmtyType = cmmtyType;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	/**
     * 异地居住code值
     */
    private String allopatryCode;

    /**
     * 异地居住地中文名
     */
    private String allopatryName;

    /**
     * 详细地址  门牌号+室号
     */
    private String liveAddress;

    /**
     * 是否发烧（0、否 1、是）
     */
    private String isHot;
    
    @DicAttribute(dicName = "syscode_code_dic", subType = "XKM_IsOrNot", key = "isHot")
    private String isHotName;

    /**
     * 1月25日之后是否离开无锡（0、否 1、是）
     */
    private String isLeave;
    
    @DicAttribute(dicName = "syscode_code_dic", subType = "XKM_IsOrNot", key = "isLeave")
    private String isLeaveName;

    /**
     * 14日内是否湖北停留或与归来人员接触（0、否 1、是）
     */
    private String isStay;
    
    @DicAttribute(dicName = "syscode_code_dic", subType = "XKM_IsOrNot", key = "isStay")
    private String isStayName;

    /**
     * 个人健康状态。0不健康，1健康，2异常，3红码待审核
     */
    private String isHealthy;
    
    @DicAttribute(dicName="syscode_code_dic",subType="XKM_HealthyCode",key="isHealthy")
    private String isHealthyName;

    /**
     * 隔离天数
     */
    private String isolationDays;

    /**
     * 隔离时间
     */
    private String isolationDate;

    /**
     * 审查编码
     */
    private String checkCode;

    /**
     * 审查人员
     */
    private String checkPerson;
    
    private String checkPersonName;

    /**
     * 打卡日期
     */
    private String punchDate;

    /**
     * 打卡天数
     */
    private String attenDays;

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
    
    @DicAttribute(dicName="syscode_code_dic",subType="XKM_IsOrNot",key="isRespiraSick")
    private String isRespiraSickName;

    /**
     * 地址是否正确（0、否 1、是）
     */
    private String isAddressRight;
    
    @DicAttribute(dicName="syscode_code_dic",subType="XKM_IsOrNot",key="isAddressRight")
    private String isAddressRightName;

    /**
     * 14日之内是否有旅行史
     */
    private String twoWeekTravel;
    
    @DicAttribute(dicName="syscode_code_dic",subType="XKM_IsOrNot",key="twoWeekTravel")
    private String twoWeekTravelName;

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
     * 标签码。 0初始 1回执 2通过  3 不通过
     */
    private String flag;

    /**
     * 是否返锡（0、否 1、是）
     */
    private String isReturnWuxi;

    /**
     * 标签码。 0初始 1回执 2通过  3 不通过
     */
    private String communityFlag;

    /**
     * 是否实人认证
     */
    private String personAuthFlag;
    
    @DicAttribute(dicName="syscode_code_dic",subType="XKM_IsOrNot",key="personAuthFlag")
    private String personAuthFlagName;

    /**
     * 实人认证渠道
     */
    private String personAuthChannel;

    /**
     * 实名认证时间
     */
    private String personAuthTime;

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

    private String imgUpdateTime;

    /**
     * 打卡日期
     */
    private String punchTime;

    /**
     * 响应时间
     */
    private String responseTime;

    /**
     * flag刷新时间
     */
    private String flagFreshTime;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 更新时间
     */
    private String updateTime;

    /**
     * 当前照片
     */
    private String currentPersonImg;
    
    private String startTime;
    
    private String endTime;
    
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

	public String getStartTime() {
		return startTime;
	}

	public void setStratTime(String stratTime) {
		this.startTime = stratTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

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
		this.uuid = uuid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCertType() {
		return certType;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getCertCode() {
		return certCode;
	}

	public void setCertCode(String certCode) {
		this.certCode = certCode;
	}

	public String getCertCodeHide() {
		return certCodeHide;
	}

	public void setCertCodeHide(String certCodeHide) {
		this.certCodeHide = certCodeHide;
	}

	public String getCertCodeSecret() {
		return certCodeSecret;
	}

	public void setCertCodeSecret(String certCodeSecret) {
		this.certCodeSecret = certCodeSecret;
	}

	public String getNationCode() {
		return nationCode;
	}

	public void setNationCode(String nationCode) {
		this.nationCode = nationCode;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getUpdateFlag() {
		return updateFlag;
	}

	public void setUpdateFlag(String updateFlag) {
		this.updateFlag = updateFlag;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRelationCertSecret() {
		return relationCertSecret;
	}

	public void setRelationCertSecret(String relationCertSecret) {
		this.relationCertSecret = relationCertSecret;
	}

	public String getApplyEntrustRelation() {
		return applyEntrustRelation;
	}

	public void setApplyEntrustRelation(String applyEntrustRelation) {
		this.applyEntrustRelation = applyEntrustRelation;
	}

	public String getWxLiveType() {
		return wxLiveType;
	}

	public void setWxLiveType(String wxLiveType) {
		this.wxLiveType = wxLiveType;
	}

	public String getIsLeaveWxType() {
		return isLeaveWxType;
	}

	public void setIsLeaveWxType(String isLeaveWxType) {
		this.isLeaveWxType = isLeaveWxType;
	}

	public String getArriveWxDate() {
		return arriveWxDate;
	}

	public void setArriveWxDate(String arriveWxDate) {
		this.arriveWxDate = arriveWxDate;
	}

	public String getIsFromHb() {
		return isFromHb;
	}

	public void setIsFromHb(String isFromHb) {
		this.isFromHb = isFromHb;
	}

	public String getDepartureAddr() {
		return departureAddr;
	}

	public void setDepartureAddr(String departureAddr) {
		this.departureAddr = departureAddr;
	}

	public String getDepartureAddrCode() {
		return departureAddrCode;
	}

	public void setDepartureAddrCode(String departureAddrCode) {
		this.departureAddrCode = departureAddrCode;
	}

	public String getArriveWxTraffic() {
		return arriveWxTraffic;
	}

	public void setArriveWxTraffic(String arriveWxTraffic) {
		this.arriveWxTraffic = arriveWxTraffic;
	}

	public String getArriveWxTrafficode() {
		return arriveWxTrafficode;
	}

	public void setArriveWxTrafficode(String arriveWxTrafficode) {
		this.arriveWxTrafficode = arriveWxTrafficode;
	}

	public String getIsTwoWeekVirus() {
		return isTwoWeekVirus;
	}

	public void setIsTwoWeekVirus(String isTwoWeekVirus) {
		this.isTwoWeekVirus = isTwoWeekVirus;
	}

	public String getHouseholdCode() {
		return householdCode;
	}

	public void setHouseholdCode(String householdCode) {
		this.householdCode = householdCode;
	}

	public String getHouseholdName() {
		return householdName;
	}

	public void setHouseholdName(String householdName) {
		this.householdName = householdName;
	}

	public String getEmergencyPerson() {
		return emergencyPerson;
	}

	public void setEmergencyPerson(String emergencyPerson) {
		this.emergencyPerson = emergencyPerson;
	}

	public String getEmergencyPhone() {
		return emergencyPhone;
	}

	public void setEmergencyPhone(String emergencyPhone) {
		this.emergencyPhone = emergencyPhone;
	}

	public String getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getCurrentDistrict() {
		return currentDistrict;
	}

	public void setCurrentDistrict(String currentDistrict) {
		this.currentDistrict = currentDistrict;
	}

	public String getStreetCode() {
		return streetCode;
	}

	public void setStreetCode(String streetCode) {
		this.streetCode = streetCode;
	}

	public String getCurrentStreet() {
		return currentStreet;
	}

	public void setCurrentStreet(String currentStreet) {
		this.currentStreet = currentStreet;
	}

	public String getCommunityCode() {
		return communityCode;
	}

	public void setCommunityCode(String communityCode) {
		this.communityCode = communityCode;
	}

	public String getCurrentCommunity() {
		return currentCommunity;
	}

	public void setCurrentCommunity(String currentCommunity) {
		this.currentCommunity = currentCommunity;
	}

	public String getPoliceStationCode() {
		return policeStationCode;
	}

	public void setPoliceStationCode(String policeStationCode) {
		this.policeStationCode = policeStationCode;
	}

	public String getPoliceStation() {
		return policeStation;
	}

	public void setPoliceStation(String policeStation) {
		this.policeStation = policeStation;
	}

	public String getHousingName() {
		return housingName;
	}

	public void setHousingName(String housingName) {
		this.housingName = housingName;
	}

	public String getAllopatryCode() {
		return allopatryCode;
	}

	public void setAllopatryCode(String allopatryCode) {
		this.allopatryCode = allopatryCode;
	}

	public String getAllopatryName() {
		return allopatryName;
	}

	public void setAllopatryName(String allopatryName) {
		this.allopatryName = allopatryName;
	}

	public String getLiveAddress() {
		return liveAddress;
	}

	public void setLiveAddress(String liveAddress) {
		this.liveAddress = liveAddress;
	}

	public String getIsHot() {
		return isHot;
	}

	public void setIsHot(String isHot) {
		this.isHot = isHot;
	}

	public String getIsLeave() {
		return isLeave;
	}

	public void setIsLeave(String isLeave) {
		this.isLeave = isLeave;
	}

	public String getIsStay() {
		return isStay;
	}

	public void setIsStay(String isStay) {
		this.isStay = isStay;
	}

	public String getIsHealthy() {
		return isHealthy;
	}

	public void setIsHealthy(String isHealthy) {
		this.isHealthy = isHealthy;
	}

	public String getIsolationDays() {
		return isolationDays;
	}

	public void setIsolationDays(String isolationDays) {
		this.isolationDays = isolationDays;
	}

	public String getIsolationDate() {
		return isolationDate;
	}

	public void setIsolationDate(String isolationDate) {
		this.isolationDate = isolationDate;
	}

	public String getCheckCode() {
		return checkCode;
	}

	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}

	public String getCheckPerson() {
		return checkPerson;
	}

	public void setCheckPerson(String checkPerson) {
		this.checkPerson = checkPerson;
	}

	public String getPunchDate() {
		return punchDate;
	}

	public void setPunchDate(String punchDate) {
		this.punchDate = punchDate;
	}

	public String getAttenDays() {
		return attenDays;
	}

	public void setAttenDays(String attenDays) {
		this.attenDays = attenDays;
	}

	public String getTipsCode() {
		return tipsCode;
	}

	public void setTipsCode(String tipsCode) {
		this.tipsCode = tipsCode;
	}

	public String getAlarmCode() {
		return alarmCode;
	}

	public void setAlarmCode(String alarmCode) {
		this.alarmCode = alarmCode;
	}

	public String getIsRespiraSick() {
		return isRespiraSick;
	}

	public void setIsRespiraSick(String isRespiraSick) {
		this.isRespiraSick = isRespiraSick;
	}

	public String getIsAddressRight() {
		return isAddressRight;
	}

	public void setIsAddressRight(String isAddressRight) {
		this.isAddressRight = isAddressRight;
	}

	public String getTwoWeekTravel() {
		return twoWeekTravel;
	}

	public void setTwoWeekTravel(String twoWeekTravel) {
		this.twoWeekTravel = twoWeekTravel;
	}

	public String getPassAddrName() {
		return passAddrName;
	}

	public void setPassAddrName(String passAddrName) {
		this.passAddrName = passAddrName;
	}

	public String getPassAddrCode() {
		return passAddrCode;
	}

	public void setPassAddrCode(String passAddrCode) {
		this.passAddrCode = passAddrCode;
	}

	public String getTranStatus() {
		return tranStatus;
	}

	public void setTranStatus(String tranStatus) {
		this.tranStatus = tranStatus;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getIsReturnWuxi() {
		return isReturnWuxi;
	}

	public void setIsReturnWuxi(String isReturnWuxi) {
		this.isReturnWuxi = isReturnWuxi;
	}

	public String getCommunityFlag() {
		return communityFlag;
	}

	public void setCommunityFlag(String communityFlag) {
		this.communityFlag = communityFlag;
	}

	public String getPersonAuthFlag() {
		return personAuthFlag;
	}

	public void setPersonAuthFlag(String personAuthFlag) {
		this.personAuthFlag = personAuthFlag;
	}

	public String getPersonAuthChannel() {
		return personAuthChannel;
	}

	public void setPersonAuthChannel(String personAuthChannel) {
		this.personAuthChannel = personAuthChannel;
	}

	public String getPersonAuthTime() {
		return personAuthTime;
	}

	public void setPersonAuthTime(String personAuthTime) {
		this.personAuthTime = personAuthTime;
	}

	public String getRoundTripCode() {
		return roundTripCode;
	}

	public void setRoundTripCode(String roundTripCode) {
		this.roundTripCode = roundTripCode;
	}

	public String getRoundTripName() {
		return roundTripName;
	}

	public void setRoundTripName(String roundTripName) {
		this.roundTripName = roundTripName;
	}

	public String getWorkUnit() {
		return workUnit;
	}

	public void setWorkUnit(String workUnit) {
		this.workUnit = workUnit;
	}

	public String getSchoolCode() {
		return schoolCode;
	}

	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}

	public String getResOne() {
		return resOne;
	}

	public void setResOne(String resOne) {
		this.resOne = resOne;
	}

	public String getResTwo() {
		return resTwo;
	}

	public void setResTwo(String resTwo) {
		this.resTwo = resTwo;
	}

	public String getResThree() {
		return resThree;
	}

	public void setResThree(String resThree) {
		this.resThree = resThree;
	}

	public String getResFour() {
		return resFour;
	}

	public void setResFour(String resFour) {
		this.resFour = resFour;
	}

	public String getResFive() {
		return resFive;
	}

	public void setResFive(String resFive) {
		this.resFive = resFive;
	}

	public String getPaaswayCodes() {
		return paaswayCodes;
	}

	public void setPaaswayCodes(String paaswayCodes) {
		this.paaswayCodes = paaswayCodes;
	}

	public String getImgUpdateTime() {
		return imgUpdateTime;
	}

	public void setImgUpdateTime(String imgUpdateTime) {
		this.imgUpdateTime = imgUpdateTime;
	}

	public String getPunchTime() {
		return punchTime;
	}

	public void setPunchTime(String punchTime) {
		this.punchTime = punchTime;
	}

	public String getResponseTime() {
		return responseTime;
	}

	public void setResponseTime(String responseTime) {
		this.responseTime = responseTime;
	}

	public String getFlagFreshTime() {
		return flagFreshTime;
	}

	public void setFlagFreshTime(String flagFreshTime) {
		this.flagFreshTime = flagFreshTime;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getCurrentPersonImg() {
		return currentPersonImg;
	}

	public void setCurrentPersonImg(String currentPersonImg) {
		this.currentPersonImg = currentPersonImg;
	}
	
    
	public String getWxLiveTypeName() {
		return wxLiveTypeName;
	}

	public void setWxLiveTypeName(String wxLiveTypeName) {
		this.wxLiveTypeName = wxLiveTypeName;
	}
	
	

	public String getIsHotName() {
		return isHotName;
	}

	public void setIsHotName(String isHotName) {
		this.isHotName = isHotName;
	}

	public String getIsLeaveName() {
		return isLeaveName;
	}

	public void setIsLeaveName(String isLeaveName) {
		this.isLeaveName = isLeaveName;
	}

	public String getIsStayName() {
		return isStayName;
	}

	public void setIsStayName(String isStayName) {
		this.isStayName = isStayName;
	}
	
	

	public String getCheckPersonName() {
		return checkPersonName;
	}

	public void setCheckPersonName(String checkPersonName) {
		this.checkPersonName = checkPersonName;
	}

	private static final long serialVersionUID = 1L;

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

	public String getUpdateFlagName() {
		return updateFlagName;
	}

	public void setUpdateFlagName(String updateFlagName) {
		this.updateFlagName = updateFlagName;
	}

	public String getPersonAuthFlagName() {
		return personAuthFlagName;
	}

	public void setPersonAuthFlagName(String personAuthFlagName) {
		this.personAuthFlagName = personAuthFlagName;
	}
	
	
}
