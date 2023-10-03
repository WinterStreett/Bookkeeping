package com.winterstreet.bookkeeping.service.impl;

import com.winterstreet.bookkeeping.entity.Record;
import com.winterstreet.bookkeeping.repository.RecordRepository;
import com.winterstreet.bookkeeping.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordServiceImpl implements RecordService {

    @Autowired
    private RecordRepository recordRepository;

    @Override
    public void createRecordWithTime(Record record){
        recordRepository.save(record);
    }

    @Override
    public List<Record> findAllRecord() {
        return (List<Record>) recordRepository.findAll();
    }

    @Override
    public Integer monthlyTotal(Integer month) {
        if(month<1 || month>12)
            return 0;

        return recordRepository.countMonthlyTotal(month);
    }
}
