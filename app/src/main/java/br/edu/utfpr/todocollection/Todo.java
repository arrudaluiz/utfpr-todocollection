package br.edu.utfpr.todocollection;

import android.os.Parcel;
import android.os.Parcelable;

public class Todo implements Parcelable {
    private String name;
    private String content;

    public Todo(String name, String content) {
        this.name = name;
        this.content = content;
    }

    private Todo(Parcel source) {
        name = source.readString();
        content = source.readString();
    }

    public static final Creator<Todo> CREATOR = new Creator<Todo>() {
        @Override
        public Todo createFromParcel(Parcel source) {
            return new Todo(source);
        }

        @Override
        public Todo[] newArray(int size) {
            return new Todo[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(content);
    }
}