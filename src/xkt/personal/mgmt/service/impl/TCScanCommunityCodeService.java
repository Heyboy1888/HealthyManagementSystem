package xkt.personal.mgmt.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import xkt.personal.mgmt.dao.xkm.ScanCommunityCodeDao;
import xkt.personal.mgmt.dao.xkm.TCHealthCompanySweepRecordDao;
import xkt.personal.mgmt.service.ITCScanCommunityCodeService;
import xkt.personal.mgmt.web.vo.ScanCommunityCodeVo;

import com.ls.pf.base.api.framework.Service;
import com.ls.pf.base.api.framework.ServiceType;

/**
 * @author : wangweilong
 * @version :2020年3月13日 下午8:22:19
 * 
 */
@Service(target = { ServiceType.APPLICATION }, value = "iTCScanCommunityCodeService")
public class TCScanCommunityCodeService implements ITCScanCommunityCodeService {

	@Autowired
	private ScanCommunityCodeDao scanCommunityCodeDao;

	@Autowired
	private TCHealthCompanySweepRecordDao tCHealthCompanySweepRecordDao;

	@Override
	public List<ScanCommunityCodeVo> selectByPage(Map<String, String> map) {
		return this.scanCommunityCodeDao.selectByPage(map);
	}

	@Override
	public int countByMap(Map<String, String> map) {
		return this.scanCommunityCodeDao.countByMap(map);
	}

	@Override
	public List<ScanCommunityCodeVo> selectBychecker(Map<String, Object> inMap) {
		return this.scanCommunityCodeDao.selectByChecker(inMap);
	}

	@Override
	public List<ScanCommunityCodeVo> selectCommunityByChecker(Map<String, Object> inMap) {

		return this.scanCommunityCodeDao.selectCommunityByChecker(inMap);
	}

	@Override
	public int countCommunityByChecker(Map<String, Object> map) {

		return this.scanCommunityCodeDao.countCommunityByChecker(map);
	}

}
