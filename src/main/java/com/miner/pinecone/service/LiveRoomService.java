package com.miner.pinecone.service;

import com.miner.pinecone.entity.LiveRoomEntity;

import java.util.List;
import java.util.Map;

/**
 * 直播活动表
 * 
 * @author hushangjie
 * @email 979783618@qq.com
 * @date 2017-09-26 18:37:09
 */
public interface LiveRoomService {
	
	LiveRoomEntity queryObject(String liveRoomId);
	
	List<LiveRoomEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(LiveRoomEntity liveRoom);
	
	void update(LiveRoomEntity liveRoom);
	
	void delete(String liveRoomId);
	
	void deleteBatch(String[] liveRoomIds);
}
