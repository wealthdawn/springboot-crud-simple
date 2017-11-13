package com.test.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.domain.Wine;
import com.test.service.WinePageService;
import com.test.service.WineService;

/**
 * 
 * @author zheng
 *
 * 2017年9月20日
 */
@Controller
@RequestMapping("/wine")
public class WineController {

	private static Logger logger = Logger.getLogger(WineController.class);
	
	@Autowired
	WineService wineService ;
	
	@Autowired
	WinePageService winePageService;

	@RequestMapping("/getOne")
	@ResponseBody
	public String getWine() {
		return wineService.findById(1L).toString();
	}
	
	@RequestMapping("/list") 
	@ResponseBody                   
	public JSONObject toIndex(HttpServletRequest request){
		logger.debug("-------------打印所有的酒信息----------");
		Integer page =Integer.parseInt(request.getParameter("page"));
		Integer limit=Integer.parseInt(request.getParameter("limit"));
		
		int total = winePageService.getCount();                				 //记录总数
		Map<String, Object> map=new HashMap<String, Object>();
		List<Wine> winelist=winePageService.getByPage(page, limit);
		JSONArray wineObject = JSONArray.fromObject(winelist);
		
		map.put("code", 0);
		map.put("msg", "");
		map.put("count", total);
		map.put("data", wineObject);
		JSONObject jsonObject = JSONObject.fromObject(map);
		
		
		return jsonObject;
		
	}
	
}