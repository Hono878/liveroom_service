package com.miner.pinecone.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.miner.pinecone.dao.LiveRecordTaskDao;
import com.miner.pinecone.entity.LiveRecordTaskEntity;
import com.miner.pinecone.service.LiveRecordTaskService;



@Service("liveRecordTaskService")
public class LiveRecordTaskServiceImpl implements LiveRecordTaskService {
	@Autowired
	private LiveRecordTaskDao liveRecordTaskDao;
	
	@Override
	public LiveRecordTaskEntity queryObject(Integer recordId){
		return liveRecordTaskDao.queryObject(recordId);
	}
	
	@Override
	public List<LiveRecordTaskEntity> queryList(Map<String, Object> map){
		return liveRecordTaskDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return liveRecordTaskDao.queryTotal(map);
	}
	
	@Override
	public void save(LiveRecordTaskEntity liveRecordTask){
		liveRecordTaskDao.save(liveRecordTask);
	}
	
	@Override
	public void update(LiveRecordTaskEntity liveRecordTask){
		liveRecordTaskDao.update(liveRecordTask);
	}
	
	@Override
	public void delete(Integer recordId){
		liveRecordTaskDao.delete(recordId);
	}
	
	@Override
	public void deleteBatch(Integer[] recordIds){
		liveRecordTaskDao.deleteBatch(recordIds);
	}
	
}
