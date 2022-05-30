package com.example.code_name_teddy.room_database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile WordSetDao1 _wordSetDao1;

  private volatile WordSetDao2 _wordSetDao2;

  private volatile WordSetDao3 _wordSetDao3;

  private volatile WordSetDao4 _wordSetDao4;

  private volatile WordSetDao5 _wordSetDao5;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `WordSet1` (`word` TEXT NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `WordSet2` (`word` TEXT NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `WordSet3` (`word` TEXT NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `WordSet4` (`word` TEXT NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `WordSet5` (`word` TEXT NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'bc406f2baffd1031b7120c60c70d849a')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `WordSet1`");
        _db.execSQL("DROP TABLE IF EXISTS `WordSet2`");
        _db.execSQL("DROP TABLE IF EXISTS `WordSet3`");
        _db.execSQL("DROP TABLE IF EXISTS `WordSet4`");
        _db.execSQL("DROP TABLE IF EXISTS `WordSet5`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsWordSet1 = new HashMap<String, TableInfo.Column>(2);
        _columnsWordSet1.put("word", new TableInfo.Column("word", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWordSet1.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysWordSet1 = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesWordSet1 = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoWordSet1 = new TableInfo("WordSet1", _columnsWordSet1, _foreignKeysWordSet1, _indicesWordSet1);
        final TableInfo _existingWordSet1 = TableInfo.read(_db, "WordSet1");
        if (! _infoWordSet1.equals(_existingWordSet1)) {
          return new RoomOpenHelper.ValidationResult(false, "WordSet1(com.example.code_name_teddy.room_database.WordSet1).\n"
                  + " Expected:\n" + _infoWordSet1 + "\n"
                  + " Found:\n" + _existingWordSet1);
        }
        final HashMap<String, TableInfo.Column> _columnsWordSet2 = new HashMap<String, TableInfo.Column>(2);
        _columnsWordSet2.put("word", new TableInfo.Column("word", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWordSet2.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysWordSet2 = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesWordSet2 = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoWordSet2 = new TableInfo("WordSet2", _columnsWordSet2, _foreignKeysWordSet2, _indicesWordSet2);
        final TableInfo _existingWordSet2 = TableInfo.read(_db, "WordSet2");
        if (! _infoWordSet2.equals(_existingWordSet2)) {
          return new RoomOpenHelper.ValidationResult(false, "WordSet2(com.example.code_name_teddy.room_database.WordSet2).\n"
                  + " Expected:\n" + _infoWordSet2 + "\n"
                  + " Found:\n" + _existingWordSet2);
        }
        final HashMap<String, TableInfo.Column> _columnsWordSet3 = new HashMap<String, TableInfo.Column>(2);
        _columnsWordSet3.put("word", new TableInfo.Column("word", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWordSet3.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysWordSet3 = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesWordSet3 = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoWordSet3 = new TableInfo("WordSet3", _columnsWordSet3, _foreignKeysWordSet3, _indicesWordSet3);
        final TableInfo _existingWordSet3 = TableInfo.read(_db, "WordSet3");
        if (! _infoWordSet3.equals(_existingWordSet3)) {
          return new RoomOpenHelper.ValidationResult(false, "WordSet3(com.example.code_name_teddy.room_database.WordSet3).\n"
                  + " Expected:\n" + _infoWordSet3 + "\n"
                  + " Found:\n" + _existingWordSet3);
        }
        final HashMap<String, TableInfo.Column> _columnsWordSet4 = new HashMap<String, TableInfo.Column>(2);
        _columnsWordSet4.put("word", new TableInfo.Column("word", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWordSet4.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysWordSet4 = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesWordSet4 = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoWordSet4 = new TableInfo("WordSet4", _columnsWordSet4, _foreignKeysWordSet4, _indicesWordSet4);
        final TableInfo _existingWordSet4 = TableInfo.read(_db, "WordSet4");
        if (! _infoWordSet4.equals(_existingWordSet4)) {
          return new RoomOpenHelper.ValidationResult(false, "WordSet4(com.example.code_name_teddy.room_database.WordSet4).\n"
                  + " Expected:\n" + _infoWordSet4 + "\n"
                  + " Found:\n" + _existingWordSet4);
        }
        final HashMap<String, TableInfo.Column> _columnsWordSet5 = new HashMap<String, TableInfo.Column>(2);
        _columnsWordSet5.put("word", new TableInfo.Column("word", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWordSet5.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysWordSet5 = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesWordSet5 = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoWordSet5 = new TableInfo("WordSet5", _columnsWordSet5, _foreignKeysWordSet5, _indicesWordSet5);
        final TableInfo _existingWordSet5 = TableInfo.read(_db, "WordSet5");
        if (! _infoWordSet5.equals(_existingWordSet5)) {
          return new RoomOpenHelper.ValidationResult(false, "WordSet5(com.example.code_name_teddy.room_database.WordSet5).\n"
                  + " Expected:\n" + _infoWordSet5 + "\n"
                  + " Found:\n" + _existingWordSet5);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "bc406f2baffd1031b7120c60c70d849a", "c7c80ad9b77fabd74de2edd2642b77ba");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "WordSet1","WordSet2","WordSet3","WordSet4","WordSet5");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `WordSet1`");
      _db.execSQL("DELETE FROM `WordSet2`");
      _db.execSQL("DELETE FROM `WordSet3`");
      _db.execSQL("DELETE FROM `WordSet4`");
      _db.execSQL("DELETE FROM `WordSet5`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(WordSetDao1.class, WordSetDao1_Impl.getRequiredConverters());
    _typeConvertersMap.put(WordSetDao2.class, WordSetDao2_Impl.getRequiredConverters());
    _typeConvertersMap.put(WordSetDao3.class, WordSetDao3_Impl.getRequiredConverters());
    _typeConvertersMap.put(WordSetDao4.class, WordSetDao4_Impl.getRequiredConverters());
    _typeConvertersMap.put(WordSetDao5.class, WordSetDao5_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public WordSetDao1 wordSetDao1() {
    if (_wordSetDao1 != null) {
      return _wordSetDao1;
    } else {
      synchronized(this) {
        if(_wordSetDao1 == null) {
          _wordSetDao1 = new WordSetDao1_Impl(this);
        }
        return _wordSetDao1;
      }
    }
  }

  @Override
  public WordSetDao2 wordSetDao2() {
    if (_wordSetDao2 != null) {
      return _wordSetDao2;
    } else {
      synchronized(this) {
        if(_wordSetDao2 == null) {
          _wordSetDao2 = new WordSetDao2_Impl(this);
        }
        return _wordSetDao2;
      }
    }
  }

  @Override
  public WordSetDao3 wordSetDao3() {
    if (_wordSetDao3 != null) {
      return _wordSetDao3;
    } else {
      synchronized(this) {
        if(_wordSetDao3 == null) {
          _wordSetDao3 = new WordSetDao3_Impl(this);
        }
        return _wordSetDao3;
      }
    }
  }

  @Override
  public WordSetDao4 wordSetDao4() {
    if (_wordSetDao4 != null) {
      return _wordSetDao4;
    } else {
      synchronized(this) {
        if(_wordSetDao4 == null) {
          _wordSetDao4 = new WordSetDao4_Impl(this);
        }
        return _wordSetDao4;
      }
    }
  }

  @Override
  public WordSetDao5 wordSetDao5() {
    if (_wordSetDao5 != null) {
      return _wordSetDao5;
    } else {
      synchronized(this) {
        if(_wordSetDao5 == null) {
          _wordSetDao5 = new WordSetDao5_Impl(this);
        }
        return _wordSetDao5;
      }
    }
  }
}
