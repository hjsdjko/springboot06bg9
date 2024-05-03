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


import com.dao.XueshengkaoqinDao;
import com.entity.XueshengkaoqinEntity;
import com.service.XueshengkaoqinService;
import com.entity.vo.XueshengkaoqinVO;
import com.entity.view.XueshengkaoqinView;

@Service("xueshengkaoqinService")
public class XueshengkaoqinServiceImpl extends ServiceImpl<XueshengkaoqinDao, XueshengkaoqinEntity> implements XueshengkaoqinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengkaoqinEntity> page = this.selectPage(
                new Query<XueshengkaoqinEntity>(params).getPage(),
                new EntityWrapper<XueshengkaoqinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengkaoqinEntity> wrapper) {
		  Page<XueshengkaoqinView> page =new Query<XueshengkaoqinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengkaoqinVO> selectListVO(Wrapper<XueshengkaoqinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengkaoqinVO selectVO(Wrapper<XueshengkaoqinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengkaoqinView> selectListView(Wrapper<XueshengkaoqinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengkaoqinView selectView(Wrapper<XueshengkaoqinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<XueshengkaoqinEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<XueshengkaoqinEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<XueshengkaoqinEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }


    @Override
    public List<Map<String, Object>> xingmingkaoqinzhuangkuangTypeStat(Map<String, Object> params, Wrapper<XueshengkaoqinEntity> wrapper) {
        return baseMapper.xingmingkaoqinzhuangkuangTypeStat(params, wrapper);
    }


}
