package ca.sa.generalmotorcars.dataBinding;

import android.databinding.BindingAdapter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import ca.sa.generalmotorcars.adapters.GenericAdapter;
import ca.sa.generalmotorcars.models.Manufacture;

/**
 * Created by samandeep on 05,March,2019
 */
public class MainActivityBindingAdapter {
    private static RecyclerView view;
    private static List<Manufacture> manufactures;
    private static int childLayoutId;

    @BindingAdapter({"manufacturesList","childLayoutId"})
    public static void setItemsList(RecyclerView view, List<Manufacture> manufactures, int childLayoutId){
        MainActivityBindingAdapter.view = view;
        MainActivityBindingAdapter.manufactures = manufactures;
        MainActivityBindingAdapter.childLayoutId = childLayoutId;
        if(manufactures == null){
            return;
        }

        RecyclerView.LayoutManager layoutManager = view.getLayoutManager();
        if(layoutManager == null) {
            view.setLayoutManager(new LinearLayoutManager(view.getContext()));
        }

        GenericAdapter adapter = (GenericAdapter) view.getAdapter();
        if(adapter == null){
            adapter = new GenericAdapter(manufactures,childLayoutId);
            view.setAdapter(adapter);
        }
    }
}
