package com.example.catchyourstar.domain;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@Table(name = "scores")
@ToString
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
public class scores {
    // 점수 등록 번호
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long scoresID;

    // 1등 점수
    @Column(nullable = true)
    private Long first;

    // 2등 점수
    @Column(nullable = true)
    private Long second;

    // 3등 점수
    @Column(nullable = true)
    private Long third;

    // 4등 점수
    @Column(nullable = true)
    private Long fourth;

    // 5등 점수
    @Column(nullable = true)
    private Long fifth;

}
