package xkt.personal.mgmt.dao.xkm;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xkt.personal.mgmt.bo.TCHealthCodeSweepRecHis;
import xkt.personal.mgmt.bo.TCHealthCodeSweepRecHisExample;

public interface TCHealthCodeSweepRecHisDao {
    int countByExample(TCHealthCodeSweepRecHisExample example);

    int deleteByExample(TCHealthCodeSweepRecHisExample example);

    int deleteByPrimaryKey(String id);

    int insert(TCHealthCodeSweepRecHis record);

    int insertSelective(TCHealthCodeSweepRecHis record);

    List<TCHealthCodeSweepRecHis> selectByExample(TCHealthCodeSweepRecHisExample example);

    TCHealthCodeSweepRecHis selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TCHealthCodeSweepRecHis record, @Param("example") TCHealthCodeSweepRecHisExample example);

    int updateByExample(@Param("record") TCHealthCodeSweepRecHis record, @Param("example") TCHealthCodeSweepRecHisExample example);

    int updateByPrimaryKeySelective(TCHealthCodeSweepRecHis record);

    int updateByPrimaryKey(TCHealthCodeSweepRecHis record);
}