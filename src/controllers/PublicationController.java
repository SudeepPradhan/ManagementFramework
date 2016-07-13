package controllers;

import java.util.List;
import businessmodels.Owner;
import decorators.ProductDecorator;

public interface PublicationController {

    /**
     * Searches book with ISBN.
     *
     * @param id the ISBN number.
     * @return the {@link Book}.
     */
    ProductDecorator searchProductWithId(String id);

    /**
     * Searches Books with title.
     *
     * @param title the title or part of the title.
     * @return list of books containing the specified title.
     */
    List<ProductDecorator> searchProductWithTitle(String title);

    /**
     * Adds new book.
     *
     * @param isbn the ISBN.
     * @param title the title of the book.
     * @param dailyRate the daily rate.
     * @param dailyFine the daily fine.
     * @param borrowDuration the duration of borrowing.
     * @param authors the list of {@link Owner}s.
     * @return the added {@link Book} if the operation succeeds, false
     * otherwise.
     */
    ProductDecorator addProduct(String isbn, String title, double dailyRate, double dailyFine, int borrowDuration, List<Owner> authors);

    public List<ProductDecorator> getProducts();

    /**
     * @param isbn the ISBN. book
     * @param title the title of book
     * @param borrowDuration
     * @param authors
     * @return
     */
    boolean updateProduct(String id, String title, int borrowDuration, List<Owner> authors);

    /**
     * Adds copies to a book.
     *
     * @param isbn the ISBN.
     * @param numberOfCopies the number of copies to add.
     * @return true if the operation succeeds, false otherwise.
     */
    boolean addCopies(String isbn, int numberOfCopies);
}
