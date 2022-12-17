package com.shendawei.recycler.demo.holder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.shendawei.recycler.demo.R;
import com.shendawei.recycler.library.adapter.style.StyleCallback;
import com.shendawei.recycler.library.adapter.style.StyleHolder;
import com.shendawei.recycler.library.adapter.style.StyleModel;

/**
 * *
 *
 * @author shendawei
 * @classname SingleHolder
 * @date 12/15/22 5:14 PM
 */
public class SingleHolder extends StyleHolder<StyleModel<String>, StyleCallback> {

    private TextView singleTv;

    public SingleHolder(View itemView, StyleCallback holderCb) {
        super(itemView, holderCb);
    }

    @Override
    public void initView() {
        singleTv = getView(R.id.single_tv);
    }

    @Override
    public void bindData(@NonNull StyleModel<String> item, int position) {
        super.bindData(item, position);
        singleTv.setText(item.m);
    }

    public static class Factory extends StyleHolder.Factory<StyleModel<String>, StyleCallback> {

        @Override
        protected int getLayoutId() {
            return R.layout.item_single;
        }

        @NonNull
        @Override
        protected SingleHolder onCreateViewHolder(@NonNull View itemView, StyleCallback holderCallback) {
            return new SingleHolder(itemView, holderCallback);
        }
    }
}
