package cn.e3mall.utils;

import java.io.Serializable;

public class KindEditorModel implements Serializable{
	
	//成功是 0，失败是 1
	private int error;
	//文档地址
	private String url;
	//错误信息
	private String message;
	
	public int getError() {
		return error;
	}
	public void setError(int error) {
		this.error = error;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
