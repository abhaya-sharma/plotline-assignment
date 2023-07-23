package com.example.plotline.adapter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.protobuf.InvalidProtocolBufferException;
import org.apache.commons.lang3.exception.ExceptionUtils;

import lombok.extern.slf4j.Slf4j;
import com.example.plotline.models.entity.ResponseData;
import com.example.plotline.protoDefinitions.ResponseDataProto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Slf4j
public class ProtoSerializer {
    public static byte[] serializeResponseData(ResponseData responseData) {
        return ProtoAdapter.convertResponseDataToProto(responseData).toByteArray();
    }

    public static ResponseData deserializeResponseData(byte[] message) {
        ResponseData result = new ResponseData();
        try {
            result = ProtoAdapter.convertProtoToResponseData(ResponseDataProto.ResponseData
                    .parseFrom(message));
        } catch (InvalidProtocolBufferException e) {
            log.error("Exception while de-serialising ResponseData: {} , trace: {}", e.getMessage(), ExceptionUtils.getStackTrace(e));
        }
        return result;
    }
}