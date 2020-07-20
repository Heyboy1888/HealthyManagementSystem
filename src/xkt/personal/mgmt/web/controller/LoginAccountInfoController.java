package xkt.personal.mgmt.web.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import xkt.personal.mgmt.bo.TCHealthCommunityInfo;
import xkt.personal.mgmt.bo.TCHealthCommunityInfoCriteria;
import xkt.personal.mgmt.service.ILoginAccountInfoService;
import xkt.personal.mgmt.service.ITCHealthCommunityInfoService;
import xkt.personal.mgmt.utils.CodeConstant;
import xkt.personal.mgmt.utils.IdWorker;
import xkt.personal.mgmt.web.vo.LoginAccountInfoVo;

import com.ls.pf.base.api.auth.IAccountService;
import com.ls.pf.base.api.auth.IStaffService;
import com.ls.pf.base.api.auth.bo.AccountBo;
import com.ls.pf.base.api.auth.bo.StaffBo;
import com.ls.pf.base.api.framework.ServiceAutowired;
import com.ls.pf.base.api.security.Authentication;
import com.ls.pf.base.api.sysparam.ISysParamService;
import com.ls.pf.base.api.sysparam.SysParamBO;
import com.ls.pf.base.common.rest.annotation.ItemResponseBody;
import com.ls.pf.base.common.rest.annotation.QueryRequestParam;
import com.ls.pf.base.common.rest.object.QueryController;
import com.ls.pf.base.common.rest.object.QueryResultObject;
import com.ls.pf.base.common.rest.object.RequestCondition;
import com.ls.pf.base.common.rest.object.WrappedResult;
import com.ls.pf.base.common.rest.utils.RestUtils;
import com.ls.pf.base.utils.tools.SecurityUtil;

