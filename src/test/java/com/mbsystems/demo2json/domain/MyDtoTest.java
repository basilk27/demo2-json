package com.mbsystems.demo2json.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyDtoTest {

    @Test
    void sampleTest() {
        MyDto myDto = MyDto.builder()
                .firstName("John")
                .lastName("Kiwanuka")
                .city("London")
                .build();

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            String jsonString = objectMapper.writeValueAsString(myDto);

            System.out.println(jsonString);
        }catch (Exception ex) {
            throw new RuntimeException("Error");
        }
    }

    @Test
    void testourcasetwo() {
        TrackHistoryResponse aTrackHistoryResponse = TrackHistoryResponse.builder()
                .trackHistoryData(dataListTrackHistory())
                .build();

        TrackHistoryApiMultiPackageResponse packageResponse = TrackHistoryApiMultiPackageResponse.builder()
                .trackHistoryResponse(aTrackHistoryResponse)
                .build();

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            String strTrackHis = objectMapper.writeValueAsString(packageResponse);

            TrackHistoryApiMultiPackageResponse bbb = objectMapper.readValue(strTrackHis, TrackHistoryApiMultiPackageResponse.class);

            System.out.println(bbb);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

            throw new RuntimeException("Error");
        }
    }

    private List<TrackHistoryData> dataListTrackHistory() {
        TrackHistoryData trackHistoryData1 = TrackHistoryData.builder()
                .inquiryNumber("10001")
                .statusCode("03")
                .statusDescription("statusDescription03")
                .lastTrackedTimeStamp("1234567")
                .lastTrackedTimeStamp("1233456")
                .build();

        TrackHistoryData trackHistoryData2 = TrackHistoryData.builder()
                .inquiryNumber("10002")
                .statusCode("03")
                .statusDescription("statusDescription03")
                .lastTrackedTimeStamp("1234567")
                .lastTrackedTimeStamp("1233456")
                .build();
        TrackHistoryData trackHistoryData3 = TrackHistoryData.builder()
                .inquiryNumber("10003")
                .statusCode("03")
                .statusDescription("statusDescription03")
                .lastTrackedTimeStamp("1234567")
                .lastTrackedTimeStamp("1233456")
                .build();

        TrackHistoryData trackHistoryData4 = TrackHistoryData.builder()
                .inquiryNumber("10004")
                .statusCode("03")
                .statusDescription("statusDescription03")
                .lastTrackedTimeStamp("1234567")
                .lastTrackedTimeStamp("1233456")
                .build();

        return List.of(trackHistoryData1, trackHistoryData2, trackHistoryData3, trackHistoryData4);
    }
}