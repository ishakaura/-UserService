package com.example.user.service.UserService.payload;

import java.sql.Date;
import java.time.Instant;
import java.time.ZoneId;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.ToString;

/*import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;*/



/*@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder*/
//@ToString
//@Data(combinatio of all)


public class ApiResponse {
    private HttpStatus status;
    private String message;
    private Object data;

    // Private constructor to enforce the use of the builder
    private ApiResponse(Builder builder) {
        this.status = builder.status;
        this.message = builder.message;
        this.data = builder.data;
    }

    // Getters
    public HttpStatus getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }

    // Static inner Builder class
    public static class Builder {
        private HttpStatus status;
        private String message;
        private Object data;

        public Builder status(HttpStatus accepted) {
            this.status = accepted;
            return this;
        }

        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public Builder data(Object data) {
            this.data = data;
            return this;
        }

        public ApiResponse build() {
            return new ApiResponse(this);
        }
    }
}
