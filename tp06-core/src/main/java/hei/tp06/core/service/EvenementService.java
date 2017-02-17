package hei.tp06.core.service;

import hei.tp06.core.entity.Evenement;

import java.util.Date;
import java.util.List;

/**
 * Created by audrey on 14/02/2017.
 */
public interface EvenementService {

    Evenement findById(Long id);

    void saveEvenement(Evenement evenement);

    List<Evenement> findAll();
}
