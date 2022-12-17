package com.shendawei.recycler.demo.adapter;

import android.util.SparseArray;

import com.shendawei.recycler.demo.constant.DemoConstant;
import com.shendawei.recycler.demo.holder.SingleHolder;
import com.shendawei.recycler.library.adapter.style.AbsStyleAdapter;
import com.shendawei.recycler.library.adapter.style.StyleCallback;

import java.util.ArrayList;
import java.util.List;

/**
 * *
 *
 * @author shendawei
 * @classname SingleAdapter
 * @date 12/15/22 4:54 PM
 */
public class SingleAdapter extends AbsStyleAdapter<StyleCallback> {

    public SingleAdapter(/*StyleCallback hcb*/) {
        super(null);
    }

    @Override
    protected void generateFactories() {
        mFactories.put(DemoConstant.ItemType.Single, new SingleHolder.Factory());
    }


    static class Tester {
        static class Group {

        }
        static class GroupT<T, S> {

            T t;

            T getT() {
                return t;
            };
        }
    }

    static class Child {
        static class Group extends Tester.Group {

        }
        static class GroupT extends Tester.GroupT<String, Void> {

        }
    }

    List<Tester.Group> groups = new ArrayList<>();
    List<Tester.GroupT<?, ?>> groupT = new ArrayList<>();
    SparseArray<Tester.GroupT<?, ?>> groupS = new SparseArray<>();

    void test() {
        groups.add(new Tester.Group());
        groups.add(new Child.Group());

        groupT.add(new Tester.GroupT<>());
        groupT.add(new Child.GroupT());

        groupS.put(0, new Tester.GroupT<>());
        groupS.put(1, new Child.GroupT());
        String t = (String) groupS.get(1).t;
//        t instanceof String;
    }
}
