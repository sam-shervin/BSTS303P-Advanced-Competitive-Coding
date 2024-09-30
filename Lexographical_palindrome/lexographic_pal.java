package Lexographical_palindrome;

/*
 * 
 */
public class lexographic_pal {
    public static void main (String[] args){
        String s = "malayalam";
        int len = s.length();
        int max=26;
        int freq[] = new int[max]

        for(int i=0;i<len;i++){
            freq[s.charAt(i)-'a']++;

        if (CanMakePalindrome(freq,max,len)==false){
            System.out.println("Yes");
            System.exit(0);
        }
    }
    String odd_String='';
            
        }
        }

    }
}
