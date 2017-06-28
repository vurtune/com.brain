package com.brain.service;

import com.brain.entity.Player;
import com.brain.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServesImpl implements PlayerServes {

    @Autowired
    private PlayerRepository repository;

    public List<Player> getAll() {
        return repository.findAll();
    }

    public Player getByID(long id) {
        return repository.findOne(id);
    }

    public Player save(Player player) {
        return repository.saveAndFlush(player);
    }

    public void remove(long id) {
        repository.delete(id);
    }
}
