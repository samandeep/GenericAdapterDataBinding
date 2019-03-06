package ca.sa.genericadapterdatabinding.dataBinding;

import android.databinding.BindingAdapter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import ca.sa.genericadapterdatabinding.BR;
import ca.sa.genericadapterdatabinding.adapters.GenericAdapter;
import ca.sa.genericadapterdatabinding.models.Student;

/**
 * Created by samandeep on 04,March,2019
 */
public class StudentBindingAdapter {
    private static RecyclerView view;
    private static List<Student> students;
    private static int childLayout;

    @BindingAdapter({"studentsList","childLayout"})
    public static void setStudentsList(RecyclerView view, List<Student> students, int childLayout){
        StudentBindingAdapter.view = view;
        StudentBindingAdapter.students = students;
        StudentBindingAdapter.childLayout = childLayout;
        if(students == null){
            return;
        }

        RecyclerView.LayoutManager layoutManager = view.getLayoutManager();
        if(layoutManager == null){
            view.setLayoutManager(new LinearLayoutManager(view.getContext()));
        }

        GenericAdapter adapter = (GenericAdapter) view.getAdapter();
        if(adapter == null){
            adapter = new GenericAdapter(students,childLayout, BR.student);
            view.setAdapter(adapter);
        }
    }
}
