package ca.sa.genericadapterdatabinding;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ca.sa.genericadapterdatabinding.databinding.ActivityMainBinding;
import ca.sa.genericadapterdatabinding.models.Item;
import ca.sa.genericadapterdatabinding.utils.Items;

public class MainActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener, View.OnClickListener {
    ActivityMainBinding mActivityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        mActivityMainBinding.btnNext.setOnClickListener(this);
        setUpItemsList();
    }
// to load the itemd data
    private void setUpItemsList(){
        Items items=new Items();
        List<Item> itemList=new ArrayList<>();
        itemList.addAll(Arrays.asList(items.ITEMS));
        mActivityMainBinding.setItems(itemList);
    }
//to refresh the list items
    @Override
    public void onRefresh() {
        onItemLoadComplete();
    }

// load items and notify adapter
    private void onItemLoadComplete() {
        mActivityMainBinding.recyclerViewMainLayout.getAdapter().notifyDataSetChanged();
        mActivityMainBinding.swipeRefreshMainLayout.setRefreshing(false);
    }

    @Override
    public void onClick(View view) {
switch (view.getId())
{
    case R.id.btnNext:
        Intent in =new Intent(this, StudentListActivity.class);
        startActivity(in);
        break;
    }}
}
