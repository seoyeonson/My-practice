package com.sy.sbkafka.domain.post.author.entity;

import com.sy.sbkafka.global.jpa.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import static lombok.AccessLevel.PRIVATE;
import static lombok.AccessLevel.PROTECTED;

@Entity
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor(access = PROTECTED)
@Builder
@Getter
@Setter
@Table(name = "MEMBER")
public class Author extends BaseEntity {
    @Column(columnDefinition = "BIGINT default 0")
    @Setter(PRIVATE)
    private long postsCount;

    @Column(name = "nickname")
    private String writer;

    public void increasePostsCount() {
        postsCount++;
    }
}
