package ca.sa.genericadapterdatabinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ca.sa.genericadapterdatabinding.databinding.ActivityStudentListBinding;
import ca.sa.genericadapterdatabinding.models.Item;
import ca.sa.genericadapterdatabinding.models.Student;
import ca.sa.genericadapterdatabinding.utils.Items;
import ca.sa.genericadapterdatabinding.utils.Students;

/**
 * Created by samandeep on 04,March,2019
 */
public class StudentListActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener {
    ActivityStudentListBinding mActivityStudentListBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mActivityStudentListBinding= DataBindingUtil.setContentView(this,R.layout.activity_student_list);
        setUpStudentsList();
    }

    // to load the students data
    private void setUpStudentsList(){
        Students students=new Students();
        List<Student> studentList=new ArrayList<>();
        studentList.addAll(Arrays.asList(students.STUDENTS));
        mActivityStudentListBinding.setStudents(studentList);
    }

        // to refresh the list data
        @Override
    public void onRefresh() {
        onItemLoadComplete();
    }

    private void onItemLoadComplete() {
        mActivityStudentListBinding.recyclerViewStudentLayout.getAdapter().notifyDataSetChanged();
        mActivityStudentListBinding.swipeRefreshStudentLayout.setRefreshing(false);
    }
}
