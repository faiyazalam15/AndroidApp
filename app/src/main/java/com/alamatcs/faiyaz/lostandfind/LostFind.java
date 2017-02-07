package com.alamatcs.faiyaz.lostandfind;

import java.util.List;

public class LostFind {
	private String message;

	private String status;

	private List<LostFindBean> item;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	public List<LostFindBean> getItem() {
		return item;
	}

	public void setItem(List<LostFindBean> item) {
		this.item = item;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LostFind [message=");
		builder.append(message);
		builder.append(", status=");
		builder.append(status);
		builder.append(", item=");
		builder.append(item);
		builder.append("]");
		return builder.toString();
	}


}
