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
     System.out.println("Lütfen ürün kodu giriniz");
     int urunKodu = sc.nextInt();
     switch(urunKodu)
     {
     case 11:
    	 System.out.println("11 numaralý ürün: bisküvinizi alýnýz");
    	 break;
     case 12: 
    	 System.out.println("12 numaralý ürün: çikolatanýzý alýnýz");
    	 break;
     case 13:
    	 System.out.println("13 numaralý ürün: çubuk krakerinizi alýnýz");
    	 break;
     case 21:
    	 System.out.println("21 numaralý ürün: kolanýzý alýnýz");
    	 break;
     case 22:
    	 System.out.println("22 numaralý ürün:kit-katýnýzý alýnýz");
    	 break;
     case 23: 
    	 System.out.println("23 numaralý ürün: pizza krakerinizi alýnýz ");
    	 break;
     case 31:
    	 System.out.println("31 numaralý ürün:fantanýzý alýnýz.");
    	 break;
     case 32:
     case 33:
    	 System.out.println("32 ya da 33 numaralý ürün: suyunuzu alýnýz.");
     default:
    	 System.out.println("Lütfen ürün kodu giriniz.");
    	 break;
     }
	}

}
