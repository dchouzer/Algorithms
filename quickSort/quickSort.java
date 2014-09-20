import java.util.ArrayList;
import java.util.Arrays;


public class quickSort {

	int pickPivot(ArrayList<Integer> unsorted){
		ArrayList<Integer> medians = new ArrayList<Integer>();

		for(int element : unsorted){
			Integer [] set = new Integer[5];

			while((unsorted.size()-medians.size()*5)>=5){
				for(int i = 0; i<5; i++){
					set[i]= unsorted.get(i);
				}
			Arrays.sort(set); 
			medians.add(set[3]); 
			}
		}
		
		if(medians.size() == 0)
			return unsorted.get(unsorted.size()/2);
		return medians.get(medians.size()/2);
	}

	ArrayList<Integer> sort(ArrayList<Integer> unsorted)
	{
		if(unsorted.size() <= 2){
			return unsorted; 
		}

		Integer pivot = pickPivot(unsorted);
		ArrayList<Integer> A  = new ArrayList<Integer>();
		ArrayList<Integer> B  = new ArrayList<Integer>();



		for(Integer element:unsorted){
			if(element< pivot){
				A.add(element); 
			}
			else if(element>pivot ){
				B.add(element); 
			}
			else{
				continue; 
			}

		}

		A.add(pivot); 
		ArrayList<Integer> sortedA = sort(A);
		ArrayList<Integer> sortedB = sort(B);

		sortedA.addAll(sortedB); 
		return sortedA; 
	}	

	public static void main(String [] args){
		quickSort q = new quickSort(); 
		ArrayList<Integer> in = new ArrayList<Integer>(); 

		for(int i=0; i<10; i++){
			in.add((int) (10*Math.random())); 
		}
	}
}
