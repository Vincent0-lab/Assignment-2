# Assignment-2
My OOP ASSIGNMENT WEEK TWO 
public class VacationCost {
    // Calculate the total cost of a vacation package
    public static double calculateTotalCost(double accommodationCost, double mealCost, double activityCost) {
        return accommodationCost + mealCost + activityCost;
    }

    public static void main(String[] args) {
        // Sample data
        double accommodation = 1200.50;
        double meals = 350.75;
        double activities = 200.00;

        double total = calculateTotalCost(accommodation, meals, activities);
        System.out.printf("Vacation summary:%n Accommodation: $%.2f%n Meals: $%.2f%n Activities: $%.2f%n",
                accommodation, meals, activities);
        System.out.printf("Total vacation cost: $%.2f%n", total);
    }
}
