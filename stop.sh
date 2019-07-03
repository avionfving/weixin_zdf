#! /bin/bash

cd weixins
mvn spring-boot:stop

cd ../subscribe
mvn spring-boot:stop

cd ../unsubscribe
mvn spring-boot:stop

cd ../self_menu
mvn spring-boot:stop

cd ../library
mvn spring-boot:stop

