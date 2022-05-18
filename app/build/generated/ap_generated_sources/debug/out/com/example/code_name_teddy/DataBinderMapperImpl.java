package com.example.code_name_teddy;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.code_name_teddy.databinding.ActivityMainBindingImpl;
import com.example.code_name_teddy.databinding.FragmentGoalBindingImpl;
import com.example.code_name_teddy.databinding.FragmentMainBindingImpl;
import com.example.code_name_teddy.databinding.FragmentWordBindingImpl;
import com.example.code_name_teddy.databinding.ItemGoalBindingImpl;
import com.example.code_name_teddy.databinding.ItemWordSetBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_FRAGMENTGOAL = 2;

  private static final int LAYOUT_FRAGMENTMAIN = 3;

  private static final int LAYOUT_FRAGMENTWORD = 4;

  private static final int LAYOUT_ITEMGOAL = 5;

  private static final int LAYOUT_ITEMWORDSET = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.code_name_teddy.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.code_name_teddy.R.layout.fragment_goal, LAYOUT_FRAGMENTGOAL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.code_name_teddy.R.layout.fragment_main, LAYOUT_FRAGMENTMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.code_name_teddy.R.layout.fragment_word, LAYOUT_FRAGMENTWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.code_name_teddy.R.layout.item_goal, LAYOUT_ITEMGOAL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.code_name_teddy.R.layout.item_word_set, LAYOUT_ITEMWORDSET);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTGOAL: {
          if ("layout/fragment_goal_0".equals(tag)) {
            return new FragmentGoalBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_goal is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMAIN: {
          if ("layout/fragment_main_0".equals(tag)) {
            return new FragmentMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTWORD: {
          if ("layout/fragment_word_0".equals(tag)) {
            return new FragmentWordBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_word is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMGOAL: {
          if ("layout/item_goal_0".equals(tag)) {
            return new ItemGoalBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_goal is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMWORDSET: {
          if ("layout/item_word_set_0".equals(tag)) {
            return new ItemWordSetBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_word_set is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(6);

    static {
      sKeys.put("layout/activity_main_0", com.example.code_name_teddy.R.layout.activity_main);
      sKeys.put("layout/fragment_goal_0", com.example.code_name_teddy.R.layout.fragment_goal);
      sKeys.put("layout/fragment_main_0", com.example.code_name_teddy.R.layout.fragment_main);
      sKeys.put("layout/fragment_word_0", com.example.code_name_teddy.R.layout.fragment_word);
      sKeys.put("layout/item_goal_0", com.example.code_name_teddy.R.layout.item_goal);
      sKeys.put("layout/item_word_set_0", com.example.code_name_teddy.R.layout.item_word_set);
    }
  }
}
