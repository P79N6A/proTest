package cn.whbing.pro.web.service;

import cn.whbing.pro.web.dao.ConnectTestDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ConnectTestServiceImpl implements ConnectTestService {
    @Resource
    ConnectTestDao connectTestDao;
    @Override
    public List<String> test() {
        List<String> list=connectTestDao.test();
        return list;
    }
}
