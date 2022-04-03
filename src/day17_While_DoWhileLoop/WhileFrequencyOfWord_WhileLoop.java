package day17_While_DoWhileLoop;

public class WhileFrequencyOfWord_WhileLoop {
    public static void main(String[] args) {

        String str="Java Java Python Python";
        int frequency=0;

        while(str.contains("Java")){
           str= str.replaceFirst("Java","");
             frequency++;
        }
        System.out.println("frequency = " + frequency);

        System.out.println("*************************");


        String sentence="cat cat dog dog cat dog ";
        sentence=sentence.toLowerCase();
        int countCat=0;

        while(sentence.contains("cat")){
            sentence=sentence.replaceFirst("cat","");
            countCat++;
        }
        System.out.println(countCat);

        System.out.println("************************************");


        String s="java java java python python python";
        int countJava=0;
        int countPython=0;

        while(s.contains("java")||s.contains("python")){
            if(s.contains("java")){
                s=s.replaceFirst("java","");
                countJava++;

            }
            if(s.contains("python")){
                s=s.replaceFirst("python","");
                countPython++;
        }

    }
        System.out.println("countPython = " + countPython);
        System.out.println("countJava = " + countJava);


        System.out.println();
        System.out.println("***************************");
        String ab="AAAABBBCCCCAa";
         ab=ab.toUpperCase();

        int count=0;

        while(ab.contains("A")){
            ab=ab.replaceFirst("A","");
            count++;


        }
        System.out.println(count);
}}