@Controller
@RequestMapping(value = "/loginAccountController")
public class LoginAccountInfoController extends
		QueryController<LoginAccountInfoVo> {

	private static final String INIT_PAGE = "/personal/mgmt/account/loginAccountInfoMain";

	private static final String EDIT_PAGE = "/personal/mgmt/account/loginAccountInfoEdit";

	@Autowired
	private IdWorker idWorker;

	@ServiceAutowired
	private ILoginAccountInfoService loginAccountInfoService;

	@ServiceAutowired
	private IAccountService accountService;

	@ServiceAutowired
	private IStaffService staffService;

	@ServiceAutowired
	private Authentication authentication;

	@ServiceAutowired
	private ISysParamService sysParamService;
	
	@ServiceAutowired
	private ITCHealthCommunityInfoService tcHealthCommunityInfoService;

	/**
	 * 
	 * @Title: init
	 * @Description: 界面初始化
	 * @Author: donganmin
	 * @Create Date: 2020年2月28日 下午3:04:17
	 * @History: 2020年2月28日 下午3:04:17 donganmin Created.
	 *
	 * @param request
	 * @return
	 *
	 */
	@RequestMapping(value = "/init")
	public String init(HttpServletRequest request) {
		LoginAccountInfoVo vo = new LoginAccountInfoVo();


		request.setAttribute("districtTypeList", CodeConstant.DISTRICT_TYPE_MAP_LIST);
		request.setAttribute("loginAccountInfoForm", vo);
		return INIT_PAGE;
	}

	/**
	 * 
	 * @Title: query
	 * @Description: 查询登入账号信息
	 * @Author: donganmin
	 * @Create Date: 2020年2月28日 下午3:14:04
	 * @History: 2020年2月28日 下午3:14:04 donganmin Created.
	 *
	 * @param params
	 * @return
	 * @throws Exception
	 *
	 */
	@RequestMapping(value = "/query")
	@ItemResponseBody
	public QueryResultObject query(
			@QueryRequestParam("params") RequestCondition params)
			throws Exception {
		LoginAccountInfoVo vo = this.rCondition2QCondition(params);
		Map<String, String> inMap = new HashMap<String, String>();
		inMap.put("districtCode", vo.getDistrictCode());
		inMap.put("accountName", vo.getAccountName());
		inMap.put("staffName", vo.getStaffName());
		inMap.put("staffIdentityCard", vo.getStaffIdentityCard());
		inMap.put("staffMobile", vo.getStaffMobile());
		inMap.put("createTimeFrom", vo.getCreateTimeFrom());
		inMap.put("createTimeTo", vo.getCreateTimeTo());
		inMap.put("pageBegin", String.valueOf(vo.getPageBegin()));
		inMap.put("pageEnd", String.valueOf(vo.getPageEnd()));
		List<LoginAccountInfoVo> listVO = this.loginAccountInfoService
				.selectByPage(inMap);
		List<LoginAccountInfoVo> vos = new ArrayList<LoginAccountInfoVo>();
		for (LoginAccountInfoVo aVo : listVO) {
			LoginAccountInfoVo lVo = new LoginAccountInfoVo();
			lVo.setId(aVo.getId());
			lVo.setAccountId(aVo.getAccountId());
			String districtCode = aVo.getDistrictCode();
			if (StringUtils.isNotEmpty(districtCode)) {
				TCHealthCommunityInfo healthCommunityInfo = getHealthCommunityInfoByCode(districtCode);
				if (null != healthCommunityInfo) {
					String grade = healthCommunityInfo.getGrade();
					String name = healthCommunityInfo.getCommunityName();
					switch (grade) {
					case "1":
						lVo.setDistrictType("市");
						break;
					case "2":
						lVo.setDistrictType("区/县级市");
						break;
					case "3":
						lVo.setDistrictType("街道/镇");
						break;
					case "4":
						lVo.setDistrictType("社区/村");
						break;
					default:
						break;
					}
					lVo.setDistrictName(name);
				}
			}
			lVo.setDistrictCode(aVo.getDistrictCode());
			lVo.setAccountName(aVo.getAccountName());
			lVo.setStaffName(aVo.getStaffName());
			lVo.setStaffIdentityCard(aVo.getStaffIdentityCard());
			lVo.setStaffMobile(aVo.getStaffMobile());
			lVo.setAccountCreateDate(aVo.getAccountCreateDate());
			switch (aVo.getIsMainAccount()) {
			case "1":
				lVo.setIsMainAccount("是");
				break;
			case "2":
				lVo.setIsMainAccount("否");
				break;
			default:
				break;
			}
			vos.add(lVo);
		}
		int count = this.loginAccountInfoService.queryCount(inMap);
		return RestUtils.wrappQueryResult(vos, count);
	}

	/**
	 * 
	 * @Title: delete
	 * @Description: 删除
	 * @Author: donganmin
	 * @Create Date: 2020年2月28日 下午3:50:19
	 * @History: 2020年2月28日 下午3:50:19 donganmin Created.
	 *
	 * @param id
	 * @return
	 * @throws Exception
	 *
	 */
	@RequestMapping("/del/{id}")
	@ItemResponseBody
	public WrappedResult delete(@PathVariable("id") String id) throws Exception {
		List<String> accountIds = new ArrayList<String>();
		accountIds.add(id);
		List<String> staffIds = new ArrayList<String>();
		staffIds.add(accountService.getAccountInfoByAccountId(id).getStaffId());
		try {
			accountService.deleteAccountBo(accountIds);
			staffService.deleteStaffBo(staffIds);
			System.out.println("删除成功！");
			return new WrappedResult(true, 0, "删除成功!");
		} catch (Exception e) {
			System.out.println("删除失败！");
			return new WrappedResult(true, 0, "删除失败!");
		}
	}

	/**
	 * 
	 * @Title: addOrEdit
	 * @Description: 修改或新增账号信息
	 * @Author: donganmin
	 * @Create Date: 2020年2月28日 下午3:54:36
	 * @History: 2020年2月28日 下午3:54:36 donganmin Created.
	 *
	 * @param request
	 * @param id
	 * @return
	 *
	 */
	@RequestMapping("/edit")
	public String addOrEdit(HttpServletRequest request,
			@RequestParam(value = "id", required = false) String id) {
		LoginAccountInfoVo editVo = new LoginAccountInfoVo();
		if (StringUtils.isNotEmpty(id)) {// 修改
			editVo = loginAccountInfoService.selectByPrimaryKey(id);
			String codeString = editVo.getDistrictCode();
			
			TCHealthCommunityInfo  communityInfo =  this.getHealthCommunityInfoByCode(codeString);
			if(null != communityInfo){
				String graderString = communityInfo.getGrade();
				editVo.setDistrictType(graderString);
				editVo.setDistrictName(communityInfo.getCommunityCode());
				TCHealthCommunityInfoCriteria example = new  TCHealthCommunityInfoCriteria(); 
				TCHealthCommunityInfoCriteria.Criteria criteria = example.createCriteria();
				criteria.andGradeEqualTo(graderString);
				List<TCHealthCommunityInfo> retCommunityInfos = this.tcHealthCommunityInfoService.selectByExample(example);
				if(!CollectionUtils.isEmpty(retCommunityInfos)){
					List<Map<String, String>> districtNameList = new LinkedList<Map<String, String>>();
					for (TCHealthCommunityInfo retCommunityInfo : retCommunityInfos) {
						Map<String, String> map = new HashMap<String, String>();
						map.put("text", retCommunityInfo.getCommunityName());
						map.put("value", retCommunityInfo.getCommunityCode());
						districtNameList.add(map);
					}
					request.setAttribute("districtNameList", districtNameList);
				}
			}
		}
		
		request.setAttribute("districtTypeList", CodeConstant.DISTRICT_TYPE_MAP_LIST);
		request.setAttribute("isMainAccountList", CodeConstant.IS_NOT_VALUE_MAP_LIST);
		request.setAttribute("loginAccountEditForm", editVo);
		return EDIT_PAGE;
	}

	/**
	 * 
	 * @Title: save
	 * @Description: 新增或修改后保存
	 * @Author: donganmin
	 * @Create Date: 2020年2月28日 下午4:27:24
	 * @History: 2020年2月28日 下午4:27:24 donganmin Created.
	 *
	 * @param id
	 * @param vo
	 * @return
	 *
	 */
	@RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST)
	public @ItemResponseBody WrappedResult saveOrUpdate(
			@RequestBody LoginAccountInfoVo vo, HttpServletRequest request) {
		if ("-1".equals(vo.getAccountId())) {// 新增
			AccountBo qbo = accountService.getAccountByStateAndName(
					vo.getAccountName(), null);
			// 账号未存在
			if (qbo == null) {
				AccountBo accountBo = new AccountBo();
				StaffBo staffBo = new StaffBo();
				long accountId = idWorker.nextId();
				String accountIdString = accountId + "";
				long staffId = idWorker.nextId();
				String staffIdString = staffId + "";
				accountBo.setId(accountIdString);
				accountBo.setName(vo.getAccountName());
				accountBo.setType("1");
				accountBo.setState("1");
				accountBo.setLocked("0");
				accountBo.setCreateDate(new Date());
				accountBo.setStaffId(staffIdString);
				accountBo.setStaffName(vo.getStaffName());
				accountBo.setIsMainAccount(vo.getIsMainAccount());
				try {
					String defaultPwd = "1";
					SysParamBO sysbo = this.sysParamService.getSysParam(
							"ACCOUNT_DEFAULT_PWD", request);
					String pwd = sysbo.getDefaultValue();
					String valueType = sysbo.getValueType();
					if (!com.ls.pf.base.utils.tools.StringUtils
							.nullOrBlank(pwd)) {
						if ("3".equals(valueType)) {
							byte[] pwds = SecurityUtil
									.decrypt(com.ls.pf.base.utils.tools.StringUtils
											.decodeBase64(pwd));
							defaultPwd = new String(pwds);
						} else {
							defaultPwd = pwd;
						}
					}
					accountBo.setPassword(SecurityUtil.passwordEncryptEx(vo
							.getAccountName().toUpperCase(), defaultPwd));
				} catch (Exception e1) {
					return new WrappedResult(false, -1, "设置默认密码失败!");
				}
				staffBo.setId(staffIdString);
				staffBo.setName(vo.getStaffName());
				long staffNo = idWorker.nextId();
				String staffNoString = staffNo + "";
				staffBo.setNo(staffNoString);
				staffBo.setSex("1");
				staffBo.setIdentityCard(vo.getStaffIdentityCard());
				staffBo.setMobile(vo.getStaffMobile());
				staffBo.setOrgNo(vo.getDistrictName());

				try {
					accountService.addAccountBo(accountBo);
					staffService.addStaffBo(staffBo);
					return new WrappedResult(true, 0, "登入账号信息新增成功!");
				} catch (Exception e) {
					return new WrappedResult(false, -1, "登入账号信息新增失败!");
				}
			} else { // 账号已存在
				return new WrappedResult(false, -1, "该账号已存在!");
			}

		} else {// 修改
			AccountBo accountBo = new AccountBo();
			StaffBo staffBo = new StaffBo();

			accountBo.setId(vo.getAccountId());
			accountBo.setName(vo.getAccountName());
			accountBo.setStaffName(vo.getStaffName());
			accountBo.setIsMainAccount(vo.getIsMainAccount());
			SimpleDateFormat formatter = new SimpleDateFormat(
					"yyyy-MM-dd HH:mm:ss");
			String now = formatter.format(new Date());
			accountBo.setModifyDate(now);
			accountBo.setModifyId(authentication.getCurrentAccount().getId());

			staffBo.setId(vo.getStaffId());
			staffBo.setName(vo.getStaffName());
			staffBo.setIdentityCard(vo.getStaffIdentityCard());
			staffBo.setMobile(vo.getStaffMobile());
			staffBo.setOrgNo(vo.getDistrictName());
			try {
				accountService.updateAccountBo(accountBo);
				staffService.updateStaffBo(staffBo);
				return new WrappedResult(true, 0, "修改成功!");
			} catch (Exception e) {
				return new WrappedResult(false, -1, "修改失败!");
			}
		}
	}

	/**
	 * 
	 * @Title: changeDistrict
	 * @Description: 根据区域类型查询区域名称列表
	 * @Author: donganmin
	 * @Create Date: 2020年3月3日 下午9:05:38
	 * @History: 2020年3月3日 下午9:05:38 donganmin Created.
	 *
	 * @param level
	 * @param request
	 * @return
	 *
	 */
	@RequestMapping(value = "/changeDistrict", method = RequestMethod.POST)
	@ItemResponseBody
	public QueryResultObject changeDistrict(@RequestParam String level,
			HttpServletRequest request) {
		TCHealthCommunityInfoCriteria example = new TCHealthCommunityInfoCriteria();
		example.setOrderByClause("community_code");
		TCHealthCommunityInfoCriteria.Criteria criteria = example
				.createCriteria();
		criteria.andGradeEqualTo(level);
		List<TCHealthCommunityInfo> healthCommunityInfoList = tcHealthCommunityInfoService
				.selectByExample(example);
		List<Map<String, String>> codeList = new LinkedList<Map<String, String>>();
		for (TCHealthCommunityInfo healthCommunityInfo : healthCommunityInfoList) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("text", healthCommunityInfo.getCommunityName());
			map.put("value", healthCommunityInfo.getCommunityCode());
			codeList.add(map);
		}
		return RestUtils.wrappQueryResult(codeList);
	}

	/**
	 * 根据Code获取社区信息
	 * 
	 * @param code
	 * @return
	 */
	private TCHealthCommunityInfo getHealthCommunityInfoByCode(String code) {
		TCHealthCommunityInfoCriteria example = new TCHealthCommunityInfoCriteria();
		TCHealthCommunityInfoCriteria.Criteria criteria = example
				.createCriteria();
		if (StringUtils.isEmpty(code)) {
			return null;
		}
		criteria.andCommunityCodeEqualTo(code);
		List<TCHealthCommunityInfo> healthCommunityInfoList = tcHealthCommunityInfoService
				.selectByExample(example);
		if (CollectionUtils.isEmpty(healthCommunityInfoList)) {
			return null;
		}
		TCHealthCommunityInfo healthCommunityInfo = healthCommunityInfoList
				.get(0);
		return healthCommunityInfo;
	}

	@Override
	protected LoginAccountInfoVo initCondition() {
		return new LoginAccountInfoVo();
	}

}
