package com.poli.moviesservice.entity;


import lombok.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder(toBuilder = true)
@EqualsAndHashCode
@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull(message = "Not null")
    @Column(unique = true, nullable = false)
    private Long id;

    @NotNull(message = "No puede estar en blanco")
    @Column
    private String title;

    @NotNull(message = "No puede estar en blanco")
    @Column
    private String director;

    @Column
    @Min(value = 0, message = "el rating debe de ser mayor a 0")
    @Max(value = 5, message = "el rating debe de ser menor a 6")
    private Integer rating;
}
