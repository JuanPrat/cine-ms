package com.poli.moviesservice.entity;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Builder(toBuilder = true)
@EqualsAndHashCode
@Data
@AllArgsConstructor
@Entity
public class Movie {
    @Id
    @NonNull
    Long id;
    @NotNull
    String title;
    @NotNull
    String director;
    Integer rating;
}
