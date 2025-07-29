package com.data.session_09.service;

import com.data.session_09.model.entity.Seed;

import java.util.List;

public interface ISeedService {
    List<Seed> findAll(int page, int size);
    void save(Seed seed);
    void update(Seed seed);
    void delete(long id);
    Seed findById(long id);
}
