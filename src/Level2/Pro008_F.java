package Level2;

public class Pro008_F {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pro008_F p = new Pro008_F();
		System.out.println(p.solution(10));

	}
	public int solution(int n) {
        int[] answer = new int[n+1];   
        
        for(int i=0; i<=n; i++) {
        	if(i==0) answer[i] = 0;
        	else if(i==1) answer[i] = 1;
        	else {
        		int sum = answer[i-2] + answer[i-1];
        		answer[i] = sum%1234567;
        	}
        }
        
        return answer[n];
    }
}
