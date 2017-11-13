package com.test.service;

import java.util.List;

import com.test.domain.Wine;

public interface WineService {
	Wine findById(Long id);
	List<Wine> getAll();
	void Add(Wine w);
	void remove(Long id);
	void update(Wine w);
}
