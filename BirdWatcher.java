//Exercise for Arrays
/*      type[] variableName = new type[size];
 
 * Declare array with explicit size (size is 2)
        twoInts = new int[2];
 
 * Two equivalent ways to declare and initialize an array (size is 3)
        int[] threeIntsV1 = new int[] { 4, 9, 7 };
        int[] threeIntsV2 = { 4, 9, 7 };

 * Assign second element by index
        twoInts[1] = 8;

 * Retrieve the second element by index and assign to the int element
        int secondElement = twoInts[1];

 * Java also supports multi-dimensional arrays like int[][] arr = new int[3][4];

 * you can iterate over all its values using a for-each loop
    char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

    for(char vowel: vowels) {
        // Output the vowel
        System.out.print(vowel);
    }
    // => aeiou   
    
 * If you want more control over which values to iterate over, a for loop can be used:
    char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

    for (int i = 0; i < 3; i++) {
        // Output the vowel
        System.out.print(vowels[i]);
    }
   // => aei 

 */

public class BirdWatcher {
    private int[] birdsPerDay;
    // private int[] lastWeeksBirdsCount = new int[]   { 2, 5, 0, 7, 4, 1 };

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay;
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        if(birdsPerDay.length==0)
        return 0;
        return birdsPerDay[(birdsPerDay.length)-1];        
    }

    public int incrementTodaysCount() {
        return birdsPerDay[(birdsPerDay.length)-1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for(int dayCount : birdsPerDay){
            if(dayCount == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        int endOfCount = birdsPerDay.length;
        if(numberOfDays < birdsPerDay.length) endOfCount = numberOfDays;
        
        for(int i= 0; i < endOfCount; i++){
                sum += birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int busyDayCount=0;
        for(int dayCount : birdsPerDay){
            if(dayCount>=5) busyDayCount++;
        }
        return busyDayCount;
    }
}