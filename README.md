# weatherinfo
A simple rest service to get weather info by city, in celsius and farenheit, for the most near day calculated by the MetaWeather service. 

Created in Java with Spring Boot Framework and Maven.

To test it locally, send a Http GET request
to this url http://localhost:8080/api/weathers/city?name=london

London can be changed for any city name.
If the query param that you send can be in more than one city name,the service is gonna display all the cities with this name with their respective weathers.




