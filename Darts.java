class Darts {
    
    int score(double xOfDart, double yOfDart) {
        double DistFromCenter = Math.sqrt(xOfDart * xOfDart + yOfDart * yOfDart);

        if (DistFromCenter > 10) {
            // Dart lands outside the target
            return 0;
        } else if (DistFromCenter > 5) {
            // Dart lands in the outer circle
            return 1;
        } else if (DistFromCenter > 1) {
            // Dart lands in the middle circle
            return 5;
        } else {
            // Dart lands in the inner circle
            return 10;
        }
    }
    
    public static void main(String[] args) {
        Darts darts = new Darts();
        System.out.println(darts.score(0, 10));
    }
}

/*
 * If the dart lands outside the target, player earns no points (0 points).
--->If the dart lands in the outer circle of the target, player earns -----1 point.
--->If the dart lands in the middle circle of the target, player earns -----5 points.
--->If the dart lands in the inner circle of the target, player earns -----10 points.
--->The outer circle has a radius of -----10 units (this is equivalent to the total radius for the entire target),
--->the middle circle a radius of -----5 units, and
--->the inner circle a radius of ----1. Of course,
they are all centered at the same
point — that is, the circles are concentric defined by the coordinates (0, 0).

Write a function that given a point in the target (defined by its Cartesian coordinates x and y, where x and y are real),
returns the correct amount earned by a dart landing at that point.
 */