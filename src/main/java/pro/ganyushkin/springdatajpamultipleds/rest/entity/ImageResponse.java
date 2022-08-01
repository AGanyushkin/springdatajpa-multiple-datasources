package pro.ganyushkin.springdatajpamultipleds.rest.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class ImageResponse {
    private UUID id;
    private String url;
}
