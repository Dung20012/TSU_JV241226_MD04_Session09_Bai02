package com.data.session_09.service.impl;

import com.data.session_09.model.entity.Category;
import com.data.session_09.model.entity.Seed;
import com.data.session_09.repository.ISeedRepository;
import com.data.session_09.service.ICategoryService;
import com.data.session_09.service.ISeedService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SeedServiceImpl implements ISeedService {
    @Autowired
    private ISeedRepository seedRepository;

    @Autowired
    ICategoryService categoryService;

    @Override
    public List<Seed> findAll(int page, int size) {
        return seedRepository.findAll(page, size);
    }

    @Override
    public void save(Seed seed) {
        seedRepository.save(seed);
    }

    @Override
    public void update(Seed seed) {
        seedRepository.update(seed);
    }

    @Override
    public void delete(long id) {
        seedRepository.delete(id);
    }

    @Override
    public Seed findById(long id) {
        return seedRepository.findById(id);
    }
        @PostConstruct
        public void insertSampleData() {
            List<Category> categories = categoryService.getAll();
            if (categories.isEmpty()) {
                categoryService.insertSampleData();
                categories = categoryService.getAll();
            }

            seedRepository.save(new Seed(null, "Hạt giống Cà chua", 100, categories.get(0)));
            seedRepository.save(new Seed(null, "Hạt giống Dưa hấu", 150, categories.get(1)));
            seedRepository.save(new Seed(null, "Hạt giống Ớt", 200, categories.get(2)));
            seedRepository.save(new Seed(null, "Hạt giống Cà rốt", 120, categories.get(3)));
            seedRepository.save(new Seed(null, "Hạt giống Bí đỏ", 180, categories.get(4)));
        }
}
