/**
 * Created by Ilnur Mamedbakov on 03.02.2018.
 * Class Book inherited from class Material
 * And its a properties of book:
 *publisher
 *year
 *edition
 * with setters and getters
 */
public class Book extends Material {
    private String publisher;
    private int year;
    private int edition;

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getEdition() {
        return edition;
    }
    public void setEdition(int edition) {
        this.edition = edition;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
