package br.com.fiap.bean;

import java.util.Date;

public class Crianca extends Pessoa {

	@Deprecated //Indicates the method is obsolete. It will still work, but is no longer supported
	@Override // Removing the annotation will not influence the behavior of the method, but it will ensure it will be overriding another method
	public void falar() {
		super.falar();
		new Date(""); //Overstriked methods indicate they are depreciated
	}
	
	
	
}
