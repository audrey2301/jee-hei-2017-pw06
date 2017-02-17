package hei.tp06.core.service.impl;

import hei.tp06.core.dao.EvenementDao;
import hei.tp06.core.entity.Evenement;
import hei.tp06.core.service.EvenementService;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Date;
import java.util.List;

/**
 * Created by audrey on 14/02/2017.
 */
@Named
@Transactional
public class EvenementServiceImpl implements EvenementService {

    @Inject
    EvenementDao evenementDao;

    public Evenement findById(Long id) {
        return evenementDao.findById(id);
    }

    public void saveEvenement(Evenement evenement) {
        evenementDao.save(evenement);
    }

    public List<Evenement> findAll() {
        return evenementDao.findAll();
    }
}
