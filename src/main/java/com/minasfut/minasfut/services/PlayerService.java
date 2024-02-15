package com.minasfut.minasfut.services;

import com.minasfut.minasfut.dto.PlayerDTO;
import com.minasfut.minasfut.entities.Player;
import com.minasfut.minasfut.projections.PlayerProjection;
import com.minasfut.minasfut.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    public PlayerRepository playerRepository;

    @Transactional(readOnly = true)
    public List<PlayerDTO>findAll(){
        List<Player> result = playerRepository.findAll();
        return result.stream().map(PlayerDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public PlayerDTO findById(Long id){
        Player result = playerRepository.findById(id).get();
        return new PlayerDTO(result);
    }
    @Transactional(readOnly = true)
    public PlayerDTO findByList(Long listId){
        List<PlayerProjection> result = playerRepository.searchByList(listId);
        return (PlayerDTO) result.stream().map(PlayerDTO::new).toList();
    }

    @Transactional(readOnly = false)
    public Player insert(Player entity){
        return playerRepository.save(entity);
    }

    @Transactional(readOnly = false)
    public void delete(Long id){
        playerRepository.deleteById(id);
    }

    public Player update(Long id, Player obj){
        Player entity = playerRepository.getReferenceById(id);
        updateEntity(entity, obj);
        return playerRepository.save(entity);
    }

    private void updateEntity(Player entity, Player obj) {
        entity.setAge(obj.getAge());
        entity.setAssistencias(obj.getAssistencias());
        entity.setGols(obj.getGols());
        entity.setPosicao(obj.getPosicao());

    }

    public Player updateAge(Long id, Player obj){
        Player entity = playerRepository.getReferenceById(id);
        updateAgeMethod(entity, obj);
        return playerRepository.save(entity);
    }

    private void updateAgeMethod(Player entity, Player obj) {
        entity.setAge(obj.getAge());
    }

    public Player updateAssistencias(Long id, Player obj){
        Player entity = playerRepository.getReferenceById(id);
        updateAssistenciasMethod(entity, obj);
        return playerRepository.save(entity);
    }

    private void updateAssistenciasMethod(Player entity, Player obj) {
        entity.setAssistencias(obj.getAssistencias());
    }

    public Player updateGols(Long id, Player obj){
        Player entity = playerRepository.getReferenceById(id);
        updateGolsMethod(entity, obj);
        return playerRepository.save(entity);
    }

    private void updateGolsMethod(Player entity, Player obj) {
        entity.setGols(obj.getGols());
    }
}
