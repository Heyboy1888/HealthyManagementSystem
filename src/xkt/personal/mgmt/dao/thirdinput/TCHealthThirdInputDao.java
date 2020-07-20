package xkt.personal.mgmt.dao.thirdinput;



import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import xkt.personal.mgmt.bo.TCHealthThirdInput;
import xkt.personal.mgmt.bo.TCHealthThirdInputCriteria;

public interface TCHealthThirdInputDao {
    int countByExample(TCHealthThirdInputCriteria example);

    int deleteByExample(TCHealthThirdInputCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCHealthThirdInput record);

    int insertSelective(TCHealthThirdInput record);

    List<TCHealthThirdInput> selectByExample(TCHealthThirdInputCriteria example);

    TCHealthThirdInput selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCHealthThirdInput record, @Param("example") TCHealthThirdInputCriteria example);

    int updateByExample(@Param("record") TCHealthThirdInput record, @Param("example") TCHealthThirdInputCriteria example);

    int updateByPrimaryKeySelective(TCHealthThirdInput record);

    int updateByPrimaryKey(TCHealthThirdInput record);
    
    List<TCHealthThirdInput> selectByPageinput(Map<String, String> var1);
    
    int countByExampleAndPageinput(Map<String, String> var1);
}