package com.example.plotline.models.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseData {

    @JsonProperty("attributes")
    private List<String> attributes; //empty

    @JsonProperty("compositeOffers")
    private List<String> compositeOffers; // will go in depth if have time

    @JsonProperty("events")
    private List<String> events; //empty

    @JsonProperty("offerItems")
    private List<String> offerItems;

    @JsonProperty("journeys")
    private List<String> journeys;

    @JsonProperty("metricEvents")
    private List<String> metricEvents;

    @JsonProperty("metricType")
    private MetricType metricType;

    @JsonProperty("noCodeEvents")
    private List<String> noCodeEvents;

    @JsonProperty("productColors")
    private List<String> productColors;

    @JsonProperty("productId")
    private String productId;

    @JsonProperty("searchIntervalMillis")
    private Integer searchIntervalMillis;

    @JsonProperty("shouldEnableOffers")
    private Boolean shouldEnableOffers;

    @JsonProperty("shouldEnableJourneys")
    private Boolean shouldEnableJourneys;

    @JsonProperty("shouldEnableNoCodeEvents")
    private Boolean shouldEnableNoCodeEvents;

    @JsonProperty("shouldRegisterAttributesEvents")
    private Boolean shouldRegisterAttributesEvents;

    @JsonProperty("discounts")
    private List<String> discounts;

    @JsonProperty("widgets")
    private List<String> widgets;
}
