package Weather;

public class OpenWeatherMap {
    public static void main(String[] args) {
        String month = "Sep";
        int day = 1;
        String city = "Kyiv";
        String country = "UA";
        int temp = 25;
        int feelike = 25;
        String weaowerview = "Overcast clouds. Light air.";
        double wind = 0.5;
        String windremiss = "ESE";
        int hpa = 1001;
        int humidity = 60;
        int uv = 2;
        int dewpoint = 16;
        double visibility = 10.0;
        System.out.println(
                "* * * * * * * * * * * * * * * * * * * * *\n"
                + "WEATHER FOR TODAY\n"
                + month + " " + day
                + "\n"
                + city + ", " + country + "\n"
                + "\u2601" + " " + temp + "°C" + "\n"
                + "Feels like " + feelike + "°C. " + weaowerview + "\n"
                + "Wind " + wind + "m/s " + windremiss + "\t\t Pressure " + hpa + "hPa\n"
                + "Humidity: " + humidity + "%" + "\t\t UV: " + uv + "\n"
                + "Dew point: " + dewpoint + "°C" + "\t\t Visibility: " + visibility + "km"

        );
        month = "Sep";
        day = 2;
        city = "Kyiv";
        country = "UA";
        temp = 18;
        feelike = 13;
        weaowerview = "Light rain. Gentle Breeze.";
        wind = 3.6;
        windremiss = "E";
        hpa = 1024;
        humidity = 29;
        uv = 4;
        dewpoint = 0;
        visibility = 6.0;
        System.out.println();
        System.out.println(
                "* * * * * * * * * * * * * * * * * * * * *\n"
                        + "WEATHER FOR TOMORROW\n"
                        + month + " " + day
                        + "\n"
                        + city + ", " + country + "\n"
                        + "\uD83C\uDF27" + " " + temp + "°C" + "\n"
                        + "Feels like " + feelike + "°C. " + weaowerview + "\n"
                        + "Wind " + wind + "m/s " + windremiss + "\t\t Pressure " + hpa + "hPa\n"
                        + "Humidity: " + humidity + "%" + "\t\t UV: " + uv + "\n"
                        + "Dew point: " + dewpoint + "°C" + "\t\t Visibility: " + visibility + "km"
        );
    }
}
