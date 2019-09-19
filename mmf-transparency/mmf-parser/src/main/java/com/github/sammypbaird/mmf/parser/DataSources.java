package com.github.sammypbaird.mmf.parser;

import org.apache.commons.dbcp2.BasicDataSource;
import javax.sql.DataSource;

public class DataSources
{
	private static DataSource DATASOURCE = createDataSource();

	public static DataSource get()
	{
		return DATASOURCE;
	}

	private static DataSource createDataSource()
	{
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("net.sourceforge.jtds.jdbc.Driver");
		dataSource.setUrl("jdbc:sqlserver://localhost;DatabaseName=mmf");
		dataSource.setUsername("sa");
		dataSource.setPassword("Clearwater123!");
		dataSource.setValidationQuery("select 1");
		return dataSource;
	}
}
