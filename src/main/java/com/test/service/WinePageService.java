package com.test.service;

import java.util.List;

import com.test.domain.Wine;

public interface WinePageService {
	int getCount();
	List<Wine> getByPage(int currentPage,int pageSize);
}
