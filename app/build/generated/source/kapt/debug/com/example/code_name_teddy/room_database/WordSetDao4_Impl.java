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
public final class WordSetDao4_Impl implements WordSetDao4 {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<WordSet4> __insertionAdapterOfWordSet4;

  private final EntityDeletionOrUpdateAdapter<WordSet4> __deletionAdapterOfWordSet4;

  public WordSetDao4_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfWordSet4 = new EntityInsertionAdapter<WordSet4>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `WordSet4` (`word`,`id`) VALUES (?,nullif(?, 0))";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WordSet4 value) {
        if (value.getWord() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getWord());
        }
        stmt.bindLong(2, value.getId());
      }
    };
    this.__deletionAdapterOfWordSet4 = new EntityDeletionOrUpdateAdapter<WordSet4>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `WordSet4` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WordSet4 value) {
        stmt.bindLong(1, value.getId());
      }
    };
  }

  @Override
  public void insert(final WordSet4 word) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfWordSet4.insert(word);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final WordSet4 word) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfWordSet4.handle(word);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<WordSet4> getAll() {
    final String _sql = "SELECT * FROM wordset4";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfWord = CursorUtil.getColumnIndexOrThrow(_cursor, "word");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final List<WordSet4> _result = new ArrayList<WordSet4>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final WordSet4 _item;
        final String _tmpWord;
        if (_cursor.isNull(_cursorIndexOfWord)) {
          _tmpWord = null;
        } else {
          _tmpWord = _cursor.getString(_cursorIndexOfWord);
        }
        _item = new WordSet4(_tmpWord);
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
