package xkt.personal.mgmt.web.vo;

import java.util.List;

import eeos.sp.core.base.vo.EBaseVo;

public class DistrictTreeVo extends EBaseVo{

	private String id;
	
	private String text;
	
	private boolean hasChildren;
	
	private String districtType;
	
	private String districtCode;
	
	private String pDistrictCode;
	
	private List<DistrictTreeVo> childNodes;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public boolean isHasChildren() {
		return hasChildren;
	}

	public void setHasChildren(boolean hasChildren) {
		this.hasChildren = hasChildren;
	}

	public List<DistrictTreeVo> getChildNodes() {
		return childNodes;
	}

	public void setChildNodes(List<DistrictTreeVo> childNodes) {
		this.childNodes = childNodes;
	}

	public String getDistrictType() {
		return districtType;
	}

	public void setDistrictType(String districtType) {
		this.districtType = districtType;
	}

	public String getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getpDistrictCode() {
		return pDistrictCode;
	}

	public void setpDistrictCode(String pDistrictCode) {
		this.pDistrictCode = pDistrictCode;
	}
	
	
}
