package weather;

public class EarthWeatherValidator implements WeatherValidator {
    @Override
    public boolean isValid(Weather weather) {
        if (isWindValid(weather.getWindSpeed()) && isTemperatureValid(weather.getTemperature()) && isPressureValid(weather.getPressure())) {
            return true;}
    else {
                return false;
            }
    }
    private boolean isPressureValid(int pressure) {
     if (pressure > 700  && pressure < 800){
         return true;
     }else{
         return false;
     }
    }
    private boolean isTemperatureValid(int temperature) {
        if (temperature > -273){
            return true;
        }else {
            return false;
        }
    }

    private boolean isWindValid(int windSpeed) {
        if (windSpeed > 0 && windSpeed < 100) {
            return true;}
    else {
                return false;
            }
    }
}