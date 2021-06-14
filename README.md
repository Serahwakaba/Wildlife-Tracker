# Wildlife-Tracker
The Forest Service is considering a proposal from a timber company to clearcut a nearby forest of Douglas Fir. Before this proposal may be approved, they must complete an environmental impact study. You have been asked to build an application that allows Rangers to track wildlife sightings in the area.
## Author
Serah Wakaba

#Specifications
1. Due to their dwindling numbers, Rangers must record additional information about Endangered Animals
2. Each time an animal species of either category is seen, a Sighting must be reported.
3. When wildlife is spotted, a Ranger submits a form to record a Sighting containing the following:id of Animal or EndangeredAnimal species
location (Conveyed in any manner you choose ie: "Zone A", "Near the River", "NE Quadrant", or latitude and longitude values are all acceptable.)


**Technologies Implemented**
1. Java 
2. Spark Java Web Framework
3. PostgreSQL for Database
4. Velocity Template Engine 

**Set Up and Installation**
1. Download the project folders
> ```
>$ git clone https://github.com/Serahwakaba/Wildlife-Tracker.git
>$ cd WildlifeTracker
>```
2. Change postgres db login details in:
> ```
> src/main/java/DB.java 
>```
3. Database instructions for PSQL
In PSQL:

* CREATE TABLE animals(id SERIAL PRIMARY KEY, health varchar, age varchar, type varchar,name varchar);
* CREATE TABLE sightings(id SERIAL PRIMARY KEY, ranger varchar , location varchar, animalid int);

4. Launch
> ```
> $gradle run
>```
> open [http://localhost:4567](http://localhost:4567)

**License**
Licensed under [MIT Licence](License.txt) 
