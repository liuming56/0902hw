package com.hw.service;

import com.hw.pojo.Worker;

import java.util.List;

public interface WorkerService {
    public List<Worker> getWorkerById(Integer id);
    public int save (Worker worker);
    public int update(Worker worker);
    public int del(Integer id);
}
