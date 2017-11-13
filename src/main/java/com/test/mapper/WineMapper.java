package com.test.mapper;

import java.util.List;

import com.test.domain.Wine;

/**
 * 
 * @author zheng
 *
 * 2017年9月20日
 */
public interface WineMapper {
	
	Wine findById(Long id);
	List<Wine> getAll();
	void Add(Wine w);
	void update(Wine w);
	void remove(Long id);
	
}
