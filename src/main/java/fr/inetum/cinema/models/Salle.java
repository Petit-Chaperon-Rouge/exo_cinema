package fr.inetum.cinema.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Salle {

    @Id
    private String id;
    private String numero;
    private Integer nbPlaces;

    @DBRef
    @Field("seance")
    private List<Seance> seances;

}
