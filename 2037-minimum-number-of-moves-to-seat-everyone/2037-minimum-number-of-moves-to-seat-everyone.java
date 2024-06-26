class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int sumSeats = 0;
        int sumStudents=0;
        int result =0; 
        for(int k : seats){sumSeats +=k;}
        for(int k : students){sumStudents +=k;}
        int max = Math.max(sumSeats, sumStudents);
        int min = Math.min(sumSeats, sumStudents);
        result = max-min;
        return result;
    }
}