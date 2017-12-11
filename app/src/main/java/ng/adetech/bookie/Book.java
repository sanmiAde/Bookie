package ng.adetech.bookie;

/**
 * Created by HP DV6 on 11/12/2017.
 */

public class Book {

    /**
     * The title of the book.

     */
    private String mTitle;
    /**
     * The author of the book.
     */
    private String mAuthor;
    /**
     * The date book was published.
     */
    private String mPub_date;
    /**
     * Website url of the book.
     */
    private String mURl;


    public Book(String title, String author, String pub_date, String URl) {
        mTitle = title;
        mAuthor = author;
        mPub_date = pub_date;
        mURl = URl;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public void setAuthor(String author) {
        mAuthor = author;
    }

    public String getPub_date() {
        return mPub_date;
    }

    public void setPub_date(String pub_date) {
        mPub_date = pub_date;
    }

    public String getURl() {
        return mURl;
    }

    public void setURl(String URl) {
        mURl = URl;
    }
}
