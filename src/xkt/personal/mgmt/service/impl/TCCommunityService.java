package xkt.personal.mgmt.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import xkt.personal.mgmt.bo.TCCommuity;
import xkt.personal.mgmt.bo.TCCommuityCheckerRela;
import xkt.personal.mgmt.bo.TCCommuityCheckerRelaCriteria;
import xkt.personal.mgmt.bo.TCCommuityCriteria;
import xkt.personal.mgmt.bo.TCCommuityVerifierRela;
import xkt.personal.mgmt.bo.TCCommuityVerifierRelaCriteria;
import xkt.personal.mgmt.bo.TCHealthCodeAdmin;
import xkt.personal.mgmt.bo.TCHealthCommunityInfo;
import xkt.personal.mgmt.bo.TCHealthCommunityInfoCriteria;
import xkt.personal.mgmt.bo.TCHealthUserCommunityRelate;
import xkt.personal.mgmt.dao.xkm.TCCommuityCheckerRelaDao;
import xkt.personal.mgmt.dao.xkm.TCCommuityDao;
import xkt.personal.mgmt.dao.xkm.TCCommuityVerifierRelaDao;
import xkt.personal.mgmt.service.ITCCommunityService;
import xkt.personal.mgmt.service.ITCHealthCommunityInfoService;
import xkt.personal.mgmt.utils.CodeConstant;
import xkt.personal.mgmt.utils.IdWorker;

import com.ls.pf.base.api.framework.Service;
import com.ls.pf.base.api.framework.ServiceAutowired;
import com.ls.pf.base.api.framework.ServiceType;
/**
 * 
 * @ClassName: TCCommunityService   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author: Zurong Hu
 * @Create Date: 2020年3月3日 下午8:30:59 Zurong Hu.
 *   
 * @version V1.0
 * @History: 2020年3月3日 下午8:30:59 Zurong Hu Created.
 */
