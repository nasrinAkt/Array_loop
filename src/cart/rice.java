package cart;

public class rice {

	public static void main(String[] args) {
		rice fun = new rice();
		fun.queen();
		fun.king();

	}
public void queen() {
	double [] side = {2.99,3.99,4.99,5.99,7.99};
	for(int i = 0; i<side.length; i++) {
	System.out.println(side[i]);		
	}
}
public void king() {
	double [] mind = {2.99,3.99,4.99,5.99,7.99};
	for(int i = 2; i<=mind.length; i=i+2) {
	System.out.println(mind[i]);		
	}
}

}
