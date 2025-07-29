package com.data.session_09.service;

import com.data.session_09.model.entity.Category;

import java.util.List;

public interface ICategoryService {
    void insertSampleData();
    List<Category> getAll();
}
