package com.miner.pinecone.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.experimental.Accessors;



/**
 * h5广告页面
 * 
 * @author hushangjie
 * @email 979783618@qq.com
 * @date 2017-09-26 18:40:01
 */
@Data
@Accessors(chain = true)
public class LiveAdPageEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//h5广告页自增长id
	private Long h5AdPageId;
	//h5广告跳转页面地址
	private String pageUrl;
	//直播活动id
	private Long eventId;

}
