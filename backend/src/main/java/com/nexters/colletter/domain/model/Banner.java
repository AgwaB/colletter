package com.nexters.colletter.domain.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "banner")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Banner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "banner_id")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "image")
    private String image;
    @Column(name = "order")
    private int priority;

    public void changePriotiry(int priority) {
        this.priority = priority;
    }
}
