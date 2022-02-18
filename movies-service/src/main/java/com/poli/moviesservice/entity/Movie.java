package com.poli.moviesservice.entity;

import lombok.*;

import javax.persistence.*;
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

public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull(message = "Not null")
    @Column(unique = true, nullable = false)
    private Long id;

    @NotNull(message = "No puede estar en blanco")
    private String title;

    @NotNull(message = "No puede estar en blanco")
    private String director;

    @Column
    @Min(value = 1, message = "el rating debe de ser mayor a 1")
    @Max(value = 5, message = "el rating debe de ser menor a 5")
    private Integer rating;
}
