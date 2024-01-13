import java.util.Scanner;

class Movie {
    private String movieTitle;
    private String director;
    private double rating;

    // Constructor
    public Movie(String movieTitle, String director, double rating) {
        this.movieTitle = movieTitle;
        this.director = director;
        this.rating = rating;
    }

    // Getter methods
    public String getMovieTitle() {
        return movieTitle;
    }

    public String getDirector() {
        return director;
    }

    public double getRating() {
        return rating;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Number of movies
        System.out.print("Enter the number of movies: ");
        int numMovies = scanner.nextInt();

        // Create an array of Movie objects
        Movie[] movies = new Movie[numMovies];

        // Input details for each movie
        for (int i = 0; i < numMovies; i++) {
            System.out.println("\nEnter details for Movie " + (i + 1) + ":");
            scanner.nextLine(); // Consume the newline character
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Director: ");
            String director = scanner.nextLine();
            System.out.print("Rating: ");
            double rating = scanner.nextDouble();

            // Create Movie object and add it to the array
            movies[i] = new Movie(title, director, rating);
        }

        // Find the movie with the highest rating
        Movie highestRatedMovie = findHighestRatedMovie(movies);

        // Display details of the movie with the highest rating
        if (highestRatedMovie != null) {
            System.out.println("\nMovie with the highest rating:");
            System.out.println("Title: " + highestRatedMovie.getMovieTitle());
            System.out.println("Director: " + highestRatedMovie.getDirector());
            System.out.println("Rating: " + highestRatedMovie.getRating());
        } else {
            System.out.println("\nNo movies entered.");
        }

        scanner.close();
    }

    // Method to find the movie with the highest rating
    private static Movie findHighestRatedMovie(Movie[] movies) {
        if (movies.length == 0) {
            return null;
        }

        Movie highestRatedMovie = movies[0];

        for (int i = 1; i < movies.length; i++) {
            if (movies[i].getRating() > highestRatedMovie.getRating()) {
                highestRatedMovie = movies[i];
            }
        }

        return highestRatedMovie;
    }
}
