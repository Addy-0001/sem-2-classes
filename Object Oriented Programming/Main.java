import java.util.*;

public class Main {
    public static void main(String[] args) {
        int size = 3;
        Movie[] movies = new Movie[size];
        for (int i = 0; i < size; i++) {
            var scanner = new Scanner(System.in);
            movies[i].movieTitle = scanner.nextLine();
            movies[i].director = scanner.nextLine();
            movies[i].rating = scanner.nextInt();
            scanner.close();
        }
        int maxRatingMovie = movies[0].getRating();
        for (int i = 1; i < size; i++) {
            if (maxRatingMovie < movies[i].getRating()) {
                maxRatingMovie = movies[i].getRating();
            }
            System.out.println("Max is" + maxRatingMovie);
            System.out.println("Max Rating movie title" + maxRatingMovie);
            System.out.println("Max Rating movie director" + maxRatingMovie);
        }
    }

}

class Movie {
    public String movieTitle, director;
    public int rating;

    public Movie(String moviesTitle, String director, int rating) {
        this.movieTitle = moviesTitle;
        this.rating = rating;
        this.director = director;
    }

    public String getMovieTitle() {
        return this.movieTitle;
    }

    public String getdirector() {
        return this.director;
    }

    public int getRating() {
        return this.rating;
    }
}