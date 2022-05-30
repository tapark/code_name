package com.example.code_name_teddy.word;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001bB\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00062\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\u000bJ\u001c\u0010\u0014\u001a\u00020\u00062\n\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0011H\u0016J\u001c\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0011H\u0016R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR&\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001c"}, d2 = {"Lcom/example/code_name_teddy/word/WordSetAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/code_name_teddy/word/WordSetAdapter$WordSetViewHolder;", "onDelete", "Lkotlin/Function1;", "", "", "(Lkotlin/jvm/functions/Function1;)V", "getOnDelete", "()Lkotlin/jvm/functions/Function1;", "wordSetList", "", "getWordSetList", "()Ljava/util/List;", "setWordSetList", "(Ljava/util/List;)V", "getItemCount", "", "initList", "list", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "WordSetViewHolder", "app_debug"})
public final class WordSetAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.code_name_teddy.word.WordSetAdapter.WordSetViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onDelete = null;
    public java.util.List<java.util.List<java.lang.String>> wordSetList;
    
    public WordSetAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onDelete) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnDelete() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.util.List<java.lang.String>> getWordSetList() {
        return null;
    }
    
    public final void setWordSetList(@org.jetbrains.annotations.NotNull()
    java.util.List<java.util.List<java.lang.String>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.code_name_teddy.word.WordSetAdapter.WordSetViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.code_name_teddy.word.WordSetAdapter.WordSetViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void initList(@org.jetbrains.annotations.NotNull()
    java.util.List<java.util.List<java.lang.String>> list) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lcom/example/code_name_teddy/word/WordSetAdapter$WordSetViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/code_name_teddy/databinding/ItemWordSetBinding;", "(Lcom/example/code_name_teddy/word/WordSetAdapter;Lcom/example/code_name_teddy/databinding/ItemWordSetBinding;)V", "getBinding", "()Lcom/example/code_name_teddy/databinding/ItemWordSetBinding;", "bind", "", "wordList", "", "", "app_debug"})
    public final class WordSetViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.code_name_teddy.databinding.ItemWordSetBinding binding = null;
        
        public WordSetViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.code_name_teddy.databinding.ItemWordSetBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.code_name_teddy.databinding.ItemWordSetBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> wordList) {
        }
    }
}