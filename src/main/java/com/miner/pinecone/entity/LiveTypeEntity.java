package com.miner.pinecone.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.experimental.Accessors;



/**
 * 活动类别
 * 
 * @author hushangjie
 * @email 979783618@qq.com
 * @date 2017-09-26 18:40:01
 */
@Data
@Accessors(chain = true)
public class LiveTypeEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer liveTypeId;
	//直播类别名称
	private String typeName;
	//直播类别描述
	private String typeDesc;
	//直播类别所属机构id
	private Long orgId;

}
