package com.miner.pinecone.controller;

import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.miner.pinecone.entity.LiveRecordTaskEntity;
import com.miner.pinecone.service.LiveRecordTaskService;
import com.miner.pinecone.common.utils.PageUtils;
import com.miner.pinecone.common.utils.Query;
import com.miner.pinecone.common.utils.R;




/**
 * 腾讯云录制反馈表
 * 
 * @author hushangjie
 * @email 979783618@qq.com
 * @date 2017-09-26 18:40:01
 */
@RestController
@RequestMapping("live_record_task")
public class LiveRecordTaskController {
	@Autowired
	private LiveRecordTaskService liveRecordTaskService;
	
	/**
	 * 列表
	 */
	@GetMapping("")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		if (params.get("page") != null && params.get("limit")!= null){
			List<LiveRecordTaskEntity> liveRecordTaskList = liveRecordTaskService.queryList(query);
			int total = liveRecordTaskService.queryTotal(query);
			
			PageUtils pageUtil = new PageUtils(liveRecordTaskList, total, query.getLimit(), query.getPage());
			
			return R.ok().put("page", pageUtil);
		}else{
			List<LiveRecordTaskEntity> liveRecordTaskList = liveRecordTaskService.queryList(query);
			return R.ok().put("list", liveRecordTaskList);
		}
		
	}
	
	
	/**
	 * 信息
	 */
	@GetMapping("/{recordId}")
	public R info(@PathVariable("recordId") Integer recordId){
		LiveRecordTaskEntity liveRecordTask = liveRecordTaskService.queryObject(recordId);
		
		return R.ok().put("liveRecordTask", liveRecordTask);
	}
	
	/**
	 * 保存
	 */
	@PostMapping("")
	public R save(@RequestBody LiveRecordTaskEntity liveRecordTask){
		liveRecordTaskService.save(liveRecordTask);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@PutMapping("")
	public R update(@RequestBody LiveRecordTaskEntity liveRecordTask){
		liveRecordTaskService.update(liveRecordTask);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@DeleteMapping("")
	public R delete(@RequestBody Integer[] recordIds){
		liveRecordTaskService.deleteBatch(recordIds);
		
		return R.ok();
	}
	
}
