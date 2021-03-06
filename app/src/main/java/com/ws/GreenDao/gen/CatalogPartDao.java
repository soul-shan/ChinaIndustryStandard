package com.ws.GreenDao.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.ws.GreenDao.CatalogPart;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "CATALOG_PART".
*/
public class CatalogPartDao extends AbstractDao<CatalogPart, Void> {

    public static final String TABLENAME = "CATALOG_PART";

    /**
     * Properties of entity CatalogPart.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Integer.class, "id", false, "ID");
        public final static Property Specialitiesid = new Property(1, Integer.class, "specialitiesid", false, "SPECIALITIESID");
        public final static Property Chapterid = new Property(2, Integer.class, "chapterid", false, "CHAPTERID");
        public final static Property Partid = new Property(3, Integer.class, "partid", false, "PARTID");
        public final static Property Part = new Property(4, String.class, "part", false, "PART");
    }


    public CatalogPartDao(DaoConfig config) {
        super(config);
    }
    
    public CatalogPartDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CATALOG_PART\" (" + //
                "\"ID\" INTEGER," + // 0: id
                "\"SPECIALITIESID\" INTEGER," + // 1: specialitiesid
                "\"CHAPTERID\" INTEGER," + // 2: chapterid
                "\"PARTID\" INTEGER," + // 3: partid
                "\"PART\" TEXT);"); // 4: part
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CATALOG_PART\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, CatalogPart entity) {
        stmt.clearBindings();
 
        Integer id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Integer specialitiesid = entity.getSpecialitiesid();
        if (specialitiesid != null) {
            stmt.bindLong(2, specialitiesid);
        }
 
        Integer chapterid = entity.getChapterid();
        if (chapterid != null) {
            stmt.bindLong(3, chapterid);
        }
 
        Integer partid = entity.getPartid();
        if (partid != null) {
            stmt.bindLong(4, partid);
        }
 
        String part = entity.getPart();
        if (part != null) {
            stmt.bindString(5, part);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, CatalogPart entity) {
        stmt.clearBindings();
 
        Integer id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Integer specialitiesid = entity.getSpecialitiesid();
        if (specialitiesid != null) {
            stmt.bindLong(2, specialitiesid);
        }
 
        Integer chapterid = entity.getChapterid();
        if (chapterid != null) {
            stmt.bindLong(3, chapterid);
        }
 
        Integer partid = entity.getPartid();
        if (partid != null) {
            stmt.bindLong(4, partid);
        }
 
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
    public CatalogPart readEntity(Cursor cursor, int offset) {
        CatalogPart entity = new CatalogPart( //
            cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // specialitiesid
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // chapterid
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // partid
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4) // part
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, CatalogPart entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0));
        entity.setSpecialitiesid(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setChapterid(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setPartid(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setPart(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
     }
    
    @Override
    protected final Void updateKeyAfterInsert(CatalogPart entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    @Override
    public Void getKey(CatalogPart entity) {
        return null;
    }

    @Override
    public boolean hasKey(CatalogPart entity) {
        // TODO
        return false;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
