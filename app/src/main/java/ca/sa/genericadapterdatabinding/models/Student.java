package ca.sa.genericadapterdatabinding.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by samandeep on 04,March,2019
 */
public class Student implements Parcelable {
    private int studentId;
    private String name;
    private String decs;

    public Student() {
    }

    public Student(int studentId,String name, String decs) {
        this.studentId=studentId;
        this.name = name;
        this.decs = decs;
    }

    protected Student(Parcel in) {
        studentId=in.readInt();
        name = in.readString();
        decs = in.readString();
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(studentId);
        parcel.writeString(name);
        parcel.writeString(decs);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDecs() {
        return decs;
    }

    public void setDecs(String decs) {
        this.decs = decs;
    }
}
