package cart;

public class sugar {
public static void main(String[] args) {
	sugar fan = new sugar();
	fan.date();
	fan.data();
	fan.dad();
	
	
}
public void date() {
String [] flowers = {"rose","hibbicus","belly","sunflower","lily"};	
for(int i = 1; i<flowers.length;i++) {
System.out.println(flowers[i]);	
	
	
}
}

public void data() {
String [] flowers = {"rose","hibbicus","belly","sunflower","lily"};	
for(int i = 1; i<flowers.length;i=i+2) {
System.out.println(flowers[i]);	
	

}
}
public void dad() {
String [] flowers = {"rose","hibbicus","belly","sunflower","lily","white flower"};	
for(int i = 1; i<=flowers.length;i=i+2) {
System.out.println(flowers[i]);	
	
	
}
}




}
