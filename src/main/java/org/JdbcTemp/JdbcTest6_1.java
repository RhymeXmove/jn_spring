package org.JdbcTemp;

import org.JdbcTemp.config.JdbcConfig;
import org.JdbcTemp.pojo.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcTest6_1 {
    private JdbcTemplate jdbcTemplate;

    @Before
    public void before() {
        AnnotationConfigApplicationContext ctx
                = new AnnotationConfigApplicationContext(JdbcConfig.class);
        jdbcTemplate = ctx.getBean(JdbcTemplate.class);
    }

    @Test
    public void insert() {
        jdbcTemplate.update("insert into user (username, address) values (?,?)",
                "pojo", "www.pojo.org");
    }

    @Test
    public void update() {
        jdbcTemplate.update("update user set username=? where id=?","javaboy123", 1);
    }

    @Test
    public void delete() {
        jdbcTemplate.update("delete from user where id=?", 2);
    }

    @Test
    public void select() {
        User user = jdbcTemplate.queryForObject("select * from user where id=?", new BeanPropertyRowMapper<User>(User.class),1);
        System.out.println(user);
    }

    //    给查询出来的列写别名
    @Test
    public void select2() {
        User user = jdbcTemplate.queryForObject("select id, username as name, address from user where id=?", new BeanPropertyRowMapper<User>(User.class),1);
        System.out.println(user);
    }

    //    自定义RowMapper
    @Test
    public void select3() {
        User user = jdbcTemplate.queryForObject("select * from user where id=?",
                new RowMapper<User>() {
                    public User mapRow(ResultSet resultSet, int i) throws SQLException{
                        int id = resultSet.getInt("id");
                        String username = resultSet.getString("username");
                        String address = resultSet.getString("address");
                        User u = new User();
                        u.setId(id);
                        u.setName(username);
                        u.setAddress(address);
                        return u;
                    }
                }, 1);
        System.out.println(user);
    }

    //    查询多条记录
    @Test
    public void select4() {
        List<User> list = jdbcTemplate.query("select * from user",new BeanPropertyRowMapper<User>(User.class));
        System.out.println(list);
    }

}
