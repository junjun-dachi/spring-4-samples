package com.cn.junjun.spring.sample.bean;

import static com.cn.junjun.spring.sample.util.ComConsts.DF_DD_MMM_YYYY;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;

public class ToDoEntity implements Serializable {

	@NotEmpty
	String content;

	Date createdDate;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public String getCreatedDateDisplay() {
		return DF_DD_MMM_YYYY.format(createdDate);
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}
