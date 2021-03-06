package io.sdb.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseProductCategory<M extends BaseProductCategory<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}
	
	public java.lang.String getName() {
		return getStr("name");
	}

	public void setParentId(java.lang.Long parentId) {
		set("parent_id", parentId);
	}
	
	public java.lang.Long getParentId() {
		return getLong("parent_id");
	}

	public void setTreePath(java.lang.String treePath) {
		set("tree_path", treePath);
	}
	
	public java.lang.String getTreePath() {
		return getStr("tree_path");
	}

	public void setOrder(java.lang.Integer order) {
		set("order", order);
	}
	
	public java.lang.Integer getOrder() {
		return getInt("order");
	}

	public void setCreateDate(java.util.Date createDate) {
		set("create_date", createDate);
	}
	
	public java.util.Date getCreateDate() {
		return get("create_date");
	}

	public void setUpdateDate(java.util.Date updateDate) {
		set("update_date", updateDate);
	}
	
	public java.util.Date getUpdateDate() {
		return get("update_date");
	}

}
