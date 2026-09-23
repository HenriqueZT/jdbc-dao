package io.github.henriquezt;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DepartmentDao depDao = DaoFactory.createDepartmentDao();

        IO.println("\n=== Test 1: Department findById ===");
        Department dep = depDao.findById(3);
        IO.println(dep);

    }
}
