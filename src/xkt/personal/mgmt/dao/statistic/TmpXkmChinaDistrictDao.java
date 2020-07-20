package xkt.personal.mgmt.dao.statistic;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xkt.personal.mgmt.bo.TmpXkmChinaDistrict;
import xkt.personal.mgmt.bo.TmpXkmChinaDistrictExample;

public interface TmpXkmChinaDistrictDao {
    int countByExample(TmpXkmChinaDistrictExample example);

    int deleteByExample(TmpXkmChinaDistrictExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TmpXkmChinaDistrict record);

    int insertSelective(TmpXkmChinaDistrict record);

    List<TmpXkmChinaDistrict> selectByExample(TmpXkmChinaDistrictExample example);

    TmpXkmChinaDistrict selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TmpXkmChinaDistrict record, @Param("example") TmpXkmChinaDistrictExample example);

    int updateByExample(@Param("record") TmpXkmChinaDistrict record, @Param("example") TmpXkmChinaDistrictExample example);

    int updateByPrimaryKeySelective(TmpXkmChinaDistrict record);

    int updateByPrimaryKey(TmpXkmChinaDistrict record);
}