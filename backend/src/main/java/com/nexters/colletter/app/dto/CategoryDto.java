package com.nexters.colletter.app.dto;

import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
public class CategoryDto {
    private String name_en;
    private String name_kr;
}
