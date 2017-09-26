package com.miner.pinecone.service;

import com.miner.pinecone.entity.LiveRecordTaskEntity;

import java.util.List;
import java.util.Map;

/**
 * 腾讯云录制反馈表
 * 
 * @author hushangjie
 * @email 979783618@qq.com
 * @date 2017-09-26 18:40:01
 */
public interface LiveRecordTaskService {
	
	LiveRecordTaskEntity queryObject(Integer recordId);
	
	List<LiveRecordTaskEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(LiveRecordTaskEntity liveRecordTask);
	
	void update(LiveRecordTaskEntity liveRecordTask);
	
	void delete(Integer recordId);
	
	void deleteBatch(Integer[] recordIds);
}
