package com.xj.file.utils;


/**
 *    分页   工具
 * @author Administrator
 *
 */
public class BaseQuery {

	//分页参数
	private Integer page=1;
	private Integer rows=10;
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}

}
