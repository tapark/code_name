// Generated by data binding compiler. Do not edit!
package com.example.code_name_teddy.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.code_name_teddy.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemWordSetBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView wordRecyclerView;

  protected ItemWordSetBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView wordRecyclerView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.wordRecyclerView = wordRecyclerView;
  }

  @NonNull
  public static ItemWordSetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_word_set, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemWordSetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemWordSetBinding>inflateInternal(inflater, R.layout.item_word_set, root, attachToRoot, component);
  }

  @NonNull
  public static ItemWordSetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_word_set, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemWordSetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemWordSetBinding>inflateInternal(inflater, R.layout.item_word_set, null, false, component);
  }

  public static ItemWordSetBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemWordSetBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemWordSetBinding)bind(component, view, R.layout.item_word_set);
  }
}
