package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.domain.Wine;
import com.test.mapper.WinePage;
import com.test.service.WinePageService;

@Service
public class WinePageServiceImpl implements WinePageService {

	@Autowired
	WinePage  winePage;
	
	@Override
	public int getCount() {
		return winePage.getCount();
	}

	@Override
	public List<Wine> getByPage(int currentPage, int pageSize) {
		return winePage.getByPage((currentPage-1)*pageSize, pageSize);
		
	}

}
