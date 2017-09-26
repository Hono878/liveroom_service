package com.miner.pinecone.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.miner.pinecone.dao.LiveRoomTabDao;
import com.miner.pinecone.entity.LiveRoomTabEntity;
import com.miner.pinecone.service.LiveRoomTabService;



@Service("liveRoomTabService")
public class LiveRoomTabServiceImpl implements LiveRoomTabService {
	@Autowired
	private LiveRoomTabDao liveRoomTabDao;
	
	@Override
	public LiveRoomTabEntity queryObject(Long liveRoomTabId){
		return liveRoomTabDao.queryObject(liveRoomTabId);
	}
	
	@Override
	public List<LiveRoomTabEntity> queryList(Map<String, Object> map){
		return liveRoomTabDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return liveRoomTabDao.queryTotal(map);
	}
	
	@Override
	public void save(LiveRoomTabEntity liveRoomTab){
		liveRoomTabDao.save(liveRoomTab);
	}
	
	@Override
	public void update(LiveRoomTabEntity liveRoomTab){
		liveRoomTabDao.update(liveRoomTab);
	}
	
	@Override
	public void delete(Long liveRoomTabId){
		liveRoomTabDao.delete(liveRoomTabId);
	}
	
	@Override
	public void deleteBatch(Long[] liveRoomTabIds){
		liveRoomTabDao.deleteBatch(liveRoomTabIds);
	}
	
}
