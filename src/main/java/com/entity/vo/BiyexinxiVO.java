package com.entity.vo;

import com.entity.BiyexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 毕业信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-02-24 21:32:40
 */
public class BiyexinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
