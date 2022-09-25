package intro.Homework;

public class sayıbulma {

	public static void main(String[] args) {
		int []sayılar=new int[] {1,2,5,7,9,0};
int aranacak=6;
boolean varMı=false;
for(int sayı:sayılar) {
	if(sayı==aranacak) {
		varMı= true;
	break;
	}


}

if(varMı) {
	System.out.println("sayı mevcuttur");
}else {
	System.out.println("sayı mevcut değildir");
}
	
	}

	
	
	
	}

	/*benim çözümüm
	 * int[] sayilar = new int[] { 1, 2, 4, 7, 8, 10 }; int aranacak = 10; boolean
	 * varMi = false;
	 * 
	 * for (int i = 0; i < sayilar.length; i++) { if (aranacak == sayilar[i]) {
	 * varMi = true; } }
	 * 
	 * if (varMi) { System.out.println("Sayı mevcuttur."); } else {
	 * System.out.println("Sayı mevcuttur değildir.");
	 */