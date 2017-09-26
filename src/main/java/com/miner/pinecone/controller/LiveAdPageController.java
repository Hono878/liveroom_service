package com.miner.pinecone.controller;

import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.miner.pinecone.entity.LiveAdPageEntity;
import com.miner.pinecone.service.LiveAdPageService;
import com.miner.pinecone.common.utils.PageUtils;
import com.miner.pinecone.common.utils.Query;
import com.miner.pinecone.common.utils.R;




/**
 * h5广告页面
 * 
 * @author hushangjie
 * @email 979783618@qq.com
 * @date 2017-09-26 18:40:01
 */
@RestController
@RequestMapping("live_ad_page")
public class LiveAdPageController {
	@Autowired
	private LiveAdPageService liveAdPageService;
	
	/**
	 * 列表
	 */
	@GetMapping("")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		if (params.get("page") != null && params.get("limit")!= null){
			List<LiveAdPageEntity> liveAdPageList = liveAdPageService.queryList(query);
			int total = liveAdPageService.queryTotal(query);
			
			PageUtils pageUtil = new PageUtils(liveAdPageList, total, query.getLimit(), query.getPage());
			
			return R.ok().put("page", pageUtil);
		}else{
			List<LiveAdPageEntity> liveAdPageList = liveAdPageService.queryList(query);
			return R.ok().put("list", liveAdPageList);
		}
		
	}
	
	
	/**
	 * 信息
	 */
	@GetMapping("/{h5AdPageId}")
	public R info(@PathVariable("h5AdPageId") Long h5AdPageId){
		LiveAdPageEntity liveAdPage = liveAdPageService.queryObject(h5AdPageId);
		
		return R.ok().put("liveAdPage", liveAdPage);
	}
	
	/**
	 * 保存
	 */
	@PostMapping("")
	public R save(@RequestBody LiveAdPageEntity liveAdPage){
		liveAdPageService.save(liveAdPage);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@PutMapping("")
	public R update(@RequestBody LiveAdPageEntity liveAdPage){
		liveAdPageService.update(liveAdPage);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@DeleteMapping("")
	public R delete(@RequestBody Long[] h5AdPageIds){
		liveAdPageService.deleteBatch(h5AdPageIds);
		
		return R.ok();
	}
	
}
