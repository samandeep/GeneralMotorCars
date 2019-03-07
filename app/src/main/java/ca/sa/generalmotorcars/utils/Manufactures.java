package ca.sa.generalmotorcars.utils;

import java.util.HashMap;

import ca.sa.generalmotorcars.models.ManufactureGmData;

/**
 * Created by samandeep on 05,March,2019
 */
public class Manufactures {
    public ManufactureGmData[] MODELS={MODEL0,MODEL1,MODEL2,MODEL3,MODEL4,MODEL5,MODEL6,MODEL7,MODEL8,MODEL9,MODEL10,
            MODEL11,MODEL12,MODEL13,MODEL14,MODEL15,MODEL16,MODEL17,MODEL18,MODEL19,MODEL20, MODEL21,MODEL22,
            MODEL23,MODEL24,MODEL25,MODEL26,MODEL27,MODEL28,MODEL29,MODEL30,MODEL31,MODEL32,MODEL33,MODEL34};

    HashMap<String, ManufactureGmData> itemHashMap=new HashMap<>();

    public Manufactures(){
        for (ManufactureGmData manufacture:MODELS){
            itemHashMap.put(String.valueOf(manufacture.getModelNumber()),manufacture);
        }
    }

    public static final ManufactureGmData MODEL0=new ManufactureGmData(1001,"Chevrolet Volt",2019,200000,"Horsepower");
    public static final ManufactureGmData MODEL1=new ManufactureGmData(1002,"Pontiac GTO",2020,205000,"Trailer");
    public static final ManufactureGmData MODEL2=new ManufactureGmData(1003,"Cadillac Escalade",2017,300000,"Rare Vision Camera");
    public static final ManufactureGmData MODEL3=new ManufactureGmData(1004,"Pontiac Aztek",2018,500000,"Horsepower");
    public static final ManufactureGmData MODEL4=new ManufactureGmData(1005,"Hummer H2",2016,605000,"Horsepower");
    public static final ManufactureGmData MODEL5=new ManufactureGmData(1006,"Chevrolet Corvair",2020,208000,"Rare Vision Camera");
    public static final ManufactureGmData MODEL6=new ManufactureGmData(1007,"Cadillac CTS",2019,240000,"Horsepower");
    public static final ManufactureGmData MODEL7=new ManufactureGmData(1008,"Chevrolet Silverado",2022,230000,"Rare Vision Camera");
    public static final ManufactureGmData MODEL8=new ManufactureGmData(1009,"Hummer H3",2021,209000,"Trailer");
    public static final ManufactureGmData MODEL9=new ManufactureGmData(1010,"Chevrolet Chevette",2016,202000,"Trailer");
    public static final ManufactureGmData MODEL10=new ManufactureGmData(1011,"Hummer H2",2017,500000,"Horsepower");
    public static final ManufactureGmData MODEL11=new ManufactureGmData(1012,"Chevrolet Corvette",2004,306000,"Horsepower");
    public static final ManufactureGmData MODEL12=new ManufactureGmData(1013,"Cadillac Cimarron",2009,200700,"Rare Vision Camera");
    public static final ManufactureGmData MODEL13=new ManufactureGmData(1014,"Chevrolet Camaro",2012,890000,"Trailer");
    public static final ManufactureGmData MODEL14=new ManufactureGmData(1015,"Chevrolet Malibu",2013,430000,"Horsepower");
    public static final ManufactureGmData MODEL15=new ManufactureGmData(1016,"Chevrolet SSR",2014,200000,"Rare Vision Camera");
    public static final ManufactureGmData MODEL16=new ManufactureGmData(1017,"Corvette Stingray",2015,810000,"Horsepower");
    public static final ManufactureGmData MODEL17=new ManufactureGmData(1018,"Chevrolet Vega",2012,170000,"Rare Vision Camera");
    public static final ManufactureGmData MODEL18=new ManufactureGmData(1019,"Chevrolet Impala",2011,270000,"Trailer");
    public static final ManufactureGmData MODEL19=new ManufactureGmData(1020,"Buick LaCrosse",2009,247000,"Horsepower");
    public static final ManufactureGmData MODEL20=new ManufactureGmData(1021,"Chevrolet Chevelle",2020,228000,"Horsepower");

    public static final ManufactureGmData MODEL21=new ManufactureGmData(1022,"Chevrolet Silverado",2022,230000,"Horsepower");
    public static final ManufactureGmData MODEL22=new ManufactureGmData(1023,"Hummer H3",2021,209000,"Rare Vision Camera");
    public static final ManufactureGmData MODEL23=new ManufactureGmData(1024,"Chevrolet Chevette",2016,202000,"Rare Vision Camera");
    public static final ManufactureGmData MODEL24=new ManufactureGmData(1025,"Hummer H2",2017,500000,"Horsepower");
    public static final ManufactureGmData MODEL25=new ManufactureGmData(1026,"Chevrolet Corvette",2004,306000,"Trailer");
    public static final ManufactureGmData MODEL26=new ManufactureGmData(1027,"Cadillac Cimarron",2009,200700,"Horsepower");
    public static final ManufactureGmData MODEL27=new ManufactureGmData(1028,"Chevrolet Camaro",2012,890000,"Rare Vision Camera");
    public static final ManufactureGmData MODEL28=new ManufactureGmData(1029,"Chevrolet Malibu",2013,430000,"Horsepower");
    public static final ManufactureGmData MODEL29=new ManufactureGmData(1030,"Chevrolet SSR",2014,200000,"Trailer");
    public static final ManufactureGmData MODEL30=new ManufactureGmData(1031,"Corvette Stingray",2015,810000,"Horsepower");
    public static final ManufactureGmData MODEL31=new ManufactureGmData(1032,"Chevrolet Vega",2012,170000,"Trailer");
    public static final ManufactureGmData MODEL32=new ManufactureGmData(1033,"Chevrolet Impala",2011,270000,"Rare Vision Camera");
    public static final ManufactureGmData MODEL33=new ManufactureGmData(1034,"Buick LaCrosse",2009,247000,"Horsepower");
    public static final ManufactureGmData MODEL34=new ManufactureGmData(1035,"Chevrolet Chevelle",2020,228000,"Rare Vision Camera");
}
