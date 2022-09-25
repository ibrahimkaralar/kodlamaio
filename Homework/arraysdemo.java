package intro.Homework;

public class arraysdemo {

	public static void main(String[] args) {
		String[] öğrenciler = new String[5];
		öğrenciler[0] = "ibrahim";
		öğrenciler[1] = "engin";
		öğrenciler[2] = "derin";
		öğrenciler[3] = "salih";
		öğrenciler[4] = "suat";
		for (int i = 0; i < öğrenciler.length; i++) {

			System.out.println(öğrenciler[i]);
		}
		System.out.println("-----------");

		for (String öğrenci : öğrenciler) {
			System.out.println(öğrenci);
		}

	}

}
