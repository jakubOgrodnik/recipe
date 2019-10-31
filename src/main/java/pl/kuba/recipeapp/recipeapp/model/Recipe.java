package pl.kuba.recipeapp.recipeapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
    private String title;
    private String description;
    private Integer prepTime;
    private Integer cookTime;

    @OneToMany
    private Set<Ingredient> ingredientSet;


    //@Lob
    @OneToMany
    private List<Image> imageList;

    @Enumerated(value = EnumType.STRING)
    private Difficulty difficulty;

    @ManyToMany
    @JoinTable(name = "recipe_category",
            joinColumns = @JoinColumn(name = "recipe_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Set<Category> categories;
}
