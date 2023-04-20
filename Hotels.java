package Hotel;

public class Hotels {
    private String name;
    private int rating;
    private int RegularRatesforweekDays;
    private int RegularRatesforweekEndDays;
    private int rewardedRatesforWeek;

    private int rewardedRatesforWeekEnd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getRegularRatesforweekDays() {
        return RegularRatesforweekDays;
    }

    public void setRegularRatesforweekDays(int regularRatesforweekDays) {
        RegularRatesforweekDays = regularRatesforweekDays;
    }

    public int getRegularRatesforweekEndDays() {
        return RegularRatesforweekEndDays;
    }

    public void setRegularRatesforweekEndDays(int regularRatesforweekEndDays) {
        RegularRatesforweekEndDays = regularRatesforweekEndDays;
    }

    public int getRewardedRatesforWeek() {
        return rewardedRatesforWeek;
    }

    public void setRewardedRatesforWeek(int rewardedRatesforWeek) {
        this.rewardedRatesforWeek = rewardedRatesforWeek;
    }

    public int getRewardedRatesforWeekEnd() {
        return rewardedRatesforWeekEnd;
    }

    public void setRewardedRatesforWeekEnd(int rewardedRatesforWeekEnd) {
        this.rewardedRatesforWeekEnd = rewardedRatesforWeekEnd;
    }

    public Hotels() {
    }

    public Hotels(String name, int rating, int regularRatesforweekDays, int regularRatesforweekEndDays, int rewardedRatesforWeek, int rewardedRatesforWeekEnd) {
        this.name = name;
        this.rating = rating;
        RegularRatesforweekDays = regularRatesforweekDays;
        RegularRatesforweekEndDays = regularRatesforweekEndDays;
        this.rewardedRatesforWeek = rewardedRatesforWeek;
        this.rewardedRatesforWeekEnd = rewardedRatesforWeekEnd;
    }
}
