package com.miner.pinecone.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.experimental.Accessors;



/**
 * 直播间菜单栏
 * 
 * @author hushangjie
 * @email 979783618@qq.com
 * @date 2017-09-26 18:40:01
 */
@Data
@Accessors(chain = true)
public class LiveRoomTabEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Long liveRoomTabId;
	//直播活动id
	private Long liveRoomId;
	//菜单名称
	private String tabName;
	//菜单内容
	private String tabContent;

}
