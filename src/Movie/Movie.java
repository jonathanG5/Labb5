package Movie;


/**
 * Movie representerar en film med titel och betyg.
 *
 */
public class Movie {
    private String title;
    private int rating;

    /**
     * Skapar ett nytt Movie-objekt.
     *
     * @param title filmens titel
     * @param rating filmens betyg (1–5)
     */
    public Movie(String title, int rating) {
        this.title = title;
        this.rating = rating;
    }

    /**
     * * Returnerar filmens titel.
     *
     * @return titel som String
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returnerar filmens betyg.
     *
     * @return betyg som heltal
     */
    public int getRating() {
        return rating;
    }

    /**
     * Returnerar en textrepresentation av filmen och filmens betyg.
     * Används när Movie objekt skrivs ut.
     * @return filmens titel och betyg som text
     */
    @Override
    public String toString(){
        return "Title: " + title + " Rating: " + rating + "/5 ";
    }

}
