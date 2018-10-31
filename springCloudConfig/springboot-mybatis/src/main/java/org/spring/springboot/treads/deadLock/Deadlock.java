package org.spring.springboot.treads.deadLock;

import org.spring.springboot.dao.CityDao;
import org.spring.springboot.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class Deadlock {

    @Autowired
    private CityDao cityDao;

    @Transactional
    public City queryCityById(Long id){
        City city = cityDao.queryCityForUpdate(id);
        updateCityById(id);
        return city;
    }

    @Transactional
    public int updateCityById(Long id){
        queryCityById(id);
        int updateCount = cityDao.updateById(id);
        return updateCount;
    }

    public void testConect(){
        System.out.println("单元测试能够调通");
    }
}
