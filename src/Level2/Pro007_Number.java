package Level2;

public class Pro007_Number {
	public static void main(String[] args) {
		Pro007_Number pro = new Pro007_Number();
		System.err.println(pro.solution(15));
	}
    public int solution(int n) {
        int answer = 0;
        
        int cnt = 1;
        while(true) {
        	int sum = 0;
        	for(int i=cnt; i<=n; i++) {
        		sum += i;
        		if(sum == n) {
        			answer++;
        			break;
        		}else if (sum > n) {
        			break;
        		}
        	}
        	cnt++;
        	
        	if(cnt > n)
        		break;
        }
        
        return answer;
    }
}
