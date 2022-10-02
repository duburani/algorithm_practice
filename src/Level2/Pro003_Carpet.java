package Level2;

public class Pro003_Carpet {
	public static void main(String[] args) {
		Pro003_Carpet car = new Pro003_Carpet();
		System.out.println(car.solution(10, 2));
	}
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        
        int max = brown + yellow;
        for(int i=2; i<=max; i++) {
        	while(max%i==0) {
        		System.out.println(i);
        		max/=i;
        	}
        }
        
        return answer;
    }
}
