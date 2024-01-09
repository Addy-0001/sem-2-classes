/*
 * 
 * You are tasked with developing a music application that encompasses various audio features. 
 * Create an abstract class named AudioFeature with the following abstract methods. 
 *  * Method to calculate and return teh tempo of the audio. 
 *  * Method to calculate and return the frequency spectrum of the audio.
 *  * Method to caluculate and return the duration of the audio.
 * 
 * Implement the abstract class and provide concrete implementations for the abstract methods. 
 * Create subclasses for different audio types. Songs, Podcasts, Audiobooks
 * Each subclass should have specific implementations for calculating the tempo, frequency spectrum and duration of the audio.
 * Instanticate instances of each audio class and demonstracte how you can caluculate the tempo, frequency spectrum and duration of the audio. 
 */

public class Spotify {
    public static void main(String[] args) {
        Songs s1 = new Songs();
        s1.tempo();
        s1.frequencySpectrum();
        s1.duration();

        Podcasts p1 = new Podcasts();
        p1.tempo();
        p1.frequencySpectrum();
        p1.duration();

        Audiobooks a1 = new Audiobooks();
        a1.tempo();
        a1.frequencySpectrum();
        a1.duration();
    }
}

abstract class AudioFeature {

    abstract int tempo();

    abstract int frequencySpectrum();

    abstract int duration();
}

class Songs extends AudioFeature {
    @Override
    int tempo() {
        System.out.println("Tempo");
        return 0;
    }

    @Override
    int frequencySpectrum() {
        System.out.println("Frequency Spectrum");
        return 0;
    }

    @Override
    int duration() {
        System.out.println("Duration");
        return 0;
    }
}

class Podcasts extends AudioFeature {
    @Override
    int tempo() {
        System.out.println("Tempo");
        return 0;
    }

    @Override
    int frequencySpectrum() {
        System.out.println("Frequency Spectrum");
        return 0;
    }

    @Override
    int duration() {
        System.out.println("Duration");
        return 0;
    }
}

class Audiobooks extends AudioFeature {
    @Override
    int tempo() {
        System.out.println("Tempo");
        return 0;
    }

    @Override
    int frequencySpectrum() {
        System.out.println("Frequency Spectrum");
        return 0;
    }

    @Override
    int duration() {
        System.out.println("Duration");
        return 0;
    }
}
