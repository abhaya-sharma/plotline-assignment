package com.example.plotline.adapter;

import com.example.plotline.models.entity.*;
import com.example.plotline.protoDefinitions.ResponseDataProto;
import lombok.extern.slf4j.Slf4j;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

public class ProtoAdapter {
        public static ResponseData convertProtoToResponseData(ResponseDataProto.ResponseData proto) {

            return ResponseData.builder()
                    .attributes( proto.getAttributesList())
                    .compositeOffers( proto.getCompositeOffersList() )
                    .events( proto.getEventsList() )
                    .offerItems( proto.getOfferItemsList() )
                    .journeys( proto.getJourneysList() )
                    .metricEvents( proto.getMetricEventsList() )
                    .metricType(proto.getMetricTypeValue() != 0 ? MetricType.valueOf(proto.getMetricType().name()) : null )
                    .noCodeEvents( proto.getNoCodeEventsList() )
                    .productColors( proto.getProductColorsList())
                    .productId( proto.getProductId() )
                    .searchIntervalMillis( proto.getSearchIntervalMillis() )
                    .shouldEnableOffers(proto.getShouldEnableOffers())
                    .shouldEnableJourneys(proto.getShouldEnableJourneys())
                    .shouldEnableNoCodeEvents(proto.getShouldEnableNoCodeEvents())
                    .shouldRegisterAttributesEvents(proto.getShouldRegisterAttributesEvents())
                    .discounts(proto.getDiscountsList())
                    .widgets(proto.getWidgetsList())
                    .build();
        }

        public static ResponseDataProto.ResponseData convertResponseDataToProto(ResponseData pojo) {
            return ResponseDataProto.ResponseData.newBuilder()
            .addAllAttributes(pojo.getAttributes())
            .addAllCompositeOffers(pojo.getCompositeOffers())
            .addAllEvents(pojo.getEvents())
            .addAllOfferItems(pojo.getOfferItems())
            .addAllJourneys(pojo.getJourneys())
            .addAllMetricEvents(pojo.getMetricEvents())
            .setMetricTypeValue(enumConverter(pojo.getMetricType()))
            .addAllNoCodeEvents(pojo.getNoCodeEvents())
            .addAllProductColors(pojo.getProductColors())
            .setProductId(pojo.getProductId())
            .setSearchIntervalMillis(pojo.getSearchIntervalMillis())
            .setShouldEnableOffers(pojo.getShouldEnableOffers())
            .setShouldEnableJourneys(pojo.getShouldEnableJourneys())
            .setShouldEnableNoCodeEvents(pojo.getShouldEnableNoCodeEvents())
            .setShouldRegisterAttributesEvents(pojo.getShouldRegisterAttributesEvents())
            .addAllDiscounts(pojo.getDiscounts())
            .addAllWidgets(pojo.getWidgets())
            .build();

        }

    public static int enumConverter(Enum e) {
        return e.ordinal() + 1;
    }
}