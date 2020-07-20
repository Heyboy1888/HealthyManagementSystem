package xkt.personal.mgmt.service;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.ls.pf.base.common.rest.object.WrappedResult;

import xkt.personal.mgmt.bo.TCHealthUserCommunityRelate;
import xkt.personal.mgmt.bo.TCHealthUserCommunityRelateCriteria;
import xkt.personal.mgmt.bo.TCHealthUserCommunityRelateExt;

public interface ITCHealthUserCommunityRelateService {
	int countByExample(TCHealthUserCommunityRelateCriteria example);

	int deleteByExample(TCHealthUserCommunityRelateCriteria example);

	int deleteByPrimaryKey(String id);

	TCHealthUserCommunityRelate selectByPrimaryKey(String id);

	int insert(TCHealthUserCommunityRelate record);

	int insertSelective(TCHealthUserCommunityRelate record);

	List<TCHealthUserCommunityRelate> selectByExample(
			TCHealthUserCommunityRelateCriteria example);

    int updateByPrimaryKeySelective(TCHealthUserCommunityRelate record);
	
	int updateByExampleSelective(
			@Param("record") TCHealthUserCommunityRelate record,
			@Param("example") TCHealthUserCommunityRelateCriteria example);

	int updateByExample(@Param("record") TCHealthUserCommunityRelate record,
			@Param("example") TCHealthUserCommunityRelateCriteria example);

	List<TCHealthUserCommunityRelateExt> selectByPage(Map<String, String> inMap);

	int countByExampleAndPage(Map<String, String> inMap);

	WrappedResult importExcel(InputStream in, long size, String fileName,
			String originalFileType) throws Exception;

}
