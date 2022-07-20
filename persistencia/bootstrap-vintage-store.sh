#!/usr/bin/env bash
mvn -U io.quarkus:quarkus-maven-plugin:create \
        -DprojectGroupId=pe.bcp.course.quarkus.orm \
        -DprojectArtifactId=vintage-store \
        -DpackageName="pe.bcp.quarkus.panache" \
        -Dextensions="jdbc-postgresql, hibernate-orm-panache"
