
public class Algorithms {
	public static void main(String[] args){
		long startTime = System.nanoTime();
		int cards[] = new int[]{2, 4, 39, 4};
		sort(cards);
		printArray(cards);
		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " seconds");
	}
	
	public static void sort(int[] array){
		int current = 0;
		for(int x = 0; x < array.length - 1; x++){
			for(int i = 0; i < array.length - 1; i++){
				if(array[i] > array[i + 1]){
					current = array[i + 1];
					array[i + 1] = array[i];
					array[i] = current;
				}
			}
		}
	}
	
	public static void printArray(int[] array){
		String finals = "";
		for(int i = 0; i < array.length; i++){
			finals += array[i] + ", ";
		}
		System.out.println(finals.substring(0, finals.length() - 2));
	}
}
