package com.passByValueReference;

import java.math.BigDecimal;

public class PassByValueReference {

	 public static void main(String[] args) {
		 
		 Nesne nesne = new Nesne();
		 nesne.setSayi(1);
		 nesne.setYazi("a");
		 nesne.setTutar(BigDecimal.ZERO);
		 nesne.setNesne(new Nesne(3,"c"));
//		 Nesne nesne2 = new Nesne();
//		 nesne2.setSayi(nesne.getSayi());
//		 nesne2.setYazi(nesne.getYazi());
		 Integer sayi = nesne.getSayi();
		 String yazi = nesne.getYazi();  //bu şekilde getter ile değerine alır yeni değişkene atarsan eski nesnedeki değer değişse de sorun olmaz eski atanan değer kalır
		 BigDecimal tutar = nesne.getTutar();
		 Nesne icNesne = nesne.getNesne();
		 
		 
		 Deneme deneme = new Deneme();
		 //deneme.setNesne(nesne2);
		 deneme.setSayi(sayi);
		 deneme.setYazi(yazi);
		 deneme.setNesne(nesne);  //Bu şekilde içine eklediğin nesnenin özelliğini değiştirisen deneme nesnesi de değişir
		 System.out.println(deneme);
		 System.out.println(nesne);
		 
		 nesne.setSayi(2);
		 nesne.setYazi("b");
		 nesne.setTutar(BigDecimal.ONE);
		 nesne.setNesne(new Nesne(4,"d"));
		 System.out.println(deneme);
		 System.out.println(nesne);
		 
		 
		 
		 
		 
		 
		 
	 }
}
