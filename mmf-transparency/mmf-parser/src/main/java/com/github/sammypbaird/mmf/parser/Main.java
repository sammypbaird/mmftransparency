package com.github.sammypbaird.mmf.parser;

import com.github.sammypbaird.mmf.dao.DataSources;
import java.io.File;
import java.util.List;

public class Main
{
	private static final String CSV_FILENAME = "mmf_data.csv";

	public static void main(String[] args)
	{
		MmfParser mmfParser = new MmfParser();
		MmfDataInserter mmfDataInserter = new MmfDataInserter(DataSources.get());

		List<MmfCsvRow> mmfCsvRows = mmfParser.parseCsvData(new File(CSV_FILENAME));
		mmfDataInserter.insertMmfData(mmfCsvRows);
	}
}
