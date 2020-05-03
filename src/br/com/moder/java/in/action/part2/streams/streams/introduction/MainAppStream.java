package br.com.moder.java.in.action.part2.streams.streams.introduction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainAppStream {

    public static void main(String[] args) {

        DishesRepository repository = new DishesRepository();

        List<Dish> menu = repository.getllDishes();

        List<String> threeHighCaloricDishNames = menu.stream() // Creates a pipeline
                .filter(dish -> dish.getCalories() > 300) //Filter high-calorie dishes
                .map(Dish::getName) // Get the names of Dishes
                .limit(3) // Select only the first three
                .collect(Collectors.toList()); //Stores the result in another list;

        System.out.println(threeHighCaloricDishNames);
    }
}
