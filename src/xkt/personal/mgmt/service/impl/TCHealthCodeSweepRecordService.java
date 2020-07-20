package xkt.personal.mgmt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;









import xkt.personal.mgmt.bo.TCCommuityVerifierRelaCriteria;
import xkt.personal.mgmt.bo.TCHealthCodeSweepRecHis;
import xkt.personal.mgmt.bo.TCHealthCodeSweepRecHisExample;
import xkt.personal.mgmt.bo.TCHealthCodeSweepRecord;
import xkt.personal.mgmt.bo.TCHealthCodeSweepRecordExample;
import xkt.personal.mgmt.bo.TCHealthCodeSweepRecordExample.Criteria;
import xkt.personal.mgmt.dao.xkm.TCCommuityVerifierRelaDao;
import xkt.personal.mgmt.dao.xkm.TCHealthCodeSweepRecHisDao;
import xkt.personal.mgmt.dao.xkm.TCHealthCodeSweepRecordDao;
import xkt.personal.mgmt.dao.xkm.TCHealthUserCommunityRelateDao;
import xkt.personal.mgmt.service.ITCHealthCodeSweepRecordService;

@Service
public class TCHealthCodeSweepRecordService implements ITCHealthCodeSweepRecordService{
	
	@Autowired
	private TCHealthCodeSweepRecordDao tcHealthCodeSweepRecordDao;
	
	@Autowired
	private TCHealthCodeSweepRecHisDao tcHealthCodeSweepRecordHisDao;
	@Autowired
	private TCCommuityVerifierRelaDao verifierRelaDao;
	@Autowired
	private TCHealthUserCommunityRelateDao tcHealthUserCommunityRelateDao;
	@Override
	public int deleteCheckerIfNotExists(String id, String phone) {
		TCHealthCodeSweepRecordExample recordExample=new TCHealthCodeSweepRecordExample();
		Criteria criteriaSweepRecord=recordExample.createCriteria();
		criteriaSweepRecord.andCheckPersonEqualTo(phone);
		List<TCHealthCodeSweepRecord> listSweepRecord=tcHealthCodeSweepRecordDao.selectByExample(recordExample);
		if(!CollectionUtils.isEmpty(listSweepRecord)){
			return 0;
		}
		TCHealthCodeSweepRecHisExample recordHisExample=new TCHealthCodeSweepRecHisExample();
		xkt.personal.mgmt.bo.TCHealthCodeSweepRecHisExample.Criteria criteriaRecordHis=recordHisExample.createCriteria();
		criteriaRecordHis.andCheckPersonEqualTo(phone);
		List<TCHealthCodeSweepRecHis> lsitRecordHis=tcHealthCodeSweepRecordHisDao.selectByExample(recordHisExample);
		if(!CollectionUtils.isEmpty(lsitRecordHis)){
			return 0;
		}
		TCCommuityVerifierRelaCriteria example = new TCCommuityVerifierRelaCriteria();
		TCCommuityVerifierRelaCriteria.Criteria crt = example.createCriteria();
		crt.andVerifierIdEqualTo(id);
		verifierRelaDao.deleteByExample(example);
		int count= this.tcHealthUserCommunityRelateDao.deleteByPrimaryKey(id);
		if(count==1){
			return 1;
		}
		return -1;
	}
	
	
}
