package com.nit.exception;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Validated
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorDetails {

    @JsonProperty("httpStatusCode")
    private String httpStatusCode = null;

    @JsonProperty("serviceErrorCode")
    private String serviceErrorCode = null;

    @JsonProperty("errorDescription")
    private String errorDescription = null;

    @JsonProperty("errorDetail")
    private String errorDetail = null;
}
