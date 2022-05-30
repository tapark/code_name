package com.example.code_name_teddy.room_database;

import java.lang.System;

@androidx.room.Database(entities = {com.example.code_name_teddy.room_database.WordSet1.class, com.example.code_name_teddy.room_database.WordSet2.class, com.example.code_name_teddy.room_database.WordSet3.class, com.example.code_name_teddy.room_database.WordSet4.class, com.example.code_name_teddy.room_database.WordSet5.class}, version = 1)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&\u00a8\u0006\r"}, d2 = {"Lcom/example/code_name_teddy/room_database/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "wordSetDao1", "Lcom/example/code_name_teddy/room_database/WordSetDao1;", "wordSetDao2", "Lcom/example/code_name_teddy/room_database/WordSetDao2;", "wordSetDao3", "Lcom/example/code_name_teddy/room_database/WordSetDao3;", "wordSetDao4", "Lcom/example/code_name_teddy/room_database/WordSetDao4;", "wordSetDao5", "Lcom/example/code_name_teddy/room_database/WordSetDao5;", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.code_name_teddy.room_database.WordSetDao1 wordSetDao1();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.code_name_teddy.room_database.WordSetDao2 wordSetDao2();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.code_name_teddy.room_database.WordSetDao3 wordSetDao3();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.code_name_teddy.room_database.WordSetDao4 wordSetDao4();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.code_name_teddy.room_database.WordSetDao5 wordSetDao5();
}