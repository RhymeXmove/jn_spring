package org.JdbcTemp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public void addMoney(String username, Integer money) {
        jdbcTemplate.update("update account set money=money-? where username=?", money, username);
    }

   public void minMoney(String username, Integer money) {
jdbcTemplate.update("update account set money=money+? where username=?", money, username);
   }
}
