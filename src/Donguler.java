import java.util.Scanner;

public class Donguler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    int sifre  = 0;
	    int sayac = 0;
	    while(sayac<= 5)
	    {
	    	System.out.print(sayac);
	    	sayac++;
	    }
	    
	    do {
	    	System.out.println("L�tfen �ifrenizi giriniz");
		    Scanner sc = new Scanner(System.in); // Scanner nesnesi ekradan bilgi almak i�in kulla�l�r
		    sifre = sc.nextInt();  // scanner nesnesinin nextInt() metodu ekrandan integer say� almaya yarar
	    }
	    while(sifre != 123);
	    
	    for(int i=0;i< 10; i++)
	    {
	    	System.out.print(i);
	    }
	    
	    for(int i = 0 ; i <10; i++)
	    {
	    	for(int j = 0 ; j <i ; j++)
	    	{
	    		System.out.print("*");
	    	}
	    	System.out.println(" ");
	    }
	}

}
