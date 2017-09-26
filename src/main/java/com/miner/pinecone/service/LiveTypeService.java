package com.miner.pinecone.service;

import com.miner.pinecone.entity.LiveTypeEntity;

import java.util.List;
import java.util.Map;

/**
 * 活动类别
 * 
 * @author hushangjie
 * @email 979783618@qq.com
 * @date 2017-09-26 18:40:01
 */
public interface LiveTypeService {
	
	LiveTypeEntity queryObject(Integer liveTypeId);
	
	List<LiveTypeEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(LiveTypeEntity liveType);
	
	void update(LiveTypeEntity liveType);
	
	void delete(Integer liveTypeId);
	
	void deleteBatch(Integer[] liveTypeIds);
}
