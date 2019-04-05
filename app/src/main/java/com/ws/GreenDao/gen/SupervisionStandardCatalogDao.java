package com.ws.GreenDao.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.ws.GreenDao.SupervisionStandardCatalog;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "SUPERVISION_STANDARD_CATALOG".
*/
public class SupervisionStandardCatalogDao extends AbstractDao<SupervisionStandardCatalog, Void> {

    public static final String TABLENAME = "SUPERVISION_STANDARD_CATALOG";

    /**
     * Properties of entity SupervisionStandardCatalog.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, int.class, "id", false, "ID");
        public final static Property Chapterid = new Property(1, int.class, "chapterid", false, "CHAPTERID");
        public final static Property Chapter = new Property(2, String.class, "chapter", false, "CHAPTER");
        public final static Property Partid = new Property(3, int.class, "partid", false, "PARTID");
        public final static Property Part = new Property(4, String.class, "part", false, "PART");
    }


    public SupervisionStandardCatalogDao(DaoConfig config) {
        super(config);
    }
    
    public SupervisionStandardCatalogDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"SUPERVISION_STANDARD_CATALOG\" (" + //
                "\"ID\" INTEGER NOT NULL ," + // 0: id
                "\"CHAPTERID\" INTEGER NOT NULL ," + // 1: chapterid
                "\"CHAPTER\" TEXT," + // 2: chapter
                "\"PARTID\" INTEGER NOT NULL ," + // 3: partid
                "\"PART\" TEXT);"); // 4: part
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"SUPERVISION_STANDARD_CATALOG\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, SupervisionStandardCatalog entity) {
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
    protected final void bindValues(SQLiteStatement stmt, SupervisionStandardCatalog entity) {
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
    public SupervisionStandardCatalog readEntity(Cursor cursor, int offset) {
        SupervisionStandardCatalog entity = new SupervisionStandardCatalog( //
            cursor.getInt(offset + 0), // id
            cursor.getInt(offset + 1), // chapterid
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // chapter
            cursor.getInt(offset + 3), // partid
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4) // part
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, SupervisionStandardCatalog entity, int offset) {
        entity.setId(cursor.getInt(offset + 0));
        entity.setChapterid(cursor.getInt(offset + 1));
        entity.setChapter(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setPartid(cursor.getInt(offset + 3));
        entity.setPart(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
     }
    
    @Override
    protected final Void updateKeyAfterInsert(SupervisionStandardCatalog entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    @Override
    public Void getKey(SupervisionStandardCatalog entity) {
        return null;
    }

    @Override
    public boolean hasKey(SupervisionStandardCatalog entity) {
        // TODO
        return false;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}