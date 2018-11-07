#!/bin/sh

echo "********************************************************"
echo "Starting HelloWorld" ON PORT: $SERVER_PORT;
echo "********************************************************"
java -Djava.security.egd=file:/dev/./urandom -Dserver.port=$SERVER_PORT   \
     -jar /usr/local/helloworld/@project.build.finalName@.jar
