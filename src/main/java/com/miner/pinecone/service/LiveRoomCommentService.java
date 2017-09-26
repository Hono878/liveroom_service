package com.miner.pinecone.service;

import com.miner.pinecone.entity.LiveRoomCommentEntity;

import java.util.List;
import java.util.Map;

/**
 * 直播间评论表
 * 
 * @author hushangjie
 * @email 979783618@qq.com
 * @date 2017-09-26 18:37:09
 */
public interface LiveRoomCommentService {
	
	LiveRoomCommentEntity queryObject(Long liveRoomCommentId);
	
	List<LiveRoomCommentEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(LiveRoomCommentEntity liveRoomComment);
	
	void update(LiveRoomCommentEntity liveRoomComment);
	
	void delete(Long liveRoomCommentId);
	
	void deleteBatch(Long[] liveRoomCommentIds);
}
