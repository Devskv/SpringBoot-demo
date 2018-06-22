package com.stationfinder.demo.controller;

import com.stationfinder.demo.domain.Station;
import com.stationfinder.demo.domain.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stations")
public class DemoController {

    @Autowired
    private StationRepository stationRepository;

    @GetMapping(value = "/all")
    public List<Station> findAll(){
      return stationRepository.findAll();
    }

    @GetMapping(value = "/id/{stationid}")
    public Station getStation(@PathVariable("stationid")  String stationid) {
        return stationRepository.findOne(stationid);

    }

    @PostMapping(value = "/load")
    public List<Station> addStation(@RequestBody  Station stations) {
        stationRepository.save(stations);
        return stationRepository.findAll();
    }

    @PutMapping(value = "/update/{stationid}")
    public Station updateStation(@PathVariable("stationid")  String stationid, @RequestBody  Station station){
        stationRepository.save(station);
        return stationRepository.findOne(stationid);

    }


    @DeleteMapping("remove/id/{stationid}")
    public void deleteStation(@PathVariable("stationid") String stationid) {
        stationRepository.delete(stationid);
    }



}
