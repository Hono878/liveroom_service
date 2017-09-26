package com.miner.pinecone.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.miner.pinecone.dao.LiveAdPageDao;
import com.miner.pinecone.entity.LiveAdPageEntity;
import com.miner.pinecone.service.LiveAdPageService;



@Service("liveAdPageService")
public class LiveAdPageServiceImpl implements LiveAdPageService {
	@Autowired
	private LiveAdPageDao liveAdPageDao;
	
	@Override
	public LiveAdPageEntity queryObject(Long h5AdPageId){
		return liveAdPageDao.queryObject(h5AdPageId);
	}
	
	@Override
	public List<LiveAdPageEntity> queryList(Map<String, Object> map){
		return liveAdPageDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return liveAdPageDao.queryTotal(map);
	}
	
	@Override
	public void save(LiveAdPageEntity liveAdPage){
		liveAdPageDao.save(liveAdPage);
	}
	
	@Override
	public void update(LiveAdPageEntity liveAdPage){
		liveAdPageDao.update(liveAdPage);
	}
	
	@Override
	public void delete(Long h5AdPageId){
		liveAdPageDao.delete(h5AdPageId);
	}
	
	@Override
	public void deleteBatch(Long[] h5AdPageIds){
		liveAdPageDao.deleteBatch(h5AdPageIds);
	}
	
}
