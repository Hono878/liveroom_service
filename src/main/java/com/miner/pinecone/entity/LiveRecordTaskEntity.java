package com.miner.pinecone.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.experimental.Accessors;



/**
 * 腾讯云录制反馈表
 * 
 * @author hushangjie
 * @email 979783618@qq.com
 * @date 2017-09-26 18:40:01
 */
@Data
@Accessors(chain = true)
public class LiveRecordTaskEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer recordId;
	//腾讯云返回录制id
	private Integer taskId;
	//录制的流名称
	private String streamId;
	//录制时间
	private Date recordTime;
	//录制是否结束
	private boolean isOver;

}
