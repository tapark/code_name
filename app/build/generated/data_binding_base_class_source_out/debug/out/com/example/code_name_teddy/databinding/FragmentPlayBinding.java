// Generated by data binding compiler. Do not edit!
package com.example.code_name_teddy.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.code_name_teddy.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentPlayBinding extends ViewDataBinding {
  @NonNull
  public final ImageView closeButton;

  @NonNull
  public final ImageView closeButton2;

  @NonNull
  public final TextView firstCardTextView;

  @NonNull
  public final View horizontalLine;

  @NonNull
  public final ConstraintLayout menuLayout;

  @NonNull
  public final RecyclerView playRecyclerView;

  @NonNull
  public final ImageView refreshButton;

  @NonNull
  public final TextView secondCardTextView;

  @NonNull
  public final ConstraintLayout selectLayout;

  @NonNull
  public final ConstraintLayout selectTitleLayout;

  @NonNull
  public final ImageView setCheckBox1;

  @NonNull
  public final ImageView setCheckBox2;

  @NonNull
  public final ImageView setCheckBox3;

  @NonNull
  public final ImageView setCheckBox4;

  @NonNull
  public final ImageView setCheckBox5;

  @NonNull
  public final TextView setTitle1;

  @NonNull
  public final TextView setTitle2;

  @NonNull
  public final TextView setTitle3;

  @NonNull
  public final TextView setTitle4;

  @NonNull
  public final TextView setTitle5;

  @NonNull
  public final View verticalLine1;

  @NonNull
  public final View verticalLine2;

  @NonNull
  public final View verticalLine3;

  @NonNull
  public final View verticalLine4;

  @NonNull
  public final LinearLayout wordSetLayout1;

  @NonNull
  public final LinearLayout wordSetLayout2;

  @NonNull
  public final LinearLayout wordSetLayout3;

  @NonNull
  public final LinearLayout wordSetLayout4;

  @NonNull
  public final LinearLayout wordSetLayout5;

  @NonNull
  public final RecyclerView wordSetRecyclerView1;

  @NonNull
  public final RecyclerView wordSetRecyclerView2;

  @NonNull
  public final RecyclerView wordSetRecyclerView3;

  @NonNull
  public final RecyclerView wordSetRecyclerView4;

  @NonNull
  public final RecyclerView wordSetRecyclerView5;

  protected FragmentPlayBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView closeButton, ImageView closeButton2, TextView firstCardTextView,
      View horizontalLine, ConstraintLayout menuLayout, RecyclerView playRecyclerView,
      ImageView refreshButton, TextView secondCardTextView, ConstraintLayout selectLayout,
      ConstraintLayout selectTitleLayout, ImageView setCheckBox1, ImageView setCheckBox2,
      ImageView setCheckBox3, ImageView setCheckBox4, ImageView setCheckBox5, TextView setTitle1,
      TextView setTitle2, TextView setTitle3, TextView setTitle4, TextView setTitle5,
      View verticalLine1, View verticalLine2, View verticalLine3, View verticalLine4,
      LinearLayout wordSetLayout1, LinearLayout wordSetLayout2, LinearLayout wordSetLayout3,
      LinearLayout wordSetLayout4, LinearLayout wordSetLayout5, RecyclerView wordSetRecyclerView1,
      RecyclerView wordSetRecyclerView2, RecyclerView wordSetRecyclerView3,
      RecyclerView wordSetRecyclerView4, RecyclerView wordSetRecyclerView5) {
    super(_bindingComponent, _root, _localFieldCount);
    this.closeButton = closeButton;
    this.closeButton2 = closeButton2;
    this.firstCardTextView = firstCardTextView;
    this.horizontalLine = horizontalLine;
    this.menuLayout = menuLayout;
    this.playRecyclerView = playRecyclerView;
    this.refreshButton = refreshButton;
    this.secondCardTextView = secondCardTextView;
    this.selectLayout = selectLayout;
    this.selectTitleLayout = selectTitleLayout;
    this.setCheckBox1 = setCheckBox1;
    this.setCheckBox2 = setCheckBox2;
    this.setCheckBox3 = setCheckBox3;
    this.setCheckBox4 = setCheckBox4;
    this.setCheckBox5 = setCheckBox5;
    this.setTitle1 = setTitle1;
    this.setTitle2 = setTitle2;
    this.setTitle3 = setTitle3;
    this.setTitle4 = setTitle4;
    this.setTitle5 = setTitle5;
    this.verticalLine1 = verticalLine1;
    this.verticalLine2 = verticalLine2;
    this.verticalLine3 = verticalLine3;
    this.verticalLine4 = verticalLine4;
    this.wordSetLayout1 = wordSetLayout1;
    this.wordSetLayout2 = wordSetLayout2;
    this.wordSetLayout3 = wordSetLayout3;
    this.wordSetLayout4 = wordSetLayout4;
    this.wordSetLayout5 = wordSetLayout5;
    this.wordSetRecyclerView1 = wordSetRecyclerView1;
    this.wordSetRecyclerView2 = wordSetRecyclerView2;
    this.wordSetRecyclerView3 = wordSetRecyclerView3;
    this.wordSetRecyclerView4 = wordSetRecyclerView4;
    this.wordSetRecyclerView5 = wordSetRecyclerView5;
  }

  @NonNull
  public static FragmentPlayBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_play, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPlayBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentPlayBinding>inflateInternal(inflater, R.layout.fragment_play, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentPlayBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_play, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPlayBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentPlayBinding>inflateInternal(inflater, R.layout.fragment_play, null, false, component);
  }

  public static FragmentPlayBinding bind(@NonNull View view) {
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
  public static FragmentPlayBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentPlayBinding)bind(component, view, R.layout.fragment_play);
  }
}
