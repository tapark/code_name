// Generated by data binding compiler. Do not edit!
package com.example.code_name_teddy.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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

public abstract class FragmentGoalBinding extends ViewDataBinding {
  @NonNull
  public final ImageView closeButton;

  @NonNull
  public final TextView firstCardTextView;

  @NonNull
  public final RecyclerView goalRecyclerView;

  @NonNull
  public final ConstraintLayout menuLayout;

  @NonNull
  public final ImageView refreshButton;

  @NonNull
  public final TextView secondCardTextView;

  protected FragmentGoalBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView closeButton, TextView firstCardTextView, RecyclerView goalRecyclerView,
      ConstraintLayout menuLayout, ImageView refreshButton, TextView secondCardTextView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.closeButton = closeButton;
    this.firstCardTextView = firstCardTextView;
    this.goalRecyclerView = goalRecyclerView;
    this.menuLayout = menuLayout;
    this.refreshButton = refreshButton;
    this.secondCardTextView = secondCardTextView;
  }

  @NonNull
  public static FragmentGoalBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_goal, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentGoalBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentGoalBinding>inflateInternal(inflater, R.layout.fragment_goal, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentGoalBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_goal, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentGoalBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentGoalBinding>inflateInternal(inflater, R.layout.fragment_goal, null, false, component);
  }

  public static FragmentGoalBinding bind(@NonNull View view) {
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
  public static FragmentGoalBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentGoalBinding)bind(component, view, R.layout.fragment_goal);
  }
}