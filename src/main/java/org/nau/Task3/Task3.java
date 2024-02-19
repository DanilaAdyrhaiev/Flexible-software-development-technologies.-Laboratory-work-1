package org.nau.Task3;

public class Task3 {


    public static void main(String[] args) {
        // Sample data array (replace it with your actual data)
        String[][] data = {
                {"Name", "Age", "City", "Country", "Occupation"},
                {"John Doe", "30", "New York", "USA", "Engineer"},
                {"Jane Smith", "25", "London", "UK", "Doctor"},
                {"Michael Johnson", "40", "Los Angeles", "USA", "Teacher"},
                {"Name", "Age", "City", "Country", "Occupation"},
                {"John Doe", "30", "New York", "USA", "Engineer"},
                {"Jane Smith", "25", "London", "UK", "Doctor"},
                {"Michael Johnson", "40", "Los Angeles", "USA", "Teacher"}
                // Add more rows as needed
        };

        // Find the length of the longest element in the array
        int maxElementLength = findLongestElementLength(data);

        // Print the table
        printTable(data, maxElementLength);
    }

    // Function to find the length of the longest element in the array
    private static int findLongestElementLength(String[][] data) {
        int maxLength = 0;
        for (String[] row : data) {
            for (String element : row) {
                int length = element.length();
                if (length > maxLength) {
                    maxLength = length;
                }
            }
        }
        return maxLength;
    }

    // Function to print the table
    private static void printTable(String[][] data, int maxElementLength) {
        // Calculate column width with padding
        int columnWidth = maxElementLength + 6;

        // Print table header
        printHorizontalLine(columnWidth * data[0].length + data[0].length + 1);
        for (String[] row : data) {
            System.out.print("|");
            for (String element : row) {
                System.out.printf(" %-" + columnWidth + "s|", element);
            }
            System.out.println();
            printHorizontalLine(columnWidth * data[0].length + data[0].length + 1);
        }
    }

    // Function to print a horizontal line
    private static void printHorizontalLine(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("—");
        }
        System.out.println();
    }
}
