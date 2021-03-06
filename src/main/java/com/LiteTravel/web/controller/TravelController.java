package com.LiteTravel.web.controller;

import com.LiteTravel.web.mapper.AgencyMapper;
import com.LiteTravel.web.mapper.LineMapper;
import com.LiteTravel.web.Model.Agency;
import com.LiteTravel.web.Model.Line;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;

@Controller
public class TravelController {

    @Autowired
    public LineMapper lineMapper;

    @Autowired
    public AgencyMapper agencyMapper;

    @GetMapping("/travel/lines")
    public String toLines(ModelMap model){
        Collection<Line> lines = lineMapper.getAllLines();
        model.addAttribute("lines", lines);
        return "travel/lineList";
    }

    @GetMapping("/travel/agency/{id}")
    public String toAgency(@PathVariable("id") Integer id, ModelMap model){
        Agency agency = agencyMapper.getAgencyById(id);
        model.addAttribute("agency", agency);
        return "travel/agency";
    }


}
