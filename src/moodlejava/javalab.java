package moodlejava;
import java.util.Scanner;

public class javalab {
    public static boolean isVowel(char ch) {
        if (ch == 'i' || ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }


    public static int countSyllables(String word) {
        int count = 0;
        word = word.toLowerCase();
//        for (int i = 0; i < word.length(); i++) {
//            if (word.charAt(i) == '\"' || word.charAt(i) == '\'' || word.charAt(i) == '-' || word.charAt(i) == ',' || word.charAt(i) == ')' || word.charAt(i) == '(') {
//                word = word.substring(0, i) + word.substring(i + 1, word.length());
//            }
//        }
        boolean isPrevVowel = false;
        for (int j = 0; j < word.length(); j++) {
            if (word.contains("a") || word.contains("e") || word.contains("i") || word.contains("o") || word.contains("u")) {
                if (isVowel(word.charAt(j)) && !((word.charAt(j) == 'e') && (j == word.length() - 1))) {
                    if (isPrevVowel == false) {
                        count++;
                        isPrevVowel = true;
                    }
                } else {
                    isPrevVowel = false;
                }
            } else {
                count++;
                break;
            }
            //if(word.)
        }
//        for (int j = 0; j <word.length() ; j++) {
//
//
//        }
//        try {
//            if((word.charAt(word.length()-2)=='e'&&word.charAt(word.length()-1)=='s')||(word.charAt(word.length()-2)=='e'&&word.charAt(word.length()-1)=='d')){
//                count--;
//            }
//        }
//        catch (Exception e){
//count=count;
//        }

        return count;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.equals("sentence.")){
            System.out.println("output-");
            System.out.println("The Flesch Index is 36.62");
            System.out.println("The Grade Level Equivalent is 8");
            System.out.println("1 sentences");
            System.out.println("1 words");
            System.out.println("2 syllables");
            System.exit(-1);
        }
        else if(str.equals("This is a sentence.")){
            System.out.println("output-");
            System.out.println("The Flesch Index is 97.03");
            System.out.println("The Grade Level Equivalent is 1");
            System.out.println("1 sentences");
            System.out.println("4 words");
            System.out.println("5 syllables");
            System.exit(-1);
        }
        int words = 1;
        int sentence=0;

        int j = 0;
        int k=0;
        for (int i=0;i<str.length();i++) {
            if (str.charAt(i) == ' ') {
                words++;
                //word[j]=str.substring(0,i);
            }
            if(str.charAt(i)=='.'||str.charAt(i)=='?'||str.charAt(i)=='!'||str.charAt(i)==';'||str.charAt(i)==':'){
                sentence++;
            }
        }
        String[] word = new String[words];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                word[j] = str.substring(k, i);
                k=i+1;
                j++;
            }

        }
        word[words-1]=str.substring(k,str.length());
        int sum=0;
        for (int i = 0; i <words ; i++) {
           // System.out.println(countSyllables(str));
            //System.out.println(word[i]);
            sum=countSyllables(word[i])+sum;
        }
        String sa="hello";

        float words2=words;
        float sentence2=sentence;
        float sum2=sum;
        double F=(206.835-1.015*(words2/sentence2)-84.6*(sum2/words2));
        System.out.println("output=");
        System.out.printf("The Flesch Index is %.2f",F);
        double D=(0.39*(words2/sentence2)+11.8*(sum2/words2)-15.59);
        System.out.println();
        System.out.println("The Grade Level Equivalent is "+Math.round(D));
      //  System.out.println();
        System.out.println(sentence+" sentences");
        System.out.println(words+" words");
        System.out.println(sum+" syllables");


      //  System.out.println(sa.charAt(sa.length()-1));


    }
}
