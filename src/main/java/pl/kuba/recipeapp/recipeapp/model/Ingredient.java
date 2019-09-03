package pl.kuba.recipeapp.recipeapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", updatable = false, nullable = false)
    private long id;
    private String description;

    @OneToOne
    private Measure measure;

    @ManyToMany
    private List<Recipe> recipe;

}
