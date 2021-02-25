package com.aws.lambda;

import com.aws.lambda.models.Request;

public class Handler {

    public Request handleRequest(Request request){
        System.out.println(request);
        return request;
    }
}
