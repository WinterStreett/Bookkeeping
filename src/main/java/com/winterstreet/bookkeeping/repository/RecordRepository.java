package com.winterstreet.bookkeeping.repository;

import com.winterstreet.bookkeeping.entity.Record;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface RecordRepository extends CrudRepository<Record,Integer> {

    @Query("select sum(amount) from Record where month = :month")
    Integer countMonthlyTotal(@Param("month") Integer month);
}
