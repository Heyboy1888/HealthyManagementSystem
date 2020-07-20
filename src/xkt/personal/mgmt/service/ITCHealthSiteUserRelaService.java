package xkt.personal.mgmt.service;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import com.ls.pf.base.common.rest.object.WrappedResult;

import xkt.personal.mgmt.bo.TCHealthSiteUserRela;
import xkt.personal.mgmt.bo.TCHealthSiteUserRelaExample;

public interface ITCHealthSiteUserRelaService {

	int countByExamplePage(Map<String, String> inMap);

	List<TCHealthSiteUserRela> selectByPage(Map<String, String> inMap);

	int deleteByPrimaryKey(String id);

	TCHealthSiteUserRela selectByPrimaryKey(String id);

	int addSelective(TCHealthSiteUserRela record);

	int countByExample(TCHealthSiteUserRelaExample example);
	
    int updateByPrimaryKeySelective(TCHealthSiteUserRela record);

	WrappedResult importExcel(InputStream in, long size,
			String originalFilename, String originalFileType);


}
