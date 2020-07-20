package xkt.personal.mgmt.dao.xkm;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import xkt.personal.mgmt.bo.TCHealthCompanySub;
import xkt.personal.mgmt.bo.TCHealthCompanySubExample;

public interface TCHealthCompanySubDao {
    int countByExample(TCHealthCompanySubExample example);

    int deleteByExample(TCHealthCompanySubExample example);

    int deleteByPrimaryKey(String id);

    int insert(TCHealthCompanySub record);

    int insertSelective(TCHealthCompanySub record);

    List<TCHealthCompanySub> selectByExample(TCHealthCompanySubExample example);

    TCHealthCompanySub selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TCHealthCompanySub record, @Param("example") TCHealthCompanySubExample example);

    int updateByExample(@Param("record") TCHealthCompanySub record, @Param("example") TCHealthCompanySubExample example);

    int updateByPrimaryKeySelective(TCHealthCompanySub record);

    int updateByPrimaryKey(TCHealthCompanySub record);
    
    List<Map<String,Object>> getOneAddrOneCodeSubInfoByCompanyId(@Param("companyId")String companyId);
    
    Map<String,Object> getSubInfoById(@Param("id")String id);
}