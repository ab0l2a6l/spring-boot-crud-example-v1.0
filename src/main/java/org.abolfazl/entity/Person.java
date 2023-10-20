package org.abolfazl.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name ="person")
@Entity(name ="person")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(name = "personSeq" , sequenceName = "person_seq", allocationSize = 1)
public class Person {
    @Id
    @GeneratedValue(generator = "personSeq")
    private long id;
    private String name;
    private String family;
}
