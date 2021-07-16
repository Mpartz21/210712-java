
public class ProductPrinter {
	
	public static void main(String args[]){
        int[] array1 = {2,4,6,8,10,12,14,16,18,20};
        int[] array2 = {1,2,3,5,7,9,11,13,17,19};

        //iterate over the first set of numbers
        for (int i = 0; i < array1.length; i++) {
            //iterate over the second set of numbers
            for (int j = 0; j < array2.length; j++) {
                //print the product of the current elements from each set
                System.out.println(array1[i] * array2[j]);
                
                int element1 = array1[i];
                int element2 = array2[j];
                       
                System.out.println(element1 * element2);
            }
        }
    }
}
