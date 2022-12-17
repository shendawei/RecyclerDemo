package com.shendawei.recycler.demo.ui.activity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.shendawei.recycler.demo.R;
import com.shendawei.recycler.demo.adapter.SingleAdapter;
import com.shendawei.recycler.demo.constant.DemoConstant;
import com.shendawei.recycler.library.adapter.style.StyleModel;

import java.util.ArrayList;
import java.util.List;

/**
 * *
 *
 * @author shendawei
 * @classname SingleRvActivity
 * @date 12/15/22 4:49 PM
 */
public class SingleRvActivity extends AppCompatActivity {

    private SingleAdapter singleAdapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_rv);
        RecyclerView singleRv = findViewById(R.id.single_rv);
        singleAdapter = new SingleAdapter();
        singleRv.setAdapter(singleAdapter);

        singleAdapter.putItems(fillData());
    }

    private List<StyleModel<String>> fillData() {
        List<StyleModel<String>> datas = new ArrayList<>();
        StyleModel<String> model;
        for (int i = 0; i < 30; i++) {
            model = new StyleModel<>();
            model.m = "Single Item ---- " + i;
            model.itemType = DemoConstant.ItemType.Single;
            if (i % 4 == 0) {
                model.backgroundColor = "#33A289";
                model.cornerType = StyleModel.CornerType.allCorner;
                model.radius = 10;
                model.padding = new StyleModel.Padding().ofTop(10).ofLeft(10).ofRight(10).ofBottom(10);
            } else if (i % 4 == 1) {
                model.backgroundColor = "#88A289";
                model.cornerType = StyleModel.CornerType.topCorner;
                model.radius = 20;
                model.padding = new StyleModel.Padding().ofTop(20).ofLeft(20).ofRight(20).ofBottom(20);
            } else if (i % 4 == 2) {
                model.backgroundColor = "#AAA289";
                model.cornerType = StyleModel.CornerType.bottomCorner;
                model.radius = 20;
                model.padding = new StyleModel.Padding().ofTop(20).ofLeft(20).ofRight(20).ofBottom(20);
            } else {
//                model.backgroundColor = "#FFA289";
                model.cornerType = StyleModel.CornerType.noneCorner;
            }

            datas.add(model);
        }
        return datas;
    }
}
