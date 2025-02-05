import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Metric Converter!");
        System.out.println("Please input your query. For example, '1 km = mile'.");
        System.out.println("Enter 'exit' or '-1' to exit the program.");
        
        while (true) {
            System.out.print("Enter conversion query: ");
            String input = scanner.nextLine().trim().toLowerCase();
            
            if (input.equals("exit") || input.equals("-1")) {
                System.out.println("Exiting the program. Thank you for using Metric Converter!");
                break;
            }
            
            String[] parts = input.split(" ");
            if (parts.length != 4 || !parts[2].equals("=")) {
                System.out.println("Invalid format. Please use the format: '1 km = mile'");
                continue;
            }
            
            try {
                double value = Double.parseDouble(parts[0]);
                String fromUnit = parts[1];
                String toUnit = parts[3];
                
                double result = convert(value, fromUnit, toUnit);
                if (result != -1) {
                    System.out.printf("%.2f %s = %.2f %s%n", value, fromUnit, result, toUnit);
                } else {
                    System.out.println("Conversion not supported. Please try another query.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format. Please enter a valid number.");
            }
        }
        
        scanner.close();
    }
    
    public static double convert(double value, String fromUnit, String toUnit) {
        switch (fromUnit) {
            case "kg":
                if (toUnit.equals("lb")) return value * 2.20462;
                break;
            case "g":
                if (toUnit.equals("oz")) return value * 0.035274;
                break;
            case "km":
                if (toUnit.equals("mile")) return value * 0.621371;
                break;
            case "mm":
                if (toUnit.equals("inch")) return value * 0.0393701;
                break;
        }
        return -1; // Return -1 if conversion is not supported
    }
}
