package com.miner.pinecone.controller;

import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.miner.pinecone.entity.LiveRoomCommentEntity;
import com.miner.pinecone.service.LiveRoomCommentService;
import com.miner.pinecone.common.utils.PageUtils;
import com.miner.pinecone.common.utils.Query;
import com.miner.pinecone.common.utils.R;




/**
 * 直播间评论表
 * 
 * @author hushangjie
 * @email 979783618@qq.com
 * @date 2017-09-26 18:37:09
 */
@RestController
@RequestMapping("liveroomcomment")
public class LiveRoomCommentController {
	@Autowired
	private LiveRoomCommentService liveRoomCommentService;
	
	/**
	 * 列表
	 */
	@GetMapping("")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		if (params.get("page") != null && params.get("limit")!= null){
			List<LiveRoomCommentEntity> liveRoomCommentList = liveRoomCommentService.queryList(query);
			int total = liveRoomCommentService.queryTotal(query);
			
			PageUtils pageUtil = new PageUtils(liveRoomCommentList, total, query.getLimit(), query.getPage());
			
			return R.ok().put("page", pageUtil);
		}else{
			List<LiveRoomCommentEntity> liveRoomCommentList = liveRoomCommentService.queryList(query);
			return R.ok().put("list", liveRoomCommentList);
		}
		
	}
	
	
	/**
	 * 信息
	 */
	@GetMapping("/{liveRoomCommentId}")
	public R info(@PathVariable("liveRoomCommentId") Long liveRoomCommentId){
		LiveRoomCommentEntity liveRoomComment = liveRoomCommentService.queryObject(liveRoomCommentId);
		
		return R.ok().put("liveRoomComment", liveRoomComment);
	}
	
	/**
	 * 保存
	 */
	@PostMapping("")
	public R save(@RequestBody LiveRoomCommentEntity liveRoomComment){
		liveRoomCommentService.save(liveRoomComment);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@PutMapping("")
	public R update(@RequestBody LiveRoomCommentEntity liveRoomComment){
		liveRoomCommentService.update(liveRoomComment);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@DeleteMapping("")
	public R delete(@RequestBody Long[] liveRoomCommentIds){
		liveRoomCommentService.deleteBatch(liveRoomCommentIds);
		
		return R.ok();
	}
	
}
