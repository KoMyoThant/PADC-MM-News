package com.example.pyaesone.myapplication.components;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.pyaesone.myapplication.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by pyaesone on 11/25/17.
 */

public class EmptyViewPod extends RelativeLayout {

    @BindView(R.id.iv_empty)
    ImageView ivEmpty;

    @BindView(R.id.tv_empty)
    TextView tvEmpty;


    public EmptyViewPod(Context context) {
        super(context);
    }

    public EmptyViewPod(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public EmptyViewPod(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    // Essential override callback methods ( 3 )
    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

        ButterKnife.bind(this, this);
    }

    // Modified custom feature methods
    public void setEmptyData(int emptyImageId, String emptyMsg) {
        ivEmpty.setImageResource(emptyImageId);
        tvEmpty.setText(emptyMsg);
    }

    public void setEmptyData(String emptyMsg) {
        tvEmpty.setText(emptyMsg);
    }
}
