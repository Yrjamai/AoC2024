import java.util.Collections;
import java.util.List;

public class Distance {
    private final List<Integer> leftNumbers;
    private final List<Integer> rightNumbers;

    public Distance(List<Integer> leftNumbers, List<Integer> rightNumbers) {
        this.leftNumbers = leftNumbers;
        this.rightNumbers = rightNumbers;
    }

    public int calculateTotalDistance() {
        int totalDistance = 0;
        Collections.sort(this.leftNumbers);
        Collections.sort(this.rightNumbers);

        for(int i = 0; i < this.leftNumbers.size(); ++i) {
            totalDistance += Math.abs((Integer)this.leftNumbers.get(i) - (Integer)this.rightNumbers.get(i));
        }

        return totalDistance;
    }
}