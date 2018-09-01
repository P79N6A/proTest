package com.didi.datainfra.jms.dao;

import com.didi.datainfra.jms.domain.entity.TaskDO;
import java.util.List;

public interface TaskDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TaskDO record);

    TaskDO selectByPrimaryKey(Long id);

    List<TaskDO> selectAll();

    int updateByPrimaryKey(TaskDO record);
}