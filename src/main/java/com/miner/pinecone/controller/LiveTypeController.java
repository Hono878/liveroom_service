package com.miner.pinecone.controller;

import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.miner.pinecone.entity.LiveTypeEntity;
import com.miner.pinecone.service.LiveTypeService;
import com.miner.pinecone.common.utils.PageUtils;
import com.miner.pinecone.common.utils.Query;
import com.miner.pinecone.common.utils.R;




/**
 * 活动类别
 * 
 * @author hushangjie
 * @email 979783618@qq.com
 * @date 2017-09-26 18:40:01
 */
@RestController
@RequestMapping("livetype")
public class LiveTypeController {
	@Autowired
	private LiveTypeService liveTypeService;
	
	/**
	 * 列表
	 */
	@GetMapping("")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		if (params.get("page") != null && params.get("limit")!= null){
			List<LiveTypeEntity> liveTypeList = liveTypeService.queryList(query);
			int total = liveTypeService.queryTotal(query);
			
			PageUtils pageUtil = new PageUtils(liveTypeList, total, query.getLimit(), query.getPage());
			
			return R.ok().put("page", pageUtil);
		}else{
			List<LiveTypeEntity> liveTypeList = liveTypeService.queryList(query);
			return R.ok().put("list", liveTypeList);
		}
		
	}
	
	
	/**
	 * 信息
	 */
	@GetMapping("/{liveTypeId}")
	public R info(@PathVariable("liveTypeId") Integer liveTypeId){
		LiveTypeEntity liveType = liveTypeService.queryObject(liveTypeId);
		
		return R.ok().put("liveType", liveType);
	}
	
	/**
	 * 保存
	 */
	@PostMapping("")
	public R save(@RequestBody LiveTypeEntity liveType){
		liveTypeService.save(liveType);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@PutMapping("")
	public R update(@RequestBody LiveTypeEntity liveType){
		liveTypeService.update(liveType);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@DeleteMapping("")
	public R delete(@RequestBody Integer[] liveTypeIds){
		liveTypeService.deleteBatch(liveTypeIds);
		
		return R.ok();
	}
	
}
