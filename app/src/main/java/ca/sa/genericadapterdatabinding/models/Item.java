package ca.sa.genericadapterdatabinding.models;

import android.os.Parcel;
import android.os.Parcelable;

import ca.sa.genericadapterdatabinding.R;

/**
 * Created by samandeep on 26,February,2019
 */
public class Item implements Parcelable {
    private int key;
    private String title;
    private String description;

    public Item() {
    }

    public Item(int key, String title, String description) {
        this.key=key;
        this.title = title;
        this.description = description;
    }

    protected Item(Parcel in) {
        key=in.readInt();
        title = in.readString();
        description = in.readString();
    }

    public static final Creator<Item> CREATOR = new Creator<Item>() {
        @Override
        public Item createFromParcel(Parcel in) {
            return new Item(in);
        }

        @Override
        public Item[] newArray(int size) {
            return new Item[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(key);
        parcel.writeString(title);
        parcel.writeString(description);
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
