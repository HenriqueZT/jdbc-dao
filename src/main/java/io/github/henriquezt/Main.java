package io.github.henriquezt;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        IO.println("=== Test 1: seller findById ===");
        Seller seller = sellerDao.findById(3);
        IO.println(seller);

        IO.println("=== Test 2: seller findByDepartment ===");
        Department dep = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(dep);
        for (Seller obj : list) {
            IO.println(obj);
        }

        IO.println("=== Test 3: seller findAll ===");
        list = sellerDao.findAll();
        for (Seller obj : list) {
            IO.println(obj);
        }
    }
}
