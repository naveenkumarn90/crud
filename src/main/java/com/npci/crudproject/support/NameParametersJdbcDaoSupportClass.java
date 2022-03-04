package com.npci.crudproject.support;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

public class NameParametersJdbcDaoSupportClass extends NamedParameterJdbcDaoSupport {
	
	@Autowired
	public void setDataSource3(DataSource dataSource) {
		setDataSource(dataSource);
	}
}
