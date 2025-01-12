package day2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReportCheck {
    int nbrOfSafeReports = 0;

    public ReportCheck(String filePath) throws IOException {
        this.readFile(filePath);
    }

    private void readFile(String filePath) throws IOException {
        File report = new File(filePath);
        BufferedReader br = new BufferedReader(new FileReader(report));

        String line;
        try {
            while ((line = br.readLine()) != null) {
                String[] levels = line.split("\\s+");

                List<Integer> levelList = new ArrayList<>();
                for (String level : levels) {
                    levelList.add(Integer.parseInt(level));
                }

                checkReportSafety(levelList);

                levelList.clear();
            }
        } finally {
            br.close();
        }
    }

    private void checkReportSafety(List<Integer> levels) {
        boolean isSafe = true;
        boolean isIncreasing = levels.get(0) < levels.get(1);

        for (int i = 0; i < levels.size() - 1; i++) {
            int diff = levels.get(i + 1) - levels.get(i);

            if (Math.abs(diff) < 1 || Math.abs(diff) > 3) {
                isSafe = false;
                break;
            }

            if ((isIncreasing && diff <= 0) || (!isIncreasing && diff >= 0)) {
                isSafe = false;
                break;
            }
        }

        if (isSafe) {
            nbrOfSafeReports++;
        }
    }

    public int getNbrOfSafeReports() {
        return nbrOfSafeReports;
    }
}
