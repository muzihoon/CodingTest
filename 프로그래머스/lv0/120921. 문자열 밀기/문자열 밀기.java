import java.util.*;

class Solution {
    public int solution(String A, String B) {
        int answer = 0;
     
        while(!A.equals(B)){
            char last = A.charAt(A.length()-1);
           String substring  = A.substring(0,A.length()-1);
         A = last + substring ; 
          answer ++;
           if(answer>A.length())
           {
               answer = -1;
               break;
           }
        }
        return answer;
    }
}