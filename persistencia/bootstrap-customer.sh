#!/usr/bin/env bash
mvn -U io.quarkus:quarkus-maven-plugin:create \
        -DprojectGroupId=pe.bcp.course.quarkus.orm \
        -DprojectArtifactId=customer \
        -DpackageName="pe.bcp.quarkus.jpa" \
        -Dextensions="jdbc-mariadb, hibernate-orm"
