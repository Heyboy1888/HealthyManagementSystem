package xkt.personal.mgmt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import xkt.personal.mgmt.bo.TCCommuityVerifierRela;
import xkt.personal.mgmt.dao.xkm.TCCommuityVerifierRelaDao;
import xkt.personal.mgmt.service.ITCCommuityVerifierRelaService;

import com.ls.pf.base.api.framework.Service;
import com.ls.pf.base.api.framework.ServiceType;
@Service(target = { ServiceType.APPLICATION }, value = "tCCommuityVerifierRelaService")
public class TCCommuityVerifierRelaService implements ITCCommuityVerifierRelaService{
	@Autowired
	TCCommuityVerifierRelaDao dao;
	//批量新增
    public int insertByBatch(List<TCCommuityVerifierRela> records){
    	return dao.insertByBatch(records);
    };
    //批量删除
    public int deleteByBatch(List<TCCommuityVerifierRela> records){
    	return dao.deleteByBatch(records);
    };
}