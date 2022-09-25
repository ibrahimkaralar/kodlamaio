package intro.Homework;

public class Main {

	public static void main(String[] args) {
		int öğrenciSayısı = 13;
		String a = "Öğrenci sayısı :";
		System.out.println(a+öğrenciSayısı);
		System.out.println(a+öğrenciSayısı);
		System.out.println(a+öğrenciSayısı);
		System.out.println(a+öğrenciSayısı);
		// data types
//primitive types: boolean, char, byte, short, int, long, float, double
		String şehir = "Ankara";
		char karakter = 'a';
		boolean doğruMu = true;
		// conditionals= şartlar
		int sayı = 25;
		if (sayı < 20) {
			System.out.println("sayı 20'den küçüktür");
		} else if (sayı == 20) {
			System.out.println("sayı 20'ye eşittir");
		} else if (sayı > 25) {
			System.out.println("sayı 25'den büyüktür");
		} else {
			System.out.println("sayı 25'e eşittir");

			// recapdemo 1
			int sayı1 = 29;
			int sayı2 = 250;
			int sayı3 = 2;
			int enBüyük = sayı2;
			if (sayı2 < sayı1) {
				enBüyük = sayı1;
			}
			if (sayı2 < sayı3) {
				enBüyük = sayı3;
			}
			System.out.println("En büyük=" + enBüyük);

			// switch
			// switch if'e göre daha az kullanılır
			char grade = 'A';

			switch (grade) {
			case 'A':
				System.out.println("Mükemmel geçtiniz");
				break;
			case 'B':
				System.out.println("Çok güzel geçtiniz");
				break;
			case 'C':
				System.out.println("İyi geçtiniz");
				break;
			case 'D':
				System.out.println("Fenda değil geçtiniz");
				break;
			case 'F':
				System.out.println("Maalesef kaldınız");
				break;
			default:
				System.out.println("Geçersiz not girdiniz");

			}					
		}
	}	
}
		
	

