#!/usr/bin/env bash
mvn -U io.quarkus:quarkus-maven-plugin:create \
        -DprojectGroupId=pe.bcp.quarkus.starting \
        -DprojectArtifactId=rest-book \
        -DclassName="pe.bcp.quarkus.starting.BookResource" \
        -Dpath="/api/books" \
        -Dextensions="resteasy-jsonb"