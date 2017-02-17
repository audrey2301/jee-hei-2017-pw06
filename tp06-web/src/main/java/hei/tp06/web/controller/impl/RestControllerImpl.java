package hei.tp06.web.controller.impl;

import hei.tp06.core.entity.Evenement;
import hei.tp06.core.service.EvenementService;
import hei.tp06.web.controller.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by audrey on 14/02/2017.
 */
@Named
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RestControllerImpl implements RestController {

    private static final Logger logger = LoggerFactory.getLogger(RestControllerImpl.class);

    @Inject
    private EvenementService evenementService;

    @GET
    @Path("/evenements/")
    public List<Evenement> getListEvenement(){
        logger.info("Demande du challenge courant avec la clé {}");
        return evenementService.findAll();
    }

    @GET
    @Path("/evenements/{id}")
    public Evenement getListEvenementById(@PathParam("id") Long id){
        logger.info("Demande de la liste des evenements par id {}", id);
        return evenementService.findById(id);
    }

    @POST
    @Path("/evenements/")
    @Consumes("application/json")
    public void jsonDoc(Evenement evenement){
        logger.info("Enregistre un evenement", evenement);
        evenementService.saveEvenement(evenement);
    }
}

