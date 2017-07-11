package org.junjun.spring.tutorials.bean;

import static org.junjun.spring.tutorials.common.Const.DF_DD_MMM_YYYY;

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
