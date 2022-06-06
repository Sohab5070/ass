package com.company;

import java.util.HashMap;

public class Main {

class ChangingSeasons {

    public static void main(final String[] args) {
        weather_forecast.Summer change = new weather_forecast.Summer();

        weather_forecast sunnyChange = new weather_forecast() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
        weather_forecast cloudyChange = new weather_forecast() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
        weather_forecast rainyChange = new weather_forecast() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
        weather_forecast fogChange = new weather_forecast() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };

        weather_forecast.Switch changed = new weather_forecast.Switch();
        changed.register("Солнечно", sunnyChange);
        changed.register("Облачно", cloudyChange);
        changed.register("Дождливо", rainyChange);
        changed.register("Туманно", fogChange);


}
}}
