package nyc.c4q.ac21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Calculate the verbosity of a text
 */
public class VerbosityCalculator {
    public static void main(String[] args){

        // An abstract representation of a File
        File mobyDick = new File("/Users/Hoshiko/Desktop/accesscode/VerbCalc/resources/MobyDick.txt");
        File aTaleOfTwoCities = new File("/Users/Hoshiko/Desktop/accesscode/VerbCalc/resources/A_Tale_of_Two_Cities.txt");

        try{
            Scanner sc = new Scanner(mobyDick);
            Scanner scSecond = new Scanner(aTaleOfTwoCities);

            /**
             *  Your CODE goes here

            System.out.println(sc.next());
            String text = sc.next();
            char space = ' ';
            //String dashes = '--';
            //System.out.println(dashes);
            int wordCount=1;

            for (int i = 0; i < text.length(); i = i+1){
                if (text.charAt(i)==space){
                    wordCount= wordCount+1;
                }
            }
            System.out.println(wordCount);
             */


            int count =0;
            int countSecond =0;

            while (sc.hasNext()) {
                ++count;
                sc.next();
            }
            System.out.println(count);

            while (scSecond.hasNext()) {
                ++countSecond;
                scSecond.next();
            }
            System.out.println(countSecond);
        }

        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}