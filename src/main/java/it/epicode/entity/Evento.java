package it.epicode.entity;

import it.epicode.entity.entityENUM.TipoEvento;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;


@Entity
@Data
@Table(name = "eventi")

public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titolo;

    @Column(name = "data_evento")
    private LocalDate dataEvento;
    private String descrizione;
    @Column(name = "tipo_evento")
    @Enumerated(EnumType.STRING)
    private TipoEvento tipoEvento;
    @Column(name = "numero_massimo_partecipanti")
    private Integer numeroMassimoPartecipanti;

    @ManyToOne
    private Location location;

    @OneToMany(mappedBy = "evento")
    private List<Partecipazione> partecipazioni;
}
