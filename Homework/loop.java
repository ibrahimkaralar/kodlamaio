package intro.Homework;

public class loop {
	
	public static void main(String[] args) {
		
		//loop döngü demektir
		//for döngüsü
		for(int i=1; i<10; i++) {
			System.out.println(i);
		}
		System.out.println("döngü bitti");

		//for döngüsüyle yapabildiğimiz her şeyi while döngüsüyle de yapabiliriz
		//en çok tercih edilen for döngüsü
		
		//while
		int i=1;
	while(i<10) {
		System.out.println(i);
	i++;
	}
	System.out.println("while döngüsü bitti");
	
	//do while
	int j=100 ;
	do {
		System.out.println(j);
		j++;
	}while(j<10) ;
	System.out.println("do while döngüsü bitti");
	}

}
