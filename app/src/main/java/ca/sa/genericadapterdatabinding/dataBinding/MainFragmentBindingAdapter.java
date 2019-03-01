package ca.sa.genericadapterdatabinding.dataBinding;

import android.databinding.BindingAdapter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import ca.sa.genericadapterdatabinding.adapters.GenericAdapter;
import ca.sa.genericadapterdatabinding.models.Item;

/**
 * Created by samandeep on 26,February,2019
 */
public class MainFragmentBindingAdapter {

    @BindingAdapter({"itemsList","childLayoutId"})
    public static void setItemsList(RecyclerView view, List<Item> items, int childLayoutId){
        if(items == null){
            return;
        }

        RecyclerView.LayoutManager layoutManager = view.getLayoutManager();
        if(layoutManager == null){
            view.setLayoutManager(new LinearLayoutManager(view.getContext()));
        }

        GenericAdapter adapter = (GenericAdapter) view.getAdapter();
        if(adapter == null){
            adapter = new GenericAdapter(items);
            view.setAdapter(adapter);
        }
    }
}
