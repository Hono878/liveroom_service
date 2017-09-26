package com.miner.pinecone.dao;

import com.miner.pinecone.entity.LiveRoomCommentEntity;
import com.miner.pinecone.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
/**
 * 直播间评论表
 * 
 * @author hushangjie
 * @email 979783618@qq.com
 * @date 2017-09-26 18:37:09
 */
@Mapper
@Repository
public interface LiveRoomCommentDao extends BaseDao<LiveRoomCommentEntity> {
	
}
