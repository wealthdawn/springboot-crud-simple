package com.test.mapper;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.test.domain.Wine;
import com.test.service.WineService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WineMapperTest {

	@Autowired
	WineService wineService;
	
	
	@Test
	public void testFindById() {
		System.out.println(wineService.findById(1L).toString());
	}
	@Test
	public void testGetALL(){
		System.out.println(wineService.getAll().toString());
	}
	
	@Test
	public void testAdd(){
		for (int i = 0; i < 10; i++) {
			Wine w =new Wine();
			w.setBrand("添加品牌"+i);
			w.setCapacity(1000);
			w.setPrice(new BigDecimal(1000));
			w.setType("测试酒"+i);
			wineService.Add(w);
		}
	}
	
	@Test
	public void testRemove(){
		wineService.remove(14L);
	}
	
	@Test
	public void testUpdate(){
		Wine w = wineService.findById(13L);
		w.setBrand("更新的名字");
		wineService.update(w);
	}
}
