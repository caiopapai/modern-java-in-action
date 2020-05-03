package br.com.moder.java.in.action.part2.streams.streams.introduction;

import java.util.Arrays;
import java.util.List;

public class DishesRepository {

    List<Dish> dishes = Arrays.asList(
            new Dish("pork",false,800,DishType.MEAT),
            new Dish("beef",false,700,DishType.MEAT),
            new Dish("chicken", false, 400, DishType.MEAT),
            new Dish("french fires", true, 530, DishType.OTHER),
            new Dish("rice", true,350, DishType.OTHER),
            new Dish("season fruit", true,120,DishType.OTHER),
            new Dish("pizza", true, 550, DishType.OTHER),
            new Dish("prawns", false, 300, DishType.FISH),
            new Dish("salmon", false, 450, DishType.FISH)
    );

    public List<Dish> getllDishes(){
        return this.dishes;
    }

}
