package com.mbsystems.demo2json.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor(force = true)
@RequiredArgsConstructor
@Builder
@Getter
public class TrackHistoryResponse {

    @JsonProperty("TrackHistoryData")
    private final List<TrackHistoryData> trackHistoryData;
}
