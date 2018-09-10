package com.guozz.rpc.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.guozz.blade.anno.EncodeBy;

/**
* @author 郭智忠
* @date 2017年11月13日 下午5:20:53
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@EncodeBy(EncodeBy.XML)
public class XmlRequest {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
