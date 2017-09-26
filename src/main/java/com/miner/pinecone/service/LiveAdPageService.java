package com.miner.pinecone.service;

import com.miner.pinecone.entity.LiveAdPageEntity;

import java.util.List;
import java.util.Map;

/**
 * h5广告页面
 * 
 * @author hushangjie
 * @email 979783618@qq.com
 * @date 2017-09-26 18:40:01
 */
public interface LiveAdPageService {
	
	LiveAdPageEntity queryObject(Long h5AdPageId);
	
	List<LiveAdPageEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(LiveAdPageEntity liveAdPage);
	
	void update(LiveAdPageEntity liveAdPage);
	
	void delete(Long h5AdPageId);
	
	void deleteBatch(Long[] h5AdPageIds);
}
