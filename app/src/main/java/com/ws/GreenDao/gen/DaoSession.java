package com.ws.GreenDao.gen;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.ws.GreenDao.CommunicationCatalog;
import com.ws.GreenDao.PowerCatalog;
import com.ws.GreenDao.PowerSupplyCatalog;
import com.ws.GreenDao.SignalCatalog;
import com.ws.GreenDao.Specialities;
import com.ws.GreenDao.SupervisionStandardCatalog;
import com.ws.GreenDao.User;
import com.ws.GreenDao.Catalog;
import com.ws.GreenDao.Part;
import com.ws.GreenDao.SupervisionstandardParagraph;
import com.ws.GreenDao.CatalogChapter;
import com.ws.GreenDao.CatalogPart;
import com.ws.GreenDao.Paragraph;

import com.ws.GreenDao.gen.CommunicationCatalogDao;
import com.ws.GreenDao.gen.PowerCatalogDao;
import com.ws.GreenDao.gen.PowerSupplyCatalogDao;
import com.ws.GreenDao.gen.SignalCatalogDao;
import com.ws.GreenDao.gen.SpecialitiesDao;
import com.ws.GreenDao.gen.SupervisionStandardCatalogDao;
import com.ws.GreenDao.gen.UserDao;
import com.ws.GreenDao.gen.CatalogDao;
import com.ws.GreenDao.gen.PartDao;
import com.ws.GreenDao.gen.SupervisionstandardParagraphDao;
import com.ws.GreenDao.gen.CatalogChapterDao;
import com.ws.GreenDao.gen.CatalogPartDao;
import com.ws.GreenDao.gen.ParagraphDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig communicationCatalogDaoConfig;
    private final DaoConfig powerCatalogDaoConfig;
    private final DaoConfig powerSupplyCatalogDaoConfig;
    private final DaoConfig signalCatalogDaoConfig;
    private final DaoConfig specialitiesDaoConfig;
    private final DaoConfig supervisionStandardCatalogDaoConfig;
    private final DaoConfig userDaoConfig;
    private final DaoConfig catalogDaoConfig;
    private final DaoConfig partDaoConfig;
    private final DaoConfig supervisionstandardParagraphDaoConfig;
    private final DaoConfig catalogChapterDaoConfig;
    private final DaoConfig catalogPartDaoConfig;
    private final DaoConfig paragraphDaoConfig;

    private final CommunicationCatalogDao communicationCatalogDao;
    private final PowerCatalogDao powerCatalogDao;
    private final PowerSupplyCatalogDao powerSupplyCatalogDao;
    private final SignalCatalogDao signalCatalogDao;
    private final SpecialitiesDao specialitiesDao;
    private final SupervisionStandardCatalogDao supervisionStandardCatalogDao;
    private final UserDao userDao;
    private final CatalogDao catalogDao;
    private final PartDao partDao;
    private final SupervisionstandardParagraphDao supervisionstandardParagraphDao;
    private final CatalogChapterDao catalogChapterDao;
    private final CatalogPartDao catalogPartDao;
    private final ParagraphDao paragraphDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        communicationCatalogDaoConfig = daoConfigMap.get(CommunicationCatalogDao.class).clone();
        communicationCatalogDaoConfig.initIdentityScope(type);

        powerCatalogDaoConfig = daoConfigMap.get(PowerCatalogDao.class).clone();
        powerCatalogDaoConfig.initIdentityScope(type);

        powerSupplyCatalogDaoConfig = daoConfigMap.get(PowerSupplyCatalogDao.class).clone();
        powerSupplyCatalogDaoConfig.initIdentityScope(type);

        signalCatalogDaoConfig = daoConfigMap.get(SignalCatalogDao.class).clone();
        signalCatalogDaoConfig.initIdentityScope(type);

        specialitiesDaoConfig = daoConfigMap.get(SpecialitiesDao.class).clone();
        specialitiesDaoConfig.initIdentityScope(type);

        supervisionStandardCatalogDaoConfig = daoConfigMap.get(SupervisionStandardCatalogDao.class).clone();
        supervisionStandardCatalogDaoConfig.initIdentityScope(type);

        userDaoConfig = daoConfigMap.get(UserDao.class).clone();
        userDaoConfig.initIdentityScope(type);

        catalogDaoConfig = daoConfigMap.get(CatalogDao.class).clone();
        catalogDaoConfig.initIdentityScope(type);

        partDaoConfig = daoConfigMap.get(PartDao.class).clone();
        partDaoConfig.initIdentityScope(type);

        supervisionstandardParagraphDaoConfig = daoConfigMap.get(SupervisionstandardParagraphDao.class).clone();
        supervisionstandardParagraphDaoConfig.initIdentityScope(type);

        catalogChapterDaoConfig = daoConfigMap.get(CatalogChapterDao.class).clone();
        catalogChapterDaoConfig.initIdentityScope(type);

        catalogPartDaoConfig = daoConfigMap.get(CatalogPartDao.class).clone();
        catalogPartDaoConfig.initIdentityScope(type);

        paragraphDaoConfig = daoConfigMap.get(ParagraphDao.class).clone();
        paragraphDaoConfig.initIdentityScope(type);

        communicationCatalogDao = new CommunicationCatalogDao(communicationCatalogDaoConfig, this);
        powerCatalogDao = new PowerCatalogDao(powerCatalogDaoConfig, this);
        powerSupplyCatalogDao = new PowerSupplyCatalogDao(powerSupplyCatalogDaoConfig, this);
        signalCatalogDao = new SignalCatalogDao(signalCatalogDaoConfig, this);
        specialitiesDao = new SpecialitiesDao(specialitiesDaoConfig, this);
        supervisionStandardCatalogDao = new SupervisionStandardCatalogDao(supervisionStandardCatalogDaoConfig, this);
        userDao = new UserDao(userDaoConfig, this);
        catalogDao = new CatalogDao(catalogDaoConfig, this);
        partDao = new PartDao(partDaoConfig, this);
        supervisionstandardParagraphDao = new SupervisionstandardParagraphDao(supervisionstandardParagraphDaoConfig, this);
        catalogChapterDao = new CatalogChapterDao(catalogChapterDaoConfig, this);
        catalogPartDao = new CatalogPartDao(catalogPartDaoConfig, this);
        paragraphDao = new ParagraphDao(paragraphDaoConfig, this);

        registerDao(CommunicationCatalog.class, communicationCatalogDao);
        registerDao(PowerCatalog.class, powerCatalogDao);
        registerDao(PowerSupplyCatalog.class, powerSupplyCatalogDao);
        registerDao(SignalCatalog.class, signalCatalogDao);
        registerDao(Specialities.class, specialitiesDao);
        registerDao(SupervisionStandardCatalog.class, supervisionStandardCatalogDao);
        registerDao(User.class, userDao);
        registerDao(Catalog.class, catalogDao);
        registerDao(Part.class, partDao);
        registerDao(SupervisionstandardParagraph.class, supervisionstandardParagraphDao);
        registerDao(CatalogChapter.class, catalogChapterDao);
        registerDao(CatalogPart.class, catalogPartDao);
        registerDao(Paragraph.class, paragraphDao);
    }
    
    public void clear() {
        communicationCatalogDaoConfig.clearIdentityScope();
        powerCatalogDaoConfig.clearIdentityScope();
        powerSupplyCatalogDaoConfig.clearIdentityScope();
        signalCatalogDaoConfig.clearIdentityScope();
        specialitiesDaoConfig.clearIdentityScope();
        supervisionStandardCatalogDaoConfig.clearIdentityScope();
        userDaoConfig.clearIdentityScope();
        catalogDaoConfig.clearIdentityScope();
        partDaoConfig.clearIdentityScope();
        supervisionstandardParagraphDaoConfig.clearIdentityScope();
        catalogChapterDaoConfig.clearIdentityScope();
        catalogPartDaoConfig.clearIdentityScope();
        paragraphDaoConfig.clearIdentityScope();
    }

    public CommunicationCatalogDao getCommunicationCatalogDao() {
        return communicationCatalogDao;
    }

    public PowerCatalogDao getPowerCatalogDao() {
        return powerCatalogDao;
    }

    public PowerSupplyCatalogDao getPowerSupplyCatalogDao() {
        return powerSupplyCatalogDao;
    }

    public SignalCatalogDao getSignalCatalogDao() {
        return signalCatalogDao;
    }

    public SpecialitiesDao getSpecialitiesDao() {
        return specialitiesDao;
    }

    public SupervisionStandardCatalogDao getSupervisionStandardCatalogDao() {
        return supervisionStandardCatalogDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public CatalogDao getCatalogDao() {
        return catalogDao;
    }

    public PartDao getPartDao() {
        return partDao;
    }

    public SupervisionstandardParagraphDao getSupervisionstandardParagraphDao() {
        return supervisionstandardParagraphDao;
    }

    public CatalogChapterDao getCatalogChapterDao() {
        return catalogChapterDao;
    }

    public CatalogPartDao getCatalogPartDao() {
        return catalogPartDao;
    }

    public ParagraphDao getParagraphDao() {
        return paragraphDao;
    }

}