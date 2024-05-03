package com.dao;

import com.entity.BiyexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BiyexinxiVO;
import com.entity.view.BiyexinxiView;


/**
 * 毕业信息
 * 
 * @author 
 * @email 
 * @date 2023-02-24 21:32:40
 */
public interface BiyexinxiDao extends BaseMapper<BiyexinxiEntity> {
	
	List<BiyexinxiVO> selectListVO(@Param("ew") Wrapper<BiyexinxiEntity> wrapper);
	
	BiyexinxiVO selectVO(@Param("ew") Wrapper<BiyexinxiEntity> wrapper);
	
	List<BiyexinxiView> selectListView(@Param("ew") Wrapper<BiyexinxiEntity> wrapper);

	List<BiyexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<BiyexinxiEntity> wrapper);
	
	BiyexinxiView selectView(@Param("ew") Wrapper<BiyexinxiEntity> wrapper);
	

}
