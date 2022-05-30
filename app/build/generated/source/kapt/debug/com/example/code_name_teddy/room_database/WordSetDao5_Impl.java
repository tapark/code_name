package com.example.code_name_teddy.room_database;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class WordSetDao5_Impl implements WordSetDao5 {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<WordSet5> __insertionAdapterOfWordSet5;

  private final EntityDeletionOrUpdateAdapter<WordSet5> __deletionAdapterOfWordSet5;

  public WordSetDao5_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfWordSet5 = new EntityInsertionAdapter<WordSet5>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `WordSet5` (`word`,`id`) VALUES (?,nullif(?, 0))";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WordSet5 value) {
        if (value.getWord() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getWord());
        }
        stmt.bindLong(2, value.getId());
      }
    };
    this.__deletionAdapterOfWordSet5 = new EntityDeletionOrUpdateAdapter<WordSet5>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `WordSet5` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WordSet5 value) {
        stmt.bindLong(1, value.getId());
      }
    };
  }

  @Override
  public void insert(final WordSet5 word) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfWordSet5.insert(word);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final WordSet5 word) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfWordSet5.handle(word);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<WordSet5> getAll() {
    final String _sql = "SELECT * FROM wordset5";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfWord = CursorUtil.getColumnIndexOrThrow(_cursor, "word");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final List<WordSet5> _result = new ArrayList<WordSet5>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final WordSet5 _item;
        final String _tmpWord;
        if (_cursor.isNull(_cursorIndexOfWord)) {
          _tmpWord = null;
        } else {
          _tmpWord = _cursor.getString(_cursorIndexOfWord);
        }
        _item = new WordSet5(_tmpWord);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
