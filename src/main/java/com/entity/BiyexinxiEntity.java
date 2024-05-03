package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 毕业信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-24 21:32:40
 */
@TableName("biyexinxi")
public class BiyexinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BiyexinxiEntity() {
		
	}
	
	public BiyexinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 就业企业
	 */
					
	private String jiuyeqiye;
	
	/**
	 * 就业地点
	 */
					
	private String jiuyedidian;
	
	/**
	 * 工号
	 */
					
	private String gonghao;
	
	/**
	 * 教师姓名
	 */
					
	private String jiaoshixingming;
	
	/**
	 * 就业时间
	 */
					
	private String jiuyeshijian;
	
	/**
	 * 就业方向
	 */
					
	private String jiuyefangxiang;
	
	/**
	 * 离校时间
	 */
					
	private String lixiaoshijian;
	
	/**
	 * 信息备注
	 */
					
	private String xinxibeizhu;
	
	/**
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：就业企业
	 */
	public void setJiuyeqiye(String jiuyeqiye) {
		this.jiuyeqiye = jiuyeqiye;
	}
	/**
	 * 获取：就业企业
	 */
	public String getJiuyeqiye() {
		return jiuyeqiye;
	}
	/**
	 * 设置：就业地点
	 */
	public void setJiuyedidian(String jiuyedidian) {
		this.jiuyedidian = jiuyedidian;
	}
	/**
	 * 获取：就业地点
	 */
	public String getJiuyedidian() {
		return jiuyedidian;
	}
	/**
	 * 设置：工号
	 */
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
	/**
	 * 设置：教师姓名
	 */
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
	/**
	 * 设置：就业时间
	 */
	public void setJiuyeshijian(String jiuyeshijian) {
		this.jiuyeshijian = jiuyeshijian;
	}
	/**
	 * 获取：就业时间
	 */
	public String getJiuyeshijian() {
		return jiuyeshijian;
	}
	/**
	 * 设置：就业方向
	 */
	public void setJiuyefangxiang(String jiuyefangxiang) {
		this.jiuyefangxiang = jiuyefangxiang;
	}
	/**
	 * 获取：就业方向
	 */
	public String getJiuyefangxiang() {
		return jiuyefangxiang;
	}
	/**
	 * 设置：离校时间
	 */
	public void setLixiaoshijian(String lixiaoshijian) {
		this.lixiaoshijian = lixiaoshijian;
	}
	/**
	 * 获取：离校时间
	 */
	public String getLixiaoshijian() {
		return lixiaoshijian;
	}
	/**
	 * 设置：信息备注
	 */
	public void setXinxibeizhu(String xinxibeizhu) {
		this.xinxibeizhu = xinxibeizhu;
	}
	/**
	 * 获取：信息备注
	 */
	public String getXinxibeizhu() {
		return xinxibeizhu;
	}
	/**
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}

}
