
public class OverloadedMethods {
	public static void main(String[] args) {  
        //create instance here  
    }  
  
    //overload methods here  
	public void print(){  
		System.out.println("original print method.");  
	}
	
	public void print(String string){  
        System.out.println(string);  
    }  
	
	public void print(String string, String string2){  
        System.out.println(string + " " + string2);  
    } 
	
//	public void print(String first, String second){  
//        System.out.println(first + " " + second);  
//    }
}