@Service(target = { ServiceType.APPLICATION }, value = "tCCommunityService")
public class TCCommunityService implements
		ITCCommunityService {
	@Autowired
	TCCommuityDao commuityDao;
	@Autowired
	TCCommuityCheckerRelaDao checkerRelaDao;
	@Autowired
	TCCommuityVerifierRelaDao verifierRelaDao;
	@Autowired
	private IdWorker idWorker;
	@ServiceAutowired
	private ITCHealthCommunityInfoService healthCommunityInfoService;
//	private ITGRegionCatalogService tgRegionCatalogService;
	
	
	
	/**
	 * 导入操作 小区统一处理
	 * @Title: importCommunityComm  
	 * @Description:   
	 * @param bo
	 * type:0/审核员  1/核验员
	 * id:对应 审核员/核验员 主键
	 * @return   
	 * @see xkt.personal.mgmt.service.ITCCommunityService#importCommunityComm(xkt.personal.mgmt.bo.TCCommuity)
	 */	
	public Boolean importCommunityComm(TCCommuity bo,Object imortBo) throws Exception{
		//判断小区是否存在
		TCCommuityCriteria example = new TCCommuityCriteria();
		TCCommuityCriteria.Criteria criteria = example.createCriteria();
		criteria.andCommuityNameEqualTo(bo.getCommuityName());
		criteria.andVillageCodeEqualTo(bo.getVillageCode());
		List<TCCommuity> commuitys = commuityDao.selectByExample(example);
		if(commuitys==null||commuitys.size()==0){//不存在，新增
			bo.setCommuityId(idWorker.nextId()+"");
			//bo.setCommuityNo(bo.getCommuityId());
			//TODO 暂时默认省码和市码
			bo.setProvinceCode(CodeConstant.PROVINCE_CODE);
			bo.setCityCode(CodeConstant.CITY_CODE);
			//根据社区编号 获取 省市区街道
			TCHealthCommunityInfoCriteria regionExpl = new  TCHealthCommunityInfoCriteria();
			TCHealthCommunityInfoCriteria.Criteria regionCte = regionExpl.createCriteria();
			regionCte.andCommunityCodeEqualTo(bo.getVillageCode());
			List<TCHealthCommunityInfo> communityInfoList = healthCommunityInfoService.selectByExample(regionExpl);
			if(!CollectionUtils.isEmpty(communityInfoList)){
				TCHealthCommunityInfo communityInfo = communityInfoList.get(0);
				if(null!=communityInfo){
					String streetCode = communityInfo.getpId();//街道编码
					if(StringUtils.isNotEmpty(streetCode)){
						bo.setStreetCode(streetCode);
						TCHealthCommunityInfoCriteria regionExp2 = new  TCHealthCommunityInfoCriteria();
						TCHealthCommunityInfoCriteria.Criteria regionCte2 = regionExp2.createCriteria();
						regionCte2.andCommunityCodeEqualTo(streetCode);
						List<TCHealthCommunityInfo> streetInfoList = healthCommunityInfoService.selectByExample(regionExp2);
						if(!CollectionUtils.isEmpty(streetInfoList)){//街道信息
							TCHealthCommunityInfo streetInfo = streetInfoList.get(0);
							if(null!=streetInfo){//区域编码
								bo.setCountyCode(streetInfo.getpId());
							}
						}
					}
				}
			}
			// TODO 地址全称
			//bo.setCommuityAddr(commuityAddr);
			commuityDao.insert(bo);
		}else{
			bo = commuitys.get(0);
		}
		
		//关系表
		if(imortBo instanceof TCHealthCodeAdmin){//审核员
			TCHealthCodeAdmin chk = (TCHealthCodeAdmin) imortBo;
			//判断小区和检验员关系是否存在  检验员和小区已导入或系统中存在
			TCCommuityCheckerRelaCriteria ckkCte = new TCCommuityCheckerRelaCriteria();
			TCCommuityCheckerRelaCriteria.Criteria chkExpl = ckkCte.createCriteria();
			chkExpl.andCommuityIdEqualTo(bo.getCommuityId());
			chkExpl.andCheckerIdEqualTo(chk.getId());
			int ct = checkerRelaDao.countByExample(ckkCte);
			if(ct>0){
//				EEOSBusinessException e = new EEOSBusinessException("审核员："+chk.getRealName()+"系统中已存在，不允许重复导入"
//						,  new Object[] {}, this.getClass());
//				throw e;
				System.out.println(">>>>>>>>>>>>>存在重复的关系："+chk.getRealName());
				return true;
			}
			TCCommuityCheckerRela chkRela = new TCCommuityCheckerRela();
			chkRela.setRelaId(idWorker.nextId()+"");
			chkRela.setCommuityId(bo.getCommuityId());
			chkRela.setCheckerId(chk.getId());
			checkerRelaDao.insert(chkRela);
		}else if(imortBo instanceof TCHealthUserCommunityRelate){//核验员
			TCHealthUserCommunityRelate verf = (TCHealthUserCommunityRelate) imortBo;
			//判断小区和检验员关系是否存在  检验员和小区已导入或系统中存在
			TCCommuityVerifierRelaCriteria verCte = new TCCommuityVerifierRelaCriteria();
			TCCommuityVerifierRelaCriteria.Criteria verExpl = verCte.createCriteria();
			verExpl.andCommuityIdEqualTo(bo.getCommuityId());
			verExpl.andVerifierIdEqualTo(verf.getId());
			int ct = verifierRelaDao.countByExample(verCte);
			if(ct>0){
//				EEOSBusinessException e = new EEOSBusinessException("核验员："+verf.getRealName()+"系统中已存在，不允许重复导入"
//						,  new Object[] {}, this.getClass());
//				throw e;
				System.out.println(">>>>>>>>>>>>>存在重复的关系："+verf.getRealName());
				return true;
			}
			TCCommuityVerifierRela vfyRela = new TCCommuityVerifierRela();
			vfyRela.setRelaId(idWorker.nextId()+"");
			vfyRela.setCommuityId(bo.getCommuityId());
			vfyRela.setVerifierId(verf.getId());
			verifierRelaDao.insert(vfyRela);
		}
		return true;
	}
	public int deleteByPrimaryKey(String paramString) {
		return commuityDao.deleteByPrimaryKey(paramString);
	}
	public int insert(TCCommuity paramTCCommuity) {
		return commuityDao.insert(paramTCCommuity);
	}
	public int updateByPrimaryKey(TCCommuity paramTCCommuity) {
		return commuityDao.updateByPrimaryKey(paramTCCommuity);
	}
	public int countByExampleAndPage(Map<String, String> paramMap) {
		return commuityDao.countByExampleAndPage(paramMap);
	}
	public List<TCCommuity> selectByPage(
			Map<String, String> paramMap) {
		return commuityDao.selectByPage(paramMap);
	}
	public TCCommuity selectByPrimaryKey(String commuityId) {
		return this.commuityDao.selectByPrimaryKey(commuityId);
	}
	
	/**
	 * 查询验证员下的小区
	 * @Title: selectByVerify  
	 * @Description:   
	 * @param verifierId
	 * @return   
	 * @see xkt.personal.mgmt.service.ITCCommunityService#selectByVerify(java.lang.String)
	 */
	public List<TCCommuity> selectByVerify(Map<String, String> inMap) {
		return commuityDao.selectByVerify(inMap);
	}
	public int countByVerify(Map<String, String> inMap) {
		return commuityDao.countByVerify(inMap);
	}
	/**
	 * 查询审核员下的小区
	 * @Title: selectByChecker  
	 * @Description:   
	 * @param checkerId
	 * @return   
	 * @see xkt.personal.mgmt.service.ITCCommunityService#selectByChecker(java.lang.String)
	 */
	public List<TCCommuity> selectByChecker(Map<String, String> inMap) {
		return commuityDao.selectByChecker(inMap);
	}
	public int countByChecker(Map<String, String> inMap) {
		return commuityDao.countByChecker(inMap);
	}
}
