package xkt.personal.mgmt.dao.xkm;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import xkt.personal.mgmt.bo.TCCommuityCheckerRela;
import xkt.personal.mgmt.bo.TCCommuityCheckerRelaCriteria;

public interface TCCommuityCheckerRelaDao {
    int countByExample(TCCommuityCheckerRelaCriteria example);

    int deleteByExample(TCCommuityCheckerRelaCriteria example);

    int deleteByPrimaryKey(String relaId);

    int insert(TCCommuityCheckerRela record);

    int insertSelective(TCCommuityCheckerRela record);

    List<TCCommuityCheckerRela> selectByExample(TCCommuityCheckerRelaCriteria example);

    TCCommuityCheckerRela selectByPrimaryKey(String relaId);

    int updateByExampleSelective(@Param("record") TCCommuityCheckerRela record, @Param("example") TCCommuityCheckerRelaCriteria example);

    int updateByExample(@Param("record") TCCommuityCheckerRela record, @Param("example") TCCommuityCheckerRelaCriteria example);

    int updateByPrimaryKeySelective(TCCommuityCheckerRela record);

    int updateByPrimaryKey(TCCommuityCheckerRela record);
    //批量新增
    int insertByBatch(List<TCCommuityCheckerRela> records);
    //批量删除
    int deleteByBatch(List<TCCommuityCheckerRela> records);
}