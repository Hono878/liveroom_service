package com.miner.pinecone.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.miner.pinecone.dao.LiveRoomCommentDao;
import com.miner.pinecone.entity.LiveRoomCommentEntity;
import com.miner.pinecone.service.LiveRoomCommentService;



@Service("liveRoomCommentService")
public class LiveRoomCommentServiceImpl implements LiveRoomCommentService {
	@Autowired
	private LiveRoomCommentDao liveRoomCommentDao;
	
	@Override
	public LiveRoomCommentEntity queryObject(Long liveRoomCommentId){
		return liveRoomCommentDao.queryObject(liveRoomCommentId);
	}
	
	@Override
	public List<LiveRoomCommentEntity> queryList(Map<String, Object> map){
		return liveRoomCommentDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return liveRoomCommentDao.queryTotal(map);
	}
	
	@Override
	public void save(LiveRoomCommentEntity liveRoomComment){
		liveRoomCommentDao.save(liveRoomComment);
	}
	
	@Override
	public void update(LiveRoomCommentEntity liveRoomComment){
		liveRoomCommentDao.update(liveRoomComment);
	}
	
	@Override
	public void delete(Long liveRoomCommentId){
		liveRoomCommentDao.delete(liveRoomCommentId);
	}
	
	@Override
	public void deleteBatch(Long[] liveRoomCommentIds){
		liveRoomCommentDao.deleteBatch(liveRoomCommentIds);
	}
	
}
