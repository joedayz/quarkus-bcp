#!/usr/bin/env bash
mvn -U io.quarkus:quarkus-maven-plugin:create \
        -DprojectGroupId=pe.bcp.course.quarkus.orm \
        -DprojectArtifactId=artist \
        -DpackageName="pe.bcp.quarkus.jdbc" \
        -Dextensions="jdbc-mysql, quarkus-agroal"
