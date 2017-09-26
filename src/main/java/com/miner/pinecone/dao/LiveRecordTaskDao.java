package com.miner.pinecone.dao;

import com.miner.pinecone.entity.LiveRecordTaskEntity;
import com.miner.pinecone.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
/**
 * 腾讯云录制反馈表
 * 
 * @author hushangjie
 * @email 979783618@qq.com
 * @date 2017-09-26 18:40:01
 */
@Mapper
@Repository
public interface LiveRecordTaskDao extends BaseDao<LiveRecordTaskEntity> {
	
}
