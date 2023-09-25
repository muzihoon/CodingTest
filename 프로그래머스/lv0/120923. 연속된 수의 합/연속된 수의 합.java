import java.util.*;
class Solution {
    public int[] solution(int num, int total) {
         int[] answer = new int [num];
           
        int middle = num%2 == 0? total/num+1 : total/num;
        int left = num/2;
        for(int i = 0; i<num; i++)
        {
            answer[i] = middle - (left-i);    
        }
        
        
        return answer;
    }
}

