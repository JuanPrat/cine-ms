package com.poli.showtimesservice.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;
import java.util.ArrayList;
import java.util.Date;

@Getter
@Setter
@Builder(toBuilder = true)
@EqualsAndHashCode
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ShowTime {
    @Id
    @NonNull
    private Long id;
    @NonNull
    private Date date;
    private ArrayList<Object> movies;
}
