
// Kai D. Gonzalez
// 2/3/2026
// Exercise 2: LinkedHashMap Weather Forecast
void main() {
    LinkedHashMap <Integer, Double> highTempsNextDays = new LinkedHashMap<>();

    String[] dayMap = {
            "Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"
    };

    highTempsNextDays.put(45, 0.95);
    highTempsNextDays.put(29, 0.60);
    highTempsNextDays.put(10, 0.25);
    highTempsNextDays.put(22, 0.05);
    highTempsNextDays.put(41, 0.0);
    highTempsNextDays.put(28, 0.75);
    highTempsNextDays.put(33, 0.90);

    int dayCounter = 0;
    for (Map.Entry<Integer, Double> entry : highTempsNextDays.entrySet()) {
        if (entry.getKey() <= 32 && entry.getValue() > 0.50) {
            System.out.println("Day " + dayMap[dayCounter] + " temp: " + entry.getKey() + ", precip: " + entry.getValue() * 100 + "%");
        }

        dayCounter++;
    }
}