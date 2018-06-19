package com.stationfinder.demo.domain;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Data
@Table(name = "station")
public class Station {

    @Id
    @Column(name = "stationid")
    private String stationid;

    @Column(name = "name")
    private String name;

    @Column(name = "hdenabled")
    private Boolean hdenabled;

    @Column(name = "callsign")
    private String callsign;

    public String getStationid() {
        return stationid;
    }

    public void setStationid(String stationid) {
        this.stationid = stationid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getHdenabled() {
        return hdenabled;
    }

    public void setHdenabled(Boolean hdenabled) {
        this.hdenabled = hdenabled;
    }

    public String getCallsign() {
        return callsign;
    }

    public void setCallsign(String callsign) {
        this.callsign = callsign;
    }

    private Station(){

    }

}
