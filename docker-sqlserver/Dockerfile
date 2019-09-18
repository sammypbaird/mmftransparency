FROM  mcr.microsoft.com/mssql/server:2017-latest

RUN apt-get update && apt-get install -y netcat
COPY scripts /usr/src/app

ENV ACCEPT_EULA=Y
ENV SA_PASSWORD=Clearwater123!

WORKDIR /usr/src/app

ENTRYPOINT ./entrypoint.sh
