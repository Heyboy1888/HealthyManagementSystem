package xkt.personal.mgmt.dao.xkm;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xkt.personal.mgmt.bo.TCHealthCompanyAddress;
import xkt.personal.mgmt.bo.TCHealthCompanyAddressExample;

public interface TCHealthCompanyAddressDao {
    int countByExample(TCHealthCompanyAddressExample example);

    int deleteByExample(TCHealthCompanyAddressExample example);

    int deleteByPrimaryKey(String id);

    int insert(TCHealthCompanyAddress record);

    int insertSelective(TCHealthCompanyAddress record);

    List<TCHealthCompanyAddress> selectByExample(TCHealthCompanyAddressExample example);

    TCHealthCompanyAddress selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TCHealthCompanyAddress record, @Param("example") TCHealthCompanyAddressExample example);

    int updateByExample(@Param("record") TCHealthCompanyAddress record, @Param("example") TCHealthCompanyAddressExample example);

    int updateByPrimaryKeySelective(TCHealthCompanyAddress record);

    int updateByPrimaryKey(TCHealthCompanyAddress record);
}