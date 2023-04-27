package Leetcode;

public class lengthoflastword {
    public static void lengthOfLastWord(String s) {
        String [] words=new String[s.length()];
        int i;
        int k=0;
        int j=0;
        StringBuilder result = new StringBuilder();
        result.append(s);
        for(i=0;i<result.length();i++){
            if(Character.isWhitespace(result.charAt(i))){
                words[j]=s.substring(k,i);
                k=i+1;
                j++;
            }
        }

        words[j]=s.substring(k,s.length());

        for(int l=0;l<=j;l++){
           if(Character.isWhitespace(words[j].charAt(l))){

           }
        }
        int p=words[j].length();
        System.out.println(p);
    }


    public static void main(String[] args) {
        lengthOfLastWord("   fly me   to   the moon  ");
    }
}
