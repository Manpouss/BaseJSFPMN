package com.exemple.jsf;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class JSFBean {
	private String name;
	
	public void showName() {
		System.out.println("Votre nom est "+ this.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	private String val;

	
	
	public String getVal() {
		return val;
	}
	public void setVal(String val) {
		this.val = val;
	}

	public String getRes() {
		try {
			Integer res = Integer.valueOf(val);
			res = res * res;
			return res.toString();
		}catch(Exception ex) {
			return ""
;		}
	}
	
}
