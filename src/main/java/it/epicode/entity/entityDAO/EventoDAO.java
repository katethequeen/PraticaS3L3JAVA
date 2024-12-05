package it.epicode.entity.entityDAO;

import it.epicode.entity.Evento;
import jakarta.persistence.EntityManager;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EventoDAO {
    private EntityManager em;

    public void save(Evento evento) {
        em.getTransaction().begin();
        em.persist(evento);
        em.getTransaction().commit();
    }

    public Evento findById(Long id) {
        return em.find(Evento.class, id);
    }

    public void removeById(Long id) {
        Evento evento = em.find(Evento.class, id);
        if(evento != null) {
            em.remove(evento);
        }
    }

    public void delete(Evento evento) {
        em.getTransaction().begin();
        em.remove(evento);
        em.getTransaction().commit();
    }

    public void updateEvento(Evento evento) {
        em.getTransaction().begin();
        em.merge(evento);
        em.getTransaction().commit();
    }
}
