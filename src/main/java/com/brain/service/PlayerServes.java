package com.brain.service;

import com.brain.entity.Player;

import java.util.List;

public interface PlayerServes {

    List<Player> getAll();
    Player getByID(long id);
    Player save(Player player);
    void remove(long id);

}
