package intro.Homework;

public class mükemmelsayı {

	public static void main(String[] args) {
		int number=6;
int toplam=0;
	for(int i=1;i<number;i++) {
		if(number%i==0) {
			toplam=toplam + i ;
			
		}
		
	}
	if(number==toplam) {
		System.out.println("mükemmel sayıdır" );
	}else {
		System.out.println("mükemmel sayı değil" );
	}
	}

	}
