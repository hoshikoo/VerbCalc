package nyc.c4q.ac21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * Calculate the verbosity of a text
 */
public class VerbosityCalculator {
    public static void main(String[] args) {

        // An abstract representation of a File
        File mobyDick = new File("/Users/Hoshiko/Desktop/accesscode/VerbCalc/resources/MobyDick.txt");
        File aTaleOfTwoCities = new File("/Users/Hoshiko/Desktop/accesscode/VerbCalc/resources/A_Tale_of_Two_Cities.txt");


        System.out.println("Hermal Melville's Moby Dick verbosity is ");
        VerbosityCal(mobyDick);
        System.out.println("Charles Dickens' A Tale of Two Cities verbosity is ");
        VerbosityCal(aTaleOfTwoCities);

        if(VerbosityCal(mobyDick)>VerbosityCal(aTaleOfTwoCities)){
            System.out.println("Hermal Melville is more verbose than Charles Dickens");
        }else if (VerbosityCal(mobyDick)<VerbosityCal(aTaleOfTwoCities)){
            System.out.println("Charles Dickens is more verbose than Hermal Melville");
        }
    }

    public static void VerbosityCal(File file) {
        try {

            Scanner sc = new Scanner(file);


            double wordCount = 0.0;
            double sentences = 0.0;

            while (sc.hasNext()) {
                ++wordCount;
                String words = sc.next();
                //System.out.println(sc.next());
                if (words.contains(".") || words.contains("!") || words.contains("?"))
                    sentences=sentences+1;
                
                if (words.equalsIgnoreCase("mr.") || words.equalsIgnoreCase("mrs.") || words.equalsIgnoreCase("ms."))
                    sentences=sentences-1;

            }
            double verbosity = wordCount/sentences;
            //System.out.println(wordCount);
            //System.out.println(sentences);
            DecimalFormat df = new DecimalFormat("###,##0.00");
            System.out.println(df.format(verbosity));

        }

        catch(FileNotFoundException e){
            e.printStackTrace();
        }


    }
}
