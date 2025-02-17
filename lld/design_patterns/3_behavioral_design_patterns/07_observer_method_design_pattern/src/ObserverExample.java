public class ObserverExample {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer phoneDisplay = new PhoneDisplay();
        Observer tvDisplay = new TVDisplay();

        weatherStation.addObservers(phoneDisplay);
        weatherStation.addObservers(tvDisplay);

        weatherStation.setWeather("Sunny");

        weatherStation.removeObservers(tvDisplay);

        weatherStation.setWeather("Cloudy");
    }
}