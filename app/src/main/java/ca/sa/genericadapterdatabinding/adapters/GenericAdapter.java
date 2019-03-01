package ca.sa.genericadapterdatabinding.adapters;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.android.databinding.library.baseAdapters.BR;

import java.util.List;


/**
 * Created by samandeep on 27,February,2019
 */

public class GenericAdapter<T> extends RecyclerView.Adapter<GenericAdapter.ViewHolder> {

    private List<? extends T> list;

    public GenericAdapter(List<? extends T> list) {
        this.list = list;
    }

    public static class ViewHolder<V extends ViewDataBinding> extends RecyclerView.ViewHolder {
        private V v;

        public ViewHolder(V v) {
            super(v.getRoot());
            this.v = v;
        }

        public V getBinding() {
            return v;
        }
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    @Override
    public GenericAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewDataBinding bind = DataBindingUtil.bind(LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false));
        return new ViewHolder<>(bind);
    }

    @Override
    public void onBindViewHolder(GenericAdapter.ViewHolder holder, int position) {
        final T model = list.get(position);
        holder.getBinding().setVariable(BR.item, model);
        holder.getBinding().executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}
