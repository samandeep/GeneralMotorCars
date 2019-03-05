package ca.sa.generalmotorcars.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by samandeep on 05,March,2019
 */
public class Manufacture implements Parcelable {
    private int modelNumber;
    private String modelName;
    private int releaseYear;
    private int price;
    private String features;

    public Manufacture() {
    }

    public Manufacture(int modelNumber, String modelName, int releaseYear, int price, String features) {
        this.modelNumber=modelNumber;
        this.modelName = modelName;
        this.releaseYear = releaseYear;
        this.price = price;
        this.features = features;
    }

    protected Manufacture(Parcel in) {
        modelNumber=in.readInt();
        modelName = in.readString();
        releaseYear = in.readInt();
        price = in.readInt();
        features = in.readString();
    }

    public static final Creator<Manufacture> CREATOR = new Creator<Manufacture>() {
        @Override
        public Manufacture createFromParcel(Parcel in) {
            return new Manufacture(in);
        }

        @Override
        public Manufacture[] newArray(int size) {
            return new Manufacture[size];
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
