package org.example.fallout.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.example.fallout.domain.entity.util.Identifiable;

import java.util.UUID;

@Entity
@Table(name = "locations")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Location extends Identifiable {

    private String name;
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "north_location_id")
    private Location northLocationId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "south_location_id")
    private Location southLocationId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "east_location_id")
    private Location eastLocationId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "west_location_id")
    private Location westLocationId;

//    @OneToMany(mappedBy = "location")
//    private List<NPC> npcs;
//
//    @OneToMany(mappedBy = "location")
//    private List<Item> items;
//
//    @OneToMany(mappedBy = "location")
//    private List<Enemy> enemies;
}
