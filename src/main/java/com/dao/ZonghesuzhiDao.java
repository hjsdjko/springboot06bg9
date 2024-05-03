package com.dao;

import com.entity.ZonghesuzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZonghesuzhiVO;
import com.entity.view.ZonghesuzhiView;


/**
 * 综合素质
 * 
 * @author 
 * @email 
 * @date 2023-02-24 21:32:41
 */
public interface ZonghesuzhiDao extends BaseMapper<ZonghesuzhiEntity> {
	
	List<ZonghesuzhiVO> selectListVO(@Param("ew") Wrapper<ZonghesuzhiEntity> wrapper);
	
	ZonghesuzhiVO selectVO(@Param("ew") Wrapper<ZonghesuzhiEntity> wrapper);
	
	List<ZonghesuzhiView> selectListView(@Param("ew") Wrapper<ZonghesuzhiEntity> wrapper);

	List<ZonghesuzhiView> selectListView(Pagination page,@Param("ew") Wrapper<ZonghesuzhiEntity> wrapper);
	
	ZonghesuzhiView selectView(@Param("ew") Wrapper<ZonghesuzhiEntity> wrapper);
	

}
