package io.github.henriquezt;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        IO.println("\n=== Test 1: seller findById ===");
        Seller seller = sellerDao.findById(3);
        IO.println(seller);

        IO.println("\n=== Test 2: seller findByDepartment ===");
        Department dep = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(dep);
        for (Seller obj : list) {
            IO.println(obj);
        }

        IO.println("\n=== Test 3: seller findAll ===");
        list = sellerDao.findAll();
        for (Seller obj : list) {
            IO.println(obj);
        }

        IO.println("\n=== Test 4: seller insert ===");
        Seller newSeller = new Seller(null, "Grog", "greg@gmail.com", new Date(), 4000.0, dep);
        sellerDao.insert(newSeller);
        IO.println("inserted! New id = " + newSeller.getId());

        IO.println("\n=== Test 5: seller update ===");
        seller = sellerDao.findById(1);
        seller.setName("Martha Wayne");
        sellerDao.update(seller);
        IO.println("Update completed!");
    }
}
