package com.brain.controller;

import com.brain.entity.Player;
import com.brain.service.PlayerServes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerController {

    @Autowired
    private PlayerServes service;

    @RequestMapping(value = "/players", method = RequestMethod.GET)
    @ResponseBody
    public List<Player> getAllPlayers() {
        return service.getAll();
    }

    @RequestMapping(value = "/players/players/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Player getPlayer(@PathVariable("id") long remindID) {
        return service.getByID(remindID);
    }

    @RequestMapping(value = "/player", method = RequestMethod.POST)
    @ResponseBody
    public Player savePlayer(@RequestBody Player player) {
        return service.save(player);
    }

    @RequestMapping(value = "/players/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void delete(@PathVariable long id) {
        service.remove(id);
    }

}
