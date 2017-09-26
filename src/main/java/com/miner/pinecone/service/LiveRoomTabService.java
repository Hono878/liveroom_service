package com.miner.pinecone.service;

import com.miner.pinecone.entity.LiveRoomTabEntity;

import java.util.List;
import java.util.Map;

/**
 * 直播间菜单栏
 * 
 * @author hushangjie
 * @email 979783618@qq.com
 * @date 2017-09-26 18:40:01
 */
public interface LiveRoomTabService {
	
	LiveRoomTabEntity queryObject(Long liveRoomTabId);
	
	List<LiveRoomTabEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(LiveRoomTabEntity liveRoomTab);
	
	void update(LiveRoomTabEntity liveRoomTab);
	
	void delete(Long liveRoomTabId);
	
	void deleteBatch(Long[] liveRoomTabIds);
}
