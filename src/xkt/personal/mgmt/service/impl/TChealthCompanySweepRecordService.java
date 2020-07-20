package xkt.personal.mgmt.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import xkt.personal.mgmt.dao.xkm.ScanCommunityCodeDao;
import xkt.personal.mgmt.dao.xkm.TCHealthCompanySweepRecordDao;
import xkt.personal.mgmt.service.ITCHealthCompanySweepRecordService;
import xkt.personal.mgmt.web.vo.CompanySweepRecordVo;

import com.ls.pf.base.api.framework.Service;

@Service
public class TChealthCompanySweepRecordService implements ITCHealthCompanySweepRecordService{
	
	
	@Autowired
	private TCHealthCompanySweepRecordDao tcHealthCompanySweepRecordDao;
	
	@Autowired
	private ScanCommunityCodeDao scanCommunityCodeDao;
	
	
	@Override
	public List<CompanySweepRecordVo> selectRecordByCertCode(Map<String, Object> val) {
		List<Map<String,Object>> list=tcHealthCompanySweepRecordDao.selectRecordByCertCode(val);
		List<CompanySweepRecordVo> listVo=new ArrayList<CompanySweepRecordVo>();
		for (Map<String, Object> map : list) {
			CompanySweepRecordVo vo=new CompanySweepRecordVo();
			vo.setCertCode((String)map.get("CERT_CODE"));
			vo.setCompanyId((String)map.get("company_id"));
			vo.setCreateTime(map.get("CREATE_TIME").toString());
			vo.setOpenId((String)map.get("open_id"));
			vo.setRealName((String)map.get("REAL_NAME"));
			vo.setCompanyName((String)map.get("COMPANY_NAME"));
			vo.setIsHealth((String)map.get("is_health"));
			vo.setLatitude((String)map.get("LATITUDE"));
			vo.setId((String)map.get("id"));
			vo.setCompanyAddress((String)map.get("reg_address"));
			vo.setCompanySubName((String)map.get("company_sub_name"));
			
			listVo.add(vo);
		}
		return listVo;
	}

	@Override
	public int countRecordByCertCode(Map<String, Object> val) {
		// TODO Auto-generated method stub
		return tcHealthCompanySweepRecordDao.countRecordByCertCode(val);
	}

	@Override
	public List<Map<String, Object>> selectPersonalScanByCompanyIdScanDate(
			Map<String, Object> inMap) {
		
		return tcHealthCompanySweepRecordDao.selectPersonalScanByCompanyIdScanDate(inMap);
	}

	@Override
	public int countPersonalScanByCompanyIdScanDate(Map<String, Object> inMap) {
		// TODO Auto-generated method stub
		return tcHealthCompanySweepRecordDao.countPersonalScanByCompanyIdScanDate(inMap);
	}

	

}
