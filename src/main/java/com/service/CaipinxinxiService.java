package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CaipinxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CaipinxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CaipinxinxiView;


/**
 * 菜品信息
 *
 * @author 
 * @email 
 * @date 2023-02-24 11:17:07
 */
public interface CaipinxinxiService extends IService<CaipinxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CaipinxinxiVO> selectListVO(Wrapper<CaipinxinxiEntity> wrapper);
   	
   	CaipinxinxiVO selectVO(@Param("ew") Wrapper<CaipinxinxiEntity> wrapper);
   	
   	List<CaipinxinxiView> selectListView(Wrapper<CaipinxinxiEntity> wrapper);
   	
   	CaipinxinxiView selectView(@Param("ew") Wrapper<CaipinxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CaipinxinxiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<CaipinxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<CaipinxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<CaipinxinxiEntity> wrapper);



}

