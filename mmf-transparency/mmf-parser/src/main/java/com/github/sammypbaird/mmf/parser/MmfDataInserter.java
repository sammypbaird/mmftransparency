package com.github.sammypbaird.mmf.parser;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

//TODO Implement
public class MmfDataInserter
{
	private DataSource dataSource;

	public MmfDataInserter(DataSource dataSource)
	{
		this.dataSource = dataSource;
	}

	public void insertMmfData(List<MmfCsvRow> rows)
	{
		String sql = "";
		try (Connection connection = dataSource.getConnection(); PreparedStatement st = connection.prepareStatement(sql);)
		{

		}
		catch (SQLException ex)
		{
			throw new IllegalArgumentException(ex);
		}
	}
}
