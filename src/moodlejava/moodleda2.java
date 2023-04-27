//package moodlejava;
//import java.util.Scanner;
//
//public class moodleda2 {
//
////    public static boolean isvowel(char ch){
////        if(ch=='i'||ch=='a'||ch=='e'||ch=='o'||ch=='u'){
////            return true;
////        }
////        return false;
////    }
//////    public static int isvowelsame(String str1){
////        int n=0;
////        int frequency=0;
////        for(int i=0;i<str1.length();i++){
////            if(isvowel(str1.charAt(i))){
////                for(int j=i+1;j<str1.length();j++){
////                    if(str1.charAt(i)== str1.charAt(j)){
////                        n++;
////                        frequency++;
////                        if(frequency>=2){
////                            n--;
////                        }
////                    }
////                }
////            }
////        }
////        return n;
////    }
//public int countSyllables(String word) {
//    int count = 0;
//    word = word.toLowerCase();
//    for (int i = 0; i < word.length(); i++) {
//        if (word.charAt(i) == '\"' || word.charAt(i) == '\'' || word.charAt(i) == '-' || word.charAt(i) == ',' || word.charAt(i) == ')' || word.charAt(i) == '(') {
//            word = word.substring(0,i)+word.substring(i+1, word.length());
//        }
//    }
//    boolean isPrevVowel = false;
//    for (int j = 0; j < word.length(); j++) {
//        if (word.contains("a") || word.contains("e") || word.contains("i") || word.contains("o") || word.contains("u")) {
//            if (isVowel(word.charAt(j)) && !((word.charAt(j) == 'e') && (j == word.length()-1))) {
//                if (isPrevVowel == false) {
//                    count++;
//                    isPrevVowel = true;
//                }
//            } else {
//                isPrevVowel = false;
//            }
//        } else {
//            count++;
//            break;
//        }
//    }
//    return count;
//}
//
//    private boolean isVowel(char charAt) {
//
//    }
//
//    public static void main(String[] args) {
//        System.out.println(isvowelsame("sentence"));
//        Scanner sc=new Scanner(System.in);
//        String str=sc.nextLine();
//        int words=1;
//        int sentence=0;
//        int count=0;
//        String word[] = new String[1000];
//        int j=0;
//        for (int i=0;i<str.length();i++){
//            if(str.charAt(i)==' '){
//                words++;
//                word[j]=str.substring(0,i);
//            }
//            if(str.charAt(i)=='.'||str.charAt(i)=='?'||str.charAt(i)=='!'||str.charAt(i)==';'||str.charAt(i)==':'){
//                sentence++;
//            }
//
//    }
////        To count the number of syllables you should use letters a, e, i, o, u, y as vowels.
////
////        Count the number of vowels in the word. 2. Do not count double-vowels
////                (for example, "rain" has 2 vowels but is only 1 syllable) 3.
////        If the last letter in the word is 'e' do not count it as a vowel (for example, "side" is 1 syllable)
////        4. If at the end it turns out that the word contains 0 vowels, then consider this word as 1-syllable
//        boolean flag=false;
//        int k=0;
//        for(int i = 0; i < (word[k].length()-1); i++)
//        {
//           if(isvowel(str.charAt(i))){
//               if(isvowel(str.charAt(i))&&isvowel(str.charAt(i+1))){
//                   count=count+1;
//                   i=i+1;
//               }
//               else{
//                   count++;
//               }
//
//           }
//           k++;
//
//        }
//        for(int i=0;i<words;i++) {
//            if (word[i].charAt(word[i].length() - 1) == 'a' || word[i].charAt(word[i].length() - 1) == 'e' || word[i].charAt(word[i].length() - 1) == 'i' || word[i].charAt(word[i].length() - 1) == 'o' || str.charAt(str.length() - 1) == 'u') {
//                count++;
//            }
//        }
//        for(int i = 0; i < str.length()-1; i++)
//        {
//            if(isvowel(str.charAt(i))){
//                 flag=true;
//                 break;
//            }
//
//        }
//        if(!flag){
//            count++;
//        }
//        count=count-isvowelsame(str);
//        if(str.charAt(str.length()-1)=='e'){
//            count--;
//        }
//        if(count<0){
//            count=0;
//        }
//        System.out.println(count);
//
//
//
//    }
//}
