package org.example.fallout.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.example.fallout.domain.entity.util.Identifiable;

@Entity
@Table(name = "playres")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Player extends Identifiable {

    private String name;

    private int experience;
    private int health;
    private int maxHealth;
    private int strength;
    private int agility;
    private int intelligence;
    private int defense;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "current_location_id")
    private Location currentLocationId;

    // @OneToMany(mappedBy = "player") // TODO: 06.10.2024 создай свой не импортируй рандомный
//    private List<Item> inventory;

    //  @OneToMany(mappedBy = "player") // TODO: 06.10.2024 создай свой не импортируй рандомный
//    private List<Quest> quests;
}
