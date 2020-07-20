package xkt.personal.mgmt.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import xkt.personal.mgmt.dao.statistic.XcsTmpHong6ZhangZongDao;
import xkt.personal.mgmt.dao.xkm.TCHealthCodeModifyRecordDao;
import xkt.personal.mgmt.service.IPersonalInfoChangeRecordService;
import xkt.personal.mgmt.web.vo.PersonalInfoChangeRecordVo;

import com.ls.pf.base.api.framework.Service;

@Service
public class PersonalInfoChangeRecordServiceImpl implements
		IPersonalInfoChangeRecordService {

	@Autowired
	private TCHealthCodeModifyRecordDao healthCodeModifyRecordDao;

	@Autowired
	private XcsTmpHong6ZhangZongDao tmpHong6ZhangZongDao;

	@Override
	public List<PersonalInfoChangeRecordVo> queryPersonalInfoChangeRecord(
			Map<String, Object> map) {
		List<Map<String, Object>> resList1 = healthCodeModifyRecordDao
				.queryModifyRecord(map);
		List<PersonalInfoChangeRecordVo> resListVo = new ArrayList<PersonalInfoChangeRecordVo>();
		try {
			for (Map<String, Object> map1 : resList1) {
				PersonalInfoChangeRecordVo vo = new PersonalInfoChangeRecordVo();
				if(map1.get("is_healthy_after")!=null){
					vo.setIsHealthy(map1.get("is_healthy_after").toString());
				}
				if(map1.get("modify_reason")!=null){
					vo.setReason(map1.get("modify_reason").toString());
				}
				SimpleDateFormat sdf = new SimpleDateFormat(
						"yyyy-MM-dd hh:mm:ss");
				Date date = sdf.parse(map1.get("update_time").toString());
				vo.setUpdateTime(date);
				resListVo.add(vo);
			}
			List<Map<String, Object>> resList2 = tmpHong6ZhangZongDao
					.queryChangeRecordByCertCode(map);
			for (Map<String, Object> map2 : resList2) {
				PersonalInfoChangeRecordVo vo = new PersonalInfoChangeRecordVo();
				if(map.get("isHealthy")!=null){
					vo.setIsHealthy(map.get("isHealthy").toString()); // 这里的isHealthy的确是从controller里传过来的
				}
				if(map2.get("beizhu")!=null){
					vo.setReason(map2.get("reason").toString());
				}
				SimpleDateFormat sdf = new SimpleDateFormat(
						"yyyy-MM-dd hh:mm:ss");
				Date date = sdf.parse(map2.get("create_time").toString());
				vo.setUpdateTime(date);
				resListVo.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resListVo;
	}

}
