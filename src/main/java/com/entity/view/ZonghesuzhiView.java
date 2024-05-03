package com.entity.view;

import com.entity.ZonghesuzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 综合素质
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-24 21:32:41
 */
@TableName("zonghesuzhi")
public class ZonghesuzhiView  extends ZonghesuzhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZonghesuzhiView(){
	}
 
 	public ZonghesuzhiView(ZonghesuzhiEntity zonghesuzhiEntity){
 	try {
			BeanUtils.copyProperties(this, zonghesuzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
