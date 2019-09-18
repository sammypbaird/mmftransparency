docker build --network host -t bootcamp-sql-server:latest .
docker run --name mssql-server -it -p 1433:1433 -d bootcamp-sql-server:latest
