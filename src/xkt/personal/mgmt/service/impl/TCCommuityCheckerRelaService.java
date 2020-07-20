package xkt.personal.mgmt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import xkt.personal.mgmt.bo.TCCommuityCheckerRela;
import xkt.personal.mgmt.dao.xkm.TCCommuityCheckerRelaDao;
import xkt.personal.mgmt.service.ITCCommuityCheckerRelaService;

import com.ls.pf.base.api.framework.Service;
import com.ls.pf.base.api.framework.ServiceType;
@Service(target = { ServiceType.APPLICATION }, value = "tcommuityCheckerRelaService")
public class TCCommuityCheckerRelaService implements ITCCommuityCheckerRelaService{
	@Autowired
	TCCommuityCheckerRelaDao dao;	
    //批量新增
    public int insertByBatch(List<TCCommuityCheckerRela> records){
    	return dao.insertByBatch(records);
    };
    //批量删除
    public int deleteByBatch(List<TCCommuityCheckerRela> records){
    	return dao.deleteByBatch(records);
    };
}