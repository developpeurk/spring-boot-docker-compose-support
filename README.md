# spring-boot-docker-compose-support

## Quelques commandes de docker


````
docker ps  
````


````
docker exec -it 99403770583c psql -U user1 -d hotel_db
````

````
docker exec -it 99403770583c psql -U user1 -d hotel_db
````

````
docker inspect 99403770583c 
````

````
docker inspect 99403770583c | grep IPAddress
````

## Quelques commandes de Postgres

 #### Pour consulter La liste des bases de données

 ````
\l
````

 #### Pour se connecter a une base de données

````
\c hotel_db
````

 #### Pour voir la lite de table

 ````
\dt
````


 #### Pour voir la description de la table
 ````
\d reservation
````
 

 









