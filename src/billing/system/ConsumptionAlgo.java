package billing.system;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConsumptionAlgo {

    public static List<Rate> getRateList() {
        Rate rate = new Rate(1, "home", 4, 0, 100);
        Rate rate1 = new Rate(2, "home", 6, 100, 300);
        Rate rate2 = new Rate(3, "home", 10, 300, 500);
        Rate rate3 = new Rate(4, "home", 15, 500, 0);

        return Arrays.asList(rate, rate3, rate2, rate1);
    }


//    public List<Map<String, Object>> getAllElectricityBills() {
//        // Example list of maps representing electricity bills
//        List<Map<String, Object>> electricityBills = Arrays.asList(
//                Map.of("billId", 1L, "unit", 50),
//                Map.of("billId", 2L, "unit", 150),
//                Map.of("billId", 3L, "unit", 280),
//                Map.of("billId", 4L, "unit", 400)
//        );
//
//        // Calculate consumption level using Stream API
//        List<Map<String, Object>> billsWithConsumptionLevel = electricityBills.stream()
//                .map(bill -> {
//                    int unit = (int) bill.get("unit");
//                    String consumptionLevel;
//                    if (unit >= 0 && unit <= 100) {
//                        consumptionLevel = "Low consumption";
//                    } else if (unit > 100 && unit <= 300) {
//                        consumptionLevel = "Medium consumption";
//                    } else if (unit > 300) {
//                        consumptionLevel = "High consumption";
//                    } else {
//                        consumptionLevel = "Unknown"; // Handle unexpected values
//                    }
//                    // Create a new map with added consumption level
//                    return Map.of(
//                            "billId", bill.get("billId"),
//                            "unit", unit,
//                            "consumptionLevel", consumptionLevel
//                    );
//                })
//                .collect(Collectors.toList());
//
//        // Create ResponseEntity with JSON data and HttpStatus.OK
//        return billsWithConsumptionLevel;
//
//    }


    public static void main(String[] args) {

    }
}
