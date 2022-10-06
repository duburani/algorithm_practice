package Level2;

import java.util.Arrays;

public class Pro005_LifeBoat {
	public static void main(String[] args) {
		Pro005_LifeBoat pro = new Pro005_LifeBoat();
		int[] people = {20,50,70,80};
		System.out.println(pro.solution(people, 100));
	}
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        
        int i = 0;
        for(int j = people.length - 1; j >= i; j--) {
        	if(people[j] + people[i] <= limit) {
        		answer++;
        		i++;
        	}
        	else answer++;
        }

        return answer;
    }

}
