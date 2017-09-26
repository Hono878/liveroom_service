package com.miner.pinecone.controller;

import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.miner.pinecone.entity.LiveRoomEntity;
import com.miner.pinecone.service.LiveRoomService;
import com.miner.pinecone.common.utils.PageUtils;
import com.miner.pinecone.common.utils.Query;
import com.miner.pinecone.common.utils.R;




/**
 * 直播活动表
 * 
 * @author hushangjie
 * @email 979783618@qq.com
 * @date 2017-09-26 18:37:09
 */
@RestController
@RequestMapping("liveroom")
public class LiveRoomController {
	@Autowired
	private LiveRoomService liveRoomService;
	
	/**
	 * 列表
	 */
	@GetMapping("")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		if (params.get("page") != null && params.get("limit")!= null){
			List<LiveRoomEntity> liveRoomList = liveRoomService.queryList(query);
			int total = liveRoomService.queryTotal(query);
			
			PageUtils pageUtil = new PageUtils(liveRoomList, total, query.getLimit(), query.getPage());
			
			return R.ok().put("page", pageUtil);
		}else{
			List<LiveRoomEntity> liveRoomList = liveRoomService.queryList(query);
			return R.ok().put("list", liveRoomList);
		}
		
	}
	
	
	/**
	 * 信息
	 */
	@GetMapping("/{liveRoomId}")
	public R info(@PathVariable("liveRoomId") String liveRoomId){
		LiveRoomEntity liveRoom = liveRoomService.queryObject(liveRoomId);
		
		return R.ok().put("liveRoom", liveRoom);
	}
	
	/**
	 * 保存
	 */
	@PostMapping("")
	public R save(@RequestBody LiveRoomEntity liveRoom){
		liveRoomService.save(liveRoom);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@PutMapping("")
	public R update(@RequestBody LiveRoomEntity liveRoom){
		liveRoomService.update(liveRoom);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@DeleteMapping("")
	public R delete(@RequestBody String[] liveRoomIds){
		liveRoomService.deleteBatch(liveRoomIds);
		
		return R.ok();
	}
	
}
