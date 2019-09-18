/usr/src/app/wait.sh localhost:1433

/opt/mssql-tools/bin/sqlcmd -S localhost -U sa -P ${SA_PASSWORD} -d master -i setup.sql
/opt/mssql-tools/bin/bcp test.dbo.test in "/usr/src/app/test.csv" -c -t',' -S localhost -U sa -P ${SA_PASSWORD}
