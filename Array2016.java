public class Array2016 {
	public static void main(String[] args) {
		/* Make an array of integers of size 30, store 30 integers, then display integers
		that are between 16 and 47 */
		int array[] = {1,42,33,4,5,6,50,312,23};
		int i,store=0;
		for(i=0;i<array.length;i++) {
			if(array[i]>16 && array[i]<47) {
				store = array[i];
				System.out.print("\tStored numbers are: "+i);
			}
		}
		System.out.print("Stored numbers are: "+store);
	}
}