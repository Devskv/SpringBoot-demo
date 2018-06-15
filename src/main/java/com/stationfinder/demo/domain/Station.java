package com.stationfinder.demo.domain;


import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Station {

    private String stationid;

    private String name;

    private Boolean hdenabled;

    private String callsign;



}
