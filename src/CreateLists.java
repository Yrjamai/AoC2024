import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreateLists {
    private final List<Integer> leftNumbers = new ArrayList();
    private final List<Integer> rightNumbers = new ArrayList();

    public CreateLists(String filePath) throws IOException {
        this.readFile(filePath);
    }

    private void readFile(String filePath) throws IOException {
        File input = new File(filePath);
        BufferedReader br = new BufferedReader(new FileReader(input));

        String line;
        try {
            while((line = br.readLine()) != null) {
                String[] numbers = line.split("\\s+");
                if (numbers.length == 2) {
                    try {
                        this.leftNumbers.add(Integer.parseInt(numbers[0]));
                        this.rightNumbers.add(Integer.parseInt(numbers[1]));
                    } catch (NumberFormatException var8) {
                        System.out.println("Invalid input");
                    }
                }
            }
        } catch (Throwable var9) {
            try {
                br.close();
            } catch (Throwable var7) {
                var9.addSuppressed(var7);
            }

            throw var9;
        }

        br.close();
    }

    public List<Integer> getLeftNumbers() {
        return this.leftNumbers;
    }

    public List<Integer> getRightNumbers() {
        return this.rightNumbers;
    }
}