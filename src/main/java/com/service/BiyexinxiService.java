package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BiyexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BiyexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BiyexinxiView;


/**
 * 毕业信息
 *
 * @author 
 * @email 
 * @date 2023-02-24 21:32:40
 */
public interface BiyexinxiService extends IService<BiyexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BiyexinxiVO> selectListVO(Wrapper<BiyexinxiEntity> wrapper);
   	
   	BiyexinxiVO selectVO(@Param("ew") Wrapper<BiyexinxiEntity> wrapper);
   	
   	List<BiyexinxiView> selectListView(Wrapper<BiyexinxiEntity> wrapper);
   	
   	BiyexinxiView selectView(@Param("ew") Wrapper<BiyexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BiyexinxiEntity> wrapper);
   	

}

