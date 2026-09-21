package io.github.henriquezt;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        IO.println("=== Test 1: seller findById ===");
        Seller seller = sellerDao.findById(3);

        IO.println(seller);
    }
}
