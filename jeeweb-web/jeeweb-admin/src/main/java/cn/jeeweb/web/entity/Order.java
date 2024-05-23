package cn.jeeweb.web.entity;

import cn.jeeweb.common.mvc.entity.AbstractEntity;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * All rights Reserved, Designed By www.gzst.gov.cn
 *
 * @version V1.0
 * @package cn.jeeweb.web.entity
 * @title: order实体
 * @description: order实体
 * @author: Allen
 * @date: 2019-02-26 11:27:21
 * @copyright: 2018 www.gzst.gov.cn Inc. All rights reserved.
 */

@TableName("t_order")
@SuppressWarnings("serial")
public class Order extends AbstractEntity<Integer> {

    /**id*/
    @TableId(value = "id", type = IdType.AUTO)
	private Integer id;
    /**code*/
    @TableField(value = "code")
	private String code;
    /**create_time*/

	@JsonFormat(pattern="yyyy-MM-dd HH:mm")
    @TableField(value = "create_time")
	private Date createTime;
	
	/**
	 * 获取  id
	 *@return Integer  id
	 */
	public Integer getId(){
		return this.id;
	}

	/**
	 * 设置  id
	 *@param id  id
	 */
	public void setId(Integer id){
		this.id = id;
	}
	/**
	 * 获取  code
	 *@return String  code
	 */
	public String getCode(){
		return this.code;
	}

	/**
	 * 设置  code
	 *@param code  code
	 */
	public void setCode(String code){
		this.code = code;
	}
	/**
	 * 获取  createTime
	 *@return Date  create_time
	 */
	public Date getCreateTime(){
		return this.createTime;
	}

	/**
	 * 设置  createTime
	 *@param createTime  create_time
	 */
	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}
	
}