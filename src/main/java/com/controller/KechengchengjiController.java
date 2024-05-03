package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.KechengchengjiEntity;
import com.entity.view.KechengchengjiView;

import com.service.KechengchengjiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 课程成绩
 * 后端接口
 * @author 
 * @email 
 * @date 2023-02-24 21:32:40
 */
@RestController
@RequestMapping("/kechengchengji")
public class KechengchengjiController {
    @Autowired
    private KechengchengjiService kechengchengjiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,KechengchengjiEntity kechengchengji,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			kechengchengji.setXuehao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiaoshi")) {
			kechengchengji.setGonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<KechengchengjiEntity> ew = new EntityWrapper<KechengchengjiEntity>();

		PageUtils page = kechengchengjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kechengchengji), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,KechengchengjiEntity kechengchengji, 
		HttpServletRequest request){
        EntityWrapper<KechengchengjiEntity> ew = new EntityWrapper<KechengchengjiEntity>();

		PageUtils page = kechengchengjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kechengchengji), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( KechengchengjiEntity kechengchengji){
       	EntityWrapper<KechengchengjiEntity> ew = new EntityWrapper<KechengchengjiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( kechengchengji, "kechengchengji")); 
        return R.ok().put("data", kechengchengjiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(KechengchengjiEntity kechengchengji){
        EntityWrapper< KechengchengjiEntity> ew = new EntityWrapper< KechengchengjiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( kechengchengji, "kechengchengji")); 
		KechengchengjiView kechengchengjiView =  kechengchengjiService.selectView(ew);
		return R.ok("查询课程成绩成功").put("data", kechengchengjiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        KechengchengjiEntity kechengchengji = kechengchengjiService.selectById(id);
        return R.ok().put("data", kechengchengji);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        KechengchengjiEntity kechengchengji = kechengchengjiService.selectById(id);
        return R.ok().put("data", kechengchengji);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody KechengchengjiEntity kechengchengji, HttpServletRequest request){
    	kechengchengji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(kechengchengji);
        kechengchengjiService.insert(kechengchengji);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody KechengchengjiEntity kechengchengji, HttpServletRequest request){
    	kechengchengji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(kechengchengji);
        kechengchengjiService.insert(kechengchengji);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody KechengchengjiEntity kechengchengji, HttpServletRequest request){
        //ValidatorUtils.validateEntity(kechengchengji);
        kechengchengjiService.updateById(kechengchengji);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        kechengchengjiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<KechengchengjiEntity> wrapper = new EntityWrapper<KechengchengjiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiaoshi")) {
			wrapper.eq("gonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = kechengchengjiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	






    /**
     * （按值统计）
     */
    @RequestMapping("/value/{xColumnName}/{yColumnName}")
    public R value(@PathVariable("yColumnName") String yColumnName, @PathVariable("xColumnName") String xColumnName,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("yColumn", yColumnName);
        EntityWrapper<KechengchengjiEntity> ew = new EntityWrapper<KechengchengjiEntity>();
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
            ew.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiaoshi")) {
            ew.eq("gonghao", (String)request.getSession().getAttribute("username"));
		}
        List<Map<String, Object>> result = kechengchengjiService.selectValue(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }

    /**
     * （按值统计）时间统计类型
     */
    @RequestMapping("/value/{xColumnName}/{yColumnName}/{timeStatType}")
    public R valueDay(@PathVariable("yColumnName") String yColumnName, @PathVariable("xColumnName") String xColumnName, @PathVariable("timeStatType") String timeStatType,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("yColumn", yColumnName);
        params.put("timeStatType", timeStatType);
        EntityWrapper<KechengchengjiEntity> ew = new EntityWrapper<KechengchengjiEntity>();
        String tableName = request.getSession().getAttribute("tableName").toString();
        if(tableName.equals("xuesheng")) {
            ew.eq("xuehao", (String)request.getSession().getAttribute("username"));
        }
        if(tableName.equals("jiaoshi")) {
            ew.eq("gonghao", (String)request.getSession().getAttribute("username"));
        }
        List<Map<String, Object>> result = kechengchengjiService.selectTimeStatValue(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }

    /**
     * 分组统计
     */
    @RequestMapping("/group/{columnName}")
    public R group(@PathVariable("columnName") String columnName,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("column", columnName);
        EntityWrapper<KechengchengjiEntity> ew = new EntityWrapper<KechengchengjiEntity>();
        String tableName = request.getSession().getAttribute("tableName").toString();
        if(tableName.equals("xuesheng")) {
            ew.eq("xuehao", (String)request.getSession().getAttribute("username"));
        }
        if(tableName.equals("jiaoshi")) {
            ew.eq("gonghao", (String)request.getSession().getAttribute("username"));
        }
        List<Map<String, Object>> result = kechengchengjiService.selectGroup(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }

    /**
     * 分段统计
     */
    @RequestMapping("/sectionStat/fenshu")
    @IgnoreAuth
    public R fenshuSectionStat(HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        EntityWrapper<KechengchengjiEntity> ew = new EntityWrapper<KechengchengjiEntity>();
        String tableName = request.getSession().getAttribute("tableName").toString();
        if(tableName.equals("xuesheng")) {
            ew.eq("xuehao", (String)request.getSession().getAttribute("username"));
        }
        if(tableName.equals("jiaoshi")) {
            ew.eq("gonghao", (String)request.getSession().getAttribute("username"));
        }
        List<Map<String, Object>> result = kechengchengjiService.fenshuSectionStat(params, ew);
        return R.ok().put("data", result);
    }



    /**
     * 总数量
     */
    @RequestMapping("/count")
    public R count(@RequestParam Map<String, Object> params,KechengchengjiEntity kechengchengji, HttpServletRequest request){
        String tableName = request.getSession().getAttribute("tableName").toString();
        if(tableName.equals("xuesheng")) {
            kechengchengji.setXuehao((String)request.getSession().getAttribute("username"));
        }
        if(tableName.equals("jiaoshi")) {
            kechengchengji.setGonghao((String)request.getSession().getAttribute("username"));
        }
        EntityWrapper<KechengchengjiEntity> ew = new EntityWrapper<KechengchengjiEntity>();
        int count = kechengchengjiService.selectCount(MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kechengchengji), params), params));
        return R.ok().put("data", count);
    }


}
