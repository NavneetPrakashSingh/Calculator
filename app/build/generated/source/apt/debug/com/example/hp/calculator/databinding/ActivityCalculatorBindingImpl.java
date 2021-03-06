package com.example.hp.calculator.databinding;
import com.example.hp.calculator.R;
import com.example.hp.calculator.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityCalculatorBindingImpl extends ActivityCalculatorBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.display, 1);
        sViewsWithIds.put(R.id.memoryText, 2);
        sViewsWithIds.put(R.id.infoTextView, 3);
        sViewsWithIds.put(R.id.editText, 4);
        sViewsWithIds.put(R.id.tableLayout, 5);
        sViewsWithIds.put(R.id.first_row, 6);
        sViewsWithIds.put(R.id.mc, 7);
        sViewsWithIds.put(R.id.m_positive, 8);
        sViewsWithIds.put(R.id.m_negative, 9);
        sViewsWithIds.put(R.id.mr, 10);
        sViewsWithIds.put(R.id.second_row, 11);
        sViewsWithIds.put(R.id.clear, 12);
        sViewsWithIds.put(R.id.positive_negative, 13);
        sViewsWithIds.put(R.id.divide, 14);
        sViewsWithIds.put(R.id.multiply, 15);
        sViewsWithIds.put(R.id.seven, 16);
        sViewsWithIds.put(R.id.eight, 17);
        sViewsWithIds.put(R.id.nine, 18);
        sViewsWithIds.put(R.id.minus, 19);
        sViewsWithIds.put(R.id.four, 20);
        sViewsWithIds.put(R.id.five, 21);
        sViewsWithIds.put(R.id.six, 22);
        sViewsWithIds.put(R.id.add, 23);
        sViewsWithIds.put(R.id.one, 24);
        sViewsWithIds.put(R.id.two, 25);
        sViewsWithIds.put(R.id.three, 26);
        sViewsWithIds.put(R.id.decimal, 27);
        sViewsWithIds.put(R.id.zero, 28);
        sViewsWithIds.put(R.id.equal, 29);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityCalculatorBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 30, sIncludes, sViewsWithIds));
    }
    private ActivityCalculatorBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[23]
            , (android.widget.Button) bindings[12]
            , (android.widget.Button) bindings[27]
            , (android.widget.TableLayout) bindings[1]
            , (android.widget.Button) bindings[14]
            , (android.widget.EditText) bindings[4]
            , (android.widget.Button) bindings[17]
            , (android.widget.Button) bindings[29]
            , (android.widget.TableRow) bindings[6]
            , (android.widget.Button) bindings[21]
            , (android.widget.Button) bindings[20]
            , (android.widget.TextView) bindings[3]
            , (android.widget.Button) bindings[9]
            , (android.widget.Button) bindings[8]
            , (android.widget.Button) bindings[7]
            , (android.widget.TextView) bindings[2]
            , (android.widget.Button) bindings[19]
            , (android.widget.Button) bindings[10]
            , (android.widget.Button) bindings[15]
            , (android.widget.Button) bindings[18]
            , (android.widget.Button) bindings[24]
            , (android.widget.Button) bindings[13]
            , (android.widget.TableRow) bindings[11]
            , (android.widget.Button) bindings[16]
            , (android.widget.Button) bindings[22]
            , (android.widget.TableLayout) bindings[5]
            , (android.widget.Button) bindings[26]
            , (android.widget.Button) bindings[25]
            , (android.widget.Button) bindings[28]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
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