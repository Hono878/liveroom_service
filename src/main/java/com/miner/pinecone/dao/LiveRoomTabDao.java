package com.miner.pinecone.dao;

import com.miner.pinecone.entity.LiveRoomTabEntity;
import com.miner.pinecone.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
/**
 * 直播间菜单栏
 * 
 * @author hushangjie
 * @email 979783618@qq.com
 * @date 2017-09-26 18:40:01
 */
@Mapper
@Repository
public interface LiveRoomTabDao extends BaseDao<LiveRoomTabEntity> {
	
}
