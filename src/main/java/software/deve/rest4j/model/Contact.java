package software.deve.rest4j.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Contact {
    public Contact() {
    }

    public Contact(Integer id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private Integer id;

    private String name;

    private String surname;
}
