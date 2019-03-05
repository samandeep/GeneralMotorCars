package ca.sa.generalmotorcars.utils;

/**
 * Created by samandeep on 22,February,2019
 */
public class StringUtil {
    public static String convertIntToString(int val){
        return String.valueOf(val);
    }

    public static String getReleasingString(int releaseDate){
        return ("Releasing on: "+String.valueOf(releaseDate));
    }
}
