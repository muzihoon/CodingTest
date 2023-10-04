import java.util.Scanner;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        String[] b = new String[a.length()];
        
       // 한 글자씩 배열에 담고 
       //아스키 코드 값으로 비교한 후 변환
        for (int i = 0; i < a.length(); i++) {
          b[i] = a.charAt(i)-97>=0 ? String.valueOf(Character.toUpperCase(a.charAt(i))) 
                                   : String.valueOf(Character.toLowerCase(a.charAt(i)));
        	result += b[i];
        }   
        System.out.println(result);
    }
}