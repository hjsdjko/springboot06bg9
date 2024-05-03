package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GonggaotongzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GonggaotongzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GonggaotongzhiView;


/**
 * 公告通知
 *
 * @author 
 * @email 
 * @date 2023-02-24 21:32:40
 */
public interface GonggaotongzhiService extends IService<GonggaotongzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GonggaotongzhiVO> selectListVO(Wrapper<GonggaotongzhiEntity> wrapper);
   	
   	GonggaotongzhiVO selectVO(@Param("ew") Wrapper<GonggaotongzhiEntity> wrapper);
   	
   	List<GonggaotongzhiView> selectListView(Wrapper<GonggaotongzhiEntity> wrapper);
   	
   	GonggaotongzhiView selectView(@Param("ew") Wrapper<GonggaotongzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GonggaotongzhiEntity> wrapper);
   	

}

