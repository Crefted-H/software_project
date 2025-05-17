package com.dao;

import com.entity.ShetuanchengyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShetuanchengyuanVO;
import com.entity.view.ShetuanchengyuanView;


/**
 * 集体成员
 * 
 * @author 
 * @email 
 * @date 
 */
public interface ShetuanchengyuanDao extends BaseMapper<ShetuanchengyuanEntity> {
	
	List<ShetuanchengyuanVO> selectListVO(@Param("ew") Wrapper<ShetuanchengyuanEntity> wrapper);
	
	ShetuanchengyuanVO selectVO(@Param("ew") Wrapper<ShetuanchengyuanEntity> wrapper);
	
	List<ShetuanchengyuanView> selectListView(@Param("ew") Wrapper<ShetuanchengyuanEntity> wrapper);

	List<ShetuanchengyuanView> selectListView(Pagination page,@Param("ew") Wrapper<ShetuanchengyuanEntity> wrapper);
	
	ShetuanchengyuanView selectView(@Param("ew") Wrapper<ShetuanchengyuanEntity> wrapper);
	
}
