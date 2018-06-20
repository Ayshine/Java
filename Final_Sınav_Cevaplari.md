## BIL 112 Final Sınavı Soruları ve Cevapları
**1.** İçerisinde yarıçap özelliği olan ve bu özelliğin değerini nesne yaratılırken alındığı ve bu özellik için getter setter fonksiyonları olan , ayrıca çevre ve alan hesaplayabilen fonksiyonları olan bir daire sınıfı yazınız.

~~~

public class Daire {

	private int yaricap;
	private final double PI = 3.14;
	
	public Daire(int yaricap)
	{
		this.yaricap = yaricap;
	}

	public int getYaricap() {
		return yaricap;
	}

	public void setYaricap(int yaricap) {
		this.yaricap = yaricap;
	}
	
	public double Alan()
	{
		return PI * (this.yaricap * this.yaricap);
	}	
	
	public double Cevre()
	{
		return 2 * PI * this.yaricap;
	}		
}

~~~

**2.** Çalışan isimli bir sınıftan türeyen işçi ve memur sınıflarını yazınız.(içerikleri konusunda serbestsiniz.)

~~~
class Calisan
{
}

class Isci extends Calisan
{
}

class Memur extends Calisan
{
}

~~~
**3.** İki int sayıyı alan ve eşitlik durumuna göre true veya false döndüren karşılaştır isimli bir fonksiyona sahip karşılaştırılabilirlik Interface ini yazınız.

~~~

interface Karsilastirilabilirlik
{
	boolean Karsilastir(int x, int y);
}
~~~

**4.** 3. sorudaki Interface i implemente eden araba isimli sınıf yazınız Arabaların fiyat, beygir gücü açısından karşılaştırmasından en az birini yapınız.

~~~

class Araba  
{
	private int fiyat;
	
	public Araba(int fiyat) 
	{
		this.fiyat = fiyat;
	}
}

class ArabaFiyatiKarsilastir implements Karsilastirilabilirlik
{	
	public boolean Karsilastir(int x, int y)
	{
		if (x > y)
		{
			System.out.println("1. araba pahalı");
			return true;
		}
		else
		{
			System.out.println("2. araba pahalı");
			return false;
		}
	}
}
~~~

**5.** Bir sınıfın final olarak bildirilmesi ile bir değişkenin final anahtar sözcüğüyle tanımlanması arasındaki fark nedir? 

**Cevap:**Bir sınıf **final** anahtar sözcüğü ile bildirilmiş ise o sınıf türetmeye kapalıdır yani **extend** edilemez. 
Bir değişken **final** anahtar sözcüğü ile tanımlanmış ise sabittir yani içeriğine tanımlama sırasında atanan ilk değerden farklı bir değer atanamaz.
