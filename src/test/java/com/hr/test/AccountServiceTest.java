package com.hr.test;

import com.hr.domain.Account;
import com.hr.service.IAccountService;
import com.hr.service.impl.AccountServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class AccountServiceTest {

    @Autowired
    private IAccountService accountService;

    @Test
    public void testFindAll() {
        List<Account> allAccount = accountService.findAllAccount();
        for (Account a : allAccount) {
            System.out.println(a);

        }
    }

    @Test
    public void testFindOne() {
        Account a = accountService.findAccountById(1);
        System.out.println(a);
    }

    @Test
    public void testSave() {
        Account account = new Account();
        account.setName("laohefsa");
        account.setMoney(999999f);
        accountService.saveAccount(account);

    }

    @Test
    public void testUpdate() {

    }

    @Test
    public void testDelete() {

    }
}
