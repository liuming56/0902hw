package com.hw.controller;

import com.hw.pojo.Worker;
import com.hw.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class WorkerController {
    @Autowired
    private WorkerService workerService;
    @GetMapping("/getDept")
    public List<Worker> getDept(Integer id){
        return workerService.getWorkerById(id);
    }
    @GetMapping("/del")
    public int del(Integer id){
        return workerService.del(id);
    }
    @PostMapping("/update")
    public int update(Worker worker){
        return workerService.update(worker);
    }
    @PostMapping("/save")
    public int save(@RequestBody Worker worker){
        return workerService.save(worker);
    }
}
