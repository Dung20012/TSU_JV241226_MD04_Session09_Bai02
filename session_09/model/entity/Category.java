package com.data.session_09.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cate_name", nullable = false)
    private String cateName;

    @Column(name = "description")
    private String description;

    public Category(String cateName, String description) {
        this.cateName = cateName;
        this.description = description;
    }
}


