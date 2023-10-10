class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int d = 0;
        int r = 0;
        int add = 0;
    	int multiple =0;
        
        for(int i=0; i<common.length-1; i++)
        {	
        	//등차 구하기
        	d = (common[1])-common[0];
            //등비 구하기, 0일 경우 회차를 건너뛴다.
        	if(common[common.length-1]==0 || common[common.length-2]==0)
        		continue; 
        	else
        		r = (common[common.length-1])/common[common.length-2];
            
        	//등차수열 일 경우
        	if(common[i+1]==common[i]+d)
        		add++;
        	else //등비수열 일 경우
        		multiple++;
        }
        answer = add>multiple ? (common[common.length-1])+d :(common[common.length-1])*r;
        return answer;
    }
}