package xkt.personal.mgmt.dao.statistic;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import xkt.personal.mgmt.bo.TXkmYrReason;
import xkt.personal.mgmt.bo.TXkmYrReasonExample;

public interface TXkmYrReasonDao {
    int countByExample(TXkmYrReasonExample example);

    int deleteByExample(TXkmYrReasonExample example);

    int insert(TXkmYrReason record);

    int insertSelective(TXkmYrReason record);

    List<TXkmYrReason> selectByExample(TXkmYrReasonExample example);

    int updateByExampleSelective(@Param("record") TXkmYrReason record, @Param("example") TXkmYrReasonExample example);

    int updateByExample(@Param("record") TXkmYrReason record, @Param("example") TXkmYrReasonExample example);
    
    List<Map<String, Object>> queryYrReason(Map<String, Object> map);
    
    int countYrReason(Map<String, Object> map);
    
    Integer callProcedure();
}