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
 * 综合素质
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-24 21:32:41
 */
@TableName("zonghesuzhi")
public class ZonghesuzhiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZonghesuzhiEntity() {
		
	}
	
	public ZonghesuzhiEntity(T t) {
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
	 * 学号
	 */
					
	private String xuehao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
