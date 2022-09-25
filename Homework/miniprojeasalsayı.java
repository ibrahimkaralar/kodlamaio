package intro.Homework;

public class miniprojeasalsayı {

	public static void main(String[] args) {
		int number=-5;
		int remainder= number%2;
		/* System.out.println(remainder); */
		boolean asalSayıMı=true ;
		if(number==1) {
			System.out.println("asal sayı değildir");
		return;
		}
	if(number<1) {
		System.out.println("geçersiz sayı");
return;
	}
		
		for(int i=2 ;i<number;i++) {
			if(number%i==0) {
				asalSayıMı=false;
			}
		}	
			if(asalSayıMı==true){
		System.out.println("asal sayıdır");
			}else {
				System.out.println("asal sayı değildir");
			}
			
			}
		
}
