﻿package com.taobao.top.domain;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * 商品属性。
 * 
 * @author carver.gu
 * @since 1.0, Sep 17, 2009
 */
public class ItemProp extends BaseObject {

	/** 属性编号 */
	@JsonProperty("pid")
	private Long pid;

	/** 属性名称 */
	@JsonProperty("name")
	private String name;

	/** 是否关键属性 */
	@JsonProperty("is_key_prop")
	private Boolean isKeyProp;

	/** 是否销售属性 */
	@JsonProperty("is_sale_prop")
	private Boolean isSaleProp;

	/** 是否颜色属性 */
	@JsonProperty("is_color_prop")
	private Boolean isColorProp;

	/** 是否是可枚举属性 */
	@JsonProperty("is_enum_prop")
	private Boolean isEnumProp;

	/** 是否是卖家可以自行输入的属性 */
	@JsonProperty("is_input_prop")
	private String isInputProp;

	/** 是否商品属性 */
	@JsonProperty("is_item_prop")
	private String isItemProp;

	/** 子属性的模板 */
	@JsonProperty("child_template")
	private String childPropTemplate;

	/** 发布产品或商品时是否为必选属性 */
	@JsonProperty("must")
	private Boolean isMust;

	/** 发布产品或商品时是否可以多选 */
	@JsonProperty("multi")
	private Boolean isMulti;

	/** 上级属性编号 */
	@JsonProperty("parent_pid")
	private Long parentPid;

	/** 上级属性值编号 */
	@JsonProperty("parent_vid")
	private Long parentVid;

	/** 属性值对象 */
	@JsonProperty("prop_values")
	private List<PropValue> propValues;

	/** 属性状态 */
	@JsonProperty("status")
	private String status;

	/** 排列序号 */
	@JsonProperty("sort_order")
	private Integer sortOrder;

	public Long getPid() {
		return this.pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean isKeyProp() {
		return this.isKeyProp;
	}

	public void setKeyProp(Boolean isKeyProp) {
		this.isKeyProp = isKeyProp;
	}

	public Boolean isSaleProp() {
		return this.isSaleProp;
	}

	public void setSaleProp(Boolean isSaleProp) {
		this.isSaleProp = isSaleProp;
	}

	public Boolean isColorProp() {
		return this.isColorProp;
	}

	public void setColorProp(Boolean isColorProp) {
		this.isColorProp = isColorProp;
	}

	public Boolean isEnumProp() {
		return this.isEnumProp;
	}

	public void setEnumProp(Boolean isEnumProp) {
		this.isEnumProp = isEnumProp;
	}

	public String isInputProp() {
		return this.isInputProp;
	}

	public void setInputProp(String isInputProp) {
		this.isInputProp = isInputProp;
	}

	public String isItemProp() {
		return this.isItemProp;
	}

	public void setItemProp(String isItemProp) {
		this.isItemProp = isItemProp;
	}

	public String getChildPropTemplate() {
		return this.childPropTemplate;
	}

	public void setChildPropTemplate(String childPropTemplate) {
		this.childPropTemplate = childPropTemplate;
	}

	public Boolean isMust() {
		return this.isMust;
	}

	public void setMust(Boolean isMust) {
		this.isMust = isMust;
	}

	public Boolean isMulti() {
		return this.isMulti;
	}

	public void setMulti(Boolean isMulti) {
		this.isMulti = isMulti;
	}

	public Long getParentPid() {
		return this.parentPid;
	}

	public void setParentPid(Long parentPid) {
		this.parentPid = parentPid;
	}

	public Long getParentVid() {
		return this.parentVid;
	}

	public void setParentVid(Long parentVid) {
		this.parentVid = parentVid;
	}

	public List<PropValue> getPropValues() {
		return this.propValues;
	}

	public void setPropValues(List<PropValue> propValues) {
		this.propValues = propValues;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

}