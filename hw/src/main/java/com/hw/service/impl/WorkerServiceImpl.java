package com.hw.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hw.mapper.WorkerMapper;
import com.hw.pojo.Worker;
import com.hw.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerServiceImpl implements WorkerService {
    @Autowired
    private WorkerMapper workerMapper;
    @Override
    public List<Worker> getWorkerById(Integer id) {
        QueryWrapper<Worker> workerQueryWrapper = new QueryWrapper<>();

        workerQueryWrapper.eq("deptid",id);
        return workerMapper.selectList(workerQueryWrapper);
    }

    @Override
    public int save(Worker worker) {
        return workerMapper.insert(worker);
    }

    @Override
    public int update(Worker worker) {
        return workerMapper.updateById(worker);
    }

    @Override
    public int del(Integer id) {
        return workerMapper.deleteById(id);
    }
}
