package com.example.plotline.models.entity.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.example.plotline.models.entity.ResponseData;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SuccessResponse {

    @JsonProperty("message")
    public String message;

    @JsonProperty("data")
    public byte[] data ;

    @JsonProperty("status")
    public String status;

    @JsonProperty("statusCode")
    public Integer statusCode;

    public static SuccessResponse getSuccessResponse(byte[] data) {

        return SuccessResponse.builder()
                .status("success")
                .statusCode(200)
                .message("")
                .data(data)
                .build();
    }
}
