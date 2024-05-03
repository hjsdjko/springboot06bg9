package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GonggaotongzhiDao;
import com.entity.GonggaotongzhiEntity;
import com.service.GonggaotongzhiService;
import com.entity.vo.GonggaotongzhiVO;
import com.entity.view.GonggaotongzhiView;

@Service("gonggaotongzhiService")
public class GonggaotongzhiServiceImpl extends ServiceImpl<GonggaotongzhiDao, GonggaotongzhiEntity> implements GonggaotongzhiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GonggaotongzhiEntity> page = this.selectPage(
                new Query<GonggaotongzhiEntity>(params).getPage(),
                new EntityWrapper<GonggaotongzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GonggaotongzhiEntity> wrapper) {
		  Page<GonggaotongzhiView> page =new Query<GonggaotongzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GonggaotongzhiVO> selectListVO(Wrapper<GonggaotongzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GonggaotongzhiVO selectVO(Wrapper<GonggaotongzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GonggaotongzhiView> selectListView(Wrapper<GonggaotongzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GonggaotongzhiView selectView(Wrapper<GonggaotongzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
