package hei.tp06.core.service;

import hei.tp06.core.entity.Evenement;

import java.util.Date;
import java.util.List;

/**
 * Created by audrey on 14/02/2017.
 */
public interface EvenementService {

    List<Evenement> findById(long id);

    List<Evenement> findByTitle(String title);

    List<Evenement> findByStart(Date start);

    void saveEvenement(Evenement evenement);

    List<Evenement> findAll();
}
