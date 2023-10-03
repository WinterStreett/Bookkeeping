package com.winterstreet.bookkeeping.service;

import com.winterstreet.bookkeeping.entity.Record;

import java.util.List;

public interface RecordService {
    void createRecordWithTime(Record record);
    List<Record> findAllRecord();
    Integer monthlyTotal(Integer mouth);
}
