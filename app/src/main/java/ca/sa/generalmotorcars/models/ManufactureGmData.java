package ca.sa.generalmotorcars.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by samandeep on 05,March,2019
 */
public class ManufactureGmData implements Parcelable {
    private int modelNumber;
    private String modelName;
    public int releaseYear;
    private int price;
    private String features;

    public ManufactureGmData() {
    }

    public ManufactureGmData(int modelNumber, String modelName, int releaseYear, int price, String features) {
        this.modelNumber=modelNumber;
        this.modelName = modelName;
        this.releaseYear = releaseYear;
        this.price = price;
        this.features = features;
    }

    protected ManufactureGmData(Parcel in) {
        modelNumber=in.readInt();
        modelName = in.readString();
        releaseYear = in.readInt();
        price = in.readInt();
        features = in.readString();
    }

    public static final Creator<ManufactureGmData> CREATOR = new Creator<ManufactureGmData>() {
        @Override
        public ManufactureGmData createFromParcel(Parcel in) {
            return new ManufactureGmData(in);
        }

        @Override
        public ManufactureGmData[] newArray(int size) {
            return new ManufactureGmData[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(modelNumber);
        parcel.writeString(modelName);
        parcel.writeInt(releaseYear);
        parcel.writeInt(price);
        parcel.writeString(features);
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getPrice() {
        return price;
    }

    public String getPriceString(){
        return "$ "+getPrice();
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }
}
