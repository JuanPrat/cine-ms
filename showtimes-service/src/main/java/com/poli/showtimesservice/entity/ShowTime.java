package com.poli.showtimesservice.entity;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;

@Getter
@Setter
@Builder(toBuilder = true)
@EqualsAndHashCode
public class ShowTime {
    Long id;
    Date date;
    ArrayList<Object> movies;
}
