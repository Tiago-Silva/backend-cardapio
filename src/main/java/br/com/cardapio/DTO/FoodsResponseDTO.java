package br.com.cardapio.DTO;

import br.com.cardapio.entidades.Foods;

public record FoodsResponseDTO(Long id, String title, String image, Integer price) {

    public FoodsResponseDTO(Foods foods) {
        this(foods.getId(), foods.getTitle(), foods.getImage(), foods.getPrice());
    }
}
