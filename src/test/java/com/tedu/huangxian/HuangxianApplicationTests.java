package com.tedu.huangxian;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HuangxianApplicationTests {
@Autowired
 DataSource data;
	@Test
	public void contextLoads() throws SQLException {
		 Connection conn=  data.getConnection();
		System.out.println(conn);
	}

}
