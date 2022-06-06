package com.company;

import java.util.HashMap;

public interface weather_forecast {
    static void changed() {}

    class Switch {
        private final HashMap<String, weather_forecast> SeasonCalendar = new HashMap<>();

        public void register(String SeasonName, weather_forecast season) {
            SeasonCalendar.put(SeasonName, season);
        }

        public void changed (String Name) {
            weather_forecast season = SeasonCalendar.get(Name);
            if (season == null) {
                throw new IllegalStateException("Название " + Name);
            }
            weather_forecast.changed();
        }}

    class Summer {
        public static void sunny() {
            System.out.println("Солнечная погода");
        }
        public static void cloudy () {
            System.out.println("Тучки появились");
        }
        public static void rainy () {
            System.out.println("Прошел дождик");

        }
        public static void fog () {
            System.out.println("Лег туман");}
    }

   class sunnyChange implements weather_forecast {
        public final Summer spring;

        sunnyChange(Summer spring) {
            this.spring = spring;
        }

        public static void changed() {
            Summer.sunny();
        }}

    class cloudyChange implements weather_forecast {
        public final Summer summer;

        cloudyChange(Summer summer) {
            this.summer = summer;
        }

        public static void changed() {
            Summer.cloudy();
        }
    }

    class rainyChange implements weather_forecast {
        public final Summer a;

        rainyChange(Summer a) {
            this.a = a;
        }

        public static void changed() {
            Summer.rainy();
        }
    }

    class fogChange implements weather_forecast {
        public final Summer y;

        fogChange(Summer y) {
            this.y = y;
        }

        public static void changed() {
            Summer.fog();
        }}


    class ChangingSeasons {
        public static void main(final String[] args) {
            Summer change = new Summer();

            weather_forecast sunnyChange = new sunnyChange(change);
            weather_forecast cloudyChange = new cloudyChange(change);
            weather_forecast rainyChange = new rainyChange(change);
            weather_forecast fogChange = new fogChange(change);

            Switch changed = new Switch();
            changed.register("Солнечно", sunnyChange);
            changed.register("Облочно", cloudyChange);
            changed.register("Дождливо", rainyChange);
            changed.register("Туманно", fogChange);

            changed.changed("Лето");
            changed.changed("Лето");
            changed.changed("Лето");
            changed.changed("Лето");
        }
    }
}
