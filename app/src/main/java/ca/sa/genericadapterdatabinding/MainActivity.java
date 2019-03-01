package ca.sa.genericadapterdatabinding;

import android.databinding.DataBindingUtil;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ca.sa.genericadapterdatabinding.databinding.ActivityMainBinding;
import ca.sa.genericadapterdatabinding.models.Item;
import ca.sa.genericadapterdatabinding.utils.Items;

public class MainActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener {
    ActivityMainBinding mActivityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        setUpItemsList();
    }

    private void setUpItemsList(){
        Items items=new Items();
        List<Item> itemList=new ArrayList<>();
        itemList.addAll(Arrays.asList(items.ITEMS));
        mActivityMainBinding.setItems(itemList);
    }

    @Override
    public void onRefresh() {
        onItemLoadComplete();
    }


    private void onItemLoadComplete() {
        mActivityMainBinding.recyclerViewMainLayout.getAdapter().notifyDataSetChanged();
        mActivityMainBinding.swipeRefreshMainLayout.setRefreshing(false);

    }
}
