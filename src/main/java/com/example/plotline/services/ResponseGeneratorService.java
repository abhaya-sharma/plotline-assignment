package com.example.plotline.services;

import com.example.plotline.models.entity.MetricType;
import com.example.plotline.models.entity.ResponseData;
import lombok.extern.slf4j.Slf4j;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.loader.ast.spi.SqlArrayMultiKeyLoader;
import org.springframework.stereotype.Service;
import com.example.plotline.constants.Constants.SampleResponse.*;
import com.example.plotline.adapter.*;

import static com.example.plotline.constants.Constants.SampleResponse.SAMPLE_RESPONSE_DATA;

@Slf4j
@Service
public class ResponseGeneratorService {

    public byte[] populateResponseData(){
        ResponseData responseData = populateRandom();
        return ProtoSerializer.serializeResponseData(responseData);
    }
    public ResponseData populateRandom(){
        return ResponseData.builder()
                .attributes(SAMPLE_RESPONSE_DATA)
                .compositeOffers(SAMPLE_RESPONSE_DATA)
        .events(SAMPLE_RESPONSE_DATA)
        .offerItems(SAMPLE_RESPONSE_DATA)
        .journeys(SAMPLE_RESPONSE_DATA)
        .metricEvents(SAMPLE_RESPONSE_DATA)
        .metricType(MetricType.NONE)
        .noCodeEvents(SAMPLE_RESPONSE_DATA)
        .productColors(SAMPLE_RESPONSE_DATA)
        .productId("abcd")
        .searchIntervalMillis(123)
        .shouldEnableOffers(true)
        .shouldEnableJourneys(true)
        .shouldEnableNoCodeEvents(false)
        .shouldRegisterAttributesEvents(false)
        .discounts(SAMPLE_RESPONSE_DATA)
        .widgets(SAMPLE_RESPONSE_DATA)
                .build();
    }
}