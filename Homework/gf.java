package intro.Homework;

public class gf {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 4, 7, 8, 10 };
		int aranacak = 1;
		boolean varMi = false;

		for (int i = 0; i <sayilar.length; i++) {
			if (aranacak == sayilar[i]) {
				varMi = true;
			}
		}

		if (varMi) {
			System.out.println("Sayı mevcuttur.");
		} else {
			System.out.println("Sayı mevcuttur değildir.");

	}

}
}