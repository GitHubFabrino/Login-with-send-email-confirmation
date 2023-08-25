package com.example.applicationEmail.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.springframework.http.HttpStatus;

import java.util.Map;

@Data
@SuperBuilder
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class HttpReponse {
    protected String timeStamp;
    protected  int statusCode;
    protected HttpStatus status;
    protected String message;
    protected String DevelopperMessage;
    protected String path;
    protected String requestMethod;
    protected Map<?, ?>data;
}
