package com.poli.moviesservice.entity;

import com.sun.istack.NotNull;
import lombok.NonNull;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Date;

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
