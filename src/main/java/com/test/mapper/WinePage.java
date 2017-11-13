package com.test.mapper;

import java.util.List;

import com.test.domain.Wine;

/**
 * @author zheng
 *
 * 2017年10月17日
 * 分页     查询总数
 */
public interface WinePage {
	int getCount();
	List<Wine> getByPage(int num,int pageSize);
}
