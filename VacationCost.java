public class VacationCost {

    public static double calculateTotalCost(double accommodationCost, double mealCost, double activityCost) {
        return accommodationCost + mealCost + activityCost;
    }

    public static void main(String[] args) {
        double accommodation = 850.50;
        double meals = 300.25;
        double activities = 300.00;

        double total = calculateTotalCost(accommodation, meals, activities);

        System.out.println("Total Vacation Cost: $" + total);
    }
}