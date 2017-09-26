package com.miner.pinecone.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.experimental.Accessors;



/**
 * 直播间评论表
 * 
 * @author hushangjie
 * @email 979783618@qq.com
 * @date 2017-09-26 18:37:09
 */
@Data
@Accessors(chain = true)
public class LiveRoomCommentEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//直播间评论自增长id
	private Long liveRoomCommentId;
	//评论对应直播间id
	private String liveRoomId;
	//评论者昵称
	private String nickName;
	//评论者头像
	private String avatar;
	//评论内容
	private String comment;
	//点赞数
	private Integer commentUp;
	//评论时间
	private Date commentTime;

}
