package xkt.personal.mgmt.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import xkt.personal.mgmt.bo.TmpXkmChinaDistrict;
import xkt.personal.mgmt.bo.TmpXkmChinaDistrictExample;
import xkt.personal.mgmt.service.IDistrictTreeService;

import com.ls.pf.base.api.framework.ServiceAutowired;
import com.ls.pf.base.common.rest.object.WrappedResult;

@Controller
@RequestMapping("/districtTreeController")
public class DistrictTreeController {

	public static final String PATH_INIT = "/personal/mgmt/districtTree/districtTree";

	@ServiceAutowired
	private IDistrictTreeService districtTreeService;

	/**
	 * 
	 * @Title: init
	 * @Description: 界面初始化
	 * @Author: zyf
	 * @Create Date: 2020年4月23日 下午3:03:31
	 * @History: 2020年4月23日 下午3:03:31 ls-700725 Created.
	 *
	 * @return
	 *
	 */
	@RequestMapping("/init")
	public String init() {

		return PATH_INIT;
	}

	/**
	 * 初始化树
	 * @param request
	 * @return
	 */
	@RequestMapping("/initDistTree")
	@ResponseBody
	public Object initDistTree(HttpServletRequest request) {
		
		TmpXkmChinaDistrictExample example = new TmpXkmChinaDistrictExample();
		example.setOrderByClause("id asc");
		example.setDistinct(true);
		TmpXkmChinaDistrictExample.Criteria criteria = example.createCriteria();
		criteria.andPDistrictCodeIsNull();
		List<TmpXkmChinaDistrict> districtInfoList = districtTreeService
				.selectByExample(example);
		List<Map<String, Object>> nodeMapList = new ArrayList<Map<String, Object>>();

		if(CollectionUtils.isEmpty(districtInfoList)){
			return WrappedResult.successWrapedResult(null);
		}
		for(TmpXkmChinaDistrict district :  districtInfoList){
			Map<String, Object> nodeMap = new HashMap<String, Object>();
			nodeMapList.add(nodeMap);
			nodeMap.put("id", district.getDistrictCode());
			nodeMap.put("text", district.getDistrictName());
			nodeMap.put("type",district.getDistrictType());
			nodeMap.put("p_id", district.getpDistrictCode());
			nodeMap.put("hasChildren",!isLeaf(district));
			nodeMap.put("fullName", district.getDistrictFullName());
		}
		Map<String, List<Map<String, Object>>> resultMap = new HashMap<String, List<Map<String, Object>>>();
		resultMap.put("nodes", nodeMapList);
		return WrappedResult.successWrapedResult(resultMap);
	}

	/**
	 * 根据父节点获取子节点
	 * @param request
	 * @param parentId
	 * @return
	 */
	@RequestMapping("/initDistTree/{id}")
	@ResponseBody
	public Object initDistTreeChildren(HttpServletRequest request,
			@PathVariable("id") String parentId) {
		TmpXkmChinaDistrictExample example = new TmpXkmChinaDistrictExample();
		example.setOrderByClause("id asc");
		example.setDistinct(true);
		TmpXkmChinaDistrictExample.Criteria criteria = example.createCriteria();
		criteria.andPDistrictCodeEqualTo(parentId);
		List<TmpXkmChinaDistrict> districtInfoList = districtTreeService
				.selectByExample(example);
		List<Map<String, Object>> nodeMapList = new ArrayList<Map<String, Object>>();

		if(CollectionUtils.isEmpty(districtInfoList)){
			return WrappedResult.successWrapedResult(null);
		}
		for(TmpXkmChinaDistrict district :  districtInfoList){
			Map<String, Object> nodeMap = new HashMap<String, Object>();
			nodeMapList.add(nodeMap);
			nodeMap.put("id", district.getDistrictCode());
			nodeMap.put("text", district.getDistrictName());
			nodeMap.put("type",district.getDistrictType());
			nodeMap.put("p_id", district.getpDistrictCode());
			nodeMap.put("hasChildren",!isLeaf(district));
			nodeMap.put("fullName", district.getDistrictFullName());
		}
		Map<String, List<Map<String, Object>>> resultMap = new HashMap<String, List<Map<String, Object>>>();
		resultMap.put("nodes", nodeMapList);
		return WrappedResult.successWrapedResult(resultMap);
	}

	/**
	 * 是否为根节点
	 * 
	 * @return
	 */
	private boolean isLeaf(TmpXkmChinaDistrict bo) {
		String districtCode = bo.getDistrictCode();
		TmpXkmChinaDistrictExample example = new TmpXkmChinaDistrictExample();
		example.setOrderByClause("id asc");
		example.setDistinct(true);
		TmpXkmChinaDistrictExample.Criteria criteria = example.createCriteria();
		criteria.andPDistrictCodeEqualTo(districtCode);
		List<TmpXkmChinaDistrict> districtInfoList = districtTreeService
				.selectByExample(example);
		if(CollectionUtils.isEmpty(districtInfoList)){
			return true;
		}
		return false;
	}

}
