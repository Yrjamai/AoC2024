package day1;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Similarities {
    private final List<Integer> leftNumbers;
    private final List<Integer> rightNumbers;

    public Similarities(List<Integer> leftNumbers, List<Integer> rightNumbers) {
        this.leftNumbers = leftNumbers;
        this.rightNumbers = rightNumbers;
    }

    public int calculateTotalSimilarities() {
        int totalSimilarities = 0;
        int nbrOfOccurences = 0;

        for(Iterator var3 = this.leftNumbers.iterator(); var3.hasNext(); nbrOfOccurences = 0) {
            Integer leftNumber = (Integer)var3.next();
            Iterator var5 = this.rightNumbers.iterator();

            while(var5.hasNext()) {
                Integer rightNumber = (Integer)var5.next();
                if (Objects.equals(leftNumber, rightNumber)) {
                    ++nbrOfOccurences;
                }
            }

            totalSimilarities += nbrOfOccurences * leftNumber;
        }

        return totalSimilarities;
    }
}