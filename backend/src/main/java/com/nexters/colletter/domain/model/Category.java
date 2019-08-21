package com.nexters.colletter.domain.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "category")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private long id;
    @Column(name = "name_en")
    private String name_en;
    @Column(name = "name_kr")
    private String name_kr;
    @Column(name = "image")
    private String image;

    public Category(String name_en, String name_kr, String image) {
        this.name_en = name_en;
        this.name_kr = name_kr;
        this.image = image;
    }

    public void addImage(String imageUrl) {
        this.image = imageUrl;
    }
}
