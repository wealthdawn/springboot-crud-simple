package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.domain.Wine;
import com.test.mapper.WineMapper;
import com.test.service.WineService;

@Service
public class WineServiceImpl implements WineService {

	@Autowired
	WineMapper wineMapper;
	
	public Wine findById(Long id) {
		return wineMapper.findById(id);
	}

	public List<Wine> getAll() {
		return wineMapper.getAll();
	}

	@Override
	public void Add(Wine w) {
		wineMapper.Add(w);
	}

	@Override
	public void remove(Long id) {
		wineMapper.remove(id);
	}

	@Override
	public void update(Wine w) {
		wineMapper.update(w);
	}

}
