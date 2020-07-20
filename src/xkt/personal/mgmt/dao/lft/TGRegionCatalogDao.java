package xkt.personal.mgmt.dao.lft;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xkt.personal.mgmt.bo.TGRegionCatalog;
import xkt.personal.mgmt.bo.TGRegionCatalogCriteria;

public interface TGRegionCatalogDao {
	int countByExample(TGRegionCatalogCriteria example);

	int deleteByExample(TGRegionCatalogCriteria example);

	int deleteByPrimaryKey(Integer id);

	int insert(TGRegionCatalog record);

	int insertSelective(TGRegionCatalog record);

	List<TGRegionCatalog> selectByExample(TGRegionCatalogCriteria example);

	TGRegionCatalog selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") TGRegionCatalog record,
			@Param("example") TGRegionCatalogCriteria example);

	int updateByExample(@Param("record") TGRegionCatalog record,
			@Param("example") TGRegionCatalogCriteria example);

	int updateByPrimaryKeySelective(TGRegionCatalog record);

	int updateByPrimaryKey(TGRegionCatalog record);
}