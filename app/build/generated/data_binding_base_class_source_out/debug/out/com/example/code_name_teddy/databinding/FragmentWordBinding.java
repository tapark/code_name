// Generated by data binding compiler. Do not edit!
package com.example.code_name_teddy.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.example.code_name_teddy.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentWordBinding extends ViewDataBinding {
  @NonNull
  public final TextView addWordButton;

  @NonNull
  public final EditText addWordEditText;

  @NonNull
  public final View grayLine1;

  @NonNull
  public final View grayLine2;

  @NonNull
  public final View grayLine3;

  @NonNull
  public final ConstraintLayout textLayout;

  @NonNull
  public final ConstraintLayout titleLayout;

  @NonNull
  public final TextView titleTextView;

  @NonNull
  public final ViewPager2 wordSetViewPager;

  protected FragmentWordBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView addWordButton, EditText addWordEditText, View grayLine1, View grayLine2,
      View grayLine3, ConstraintLayout textLayout, ConstraintLayout titleLayout,
      TextView titleTextView, ViewPager2 wordSetViewPager) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addWordButton = addWordButton;
    this.addWordEditText = addWordEditText;
    this.grayLine1 = grayLine1;
    this.grayLine2 = grayLine2;
    this.grayLine3 = grayLine3;
    this.textLayout = textLayout;
    this.titleLayout = titleLayout;
    this.titleTextView = titleTextView;
    this.wordSetViewPager = wordSetViewPager;
  }

  @NonNull
  public static FragmentWordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_word, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentWordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentWordBinding>inflateInternal(inflater, R.layout.fragment_word, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentWordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_word, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentWordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentWordBinding>inflateInternal(inflater, R.layout.fragment_word, null, false, component);
  }

  public static FragmentWordBinding bind(@NonNull View view) {
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
  public static FragmentWordBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentWordBinding)bind(component, view, R.layout.fragment_word);
  }
}
