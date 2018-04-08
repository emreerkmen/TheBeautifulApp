package com.example.emree.thebeautifulapp;

import android.os.Parcel;
import android.os.Parcelable;

public class kartInfo implements Parcelable {
    public boolean isBack=true;
    public int imageId;
    public int backgroundId;
    public boolean match=false;
    public int id;

    public kartInfo(boolean isBack, int imageId, boolean match) {
        this.isBack = isBack;
        this.imageId = imageId;
        this.match = match;

    }

    public boolean isBack() {
        return isBack;
    }

    public void setBack(boolean back) {
        isBack = back;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getBackgroundId() {
        return backgroundId;
    }

    public void setBackgroundId(int backgroundId) {
        this.backgroundId = backgroundId;
    }

    public boolean isMatch() {
        return match;
    }

    public void setMatch(boolean match) {
        this.match = match;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte(this.isBack ? (byte) 1 : (byte) 0);
        dest.writeInt(this.imageId);
        dest.writeInt(this.backgroundId);
        dest.writeByte(this.match ? (byte) 1 : (byte) 0);
    }

    protected kartInfo(Parcel in) {
        this.isBack = in.readByte() != 0;
        this.imageId = in.readInt();
        this.backgroundId = in.readInt();
        this.match = in.readByte() != 0;
    }

    public static final Parcelable.Creator<kartInfo> CREATOR = new Parcelable.Creator<kartInfo>() {
        @Override
        public kartInfo createFromParcel(Parcel source) {
            return new kartInfo(source);
        }

        @Override
        public kartInfo[] newArray(int size) {
            return new kartInfo[size];
        }
    };
}
