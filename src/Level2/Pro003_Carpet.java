package Level2;

import java.util.Arrays;

public class Pro003_Carpet {
	public static void main(String[] args) {
		Pro003_Carpet car = new Pro003_Carpet();
		System.out.println(Arrays.toString(car.solution(10, 2)));
	}
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int sum = brown + yellow;
        for(int i=1; i<=sum; i++) {
        	int row = i;
        	int col = sum / row;
        	
        	if(row > col) {
        		continue;
        	}
        	
        	if((row-2) * (col-2) == yellow) {
        		answer[0] = col;
        		answer[1] = row;
        		break;
        		
        	}
        }
        
        return answer;
    }
}
