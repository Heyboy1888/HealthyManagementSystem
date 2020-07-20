package xkt.personal.mgmt.dao.xkm;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xkt.personal.mgmt.bo.TCHealthPass;
import xkt.personal.mgmt.bo.TCHealthPassCriteria;

public interface TCHealthPassDao {
    int countByExample(TCHealthPassCriteria example);

    int deleteByExample(TCHealthPassCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(TCHealthPass record);

    int insertSelective(TCHealthPass record);

    List<TCHealthPass> selectByExample(TCHealthPassCriteria example);

    TCHealthPass selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TCHealthPass record, @Param("example") TCHealthPassCriteria example);

    int updateByExample(@Param("record") TCHealthPass record, @Param("example") TCHealthPassCriteria example);

    int updateByPrimaryKeySelective(TCHealthPass record);

    int updateByPrimaryKey(TCHealthPass record);
}