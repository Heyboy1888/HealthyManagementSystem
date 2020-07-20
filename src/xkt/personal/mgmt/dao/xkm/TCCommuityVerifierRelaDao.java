package xkt.personal.mgmt.dao.xkm;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import xkt.personal.mgmt.bo.TCCommuityVerifierRela;
import xkt.personal.mgmt.bo.TCCommuityVerifierRelaCriteria;

public interface TCCommuityVerifierRelaDao {
    int countByExample(TCCommuityVerifierRelaCriteria example);

    int deleteByExample(TCCommuityVerifierRelaCriteria example);

    int deleteByPrimaryKey(String relaId);

    int insert(TCCommuityVerifierRela record);

    int insertSelective(TCCommuityVerifierRela record);

    List<TCCommuityVerifierRela> selectByExample(TCCommuityVerifierRelaCriteria example);

    TCCommuityVerifierRela selectByPrimaryKey(String relaId);

    int updateByExampleSelective(@Param("record") TCCommuityVerifierRela record, @Param("example") TCCommuityVerifierRelaCriteria example);

    int updateByExample(@Param("record") TCCommuityVerifierRela record, @Param("example") TCCommuityVerifierRelaCriteria example);

    int updateByPrimaryKeySelective(TCCommuityVerifierRela record);

    int updateByPrimaryKey(TCCommuityVerifierRela record);
    //批量新增
    int insertByBatch(List<TCCommuityVerifierRela> records);
    //批量删除
    int deleteByBatch(List<TCCommuityVerifierRela> records);
}