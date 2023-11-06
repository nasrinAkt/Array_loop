package cart;

public class oil {
public static void main(String[] args) {
	
	oil nice = new oil();
	nice.toy();
	nice.toy1();
	
	
	
}
public void toy() {    //odd number using <
int [] cash= {200,300,400,500,600,700,800};
for(int i = 1; i<cash.length;i= i+2) {
	
System.out.println(cash[i]);	
	
}
	
	
}

public void toy1() {    //odd number using <=
int [] money= {200,300,400,500,600,700,800,900};//here last index no should be odd
for(int i = 1; i<=money.length;i= i+2) {
	
System.out.println(money[i]);	
	
}
	
	
}





}
