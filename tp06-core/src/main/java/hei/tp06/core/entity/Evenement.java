package hei.tp06.core.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by audrey on 14/02/2017.
 */
@Entity
public class Evenement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId(){return id;}

    private Date start;
    private Date end;
    private String title;
    private String color;
    private String description;

    public Evenement(Date start, Date end, String title, String color, String description){
        this.start = start;
        this.end = end;
        this.title = title;
        this.color = color;
        this.description = description;
    }

//    @Override
//    public String toString() {return "Evenement [ id=" +id+ ", date de début=" +start+ ", date de fin=" +end+ ", titre de l'évènement="
//            +title+ ", couleur=" +color+ ", description=" +description;}
//

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
