
public class StringConcatenation {
	
	public static void main(String[] args) {
        String hello = "Hello";

        String world = " World";
        String combo = hello + world;

        System.out.println(combo);
        
        long l = 549484648648468486L;
        System.out.println("The value of l: " + l);
        
        boolean b = true;
        System.out.println(b + "is" + b);
        
        int x = 897;
        int y = 654;
        System.out.println("The sum of x and y is " + x + y);
        System.out.println("The sum of x and y is " + (x + y));
        System.out.println(x + y + " is the sum of x and y");
    }
}
