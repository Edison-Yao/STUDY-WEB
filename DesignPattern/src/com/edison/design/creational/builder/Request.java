package com.edison.design.creational.builder;


import java.util.HashMap;
import java.util.Map;

/**
 * @author edisonyao
 * @class RequestBuilder
 * @date 18-8-10
 * @description
 */
public class Request {
    final String mUrl;

    Map<String, String> mHeaders = new HashMap<String, String>();

    public Request(String url){
        this(new Builder(url));
    }

    private Request(Builder builder){
        this.mUrl = builder.url;
        this.mHeaders = builder.headers;
    }

    public static final class Builder {
        String url;

        Map<String, String> headers = new HashMap<String, String>();

        public Builder(String url) {
            this.url = url;
        }

        public Builder newBuilder(String url) {
            return new Builder(url);
        }

        public Builder addHeader(String key, String value) {

            headers.put(key, value);
            return this;
        }

        public Request build() {
            return new Request(this);
        }
    }
}
