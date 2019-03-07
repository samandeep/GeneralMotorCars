package ca.sa.generalmotorcars.models;

import java.util.Comparator;

/**
 * Created by samandeep on 07,March,2019
 */
public class ManufactureGmDataComp {
    class ReleaseYearOrder implements Comparator<ManufactureGmData> {

        @Override
        public int compare(ManufactureGmData manufactureGmData, ManufactureGmData t1) {
            return manufactureGmData.releaseYear - t1.releaseYear;
        }

        @Override
        public boolean equals(Object o) {
            return false;
        }
    }
}
