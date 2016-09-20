package com.cn.junjun.spring.sample.bean;

import static com.cn.junjun.spring.sample.util.ComConsts.DF_DD_MMM_YYYY;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@XmlRootElement(name = "todo")
@XmlAccessorType(XmlAccessType.NONE)
public class ToDoEntity implements Serializable {

	@NotEmpty
	@XmlElement(name = "content")
	String content;

	Date createdDate;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@JsonFormat(pattern = "dd MMM yyyy")
	@JsonProperty("date")
	public Date getCreatedDate() {
		return createdDate;
	}

	@JsonIgnore
	public String getCreatedDateDisplay() {
		return DF_DD_MMM_YYYY.format(createdDate);
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}
