package com.example.code_name_teddy;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.J\u0016\u0010/\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.J\b\u00100\u001a\u00020*H\u0002J\u0012\u00101\u001a\u00020*2\b\u00102\u001a\u0004\u0018\u000103H\u0014J\u0006\u00104\u001a\u00020*J\b\u00105\u001a\u00020*H\u0002J\u0006\u00106\u001a\u00020*J\u0006\u00107\u001a\u00020*R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b#\u0010\u0014\u001a\u0004\b!\u0010\"R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b(\u0010\u0014\u001a\u0004\b&\u0010\'\u00a8\u00068"}, d2 = {"Lcom/example/code_name_teddy/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/example/code_name_teddy/databinding/ActivityMainBinding;", "getBinding", "()Lcom/example/code_name_teddy/databinding/ActivityMainBinding;", "setBinding", "(Lcom/example/code_name_teddy/databinding/ActivityMainBinding;)V", "viewModel", "Lcom/example/code_name_teddy/MainActivityViewModel;", "getViewModel", "()Lcom/example/code_name_teddy/MainActivityViewModel;", "setViewModel", "(Lcom/example/code_name_teddy/MainActivityViewModel;)V", "wordSetDB1", "Lcom/example/code_name_teddy/room_database/WordSetDao1;", "getWordSetDB1", "()Lcom/example/code_name_teddy/room_database/WordSetDao1;", "wordSetDB1$delegate", "Lkotlin/Lazy;", "wordSetDB2", "Lcom/example/code_name_teddy/room_database/WordSetDao2;", "getWordSetDB2", "()Lcom/example/code_name_teddy/room_database/WordSetDao2;", "wordSetDB2$delegate", "wordSetDB3", "Lcom/example/code_name_teddy/room_database/WordSetDao3;", "getWordSetDB3", "()Lcom/example/code_name_teddy/room_database/WordSetDao3;", "wordSetDB3$delegate", "wordSetDB4", "Lcom/example/code_name_teddy/room_database/WordSetDao4;", "getWordSetDB4", "()Lcom/example/code_name_teddy/room_database/WordSetDao4;", "wordSetDB4$delegate", "wordSetDB5", "Lcom/example/code_name_teddy/room_database/WordSetDao5;", "getWordSetDB5", "()Lcom/example/code_name_teddy/room_database/WordSetDao5;", "wordSetDB5$delegate", "dbDeleteWord", "", "dbNum", "", "word", "", "dbInsertWord", "getWordSetDatabase", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showGoalFragment", "showMainFragment", "showPlayFragment", "showWordFragment", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    public com.example.code_name_teddy.databinding.ActivityMainBinding binding;
    public com.example.code_name_teddy.MainActivityViewModel viewModel;
    private final kotlin.Lazy wordSetDB1$delegate = null;
    private final kotlin.Lazy wordSetDB2$delegate = null;
    private final kotlin.Lazy wordSetDB3$delegate = null;
    private final kotlin.Lazy wordSetDB4$delegate = null;
    private final kotlin.Lazy wordSetDB5$delegate = null;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.code_name_teddy.databinding.ActivityMainBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.example.code_name_teddy.databinding.ActivityMainBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.code_name_teddy.MainActivityViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.example.code_name_teddy.MainActivityViewModel p0) {
    }
    
    private final com.example.code_name_teddy.room_database.WordSetDao1 getWordSetDB1() {
        return null;
    }
    
    private final com.example.code_name_teddy.room_database.WordSetDao2 getWordSetDB2() {
        return null;
    }
    
    private final com.example.code_name_teddy.room_database.WordSetDao3 getWordSetDB3() {
        return null;
    }
    
    private final com.example.code_name_teddy.room_database.WordSetDao4 getWordSetDB4() {
        return null;
    }
    
    private final com.example.code_name_teddy.room_database.WordSetDao5 getWordSetDB5() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getWordSetDatabase() {
    }
    
    public final void dbInsertWord(int dbNum, @org.jetbrains.annotations.NotNull()
    java.lang.String word) {
    }
    
    public final void dbDeleteWord(int dbNum, @org.jetbrains.annotations.NotNull()
    java.lang.String word) {
    }
    
    private final void showMainFragment() {
    }
    
    public final void showGoalFragment() {
    }
    
    public final void showWordFragment() {
    }
    
    public final void showPlayFragment() {
    }
}