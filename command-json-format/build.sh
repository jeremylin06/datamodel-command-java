#!/bin/sh
PROJECT_ROOT=$(pwd)
echo $PROJECT_ROOT

#start package device-service
cd $PROJECT_ROOT
mvn clean install -U -Dmaven.test.skip=true
echo "done"

