package br.com.moder.java.in.action.part2.streams.working.with.streams;

import br.com.moder.java.in.action.part2.streams.streams.introduction.Dish;
import br.com.moder.java.in.action.part2.streams.streams.introduction.DishesRepository;

import java.util.List;
import java.util.stream.Collectors;

public class TakingWhileApp {

    public static void main(String[] args) {

        DishesRepository repository = new DishesRepository();

        List<Dish> menu = repository.getllDishes();

        List<String> filteredMenu = menu.stream() // Creates a pipeline
                .map(Dish::getName) // Get the names of Dishes
                .limit(3) // Select only the first three
                .collect(Collectors.toList()); //Stores the result in another list;

        System.out.println(filteredMenu);
    }
}
