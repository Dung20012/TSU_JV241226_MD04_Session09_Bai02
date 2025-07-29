package com.data.session_09.repository;

import com.data.session_09.model.entity.Category;

import java.util.List;

public interface ICategoryRepository {
    void save(Category category);
    List<Category> findAll();
}
