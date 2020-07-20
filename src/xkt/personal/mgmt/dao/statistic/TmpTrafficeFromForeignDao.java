package xkt.personal.mgmt.dao.statistic;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import xkt.personal.mgmt.bo.TmpTrafficeFromForeign;
import xkt.personal.mgmt.bo.TmpTrafficeFromForeignExample;

public interface TmpTrafficeFromForeignDao {
    int countByExample(TmpTrafficeFromForeignExample example);

    int deleteByExample(TmpTrafficeFromForeignExample example);

    int insert(TmpTrafficeFromForeign record);
    
    int insertYellow(TmpTrafficeFromForeign record);

    int insertSelective(TmpTrafficeFromForeign record);

    List<TmpTrafficeFromForeign> selectByExample(TmpTrafficeFromForeignExample example);

    int updateByExampleSelective(@Param("record") TmpTrafficeFromForeign record, @Param("example") TmpTrafficeFromForeignExample example);

    int updateByExample(@Param("record") TmpTrafficeFromForeign record, @Param("example") TmpTrafficeFromForeignExample example);
    
    List<Map<String,Object>> queryByTimeRed(Map<String,Object>map);
    
    int countByTimeRed(@Param("date")String date);
    
    List<Map<String,Object>> queryByTimeYellow(Map<String,Object>map);
    
    int countByTimeYellow(@Param("date")String date);
    
    List<Map<String,Object>> queryByTime(Map<String,Object>map);
    
    int countByTime(@Param("date")String date);
    
    int deleteByTimeYellow(@Param("date")String date);
    
    int deleteByTimeRed(@Param("date")String date);
    
    
}