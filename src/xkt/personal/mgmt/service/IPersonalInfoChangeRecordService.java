package xkt.personal.mgmt.service;

import java.util.List;
import java.util.Map;

import xkt.personal.mgmt.web.vo.PersonalInfoChangeRecordVo;

public interface IPersonalInfoChangeRecordService {
	List<PersonalInfoChangeRecordVo> queryPersonalInfoChangeRecord(Map<String,Object> map);
}
