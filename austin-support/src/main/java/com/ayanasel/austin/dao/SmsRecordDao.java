package com.ayanasel.austin.dao;

import com.ayanasel.austin.domain.SmsRecord;
import org.springframework.data.repository.CrudRepository;

public interface SmsRecordDao extends CrudRepository<SmsRecord, Long> {


}