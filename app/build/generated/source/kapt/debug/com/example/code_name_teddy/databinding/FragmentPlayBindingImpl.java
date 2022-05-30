package com.example.code_name_teddy.databinding;
import com.example.code_name_teddy.R;
import com.example.code_name_teddy.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPlayBindingImpl extends FragmentPlayBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.menuLayout, 1);
        sViewsWithIds.put(R.id.closeButton, 2);
        sViewsWithIds.put(R.id.firstCardTextView, 3);
        sViewsWithIds.put(R.id.secondCardTextView, 4);
        sViewsWithIds.put(R.id.refreshButton, 5);
        sViewsWithIds.put(R.id.playRecyclerView, 6);
        sViewsWithIds.put(R.id.selectLayout, 7);
        sViewsWithIds.put(R.id.selectTitleLayout, 8);
        sViewsWithIds.put(R.id.horizontalLine, 9);
        sViewsWithIds.put(R.id.closeButton2, 10);
        sViewsWithIds.put(R.id.verticalLine1, 11);
        sViewsWithIds.put(R.id.verticalLine2, 12);
        sViewsWithIds.put(R.id.verticalLine3, 13);
        sViewsWithIds.put(R.id.verticalLine4, 14);
        sViewsWithIds.put(R.id.wordSetLayout1, 15);
        sViewsWithIds.put(R.id.setTitle1, 16);
        sViewsWithIds.put(R.id.setCheckBox1, 17);
        sViewsWithIds.put(R.id.wordSetRecyclerView1, 18);
        sViewsWithIds.put(R.id.wordSetLayout2, 19);
        sViewsWithIds.put(R.id.setTitle2, 20);
        sViewsWithIds.put(R.id.setCheckBox2, 21);
        sViewsWithIds.put(R.id.wordSetRecyclerView2, 22);
        sViewsWithIds.put(R.id.wordSetLayout3, 23);
        sViewsWithIds.put(R.id.setTitle3, 24);
        sViewsWithIds.put(R.id.setCheckBox3, 25);
        sViewsWithIds.put(R.id.wordSetRecyclerView3, 26);
        sViewsWithIds.put(R.id.wordSetLayout4, 27);
        sViewsWithIds.put(R.id.setTitle4, 28);
        sViewsWithIds.put(R.id.setCheckBox4, 29);
        sViewsWithIds.put(R.id.wordSetRecyclerView4, 30);
        sViewsWithIds.put(R.id.wordSetLayout5, 31);
        sViewsWithIds.put(R.id.setTitle5, 32);
        sViewsWithIds.put(R.id.setCheckBox5, 33);
        sViewsWithIds.put(R.id.wordSetRecyclerView5, 34);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentPlayBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 35, sIncludes, sViewsWithIds));
    }
    private FragmentPlayBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.TextView) bindings[3]
            , (android.view.View) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[6]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.ImageView) bindings[25]
            , (android.widget.ImageView) bindings[29]
            , (android.widget.ImageView) bindings[33]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[24]
            , (android.widget.TextView) bindings[28]
            , (android.widget.TextView) bindings[32]
            , (android.view.View) bindings[11]
            , (android.view.View) bindings[12]
            , (android.view.View) bindings[13]
            , (android.view.View) bindings[14]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.LinearLayout) bindings[23]
            , (android.widget.LinearLayout) bindings[27]
            , (android.widget.LinearLayout) bindings[31]
            , (androidx.recyclerview.widget.RecyclerView) bindings[18]
            , (androidx.recyclerview.widget.RecyclerView) bindings[22]
            , (androidx.recyclerview.widget.RecyclerView) bindings[26]
            , (androidx.recyclerview.widget.RecyclerView) bindings[30]
            , (androidx.recyclerview.widget.RecyclerView) bindings[34]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}