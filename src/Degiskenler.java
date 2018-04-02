
public class Degiskenler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		byte bi = 0;	   // byte d�i�keni ismiden de anla��laca�� gibi bir bytel�k alan tutan de�i�kendir.
		short s = 0;	   // short de�i�keni  bytetan b�y�k integer dan k���k do�al say� tutar.
		int i = 0 ;		   // integer de�i�keni do�al say� tutan bir de�i�ken t�r�d�r.
		long l = 0L;       // long int in bir b�y�k versiyonudur. Long bir t�re ilk de�er atarken yan�na L yazmam�z gerekmektedi.
		double d = 0.0;    // double tan�mlarken .0 ile decimal alanlar� belirleyebilirsiniz
		float f = 0f;	   // float double'�n bir b�y�k versiyonudur.  Float bir t�re ilk de�er atarken yan�na f yazmam�z gerekmektedi
		boolean b = false; // Boolean de�i�keni true ya da false de�eri al�r
		char c = 'c';      // Char tek bir karakter ile ifade etmek istedi�imiz de�i�kenler i�in kullan�labilir.
		
		System.out.printf("Byte t�r�n�n minimum de�eri:%d,"
						+ "maksimum de�eri: %d,sistemdeki b�y�kl���: %d%n",
				           Byte.MIN_VALUE, Byte.MAX_VALUE, Byte.SIZE);
		
		System.out.printf("Short t�r�n�n minimum de�eri: {0} ,"
				        + "maksimum de�eri: {1},sistemdeki b�y�kl���: %d%n",
		                   Short.MIN_VALUE, Short.MAX_VALUE, Short.SIZE);
		
		System.out.printf("Integer t�r�rn�n minimum de�eri: %d ,"
						+ "maksimum de�eri: %d,sistemdeki b�y�kl���: %d%n",
		                   Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.SIZE);
		
		System.out.printf("Double t�r�n�n minimum de�eri: %f ,"
						+ "maksimum de�eri: %f,sistemdeki b�y�kl���: %d%n",
						   Double.MIN_VALUE, Double.MAX_VALUE, Double.SIZE);
		
		System.out.printf("Float t�r�n�n minimum de�eri: %f ,"
						+ "maksimum de�eri: %f,sistemdeki b�y�kl���: %d%n",
						   Float.MIN_VALUE, Float.MAX_VALUE, Float.SIZE);
		
		System.out.printf("Boolean t�r�n�n minimum veya maksimum de�eri yoktur:"
						+ "Bool t�r� ya: {0} ya da {1}de�eri alabilir%n",
						   Boolean.TRUE, Boolean.FALSE);
				
		System.out.printf("Char t�r�n�n minimum veya maksimum de�eri yoktur:%n"
						+ "Char de�i�kenine ilk de�er atarken \" \" yerine \' \' kullanmam�z gerekir%n"
						+ "aksi takdirde kodumuz ilk de�eri string olarak de�erlendirir ve hata verir%n");
	}

}
