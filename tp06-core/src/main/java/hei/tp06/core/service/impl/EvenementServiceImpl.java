package hei.tp06.core.service.impl;

import hei.tp06.core.dao.EvenementDao;
import hei.tp06.core.entity.Evenement;
import hei.tp06.core.service.EvenementService;

import javax.inject.Inject;
import java.util.Date;
import java.util.List;

/**
 * Created by audrey on 14/02/2017.
 */
public class EvenementServiceImpl implements EvenementService {

    @Inject
    EvenementDao evenementDao;

    public List<Evenement> findById(long id) {
        return evenementDao.findById(id);
    }

    public List<Evenement> findByTitle(String title) {
        return evenementDao.findByTitle(title);
    }

    public List<Evenement> findByStart(Date start) {
        return evenementDao.findByStart(start);
    }

    public void saveEvenement(Evenement evenement) {
        evenementDao.save(evenement);
    }

    public List<Evenement> findAll() {
        return evenementDao.findAll();
    }
}
