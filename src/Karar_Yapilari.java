import java.util.Scanner;

public class Karar_Yapilari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 //
     System.out.println("Lütfen yaþýnýzý giriniz");
     Scanner sc = new Scanner(System.in); // Scanner nesnesi ekradan bilgi almak için kullaýlýr
     int yas = sc.nextInt();  // scanner nesnesinin nextInt() metodu ekrandan integer sayý almaya yarar
     boolean malul = false;  
     boolean emekli = false;
     boolean devletMemuru = false;
     boolean gazi = false;
     
     if(yas > 65) 
     {System.out.println("65 yaþ üstü yolcular için bilet ücreti talep edilmemektedir.");}
     else if(yas < 13)
     {System.out.println("13 yaþýndan küçük çocuklar için bilet ücreti talep edilmemektedir.");}
     else if((malul&&gazi) || emekli|| devletMemuru) // && logical ve , || ise logical or operatörleridir
     {System.out.println("Malul ve gazi , emekli ya da devlet memurlarý için bilet ücreti indirimlidir.");}
     else 
     {System.out.println("Tam bilet ücreti ödemeniz gerekmektedir");} 
     //
     
     switch()
     {
     case:
     case: 
     case:
     case:
     }
	}

}
