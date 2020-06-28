import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
public class PermutateArrayWithDuplicates {
 
	public static Pyramid[] perm(Pyramid[] pyramids, int x) {
		PermutateArrayWithDuplicates pa=new PermutateArrayWithDuplicates();
		
		
		if(x==3) {
		int[] arr= pyramids[0].level3;
		
		
		List<List<Integer>> permute = pa.permute(arr);
		
		//System.out.println("Permuations of array : [10, 20, 10] are:");
		//System.out.println("=========================================");
		int count=0;
		for(List<Integer> perm:permute)
		{
			//System.out.println(perm);
			count++;
		}
		
		if(count == 1) {
			
			
			for(List<Integer> perm:permute)
			{
				for (int i=0; i<2; i++)
				pyramids[i].level3 = toIntArray(perm);
				
			}
			
			pyramids[2].level3[0] = 0;
			return pyramids;
		}//all 3 are the same
		
		if(count == 3) {
			
			int i=0;
			
			for(List<Integer> perm:permute)
			{
				pyramids[i].level3 = toIntArray(perm);
				pyramids[i+1].level3 = toIntArray(perm);
				
				i = i+2;
			}
			pyramids[6].level3[0] = 0;
			return pyramids;	
			
		} // 2 numbers are the same
		
		
		if(count == 6) {
			int i=0;
			
			for(List<Integer> perm:permute)
			{
				pyramids[i].level3 = toIntArray(perm);
				pyramids[i+1].level3 = toIntArray(perm);
				
				i = i+2;
			}
			return pyramids;	
		}//all 3 are distinct
		
		
		}//end of case 3
		
		if(x==4) {
			
			int[] arr= pyramids[0].level4;
			
			
			List<List<Integer>> permute = pa.permute(arr);
			
			//System.out.println("Permuations of array : [10, 20, 10] are:");
			//System.out.println("=========================================");
			int count=0;
			for(List<Integer> perm:permute)
			{
				//System.out.println(perm);
				count++;
			}
			//System.out.println("Number of perrms " +count);
			
			if(count == 1) {
				
				
				for(List<Integer> perm:permute)
				{
					for (int i=0; i<6; i++)
					pyramids[i].level4 = toIntArray(perm);
					
				}
				
				pyramids[6].level4[0] = 0;
				return pyramids;
			}//all 4 are the same
			
			if(count == 4) {
				
				int i=0;
				
				for(List<Integer> perm:permute)
				{
					pyramids[i].level4 = toIntArray(perm);
					pyramids[i+1].level4 = toIntArray(perm);
					pyramids[i+2].level4 = toIntArray(perm);
					pyramids[i+3].level4 = toIntArray(perm);
					pyramids[i+4].level4 = toIntArray(perm);
					pyramids[i+5].level4 = toIntArray(perm);
					
					i = i+6;
				}
				pyramids[24].level4[0] = 0;
				return pyramids;	
				
			} // 2 numbers are the same
			
			
			if(count == 6) {
				int i=0;
				
				for(List<Integer> perm:permute)
				{
					pyramids[i].level4 = toIntArray(perm);
					pyramids[i+1].level4 = toIntArray(perm);
					pyramids[i+2].level4 = toIntArray(perm);
					pyramids[i+3].level4 = toIntArray(perm);
					pyramids[i+4].level4 = toIntArray(perm);
					pyramids[i+5].level4 = toIntArray(perm);
					
					i = i+6;
				}
				pyramids[36].level4[0] = 0;
				return pyramids;	
			}//2 sets of 2 are same
			
			if(count == 12) {
				int i=0;
				
				for(List<Integer> perm:permute)
				{
					pyramids[i].level4 = toIntArray(perm);
					pyramids[i+1].level4 = toIntArray(perm);
					pyramids[i+2].level4 = toIntArray(perm);
					pyramids[i+3].level4 = toIntArray(perm);
					pyramids[i+4].level4 = toIntArray(perm);
					pyramids[i+5].level4 = toIntArray(perm);
					
					i = i+6;
				}
				pyramids[72].level4[0] = 0;
				return pyramids;	
			}//3 are the same
			
			if(count == 24) {
				int i=0;
				
				for(List<Integer> perm:permute)
				{
					pyramids[i].level4 = toIntArray(perm);
					pyramids[i+1].level4 = toIntArray(perm);
					pyramids[i+2].level4 = toIntArray(perm);
					pyramids[i+3].level4 = toIntArray(perm);
					pyramids[i+4].level4 = toIntArray(perm);
					pyramids[i+5].level4 = toIntArray(perm);
					
					i = i+6;
				}
				
				return pyramids;	
			}//4 are distinct
			
			
			
		}//end of case 4
		
		if(x==5) {
			
			int[] arr= pyramids[0].level5;
			
			
			List<List<Integer>> permute = pa.permute(arr);
			
			//System.out.println("Permuations of array : [10, 20, 10] are:");
			//System.out.println("=========================================");
			int count=0;
			for(List<Integer> perm:permute)
			{
				//System.out.println(perm);
				count++;
			}
			//System.out.println("Number of perrms " +count);
			
			if(count == 1) {
				
				
				for(List<Integer> perm:permute)
				{
					for (int i=0; i<24; i++)
					pyramids[i].level5 = toIntArray(perm);
					
				}
				
				pyramids[24].level5[0] = 0;
				return pyramids;
			}//all 5 are the same
			
			if(count == 5) {
				
				int i=0;
				
				for(List<Integer> perm:permute)
				{
					pyramids[i].level5 = toIntArray(perm);
					pyramids[i+1].level5 = toIntArray(perm);
					pyramids[i+2].level5 = toIntArray(perm);
					pyramids[i+3].level5 = toIntArray(perm);
					pyramids[i+4].level5 = toIntArray(perm);
					pyramids[i+5].level5 = toIntArray(perm);
					pyramids[i+6].level5 = toIntArray(perm);
					pyramids[i+7].level5 = toIntArray(perm);
					pyramids[i+8].level5 = toIntArray(perm);
					pyramids[i+9].level5 = toIntArray(perm);
					pyramids[i+10].level5 = toIntArray(perm);
					pyramids[i+11].level5 = toIntArray(perm);
					pyramids[i+12].level5 = toIntArray(perm);
					pyramids[i+13].level5 = toIntArray(perm);
					pyramids[i+14].level5 = toIntArray(perm);
					pyramids[i+15].level5 = toIntArray(perm);
					pyramids[i+16].level5 = toIntArray(perm);
					pyramids[i+17].level5 = toIntArray(perm);
					pyramids[i+18].level5 = toIntArray(perm);
					pyramids[i+19].level5 = toIntArray(perm);
					pyramids[i+20].level5 = toIntArray(perm);
					pyramids[i+21].level5 = toIntArray(perm);
					pyramids[i+22].level5 = toIntArray(perm);
					pyramids[i+23].level5 = toIntArray(perm);
					
					i = i+24;
				}
				pyramids[120].level5[0] = 0;
				return pyramids;	
				
			} // 2 numbers are the same
			
			
			if(count == 10) {
				int i=0;
				
				for(List<Integer> perm:permute)
				{
					pyramids[i].level5 = toIntArray(perm);
					pyramids[i+1].level5 = toIntArray(perm);
					pyramids[i+2].level5 = toIntArray(perm);
					pyramids[i+3].level5 = toIntArray(perm);
					pyramids[i+4].level5 = toIntArray(perm);
					pyramids[i+5].level5 = toIntArray(perm);
					pyramids[i+6].level5 = toIntArray(perm);
					pyramids[i+7].level5 = toIntArray(perm);
					pyramids[i+8].level5 = toIntArray(perm);
					pyramids[i+9].level5 = toIntArray(perm);
					pyramids[i+10].level5 = toIntArray(perm);
					pyramids[i+11].level5 = toIntArray(perm);
					pyramids[i+12].level5 = toIntArray(perm);
					pyramids[i+13].level5 = toIntArray(perm);
					pyramids[i+14].level5 = toIntArray(perm);
					pyramids[i+15].level5 = toIntArray(perm);
					pyramids[i+16].level5 = toIntArray(perm);
					pyramids[i+17].level5 = toIntArray(perm);
					pyramids[i+18].level5 = toIntArray(perm);
					pyramids[i+19].level5 = toIntArray(perm);
					pyramids[i+20].level5 = toIntArray(perm);
					pyramids[i+21].level5 = toIntArray(perm);
					pyramids[i+22].level5 = toIntArray(perm);
					pyramids[i+23].level5 = toIntArray(perm);
					
					i = i+24;
				}
				pyramids[240].level5[0] = 0;
				return pyramids;	
				
				
			}//2 sets of 2 are same
			
			if(count == 20) {
				int i=0;
				
				for(List<Integer> perm:permute)
				{
					pyramids[i].level5 = toIntArray(perm);
					pyramids[i+1].level5 = toIntArray(perm);
					pyramids[i+2].level5 = toIntArray(perm);
					pyramids[i+3].level5 = toIntArray(perm);
					pyramids[i+4].level5 = toIntArray(perm);
					pyramids[i+5].level5 = toIntArray(perm);
					pyramids[i+6].level5 = toIntArray(perm);
					pyramids[i+7].level5 = toIntArray(perm);
					pyramids[i+8].level5 = toIntArray(perm);
					pyramids[i+9].level5 = toIntArray(perm);
					pyramids[i+10].level5 = toIntArray(perm);
					pyramids[i+11].level5 = toIntArray(perm);
					pyramids[i+12].level5 = toIntArray(perm);
					pyramids[i+13].level5 = toIntArray(perm);
					pyramids[i+14].level5 = toIntArray(perm);
					pyramids[i+15].level5 = toIntArray(perm);
					pyramids[i+16].level5 = toIntArray(perm);
					pyramids[i+17].level5 = toIntArray(perm);
					pyramids[i+18].level5 = toIntArray(perm);
					pyramids[i+19].level5 = toIntArray(perm);
					pyramids[i+20].level5 = toIntArray(perm);
					pyramids[i+21].level5 = toIntArray(perm);
					pyramids[i+22].level5 = toIntArray(perm);
					pyramids[i+23].level5 = toIntArray(perm);
					
					i = i+24;
				}
				pyramids[480].level5[0] = 0;
				return pyramids;	
				
			}//3 are the same
			
			if(count == 30) {
				int i=0;
				
				for(List<Integer> perm:permute)
				{
					pyramids[i].level5 = toIntArray(perm);
					pyramids[i+1].level5 = toIntArray(perm);
					pyramids[i+2].level5 = toIntArray(perm);
					pyramids[i+3].level5 = toIntArray(perm);
					pyramids[i+4].level5 = toIntArray(perm);
					pyramids[i+5].level5 = toIntArray(perm);
					pyramids[i+6].level5 = toIntArray(perm);
					pyramids[i+7].level5 = toIntArray(perm);
					pyramids[i+8].level5 = toIntArray(perm);
					pyramids[i+9].level5 = toIntArray(perm);
					pyramids[i+10].level5 = toIntArray(perm);
					pyramids[i+11].level5 = toIntArray(perm);
					pyramids[i+12].level5 = toIntArray(perm);
					pyramids[i+13].level5 = toIntArray(perm);
					pyramids[i+14].level5 = toIntArray(perm);
					pyramids[i+15].level5 = toIntArray(perm);
					pyramids[i+16].level5 = toIntArray(perm);
					pyramids[i+17].level5 = toIntArray(perm);
					pyramids[i+18].level5 = toIntArray(perm);
					pyramids[i+19].level5 = toIntArray(perm);
					pyramids[i+20].level5 = toIntArray(perm);
					pyramids[i+21].level5 = toIntArray(perm);
					pyramids[i+22].level5 = toIntArray(perm);
					pyramids[i+23].level5 = toIntArray(perm);
					
					i = i+24;
				}
				pyramids[720].level5[0] = 0;
				return pyramids;	
					
			}//2 sets of 3 are the same
			
			if(count == 60) {
				int i=0;
				
				for(List<Integer> perm:permute)
				{
					pyramids[i].level5 = toIntArray(perm);
					pyramids[i+1].level5 = toIntArray(perm);
					pyramids[i+2].level5 = toIntArray(perm);
					pyramids[i+3].level5 = toIntArray(perm);
					pyramids[i+4].level5 = toIntArray(perm);
					pyramids[i+5].level5 = toIntArray(perm);
					pyramids[i+6].level5 = toIntArray(perm);
					pyramids[i+7].level5 = toIntArray(perm);
					pyramids[i+8].level5 = toIntArray(perm);
					pyramids[i+9].level5 = toIntArray(perm);
					pyramids[i+10].level5 = toIntArray(perm);
					pyramids[i+11].level5 = toIntArray(perm);
					pyramids[i+12].level5 = toIntArray(perm);
					pyramids[i+13].level5 = toIntArray(perm);
					pyramids[i+14].level5 = toIntArray(perm);
					pyramids[i+15].level5 = toIntArray(perm);
					pyramids[i+16].level5 = toIntArray(perm);
					pyramids[i+17].level5 = toIntArray(perm);
					pyramids[i+18].level5 = toIntArray(perm);
					pyramids[i+19].level5 = toIntArray(perm);
					pyramids[i+20].level5 = toIntArray(perm);
					pyramids[i+21].level5 = toIntArray(perm);
					pyramids[i+22].level5 = toIntArray(perm);
					pyramids[i+23].level5 = toIntArray(perm);
					
					i = i+24;
				}
				pyramids[1440].level5[0] = 0;
				return pyramids;	
					
			}//4 distinct
			
			if(count == 120) {
				int i=0;
				
				for(List<Integer> perm:permute)
				{
					pyramids[i].level5 = toIntArray(perm);
					pyramids[i+1].level5 = toIntArray(perm);
					pyramids[i+2].level5 = toIntArray(perm);
					pyramids[i+3].level5 = toIntArray(perm);
					pyramids[i+4].level5 = toIntArray(perm);
					pyramids[i+5].level5 = toIntArray(perm);
					pyramids[i+6].level5 = toIntArray(perm);
					pyramids[i+7].level5 = toIntArray(perm);
					pyramids[i+8].level5 = toIntArray(perm);
					pyramids[i+9].level5 = toIntArray(perm);
					pyramids[i+10].level5 = toIntArray(perm);
					pyramids[i+11].level5 = toIntArray(perm);
					pyramids[i+12].level5 = toIntArray(perm);
					pyramids[i+13].level5 = toIntArray(perm);
					pyramids[i+14].level5 = toIntArray(perm);
					pyramids[i+15].level5 = toIntArray(perm);
					pyramids[i+16].level5 = toIntArray(perm);
					pyramids[i+17].level5 = toIntArray(perm);
					pyramids[i+18].level5 = toIntArray(perm);
					pyramids[i+19].level5 = toIntArray(perm);
					pyramids[i+20].level5 = toIntArray(perm);
					pyramids[i+21].level5 = toIntArray(perm);
					pyramids[i+22].level5 = toIntArray(perm);
					pyramids[i+23].level5 = toIntArray(perm);
					
					i = i+24;
				}
				
				return pyramids;	
					
			}//5 distinct
			
			
			
		}//end of case 5
		
		
		return pyramids;
	}
	public List<List<Integer>> permute(int[] arr) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(arr);
		permuteHelper(list, new ArrayList<>(), arr,new boolean[arr.length]);
		return list;
	}
 
	private void permuteHelper(List<List<Integer>> list, List<Integer> resultList, int [] arr, boolean [] used){
		
		// Base case
		if(resultList.size() == arr.length){
	        list.add(new ArrayList<>(resultList));
	    } else{
	        for(int i = 0; i < arr.length; i++){
	            if(used[i] || i > 0 && arr[i] == arr[i-1] && !used[i - 1]) 
	            {   
	            	    // If element is already used
	            		continue;
	            }
	            // choose element
	            used[i] = true; 
	            resultList.add(arr[i]);
	            
	            // Explore
	            permuteHelper(list, resultList, arr, used);
	            
	            // Unchoose element
	            used[i] = false; 
	            resultList.remove(resultList.size() - 1);
	        }
	    }
	}
	
	public static int[] toIntArray(List<Integer> list){
		  int[] ret = new int[list.size()];
		  for(int i = 0;i < ret.length;i++)
		  {
		    ret[i] = list.get(i);
		  }
		  return ret;
		}
 
}