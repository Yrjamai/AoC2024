import day2.ReportCheck;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
        // Day 1

        String filePath = "C:\\MAU\\Advent of Code\\day1\\input";
        day1.CreateLists numberLists = new day1.CreateLists(filePath);
        List<Integer> leftNumbers = numberLists.getLeftNumbers();
        List<Integer> rightNumbers = numberLists.getRightNumbers();
        day1.Distance distance = new day1.Distance(leftNumbers, rightNumbers);
        int totalDistance = distance.calculateTotalDistance();
        System.out.println(totalDistance);
        day1.Similarities similarities = new day1.Similarities(leftNumbers, rightNumbers);
        int totalSimilarities = similarities.calculateTotalSimilarities();
        System.out.println(totalSimilarities);
         */

        // Day 2

        ReportCheck reportCheck = new ReportCheck("reports");
        System.out.println(reportCheck.getNbrOfSafeReports());
    }
}