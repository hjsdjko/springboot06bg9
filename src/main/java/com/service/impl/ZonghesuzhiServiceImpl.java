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


import com.dao.ZonghesuzhiDao;
import com.entity.ZonghesuzhiEntity;
import com.service.ZonghesuzhiService;
import com.entity.vo.ZonghesuzhiVO;
import com.entity.view.ZonghesuzhiView;

@Service("zonghesuzhiService")
public class ZonghesuzhiServiceImpl extends ServiceImpl<ZonghesuzhiDao, ZonghesuzhiEntity> implements ZonghesuzhiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZonghesuzhiEntity> page = this.selectPage(
                new Query<ZonghesuzhiEntity>(params).getPage(),
                new EntityWrapper<ZonghesuzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZonghesuzhiEntity> wrapper) {
		  Page<ZonghesuzhiView> page =new Query<ZonghesuzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZonghesuzhiVO> selectListVO(Wrapper<ZonghesuzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZonghesuzhiVO selectVO(Wrapper<ZonghesuzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZonghesuzhiView> selectListView(Wrapper<ZonghesuzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZonghesuzhiView selectView(Wrapper<ZonghesuzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
