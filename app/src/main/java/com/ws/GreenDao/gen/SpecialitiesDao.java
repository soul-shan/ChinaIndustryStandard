package com.ws.GreenDao.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.ws.GreenDao.Specialities;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "SPECIALITIES".
*/
public class SpecialitiesDao extends AbstractDao<Specialities, Void> {

    public static final String TABLENAME = "SPECIALITIES";

    /**
     * Properties of entity Specialities.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, int.class, "id", false, "ID");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property Tb = new Property(2, String.class, "tb", false, "TB");
        public final static Property Code = new Property(3, String.class, "code", false, "CODE");
    }


    public SpecialitiesDao(DaoConfig config) {
        super(config);
    }
    
    public SpecialitiesDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"SPECIALITIES\" (" + //
                "\"ID\" INTEGER NOT NULL ," + // 0: id
                "\"NAME\" TEXT," + // 1: name
                "\"TB\" TEXT," + // 2: tb
                "\"CODE\" TEXT);"); // 3: code
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"SPECIALITIES\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Specialities entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String tb = entity.getTb();
        if (tb != null) {
            stmt.bindString(3, tb);
        }
 
        String code = entity.getCode();
        if (code != null) {
            stmt.bindString(4, code);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Specialities entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String tb = entity.getTb();
        if (tb != null) {
            stmt.bindString(3, tb);
        }
 
        String code = entity.getCode();
        if (code != null) {
            stmt.bindString(4, code);
        }
    }

    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    @Override
    public Specialities readEntity(Cursor cursor, int offset) {
        Specialities entity = new Specialities( //
            cursor.getInt(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // tb
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3) // code
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Specialities entity, int offset) {
        entity.setId(cursor.getInt(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setTb(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setCode(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
     }
    
    @Override
    protected final Void updateKeyAfterInsert(Specialities entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    @Override
    public Void getKey(Specialities entity) {
        return null;
    }

    @Override
    public boolean hasKey(Specialities entity) {
        // TODO
        return false;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}