package ca.sa.genericadapterdatabinding.utils;

import java.util.HashMap;

import ca.sa.genericadapterdatabinding.models.Item;
import ca.sa.genericadapterdatabinding.models.Student;

/**
 * Created by samandeep on 04,March,2019
 */
public class Students {
    public Student[] STUDENTS={ITEM0,ITEM1,ITEM2,ITEM3,ITEM4,ITEM5,ITEM6,ITEM7,ITEM8,ITEM9,ITEM10};

    HashMap<String, Student> studentHashMap=new HashMap<>();

    public Students(){
        for (Student student:STUDENTS){
            studentHashMap.put(String.valueOf(student.getStudentId()),student);
        }
    }

    public static final Student ITEM0=new Student(1,"Items0","Description demo 0 sdbjs sdjhfdj sdj");
    public static final Student ITEM1=new Student(2,"Items1","Description demo 0 sdbjs sdjhfdj sdj");
    public static final Student ITEM2=new Student(3,"Items2","Description demo 0 sdbjs sdjhfdj sdj");
    public static final Student ITEM3=new Student(4,"Items3","Description demo 0 sdbjs sdjhfdj sdj");
    public static final Student ITEM4=new Student(5,"Items4","Description demo 0 sdbjs sdjhfdj sdj");
    public static final Student ITEM5=new Student(6,"Items5","Description demo 0 sdbjs sdjhfdj sdj");
    public static final Student ITEM6=new Student(7,"Items6","Description demo 0 sdbjs sdjhfdj sdj");
    public static final Student ITEM7=new Student(8,"Items7","Description demo 0 sdbjs sdjhfdj sdj");
    public static final Student ITEM8=new Student(9,"Items8","Description demo 0 sdbjs sdjhfdj sdj");
    public static final Student ITEM9=new Student(10,"Items9","Description demo 0 sdbjs sdjhfdj sdj");
    public static final Student ITEM10=new Student(11,"Items10","Description demo 0 sdbjs sdjhfdj sdj");
}
