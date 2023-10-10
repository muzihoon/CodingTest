class Solution {
    public int solution(int n) {
        int answer = 0;
         for(int i =answer+1; i<=n; i++)
        {
        	answer++;
           while(true)
        	{
        		 if(answer%3==0 || answer%10==3 || answer/10==3 || (answer%100>=30 && answer%100<40))
        			 answer++;
        		 else
        			 break;
        	}
        }
        return answer;
    }
}