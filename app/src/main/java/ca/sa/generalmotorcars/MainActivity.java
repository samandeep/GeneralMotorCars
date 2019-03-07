package ca.sa.generalmotorcars;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ca.sa.generalmotorcars.databinding.ActivityMainBinding;
import ca.sa.generalmotorcars.models.ManufactureGmData;
import ca.sa.generalmotorcars.utils.Manufactures;

public class MainActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener, View.OnClickListener {
    ActivityMainBinding mActivityMainBinding;
    List<ManufactureGmData> manufactureList = new ArrayList<>();
    private boolean ascending = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mActivityMainBinding.btnSortYearData.setOnClickListener(this);
        setUpItemsList();
    }

    // to load the manufactures data
    private void setUpItemsList() {
        manufactureList.clear();
        Manufactures manufactures = new Manufactures();
        manufactureList.addAll(Arrays.asList(manufactures.MODELS));
        mActivityMainBinding.setManufactures(manufactureList);
    }

    //to refresh the list manufactures
    @Override
    public void onRefresh() {
        onItemLoadComplete();
    }

    // load manufactures data and notify adapter
    private void onItemLoadComplete() {
        mActivityMainBinding.recyclerViewMainLayout.getAdapter().notifyDataSetChanged();
        mActivityMainBinding.swipeRefreshMainLayout.setRefreshing(false);
    }



    /*
     * SORT
     */
    private void sortData(boolean asc) {
        //SORT ARRAY ASCENDING AND DESCENDING
        if (asc) {
            Collections.sort(manufactureList, new Comparator<ManufactureGmData>() {
                @Override
                public int compare(ManufactureGmData manufactureGmData, ManufactureGmData t1) {
                    return Integer.valueOf(manufactureGmData.getPrice()).compareTo(Integer.valueOf(t1.getPrice()));
                }
            });
        } else {
            Collections.reverse(manufactureList);
        }

        mActivityMainBinding.recyclerViewMainLayout.getAdapter().notifyDataSetChanged();

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnSortYearData:
                sortData(ascending);
                ascending = !ascending;
                break;
            default:
                break;
        }
    }
}
