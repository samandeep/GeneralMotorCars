package ca.sa.generalmotorcars.dataBinding;

import android.databinding.BindingAdapter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import ca.sa.generalmotorcars.BR;
import ca.sa.generalmotorcars.adapters.GenericAdapter;
import ca.sa.generalmotorcars.models.ManufactureGmData;

/**
 * Created by samandeep on 05,March,2019
 */
public class MainActivityBindingAdapter {
    private static RecyclerView view;
    private static List<ManufactureGmData> manufactures;
    private static int childLayoutId;

    @BindingAdapter({"manufacturesList","childLayoutId"})
    public static void setManufacturesList(RecyclerView view, List<ManufactureGmData> manufactures, int childLayoutId){
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
            adapter = new GenericAdapter(manufactures,childLayoutId, BR.manufacture);
            view.setAdapter(adapter);
        }
    }
}
