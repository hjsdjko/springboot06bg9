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


import com.dao.BiyexinxiDao;
import com.entity.BiyexinxiEntity;
import com.service.BiyexinxiService;
import com.entity.vo.BiyexinxiVO;
import com.entity.view.BiyexinxiView;

@Service("biyexinxiService")
public class BiyexinxiServiceImpl extends ServiceImpl<BiyexinxiDao, BiyexinxiEntity> implements BiyexinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BiyexinxiEntity> page = this.selectPage(
                new Query<BiyexinxiEntity>(params).getPage(),
                new EntityWrapper<BiyexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BiyexinxiEntity> wrapper) {
		  Page<BiyexinxiView> page =new Query<BiyexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BiyexinxiVO> selectListVO(Wrapper<BiyexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BiyexinxiVO selectVO(Wrapper<BiyexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BiyexinxiView> selectListView(Wrapper<BiyexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BiyexinxiView selectView(Wrapper<BiyexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
