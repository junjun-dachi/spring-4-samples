package com.cn.junjun.spring.sample.bean;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created for JAXB.
 * 
 * @author Justin
 *
 */

@XmlRootElement(name = "data")
public class EntityList<T> {

	private List<T> items;

	public EntityList() {
		items = new ArrayList<T>();
	}

	public EntityList(List<T> items) {
		this.items = items;
	}

	@XmlAnyElement(lax=true)
	public List<T> getItems() {
		if (items == null) {
			items = new ArrayList<>();
		}
		return items;
	}

}