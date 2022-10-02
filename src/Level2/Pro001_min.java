package Level2;

import java.util.ArrayList;
import java.util.Comparator;

public class Pro001_min {

	public static void main(String[] args) {
		System.out.println();
		
		Pro001_min pro = new Pro001_min();
		
		int []A = {1,4,2};
		int []B = {5,4,4};
		
		System.out.println(pro.solution(A, B));
	}
	
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        ArrayList<Integer> aList = new ArrayList<>();
        ArrayList<Integer> bList = new ArrayList<>();
        
        for(int i=0; i<A.length; i++) {
        	aList.add(A[i]);
        }
        for(int i=0; i<B.length; i++) {
        	bList.add(B[i]);
        }
        
        aList.sort(Comparator.naturalOrder());
        bList.sort(Comparator.reverseOrder());
        
        for(int i=0; i<aList.size(); i++) {
        	answer += aList.get(i) * bList.get(i);
        }
        return answer;
    }
}
