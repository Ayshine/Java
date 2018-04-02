
public class Degiskenler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		byte bi = 0;	   // byte dðiþkeni ismiden de anlaþýlacaðý gibi bir bytelýk alan tutan deðiþkendir.
		short s = 0;	   // short deðiþkeni  bytetan büyük integer dan küçük doðal sayý tutar.
		int i = 0 ;		   // integer deðiþkeni doðal sayý tutan bir deðiþken türüdür.
		long l = 0L;       // long int in bir büyük versiyonudur. Long bir türe ilk deðer atarken yanýna L yazmamýz gerekmektedi.
		double d = 0.0;    // double tanýmlarken .0 ile decimal alanlarý belirleyebilirsiniz
		float f = 0f;	   // float double'ýn bir büyük versiyonudur.  Float bir türe ilk deðer atarken yanýna f yazmamýz gerekmektedi
		boolean b = false; // Boolean deðiþkeni true ya da false deðeri alýr
		char c = 'c';      // Char tek bir karakter ile ifade etmek istediðimiz deðiþkenler için kullanýlabilir.
		
		System.out.printf("Byte türünün minimum deðeri:%d,"
						+ "maksimum deðeri: %d,sistemdeki büyüklüðü: %d%n",
				           Byte.MIN_VALUE, Byte.MAX_VALUE, Byte.SIZE);
		
		System.out.printf("Short türünün minimum deðeri: {0} ,"
				        + "maksimum deðeri: {1},sistemdeki büyüklüðü: %d%n",
		                   Short.MIN_VALUE, Short.MAX_VALUE, Short.SIZE);
		
		System.out.printf("Integer türürnün minimum deðeri: %d ,"
						+ "maksimum deðeri: %d,sistemdeki büyüklüðü: %d%n",
		                   Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.SIZE);
		
		System.out.printf("Double türünün minimum deðeri: %f ,"
						+ "maksimum deðeri: %f,sistemdeki büyüklüðü: %d%n",
						   Double.MIN_VALUE, Double.MAX_VALUE, Double.SIZE);
		
		System.out.printf("Float türünün minimum deðeri: %f ,"
						+ "maksimum deðeri: %f,sistemdeki büyüklüðü: %d%n",
						   Float.MIN_VALUE, Float.MAX_VALUE, Float.SIZE);
		
		System.out.printf("Boolean türünün minimum veya maksimum deðeri yoktur:"
						+ "Bool türü ya: {0} ya da {1}deðeri alabilir%n",
						   Boolean.TRUE, Boolean.FALSE);
				
		System.out.printf("Char türünün minimum veya maksimum deðeri yoktur:%n"
						+ "Char deðiþkenine ilk deðer atarken \" \" yerine \' \' kullanmamýz gerekir%n"
						+ "aksi takdirde kodumuz ilk deðeri string olarak deðerlendirir ve hata verir%n");
	}

}
