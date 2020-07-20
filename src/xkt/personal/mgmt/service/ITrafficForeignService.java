package xkt.personal.mgmt.service;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import com.ls.pf.base.common.rest.object.WrappedResult;

public interface ITrafficForeignService {
	List<Map<String,Object>> queryByTime(Map<String,Object> map);
	
	int countByTime(String date,String codeColourName);
	
	int deleteByTimeAndType(String date,int type);
	
	WrappedResult importExcel(InputStream in, long size,
			String fileName, String originalFileType,int type);
}
