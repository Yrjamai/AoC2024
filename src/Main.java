import java.io.IOException;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws IOException {
        String filePath = "C:\\MAU\\Advent of Code\\day1\\input";
        CreateLists numberLists = new CreateLists(filePath);
        List<Integer> leftNumbers = numberLists.getLeftNumbers();
        List<Integer> rightNumbers = numberLists.getRightNumbers();
        Distance distance = new Distance(leftNumbers, rightNumbers);
        int totalDistance = distance.calculateTotalDistance();
        System.out.println(totalDistance);
        Similarities similarities = new Similarities(leftNumbers, rightNumbers);
        int totalSimilarities = similarities.calculateTotalSimilarities();
        System.out.println(totalSimilarities);
    }
}