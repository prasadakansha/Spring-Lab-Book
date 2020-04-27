package com.cg.lab1_2entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
 * JavaBeans are classes that encapsulate many objects into a single object (the
 * bean). 
 * It is a java class that should follow following conventions: 
 * 1.Must implement Serializable. 
 * 2.It should have a public no-arg constructor. 
 * 3.All properties in java bean must be private with public getters and setter methods.
 */
@Component
public class Sbu {
	@Value("101")
	private int sbuId;
	@Value("Product Engineering Services")
	private String sbuName;
	@Value("Kiran Rao")
	private String sbuHead;

	public Sbu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSbuId() {
		return sbuId;
	}

	public void setSbuId(int sbuId) {
		this.sbuId = sbuId;
	}

	public String getSbuName() {
		return sbuName;
	}

	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}

	public String getSbuHead() {
		return sbuHead;
	}

	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}

	@Override
	public String toString() {
		return "Sbu [sbuId=" + sbuId + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + "]";
	}

}
