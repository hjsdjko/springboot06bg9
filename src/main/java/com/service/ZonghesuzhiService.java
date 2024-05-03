package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZonghesuzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZonghesuzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZonghesuzhiView;


/**
 * 综合素质
 *
 * @author 
 * @email 
 * @date 2023-02-24 21:32:41
 */
public interface ZonghesuzhiService extends IService<ZonghesuzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZonghesuzhiVO> selectListVO(Wrapper<ZonghesuzhiEntity> wrapper);
   	
   	ZonghesuzhiVO selectVO(@Param("ew") Wrapper<ZonghesuzhiEntity> wrapper);
   	
   	List<ZonghesuzhiView> selectListView(Wrapper<ZonghesuzhiEntity> wrapper);
   	
   	ZonghesuzhiView selectView(@Param("ew") Wrapper<ZonghesuzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZonghesuzhiEntity> wrapper);
   	

}

