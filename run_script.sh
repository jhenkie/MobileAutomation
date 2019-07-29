#!/bin/sh

#This step to specify which cucumber file to run
if [ $1 = "all" ]; then
mvn test
elif [ $1 = "login" ]; then
mvn test -Dcucumber.options='--tags "@LoginTest"'
elif [ $1 = "about" ]; then
mvn test -Dcucumber.options='--tags "@AboutTest"'
elif [ $1 = "location" ]; then
mvn test -Dcucumber.options='--tags "@LocationTest"'
fi