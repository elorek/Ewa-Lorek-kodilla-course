//package com.kodilla.hibernate.manytomany.facade;
//
//import com.kodilla.hibernate.manytomany.Company;
//import com.kodilla.hibernate.manytomany.Employee;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import javax.persistence.NamedNativeQuery;
//import javax.persistence.NamedQuery;
//
//@Service
//@NamedNativeQuery(
//        name = "Company.searchByCompanyName",
//        query = "SELECT * FROM Companies WHERE name LIKE '%Sa%'")
//@NamedQuery(
//        name = "Employee.searchByLastname",
//        query = "FROM Employee WHERE lastname LIKE '%Sm%'")
//
//
//public final class CompanyFacade {
//    @Autowired
//    private Company company;
//
//    @Autowired
//    private Employee employee;
//
//    public void searchByCompanyName() {
//        company.getName().contains("nnn");
//    }
//
//    public void searchByEmployeeName() {
//
//    }
//}
