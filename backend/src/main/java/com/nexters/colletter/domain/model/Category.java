package com.nexters.colletter.domain.model;

import com.nexters.colletter.domain.value.CategoryType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "category")
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Category {
    @Id
    @Column(name = "category_id")
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "image")
    private String image;
}
