package com.passByValueReference;

import java.math.BigDecimal;

public class Nesne {
	
	Integer sayi;
	String yazi;
	BigDecimal tutar;
	Nesne nesne;
	
	Nesne(){

	}
	
	Nesne(Integer sayi,String yazi){
		this.sayi=sayi;
		this.yazi=yazi;
	}
	
	public Integer getSayi() {
		return sayi;
	}
	public void setSayi(Integer sayi) {
		this.sayi = sayi;
	}
	public String getYazi() {
		return yazi;
	}
	public void setYazi(String yazi) {
		this.yazi = yazi;
	}
	public Nesne getNesne() {
		return nesne;
	}
	public void setNesne(Nesne nesne) {
		this.nesne = nesne;
	}

	public BigDecimal getTutar() {
		return tutar;
	}

	public void setTutar(BigDecimal tutar) {
		this.tutar = tutar;
	}
	
	
	

}
