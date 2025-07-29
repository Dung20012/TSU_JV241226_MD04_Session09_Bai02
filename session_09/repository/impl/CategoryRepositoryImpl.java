package com.data.session_09.repository.impl;

import com.data.session_09.model.entity.Category;
import com.data.session_09.repository.ICategoryRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class CategoryRepositoryImpl implements ICategoryRepository {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Category category) {
        sessionFactory.getCurrentSession().save(category);
    }

    @Override
    public List<Category> findAll() {
        return sessionFactory.getCurrentSession()
                .createQuery("from Category ", Category.class)
                .getResultList();
    }
}
