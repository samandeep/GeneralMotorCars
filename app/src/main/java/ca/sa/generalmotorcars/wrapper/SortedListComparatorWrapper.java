package ca.sa.generalmotorcars.wrapper;

import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.util.SortedListAdapterCallback;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

import ca.sa.generalmotorcars.adapters.GenericAdapter;

/**
 * Created by samandeep on 07,March,2019
 */
abstract class SortedListComparatorWrapper extends SortedListAdapterCallback {
        private Comparator comparator;

    public SortedListComparatorWrapper(RecyclerView.Adapter adapter) {
        super(adapter);
    }

    public final void setComparator(@NotNull Comparator comparator) {
            if (comparator == this.comparator) {
                return;
            }
            this.comparator = comparator;
    }


//
//   public SortedListComparatorWrapper(@NotNull GenericAdapter adapter, @Nullable Comparator comparator) {
//        super(adapter);
//        this.comparator = comparator;
//    }

    @Override
    public int compare(Object o, Object t21) {
        return comparator.compare(o,t21);
    }

    @Override
    public boolean areContentsTheSame(Object o, Object t21) {
        return false;
    }

    @Override
    public boolean areItemsTheSame(Object o, Object t21) {
        return false;
    }
}

