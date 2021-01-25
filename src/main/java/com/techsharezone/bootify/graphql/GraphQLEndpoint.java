package com.techsharezone.bootify.graphql;

/*
 * @created 24/01/2021 -00:35
 * @project bootify-graphql
 * @author  saurabhshcs
 */

import javax.servlet.annotation.WebServlet;
//import graphql.servlet.SimpleGraphQLServlet;


@WebServlet(urlPatterns = "/graphql")
public class GraphQLEndpoint {

    public GraphQLEndpoint() {
//        super(SchemaParser.newParser()
//                .file("schema.graphqls") //parse the schema file created earlier
//                .build()
//                .makeExecutableSchema());
    }
}