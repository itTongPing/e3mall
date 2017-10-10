package cn.e3mall.utils;

import java.io.Serializable;
import java.util.List;

public class DatagridPageBean implements Serializable{
	
	//总记录数
	private long total;
	//总记录
	private List<?> rows;
	
	
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	
	
	

}
