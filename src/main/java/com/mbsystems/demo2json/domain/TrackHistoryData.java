package com.mbsystems.demo2json.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor(force = true)
@RequiredArgsConstructor
@Builder
@Getter
public class TrackHistoryData {

    @JsonProperty("InquiryNumber")
    private final String inquiryNumber;

    @JsonProperty("StatusCode")
    private final String statusCode;

    @JsonProperty("StatusDescription")
    private final String statusDescription;

    @JsonProperty("LastActiveScanTimeStamp")
    private final String lastActiveScanTimeStamp;

    @JsonProperty("LastTrackedTimeStamp")
    private final String lastTrackedTimeStamp;
}
