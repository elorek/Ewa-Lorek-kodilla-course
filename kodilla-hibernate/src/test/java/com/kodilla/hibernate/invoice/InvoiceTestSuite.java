package com.kodilla.hibernate.invoice;


import com.kodilla.hibernate.invoice.dao.InvoiceDao;
import com.kodilla.hibernate.invoice.dao.ItemDao;
import com.kodilla.hibernate.invoice.dao.ProductDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;

@SpringBootTest
@RunWith(SpringRunner.class)
@Transactional
public class InvoiceTestSuite {
    @Autowired
    private ProductDao productDao;
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ItemDao itemDao;

    @Test
    public void testSaveInvoice() {
        //Given
        Product p1 = new Product("iron");
        Invoice i1 = new Invoice("fv123");
        Item item1 = new Item(1, p1, new BigDecimal("100"), new BigDecimal("100"));
        p1.getItems().add(item1);
        i1.getItems().add(item1);
        item1.setInvoice(i1);
        //When
        productDao.save(p1);
        invoiceDao.save(i1);
        itemDao.save(item1);
        //Then
        Assert.assertTrue(i1.getId() > 0);
    }
}