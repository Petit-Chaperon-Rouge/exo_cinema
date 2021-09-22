package fr.inetum.cinema.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Salle {

    @Id
    private String id;
    private String numero;
    private Integer nbPlaces;

    @DBRef
    @Field("cinema")
    private Cinema cinema;

}
