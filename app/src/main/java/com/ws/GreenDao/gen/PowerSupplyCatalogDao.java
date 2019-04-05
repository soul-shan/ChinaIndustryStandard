package com.ws.GreenDao.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.ws.GreenDao.PowerSupplyCatalog;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "POWER_SUPPLY_CATALOG".
*/
public class PowerSupplyCatalogDao extends AbstractDao<PowerSupplyCatalog, Void> {

    public static final String TABLENAME = "POWER_SUPPLY_CATALOG";

    /**
     * Properties of entity PowerSupplyCatalog.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, int.class, "id", false, "ID");
        public final static Property Chapterid = new Property(1, int.class, "chapterid", false, "CHAPTERID");
        public final static Property Chapter = new Property(2, String.class, "chapter", false, "CHAPTER");
        public final static Property Partid = new Property(3, int.class, "partid", false, "PARTID");
        public final static Property Part = new Property(4, String.class, "part", false, "PART");
    }


    public PowerSupplyCatalogDao(DaoConfig config) {
        super(config);
    }
    
    public PowerSupplyCatalogDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"POWER_SUPPLY_CATALOG\" (" + //
                "\"ID\" INTEGER NOT NULL ," + // 0: id
                "\"CHAPTERID\" INTEGER NOT NULL ," + // 1: chapterid
                "\"CHAPTER\" TEXT," + // 2: chapter
                "\"PARTID\" INTEGER NOT NULL ," + // 3: partid
                "\"PART\" TEXT);"); // 4: part
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"POWER_SUPPLY_CATALOG\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, PowerSupplyCatalog entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
        stmt.bindLong(2, entity.getChapterid());
 
        String chapter = entity.getChapter();
        if (chapter != null) {
            stmt.bindString(3, chapter);
        }
        stmt.bindLong(4, entity.getPartid());
 
        String part = entity.getPart();
        if (part != null) {
            stmt.bindString(5, part);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, PowerSupplyCatalog entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
        stmt.bindLong(2, entity.getChapterid());
 
        String chapter = entity.getChapter();
        if (chapter != null) {
            stmt.bindString(3, chapter);
        }
        stmt.bindLong(4, entity.getPartid());
 
        String part = entity.getPart();
        if (part != null) {
            stmt.bindString(5, part);
        }
    }

    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    @Override
    public PowerSupplyCatalog readEntity(Cursor cursor, int offset) {
        PowerSupplyCatalog entity = new PowerSupplyCatalog( //
            cursor.getInt(offset + 0), // id
            cursor.getInt(offset + 1), // chapterid
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // chapter
            cursor.getInt(offset + 3), // partid
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4) // part
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, PowerSupplyCatalog entity, int offset) {
        entity.setId(cursor.getInt(offset + 0));
        entity.setChapterid(cursor.getInt(offset + 1));
        entity.setChapter(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setPartid(cursor.getInt(offset + 3));
        entity.setPart(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
     }
    
    @Override
    protected final Void updateKeyAfterInsert(PowerSupplyCatalog entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    @Override
    public Void getKey(PowerSupplyCatalog entity) {
        return null;
    }

    @Override
    public boolean hasKey(PowerSupplyCatalog entity) {
        // TODO
        return false;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
