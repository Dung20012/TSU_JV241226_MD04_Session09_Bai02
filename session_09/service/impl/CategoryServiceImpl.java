package com.data.session_09.service.impl;

import com.data.session_09.model.entity.Category;
import com.data.session_09.repository.ICategoryRepository;
import com.data.session_09.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CategoryServiceImpl implements ICategoryService {
    @Autowired
    private ICategoryRepository categoryRepository;

    @Override
    public void insertSampleData() {
        categoryRepository.save(new Category("Điện tử", "Các sản phẩm điện tử"));
        categoryRepository.save(new Category("Thời trang", "Trang phục các loại"));
        categoryRepository.save(new Category("Gia dụng", "Đồ dùng trong nhà"));
        categoryRepository.save(new Category("Sách", "Sách các thể loại"));
        categoryRepository.save(new Category("Thể thao", "Dụng cụ và trang phục thể thao"));
    }

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }
}
