package com.miner.pinecone.controller;

import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.miner.pinecone.entity.LiveRoomTabEntity;
import com.miner.pinecone.service.LiveRoomTabService;
import com.miner.pinecone.common.utils.PageUtils;
import com.miner.pinecone.common.utils.Query;
import com.miner.pinecone.common.utils.R;




/**
 * 直播间菜单栏
 * 
 * @author hushangjie
 * @email 979783618@qq.com
 * @date 2017-09-26 18:40:01
 */
@RestController
@RequestMapping("liveroomtab")
public class LiveRoomTabController {
	@Autowired
	private LiveRoomTabService liveRoomTabService;
	
	/**
	 * 列表
	 */
	@GetMapping("")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		if (params.get("page") != null && params.get("limit")!= null){
			List<LiveRoomTabEntity> liveRoomTabList = liveRoomTabService.queryList(query);
			int total = liveRoomTabService.queryTotal(query);
			
			PageUtils pageUtil = new PageUtils(liveRoomTabList, total, query.getLimit(), query.getPage());
			
			return R.ok().put("page", pageUtil);
		}else{
			List<LiveRoomTabEntity> liveRoomTabList = liveRoomTabService.queryList(query);
			return R.ok().put("list", liveRoomTabList);
		}
		
	}
	
	
	/**
	 * 信息
	 */
	@GetMapping("/{liveRoomTabId}")
	public R info(@PathVariable("liveRoomTabId") Long liveRoomTabId){
		LiveRoomTabEntity liveRoomTab = liveRoomTabService.queryObject(liveRoomTabId);
		
		return R.ok().put("liveRoomTab", liveRoomTab);
	}
	
	/**
	 * 保存
	 */
	@PostMapping("")
	public R save(@RequestBody LiveRoomTabEntity liveRoomTab){
		liveRoomTabService.save(liveRoomTab);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@PutMapping("")
	public R update(@RequestBody LiveRoomTabEntity liveRoomTab){
		liveRoomTabService.update(liveRoomTab);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@DeleteMapping("")
	public R delete(@RequestBody Long[] liveRoomTabIds){
		liveRoomTabService.deleteBatch(liveRoomTabIds);
		
		return R.ok();
	}
	
}
