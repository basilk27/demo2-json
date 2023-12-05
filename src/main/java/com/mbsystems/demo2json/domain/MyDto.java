package com.mbsystems.demo2json.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Builder
@Getter
public class MyDto {

    @JsonProperty("King")
    private final String firstName;

    @JsonProperty("LastName")
    private final String lastName;

    @JsonProperty("Main-City")
    private final String city;
}
