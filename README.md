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
5. git

**Set Up and Installation**
1. Download the project folders
> ```
>$ git clone https://github.com/Serahwakaba/Wildlife-Tracker.git
>$ cd WildlifeTracker
>```
2. Change postgres db login details in:
> ```
> src/main/java/Database.java 
>```

3. Database Setup

Click this link to install postgreSQL if you don't have one.

for ubuntu users use the following in the terminal:

    sudo apt-get update

    sudo apt-get install postgresql postgresql-contrib libpq-dev

launch the postgreSQl using:

    sudo -u postgres psql -U postgres

update server password

    ALTER USER postgres WITH PASSWORD '12345';

##creating database
CREATE DATABASE wildlife_tracker;

    \c wildlife_tracker;

    CREATE TABLE animals (id serial PRIMARY KEY, name VARCHAR, rangerid int,age VARCHAR, health VARCHAR);

    CREATE TABLE sightings (id serial PRIMARY KEY, animalId int, location VARCHAR, rangerName VARCHAR);

    CREATE DATABASE wildlife_tracker_test WITH TEMPLATE wildlife_tracker;

4. Launch
> ```
> $gradle run
>```
> open [http://localhost:4567](http://localhost:4567)

**License**
Licensed under [MIT Licence](License.txt) 
