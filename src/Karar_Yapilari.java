import java.util.Scanner;

public class Karar_Yapilari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 //
     System.out.println("L�tfen ya��n�z� giriniz");
     Scanner sc = new Scanner(System.in); // Scanner nesnesi ekradan bilgi almak i�in kulla�l�r
     int yas = sc.nextInt();  // scanner nesnesinin nextInt() metodu ekrandan integer say� almaya yarar
     boolean malul = false;  
     boolean emekli = false;
     boolean devletMemuru = false;
     boolean gazi = false;
     
     if(yas > 65) 
     {System.out.println("65 ya� �st� yolcular i�in bilet �creti talep edilmemektedir.");}
     else if(yas < 13)
     {System.out.println("13 ya��ndan k���k �ocuklar i�in bilet �creti talep edilmemektedir.");}
     else if((malul&&gazi) || emekli|| devletMemuru) // && logical ve , || ise logical or operat�rleridir
     {System.out.println("Malul ve gazi , emekli ya da devlet memurlar� i�in bilet �creti indirimlidir.");}
     else 
     {System.out.println("Tam bilet �creti �demeniz gerekmektedir");} 
     //
     System.out.println("L�tfen �r�n kodu giriniz");
     int urunKodu = sc.nextInt();
     switch(urunKodu)
     {
     case 11:
    	 System.out.println("11 numaral� �r�n: bisk�vinizi al�n�z");
    	 break;
     case 12: 
    	 System.out.println("12 numaral� �r�n: �ikolatan�z� al�n�z");
    	 break;
     case 13:
    	 System.out.println("13 numaral� �r�n: �ubuk krakerinizi al�n�z");
    	 break;
     case 21:
    	 System.out.println("21 numaral� �r�n: kolan�z� al�n�z");
    	 break;
     case 22:
    	 System.out.println("22 numaral� �r�n:kit-kat�n�z� al�n�z");
    	 break;
     case 23: 
    	 System.out.println("23 numaral� �r�n: pizza krakerinizi al�n�z ");
    	 break;
     case 31:
    	 System.out.println("31 numaral� �r�n:fantan�z� al�n�z.");
    	 break;
     case 32:
     case 33:
    	 System.out.println("32 ya da 33 numaral� �r�n: suyunuzu al�n�z.");
     default:
    	 System.out.println("L�tfen �r�n kodu giriniz.");
    	 break;
     }
	}

}
