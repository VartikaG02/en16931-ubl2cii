package com.myproj.ublcii.model;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "API Response message UMLCII API")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-21T13:41:33.184Z[GMT]")
public class ApiResponseMessage {
    public static final int ERROR = 1;
    public static final int WARNING = 2;
    public static final int INFO = 3;
    public static final int OK = 4;
    public static final int TOO_BUSY = 5;

    @JsonProperty("code")
    int code;
    
    @JsonProperty("type")
    String type;
    
    @JsonProperty("message")
    String message;

    public ApiResponseMessage(){}

    public ApiResponseMessage(int code, String message){
        this.code = code;
        switch(code){
        case ERROR:
            setType("error");
            break;
        case WARNING:
            setType("warning");
            break;
        case INFO:
            setType("info");
            break;
        case OK:
            setType("ok");
            break;
        case TOO_BUSY:
            setType("too busy");
            break;
        default:
            setType("unknown");
            break;
        }
        this.message = message;
    }

    public int getCode() {
        return code;
    }
    
    @Schema(description = "")
    public void setCode(int code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    @Schema(description = "")
    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    @Schema(description = "")
    public void setMessage(String message) {
        this.message = message;
    }
}
