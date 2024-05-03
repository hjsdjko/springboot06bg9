package com.dao;

import com.entity.KechengxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KechengxinxiVO;
import com.entity.view.KechengxinxiView;


/**
 * 课程信息
 * 
 * @author 
 * @email 
 * @date 2023-02-24 21:32:40
 */
public interface KechengxinxiDao extends BaseMapper<KechengxinxiEntity> {
	
	List<KechengxinxiVO> selectListVO(@Param("ew") Wrapper<KechengxinxiEntity> wrapper);
	
	KechengxinxiVO selectVO(@Param("ew") Wrapper<KechengxinxiEntity> wrapper);
	
	List<KechengxinxiView> selectListView(@Param("ew") Wrapper<KechengxinxiEntity> wrapper);

	List<KechengxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<KechengxinxiEntity> wrapper);
	
	KechengxinxiView selectView(@Param("ew") Wrapper<KechengxinxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KechengxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KechengxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KechengxinxiEntity> wrapper);



}
