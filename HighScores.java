import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class HighScores {
    private List<Integer> highScores = new ArrayList<>();;
    Random random = new Random();
    
    public HighScores(List<Integer> highScores) {
        this.highScores= highScores;
    }

    List<Integer> scores() {
        return this.highScores;
    }

    Integer latest() {
        if (highScores.isEmpty()) {
            throw new IllegalStateException("Welcome you are the first one to Play");
        }
        return highScores.get(highScores.size() - 1);
    }

    Integer personalBest() {
        if (highScores.isEmpty()) {
            throw new IllegalStateException("No Personal score found");
        }
        return Collections.max(this.highScores);
    }

    List<Integer> personalTopThree() {
        /*
         * Here, a new ArrayList named sortedScores is created, and it is initialized with the elements
         * from the existing list highScores. This is done to create a separate copy of the original list,
         * preventing any modification to the original list during the sorting process.
         */
        List<Integer> sortedScores = new ArrayList<>(highScores);


        /*
         * The sort method is called on sortedScores to sort the list in descending order. Collections.reverseOrder() returns
         * a comparator that imposes the reverse of the natural ordering, effectively sorting the list in descending order.
         */
        sortedScores.sort(Collections.reverseOrder());


        /*
         * Finally, the subList method is used to obtain a sublist of the first three elements from the sorted
         * list. However, to handle cases where the list may have fewer than three elements, Integer.min(sortedScores.size(), 3)
         * is used to ensure that only the existing number of elements or a maximum of three elements are considered.
         */
        return sortedScores.subList(0, Integer.min(sortedScores.size(), 3));
    }

}