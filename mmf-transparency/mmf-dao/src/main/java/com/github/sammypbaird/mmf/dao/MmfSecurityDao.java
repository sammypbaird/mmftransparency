package com.github.sammypbaird.mmf.dao;

import com.github.sammypbaird.mmf.lib.MmfSecurity;
import javax.sql.DataSource;
import java.util.List;

public class MmfSecurityDao
{
	private final DataSource dataSource;

	public MmfSecurityDao(DataSource datasource)
	{
		this.dataSource = datasource;
	}

	public List<MmfSecurity> getAll()
	{
		throw new UnsupportedOperationException("Unsupported method");
	}

	public List<MmfSecurity> getByFundCusip(String fundCusip)
	{
		throw new UnsupportedOperationException("Unsupported method");
	}

	public List<MmfSecurity> getByFundName(String fundName)
	{
		throw new UnsupportedOperationException("Unsupported method");
	}

	public List<MmfSecurity> getByCusip(String cusip)
	{
		throw new UnsupportedOperationException("Unsupported method");
	}
}
