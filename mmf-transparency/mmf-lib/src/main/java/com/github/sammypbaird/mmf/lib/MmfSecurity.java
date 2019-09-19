package com.github.sammypbaird.mmf.lib;

public class MmfSecurity
{
	private int id;
	private String fund;
	private String fundCusip;
	private double percentOfFund;
	private double cusip;
	private double value;
	private double principal;
	private double coupon;
	private String issuer;
	private String countryAbbreviated;
	private String country;
	private String region;
	private String sector;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getFund()
	{
		return fund;
	}

	public void setFund(String fund)
	{
		this.fund = fund;
	}

	public String getFundCusip()
	{
		return fundCusip;
	}

	public void setFundCusip(String fundCusip)
	{
		this.fundCusip = fundCusip;
	}

	public double getPercentOfFund()
	{
		return percentOfFund;
	}

	public void setPercentOfFund(double percentOfFund)
	{
		this.percentOfFund = percentOfFund;
	}

	public double getCusip()
	{
		return cusip;
	}

	public void setCusip(double cusip)
	{
		this.cusip = cusip;
	}

	public double getValue()
	{
		return value;
	}

	public void setValue(double value)
	{
		this.value = value;
	}

	public double getPrincipal()
	{
		return principal;
	}

	public void setPrincipal(double principal)
	{
		this.principal = principal;
	}

	public double getCoupon()
	{
		return coupon;
	}

	public void setCoupon(double coupon)
	{
		this.coupon = coupon;
	}

	public String getIssuer()
	{
		return issuer;
	}

	public void setIssuer(String issuer)
	{
		this.issuer = issuer;
	}

	public String getCountryAbbreviated()
	{
		return countryAbbreviated;
	}

	public void setCountryAbbreviated(String countryAbbreviated)
	{
		this.countryAbbreviated = countryAbbreviated;
	}

	public String getCountry()
	{
		return country;
	}

	public void setCountry(String country)
	{
		this.country = country;
	}

	public String getRegion()
	{
		return region;
	}

	public void setRegion(String region)
	{
		this.region = region;
	}

	public String getSector()
	{
		return sector;
	}

	public void setSector(String sector)
	{
		this.sector = sector;
	}
}
