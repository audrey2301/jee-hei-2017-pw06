package hei.tp06.core.dao;

import hei.tp06.core.entity.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

/**
 * Created by audrey on 14/02/2017.
 */
public interface EvenementDao extends JpaRepository<Evenement,Long> {

    Evenement findById(Long id);

    List<Evenement> findByTitle(String title);

    List<Evenement> findByStart(Date start);
}
