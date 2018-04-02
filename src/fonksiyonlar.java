
public class fonksiyonlar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static void Karsila()
    {
    	System.out.println("Merhaba Dünya!");
    }
    public static void Karsila(String isim)
    {
    	System.out.println("Merhaba "+ isim);
    }
    
    public static long factorial(int n) { 
        if (n == 1) return 1; 
        return n * factorial(n-1); 
    } 
}
