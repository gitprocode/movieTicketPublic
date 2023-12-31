package com.wfuhui.modules.movie.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.wfuhui.modules.movie.dao.HistoryDao;
import com.wfuhui.modules.movie.entity.HistoryEntity;
import com.wfuhui.modules.movie.service.HistoryService;



@Service("historyService")
public class HistoryServiceImpl implements HistoryService {
	@Autowired
	private HistoryDao historyDao;
	
	@Override
	public HistoryEntity queryObject(Integer id){
		return historyDao.queryObject(id);
	}
	
	@Override
	public List<HistoryEntity> queryList(Map<String, Object> map){
		return historyDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return historyDao.queryTotal(map);
	}
	
	@Override
	public void save(HistoryEntity history){
		historyDao.save(history);
	}
	
	@Override
	public void update(HistoryEntity history){
		historyDao.update(history);
	}
	
	@Override
	public void delete(Integer id){
		historyDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		historyDao.deleteBatch(ids);
	}
	
}
