package com.exemple.jsf;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class DemoAjax implements Serializable{
	//Numéro universable identifiant de l'interface Serializable
	private static final long serialVersionUID = 1L;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMessageAjax() {
		return "Bonjour "+ name; 
	}
}
