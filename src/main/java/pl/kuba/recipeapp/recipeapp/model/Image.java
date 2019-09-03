package pl.kuba.recipeapp.recipeapp.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", updatable = false, nullable = false)
    private long id;
    //TODO change to byte[] after changing database
    //@Lob
    private String imageBlob;
}
