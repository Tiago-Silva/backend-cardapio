package br.com.cardapio.controller;

import br.com.cardapio.DTO.FoodRequestDTO;
import br.com.cardapio.DTO.FoodsResponseDTO;
import br.com.cardapio.entidades.Foods;
import br.com.cardapio.repository.FoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodsRepository foodsRepository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FoodsResponseDTO> getAll() {
        return foodsRepository.findAll().stream().map(FoodsResponseDTO::new).toList();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveFoods(@RequestBody FoodRequestDTO data) {
        Foods foods = new Foods(data);
        foodsRepository.save(foods);
    }
}
