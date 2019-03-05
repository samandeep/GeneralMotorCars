package ca.sa.generalmotorcars;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ca.sa.generalmotorcars.databinding.ActivityMainBinding;
import ca.sa.generalmotorcars.models.Manufacture;
import ca.sa.generalmotorcars.utils.Manufactures;

public class MainActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener {
    ActivityMainBinding mActivityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mActivityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);

        setUpItemsList();
    }
// to load the manufactures data
    private void setUpItemsList(){
        Manufactures manufactures=new Manufactures();

        List<Manufacture> manufactureList=new ArrayList<>();
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

}
