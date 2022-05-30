package com.example.code_name_teddy.play;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020!H\u0002J\b\u0010#\u001a\u00020!H\u0002J\b\u0010$\u001a\u00020!H\u0002J&\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u001a\u0010-\u001a\u00020!2\u0006\u0010.\u001a\u00020&2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0010\u0010/\u001a\u00020!2\u0006\u00100\u001a\u000201H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\b\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u00a8\u00062"}, d2 = {"Lcom/example/code_name_teddy/play/PlayFragment;", "Landroidx/fragment/app/Fragment;", "()V", "activityViewModel", "Lcom/example/code_name_teddy/MainActivityViewModel;", "getActivityViewModel", "()Lcom/example/code_name_teddy/MainActivityViewModel;", "activityViewModel$delegate", "Lkotlin/Lazy;", "binding", "Lcom/example/code_name_teddy/databinding/FragmentPlayBinding;", "getBinding", "()Lcom/example/code_name_teddy/databinding/FragmentPlayBinding;", "setBinding", "(Lcom/example/code_name_teddy/databinding/FragmentPlayBinding;)V", "checkBoxList", "", "Landroid/widget/ImageView;", "getCheckBoxList", "()Ljava/util/List;", "checkBoxList$delegate", "currentWordSet", "", "getCurrentWordSet", "setCurrentWordSet", "(Ljava/util/List;)V", "playAdapter", "Lcom/example/code_name_teddy/play/PlayAdapter;", "getPlayAdapter", "()Lcom/example/code_name_teddy/play/PlayAdapter;", "setPlayAdapter", "(Lcom/example/code_name_teddy/play/PlayAdapter;)V", "getRandomPosition", "", "initAdapter", "initWordSetAdapter", "onClick", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "selectWordSet", "index", "", "app_debug"})
public final class PlayFragment extends androidx.fragment.app.Fragment {
    public com.example.code_name_teddy.databinding.FragmentPlayBinding binding;
    public com.example.code_name_teddy.play.PlayAdapter playAdapter;
    private final kotlin.Lazy checkBoxList$delegate = null;
    public java.util.List<java.lang.String> currentWordSet;
    private final kotlin.Lazy activityViewModel$delegate = null;
    
    public PlayFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.code_name_teddy.databinding.FragmentPlayBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.example.code_name_teddy.databinding.FragmentPlayBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.code_name_teddy.play.PlayAdapter getPlayAdapter() {
        return null;
    }
    
    public final void setPlayAdapter(@org.jetbrains.annotations.NotNull()
    com.example.code_name_teddy.play.PlayAdapter p0) {
    }
    
    private final java.util.List<android.widget.ImageView> getCheckBoxList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getCurrentWordSet() {
        return null;
    }
    
    public final void setCurrentWordSet(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    private final com.example.code_name_teddy.MainActivityViewModel getActivityViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initWordSetAdapter() {
    }
    
    private final void initAdapter() {
    }
    
    private final void getRandomPosition() {
    }
    
    private final void onClick() {
    }
    
    private final void selectWordSet(int index) {
    }
}