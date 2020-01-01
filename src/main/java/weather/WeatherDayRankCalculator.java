package weather;

public class WeatherDayRankCalculator implements RankCalculator {
    public int calculateRank(Weather weather) {
        return 1000 - (weather.windSpeed + (20 - weather.temperature));
    }
}
