package com.winterstreet.bookkeeping.controller;

import com.winterstreet.bookkeeping.entity.Record;
import com.winterstreet.bookkeeping.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/record")
public class RecordController {

    @Autowired
    private RecordService recordService;

    @GetMapping("/test")
    public String testApi(){
        return "hello world!";
    }

    @GetMapping("/allRecords")
    public List<Record> allRecords(){
        return recordService.findAllRecord();
    }

    @PostMapping("/recordWithTime")
    public void recordWithTime(@RequestBody Record record){
        recordService.createRecordWithTime(record);
    }

    @GetMapping("/monthlyTotal")
    public Integer monthlyTotal(@RequestParam(value = "month") Integer month){
        return recordService.monthlyTotal(month);
    }
}
