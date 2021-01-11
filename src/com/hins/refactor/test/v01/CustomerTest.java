package com.hins.refactor.test.v01;

import com.hins.refactor.src.v01.Customer;
import com.hins.refactor.src.v01.Movie;
import com.hins.refactor.src.v01.Rental;
import junit.framework.TestCase;

public class CustomerTest extends TestCase {

    public void testStatement() {
        Customer customer = new Customer("John");
        String title = "Titanic";
        int priceCode = 2;
        int _daysRented = 7;
        Movie movie = new Movie(title, priceCode);
        Rental rental = new Rental(movie, _daysRented);
        customer.addRental(rental);
        String result = customer.statement();
        System.out.println(result);
    }
}
