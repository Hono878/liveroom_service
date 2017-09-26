package com.miner.pinecone.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.experimental.Accessors;



/**
 * 直播活动表
 * 
 * @author hushangjie
 * @email 979783618@qq.com
 * @date 2017-09-26 18:37:09
 */
@Data
@Accessors(chain = true)
public class LiveRoomEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//活动直播间id
	private String liveRoomId;
	//直播活动创建人
	private Long userId;
	//活动主办机构id
	private Integer orgId;
	//活动标题
	private String eventTitle;
	//直播类别id
	private Integer eventTypeId;
	//活动预计开始时间：主要用来配合生成推流过期时间
	private Date eventStartTime;
	//直播结束时间，由腾讯回调设置
	private Date eventEndTime;
	//直播间描述
	private String eventDesc;
	//直播间观看人数：通过查询直播间拉流人数+点播观看人数+自定义
	private Integer eventVisitedNum;
	//融云聊天室id
	private String chatRoomId;
	//背景图
	private String backImg;
	//直播海报封面(由用户设置)
	private String livePoster;
	//直播中自动截图(由腾讯云自动返回地址，时间间隔为2分钟)
	private String liveShot;
	//直播间状态：0-未开始1-直播中2-结束
	private boolean liveStatus;
	//直播间推流地址
	private String pushUrl;
	//直播间拉流rtmp地址
	private String liveRtmp;
	//直播间拉流hls地址
	private String liveHls;
	//直播间拉流hlv地址
	private String liveFlv;
	//是否需要录制
	private boolean enableRecord;
	//录像回看地址
	private String replayUrl;
	//记录创建时间
	private Date createTime;

}
