
public class codesort {
public static void main(String[] args) {
	//You will be given an array of numbers. You have to sort the odd numbers in 
	//ascending order while leaving the even numbers at their original positions.
	int[] ints = { 9,16,7,3,22 };
	// Should be ={3,16,7,9,22}
	
	
	for (int i = 0; i < 5; i++) {
		
		for (int j = i; j < 5; j++) {
			boolean per= ints[i]%2==0;
			boolean perj= ints[j]%2==0;
			if(!per&&!perj) {
				int box=0;
				if(ints[i]>ints[j]) {
			box=ints[j];
			ints[j]=ints[i];
				ints[i]=box;	
			}
		}
		
		
		}
	/*
		Codewars Format:
	 for (int i = 0; i < 5; i++) {
		
		for (int j = i; j < 5; j++) {
			boolean per= ints[i]%2==0;
			boolean perj= ints[j]%2==0;
			if(!per&&!perj) {
				int box=0;
				if(ints[i]>ints[j]) {
			box=ints[j];
			ints[j]=ints[i];
				ints[i]=box;	
			}
		}
		
		
		}
		
	 */
		 
	
	}
	for (int i = 0; i < ints.length; i++) {
		System.out.println(ints[i]);
	}
}
}
