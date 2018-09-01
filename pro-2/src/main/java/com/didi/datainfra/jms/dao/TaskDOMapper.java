package com.didi.datainfra.jms.dao;

import com.didi.datainfra.jms.domain.entity.TaskDO;
import com.didi.datainfra.jms.domain.entity.TaskDOExample;
import com.didi.datainfra.jms.domain.entity.TaskDOWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskDOMapper {
    long countByExample(TaskDOExample example);

    int deleteByExample(TaskDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TaskDOWithBLOBs record);

    int insertSelective(TaskDOWithBLOBs record);

    List<TaskDOWithBLOBs> selectByExampleWithBLOBs(TaskDOExample example);

    List<TaskDO> selectByExample(TaskDOExample example);

    TaskDOWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TaskDOWithBLOBs record, @Param("example") TaskDOExample example);

    int updateByExampleWithBLOBs(@Param("record") TaskDOWithBLOBs record, @Param("example") TaskDOExample example);

    int updateByExample(@Param("record") TaskDO record, @Param("example") TaskDOExample example);

    int updateByPrimaryKeySelective(TaskDOWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TaskDOWithBLOBs record);

    int updateByPrimaryKey(TaskDO record);
}