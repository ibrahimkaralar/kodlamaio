package intro.Homework;

public class multidimensionalarraydemo {

	public static void main(String[] args) {
		String[][] şehirler = new String[3][3];
		şehirler[0][0] = "istanbul";
		şehirler[0][1] = "bursa";
		şehirler[0][2] = "bilecik";
		şehirler[1][0] = "ankara";
		şehirler[1][1] = "konya";
		şehirler[1][2] = "kayseri";
		şehirler[2][0] = "diyarbakır";
		şehirler[2][1] = "şanlıurfa";
		şehirler[2][2] = "gaziantep";
	for(int i=0;i<=2; i++) {
System.out.println("-------------");
		for(int j=0;j<=2;j++) {
	System.out.println(şehirler [i][j]);
}		
	}
	
	}

}
