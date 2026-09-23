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

        IO.println("\n=== Test 1: department findById ===");
        Department dep = depDao.findById(3);
        IO.println(dep);

        IO.println("\n=== Test 2: department findAll ===");
        List<Department> list;
        list = depDao.findAll();
        for (Department obj : list) {
            IO.println(obj);
        }

        IO.println("\n=== Test 3: department insert ===");
        Department newDep = new Department(null, "Backstage");
        depDao.insert(newDep);
        IO.println("inserted! New id = " + newDep.getId());

        IO.println("\n=== Test 4: department update ===");
        dep = depDao.findById(7);
        dep.setName("Tiktok");
        depDao.update(dep);
        IO.println("Update completed!");

        IO.println("\n=== Test 5: department delete ===");
        IO.println("Enter id for delete test: ");
        int id = sc.nextInt();
        depDao.deleteById(id);
        IO.println("Delete completed");

        sc.close();
    }
}
