package com.hs.service;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/*.xml"})
public class DataSourceTest {
	@Autowired
	DataSource ds;
	
	@Test	// 단위테스트
	public void testConnection() throws Exception {
		Connection conn = ds.getConnection();
		System.out.println("DB접속 성공" + conn!=null);
		conn.close();
	}
}
