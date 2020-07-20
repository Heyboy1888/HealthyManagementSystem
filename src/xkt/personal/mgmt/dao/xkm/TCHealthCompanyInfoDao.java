package xkt.personal.mgmt.dao.xkm;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xkt.personal.mgmt.bo.TCHealthCompanyInfo;
import xkt.personal.mgmt.bo.TCHealthCompanyInfoExample;

public interface TCHealthCompanyInfoDao {
    int countByExample(TCHealthCompanyInfoExample example);

    int deleteByExample(TCHealthCompanyInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(TCHealthCompanyInfo record);

    int insertSelective(TCHealthCompanyInfo record);

    List<TCHealthCompanyInfo> selectByExample(TCHealthCompanyInfoExample example);

    TCHealthCompanyInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TCHealthCompanyInfo record, @Param("example") TCHealthCompanyInfoExample example);

    int updateByExample(@Param("record") TCHealthCompanyInfo record, @Param("example") TCHealthCompanyInfoExample example);

    int updateByPrimaryKeySelective(TCHealthCompanyInfo record);

    int updateByPrimaryKey(TCHealthCompanyInfo record);
}