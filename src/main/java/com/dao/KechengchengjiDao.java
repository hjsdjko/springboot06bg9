package com.dao;

import com.entity.KechengchengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KechengchengjiVO;
import com.entity.view.KechengchengjiView;


/**
 * 课程成绩
 * 
 * @author 
 * @email 
 * @date 2023-02-24 21:32:40
 */
public interface KechengchengjiDao extends BaseMapper<KechengchengjiEntity> {
	
	List<KechengchengjiVO> selectListVO(@Param("ew") Wrapper<KechengchengjiEntity> wrapper);
	
	KechengchengjiVO selectVO(@Param("ew") Wrapper<KechengchengjiEntity> wrapper);
	
	List<KechengchengjiView> selectListView(@Param("ew") Wrapper<KechengchengjiEntity> wrapper);

	List<KechengchengjiView> selectListView(Pagination page,@Param("ew") Wrapper<KechengchengjiEntity> wrapper);
	
	KechengchengjiView selectView(@Param("ew") Wrapper<KechengchengjiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KechengchengjiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KechengchengjiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KechengchengjiEntity> wrapper);

    List<Map<String, Object>> fenshuSectionStat(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KechengchengjiEntity> wrapper);


}
