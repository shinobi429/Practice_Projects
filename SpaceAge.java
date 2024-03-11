class SpaceAge {

    private double seconds;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return seconds;
    }

    double onEarth() {
        return seconds / 31557600 ;
    }

    double onMercury() {
        return onEarth() / 0.2408467 ;
    }

    double onVenus() {
        return onEarth() / 0.61519726 ;
    }

    double onMars() {
        return onEarth() / 1.8808158 ;
    }

    double onJupiter() {
        return onEarth() / 11.862615 ;
    }

    double onSaturn() {
        return onEarth() / 29.447498 ;
    }

    double onUranus() {
        return onEarth() / 84.016846 ;
    }

    double onNeptune() {
        return onEarth() / 164.79132 ;
    }

}

/*
 * Instructions
Given an age in seconds, calculate how old someone would be on:

Mercury: orbital period 0.2408467 Earth years
Venus: orbital period 0.61519726 Earth years
Earth: orbital period 1.0 Earth years, 365.25 Earth days, or 31557600 seconds
Mars: orbital period 1.8808158 Earth years
Jupiter: orbital period 11.862615 Earth years
Saturn: orbital period 29.447498 Earth years
Uranus: orbital period 84.016846 Earth years
Neptune: orbital period 164.79132 Earth years
So if you were told someone were 1,000,000,000 seconds old, you should be able to say that they're 31.69 Earth-years old.

If you're wondering why Pluto didn't make the cut, go watch this YouTube video.

Note: The actual length of one complete orbit of the Earth around the sun is closer to 365.256 days (1 sidereal year).
The Gregorian calendar has, on average, 365.2425 days. While not entirely accurate, 365.25 is the value used in this
exercise. See Year on Wikipedia for more ways to measure a year.
 */