package xkt.personal.mgmt.dao.statistic;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import xkt.personal.mgmt.bo.TCHealthUserStatistics;
import xkt.personal.mgmt.bo.TCHealthUserStatisticsExample;

public interface TCHealthUserStatisticsDao {
    int countByExample(TCHealthUserStatisticsExample example);

    int deleteByExample(TCHealthUserStatisticsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCHealthUserStatistics record);

    int insertSelective(TCHealthUserStatistics record);

    List<TCHealthUserStatistics> selectByExample(TCHealthUserStatisticsExample example);

    TCHealthUserStatistics selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCHealthUserStatistics record, @Param("example") TCHealthUserStatisticsExample example);

    int updateByExample(@Param("record") TCHealthUserStatistics record, @Param("example") TCHealthUserStatisticsExample example);

    int updateByPrimaryKeySelective(TCHealthUserStatistics record);

    int updateByPrimaryKey(TCHealthUserStatistics record);
    
    List<Map<String,Object>> queryStatistic(@Param("statisticsDate")String statisticsDate);
    
    int countStatistic(TCHealthUserStatistics tcHealthUserStatistics);
    
    Integer callProcedure();
    
    List<Map<String, Object>> queryYrTodayCount(Map<String, Object> map);
    
}