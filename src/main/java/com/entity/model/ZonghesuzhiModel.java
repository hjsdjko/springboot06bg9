package com.entity.model;

import com.entity.ZonghesuzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 综合素质
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-02-24 21:32:41
 */
public class ZonghesuzhiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 学院
	 */
	
	private String xueyuan;
		
	/**
	 * 班级
	 */
	
	private String banji;
		
	/**
	 * 学习能力
	 */
	
	private String xuexinengli;
		
	/**
	 * 思想品德
	 */
	
	private String sixiangpinde;
		
	/**
	 * 运动健康
	 */
	
	private String yundongjiankang;
		
	/**
	 * 心理素质
	 */
	
	private String xinlisuzhi;
		
	/**
	 * 老师评价
	 */
	
	private String laoshipingjia;
		
	/**
	 * 评价日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date pingjiariqi;
		
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
				
	
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
	 * 设置：学院
	 */
	 
	public void setXueyuan(String xueyuan) {
		this.xueyuan = xueyuan;
	}
	
	/**
	 * 获取：学院
	 */
	public String getXueyuan() {
		return xueyuan;
	}
				
	
	/**
	 * 设置：班级
	 */
	 
	public void setBanji(String banji) {
		this.banji = banji;
	}
	
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
				
	
	/**
	 * 设置：学习能力
	 */
	 
	public void setXuexinengli(String xuexinengli) {
		this.xuexinengli = xuexinengli;
	}
	
	/**
	 * 获取：学习能力
	 */
	public String getXuexinengli() {
		return xuexinengli;
	}
				
	
	/**
	 * 设置：思想品德
	 */
	 
	public void setSixiangpinde(String sixiangpinde) {
		this.sixiangpinde = sixiangpinde;
	}
	
	/**
	 * 获取：思想品德
	 */
	public String getSixiangpinde() {
		return sixiangpinde;
	}
				
	
	/**
	 * 设置：运动健康
	 */
	 
	public void setYundongjiankang(String yundongjiankang) {
		this.yundongjiankang = yundongjiankang;
	}
	
	/**
	 * 获取：运动健康
	 */
	public String getYundongjiankang() {
		return yundongjiankang;
	}
				
	
	/**
	 * 设置：心理素质
	 */
	 
	public void setXinlisuzhi(String xinlisuzhi) {
		this.xinlisuzhi = xinlisuzhi;
	}
	
	/**
	 * 获取：心理素质
	 */
	public String getXinlisuzhi() {
		return xinlisuzhi;
	}
				
	
	/**
	 * 设置：老师评价
	 */
	 
	public void setLaoshipingjia(String laoshipingjia) {
		this.laoshipingjia = laoshipingjia;
	}
	
	/**
	 * 获取：老师评价
	 */
	public String getLaoshipingjia() {
		return laoshipingjia;
	}
				
	
	/**
	 * 设置：评价日期
	 */
	 
	public void setPingjiariqi(Date pingjiariqi) {
		this.pingjiariqi = pingjiariqi;
	}
	
	/**
	 * 获取：评价日期
	 */
	public Date getPingjiariqi() {
		return pingjiariqi;
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
			
}
