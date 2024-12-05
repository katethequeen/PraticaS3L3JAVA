package it.epicode.entity.runners;

import it.epicode.entity.Evento;
import it.epicode.entity.Location;
import it.epicode.entity.Partecipazione;
import it.epicode.entity.entityENUM.TipoEvento;
import jakarta.persistence.EntityManager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void run(EntityManager em) {
        Evento evento = new Evento();
        Location location = new Location();
        List<Partecipazione> partecipazioni = new ArrayList<>();


        evento.setTipoEvento(TipoEvento.PUBBLICO);
        evento.setDataEvento(LocalDate.now());
        evento.setDescrizione("white party");
        evento.setLocation(location);
        evento.setPartecipazioni(partecipazioni);
        evento.setTitolo("Party");

    }
}
