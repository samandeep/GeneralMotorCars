package ca.sa.generalmotorcars.utils;

import java.util.HashMap;

import ca.sa.generalmotorcars.models.Manufacture;

/**
 * Created by samandeep on 05,March,2019
 */
public class Manufactures {
    public Manufacture[] MODELS={MODEL0,MODEL1,MODEL2,MODEL3,MODEL4,MODEL5,MODEL6,MODEL7,MODEL8,MODEL9,MODEL10,
            MODEL11,MODEL12,MODEL13,MODEL14,MODEL15,MODEL16,MODEL17,MODEL18,MODEL19,MODEL20, MODEL21,MODEL22,
            MODEL23,MODEL24,MODEL25,MODEL26,MODEL27,MODEL28,MODEL29,MODEL30,MODEL31,MODEL32,MODEL33,MODEL34};

    HashMap<String, Manufacture> itemHashMap=new HashMap<>();

    public Manufactures(){
        for (Manufacture manufacture:MODELS){
            itemHashMap.put(String.valueOf(manufacture.getModelNumber()),manufacture);
        }
    }

    public static final Manufacture MODEL0=new Manufacture(1001,"Chevrolet Volt",2019,200000,"Horsepower");
    public static final Manufacture MODEL1=new Manufacture(1002,"Pontiac GTO",2020,205000,"Trailer");
    public static final Manufacture MODEL2=new Manufacture(1003,"Cadillac Escalade",2017,300000,"Rare Vision Camera");
    public static final Manufacture MODEL3=new Manufacture(1004,"Pontiac Aztek",2018,500000,"Horsepower");
    public static final Manufacture MODEL4=new Manufacture(1005,"Hummer H2",2016,605000,"Horsepower");
    public static final Manufacture MODEL5=new Manufacture(1006,"Chevrolet Corvair",2020,208000,"Rare Vision Camera");
    public static final Manufacture MODEL6=new Manufacture(1007,"Cadillac CTS",2019,240000,"Horsepower");
    public static final Manufacture MODEL7=new Manufacture(1008,"Chevrolet Silverado",2022,230000,"Rare Vision Camera");
    public static final Manufacture MODEL8=new Manufacture(1009,"Hummer H3",2021,209000,"Trailer");
    public static final Manufacture MODEL9=new Manufacture(1010,"Chevrolet Chevette",2016,202000,"Trailer");
    public static final Manufacture MODEL10=new Manufacture(1011,"Hummer H2",2017,500000,"Horsepower");
    public static final Manufacture MODEL11=new Manufacture(1012,"Chevrolet Corvette",2004,306000,"Horsepower");
    public static final Manufacture MODEL12=new Manufacture(1013,"Cadillac Cimarron",2009,200700,"Rare Vision Camera");
    public static final Manufacture MODEL13=new Manufacture(1014,"Chevrolet Camaro",2012,890000,"Trailer");
    public static final Manufacture MODEL14=new Manufacture(1015,"Chevrolet Malibu",2013,430000,"Horsepower");
    public static final Manufacture MODEL15=new Manufacture(1016,"Chevrolet SSR",2014,200000,"Rare Vision Camera");
    public static final Manufacture MODEL16=new Manufacture(1017,"Corvette Stingray",2015,810000,"Horsepower");
    public static final Manufacture MODEL17=new Manufacture(1018,"Chevrolet Vega",2012,170000,"Rare Vision Camera");
    public static final Manufacture MODEL18=new Manufacture(1019,"Chevrolet Impala",2011,270000,"Trailer");
    public static final Manufacture MODEL19=new Manufacture(1020,"Buick LaCrosse",2009,247000,"Horsepower");
    public static final Manufacture MODEL20=new Manufacture(1021,"Chevrolet Chevelle",2020,228000,"Horsepower");

    public static final Manufacture MODEL21=new Manufacture(1022,"Chevrolet Silverado",2022,230000,"Horsepower");
    public static final Manufacture MODEL22=new Manufacture(1023,"Hummer H3",2021,209000,"Rare Vision Camera");
    public static final Manufacture MODEL23=new Manufacture(1024,"Chevrolet Chevette",2016,202000,"Rare Vision Camera");
    public static final Manufacture MODEL24=new Manufacture(1025,"Hummer H2",2017,500000,"Horsepower");
    public static final Manufacture MODEL25=new Manufacture(1026,"Chevrolet Corvette",2004,306000,"Trailer");
    public static final Manufacture MODEL26=new Manufacture(1027,"Cadillac Cimarron",2009,200700,"Horsepower");
    public static final Manufacture MODEL27=new Manufacture(1028,"Chevrolet Camaro",2012,890000,"Rare Vision Camera");
    public static final Manufacture MODEL28=new Manufacture(1029,"Chevrolet Malibu",2013,430000,"Horsepower");
    public static final Manufacture MODEL29=new Manufacture(1030,"Chevrolet SSR",2014,200000,"Trailer");
    public static final Manufacture MODEL30=new Manufacture(1031,"Corvette Stingray",2015,810000,"Horsepower");
    public static final Manufacture MODEL31=new Manufacture(1032,"Chevrolet Vega",2012,170000,"Trailer");
    public static final Manufacture MODEL32=new Manufacture(1033,"Chevrolet Impala",2011,270000,"Rare Vision Camera");
    public static final Manufacture MODEL33=new Manufacture(1034,"Buick LaCrosse",2009,247000,"Horsepower");
    public static final Manufacture MODEL34=new Manufacture(1035,"Chevrolet Chevelle",2020,228000,"Rare Vision Camera");
}
