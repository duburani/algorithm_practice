package Level2;

import java.util.ArrayList;

public class Pro004_Cache {
	
	public static void main(String[] args) {
		Pro004_Cache pro = new Pro004_Cache();
		String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
		System.out.println(pro.solution(0, cities));
	}
	
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        int CACHE_HIT = 1, CACHE_MISS = 5;
        
        ArrayList<String> lru = new ArrayList<>();
        
        
        if(cacheSize == 0) {
        	answer = cities.length*CACHE_MISS;
        }
        
        for(String city : cities) {
        	city = city.toUpperCase();
        	if(lru.contains(city)) { // 이미 리스트에 있었다면 지우고 맨뒤로 보냄. 그리고 추적 1 증
        		lru.remove(city);
        		lru.add(city);
        		answer += CACHE_HIT;
        	}else {
        		if(cacheSize==0) continue;
        		if(lru.size() == cacheSize) {
        			lru.remove(0);
        		}
        		lru.add(city);
        		answer += CACHE_MISS;
        	}
        }
        return answer;
    }

}
