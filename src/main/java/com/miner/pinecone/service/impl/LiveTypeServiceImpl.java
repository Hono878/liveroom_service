package com.miner.pinecone.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.miner.pinecone.dao.LiveTypeDao;
import com.miner.pinecone.entity.LiveTypeEntity;
import com.miner.pinecone.service.LiveTypeService;



@Service("liveTypeService")
public class LiveTypeServiceImpl implements LiveTypeService {
	@Autowired
	private LiveTypeDao liveTypeDao;
	
	@Override
	public LiveTypeEntity queryObject(Integer liveTypeId){
		return liveTypeDao.queryObject(liveTypeId);
	}
	
	@Override
	public List<LiveTypeEntity> queryList(Map<String, Object> map){
		return liveTypeDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return liveTypeDao.queryTotal(map);
	}
	
	@Override
	public void save(LiveTypeEntity liveType){
		liveTypeDao.save(liveType);
	}
	
	@Override
	public void update(LiveTypeEntity liveType){
		liveTypeDao.update(liveType);
	}
	
	@Override
	public void delete(Integer liveTypeId){
		liveTypeDao.delete(liveTypeId);
	}
	
	@Override
	public void deleteBatch(Integer[] liveTypeIds){
		liveTypeDao.deleteBatch(liveTypeIds);
	}
	
}
