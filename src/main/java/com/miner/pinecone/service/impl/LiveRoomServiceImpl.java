package com.miner.pinecone.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.miner.pinecone.dao.LiveRoomDao;
import com.miner.pinecone.entity.LiveRoomEntity;
import com.miner.pinecone.service.LiveRoomService;



@Service("liveRoomService")
public class LiveRoomServiceImpl implements LiveRoomService {
	@Autowired
	private LiveRoomDao liveRoomDao;
	
	@Override
	public LiveRoomEntity queryObject(String liveRoomId){
		return liveRoomDao.queryObject(liveRoomId);
	}
	
	@Override
	public List<LiveRoomEntity> queryList(Map<String, Object> map){
		return liveRoomDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return liveRoomDao.queryTotal(map);
	}
	
	@Override
	public void save(LiveRoomEntity liveRoom){
		liveRoomDao.save(liveRoom);
	}
	
	@Override
	public void update(LiveRoomEntity liveRoom){
		liveRoomDao.update(liveRoom);
	}
	
	@Override
	public void delete(String liveRoomId){
		liveRoomDao.delete(liveRoomId);
	}
	
	@Override
	public void deleteBatch(String[] liveRoomIds){
		liveRoomDao.deleteBatch(liveRoomIds);
	}
	
}
