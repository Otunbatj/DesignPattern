package builder;

import builder.meal.Meal;
import builder.meal.MealBuilder;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.prepareChickenMeal();
        meal.showItems();
        System.out.printf("Total Amount: %f\n", meal.getCost());

        Meal meal2 = mealBuilder.prepareVegMeal();
        meal2.showItems();
        System.out.printf("Total Amount: %f\n", meal2.getCost());
    }
}
