class Solution {
    public double angleClock(int hour, int minutes) {
        double difference = 0.0;
        double minHand=((double)minutes/60.0)*360.0;
        double hrHand=(((double)hour/12.0)*360.0)+(minHand/12);
        difference = Math.abs(hrHand-minHand);
        return Math.min(difference,360-difference);
    }
}