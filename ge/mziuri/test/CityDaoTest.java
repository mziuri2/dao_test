
package ge.mziuri.test;

import ge.mziuri.daotest.dao.CityDAO;
import ge.mziuri.daotest.dao.CityDAOImpl;
import ge.mziuri.daotest.model.City;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CityDaoTest {
    
    private CityDAO cityDao;
    
    private City city;
    
    @Before
    public void init() {
        cityDao = new CityDAOImpl();
        city = new City(0, "თბილისი", 1_108_000, true, 1);
    }
    
    @Test
    public void testAddCity() {
        cityDao.addCity(city);
        List<City> cityList = cityDao.getCityByName("თბილისი");
        Assert.assertEquals(1, cityList.size());
        Assert.assertEquals(city, cityList.get(0));
        cityDao.deleteCity(cityList.get(0).getId());
    }

}
