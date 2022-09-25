package intro.Homework;

public class sesliharfler {

	public static void main(String[] args) {

		/*benim çözüm:char[][] harfler = new char[2][4];
		harfler[0][0] = 'A';
		harfler[0][1] = 'I';
		harfler[0][2] = 'O';
		harfler[0][3] = 'U';
		harfler[1][0] = 'E';
		harfler[1][1] = 'İ';
		harfler[1][2] = 'Ö';
		harfler[1][3] = 'Ü';
		for (int i = 0; i <= 1; i++) {
			System.out.println("---------");
			for (int j = 0; j <= 3; j++) {
				System.out.println(harfler[i][j]);*/
		
	char harf='ü';
	char harf1=Character.toUpperCase(harf);
	switch(harf1) {
	case'A':
	case'I':
	case'O':
	case'U':
	System.out.println("kalın sesli harf");
	break;
	case'E':
	case'İ':
	case'Ö':
	case'Ü':
		System.out.println("ince sesli harf"); 
		break;
	default:
	System.out.println("geçersiz harf");
	}
	
	
	
	
	
	
	
	
	}

		

	}

