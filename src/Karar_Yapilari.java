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
     
     switch()
     {
     case:
     case: 
     case:
     case:
     }
	}

}
