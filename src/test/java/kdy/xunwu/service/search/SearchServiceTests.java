package kdy.xunwu.service.search;

import kdy.xunwu.ApplicationTests;
import kdy.xunwu.service.ServiceMultiResult;
import kdy.xunwu.web.form.RentSearch;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by 瓦力.
 */
public class SearchServiceTests extends ApplicationTests {

    @Autowired
    private ISearchService searchService;

//    @Test
//    public void testIndex() {
//        Long targetHouseId = 15L;
//        boolean success = searchService.index(targetHouseId);
//        Assert.assertTrue(success);
//    }

    @Test
    public void testRemove() {
        Long targetHouseId = 15L;

        searchService.remove(targetHouseId);
    }

    @Test
    public void testQuery() {
        RentSearch rentSearch = new RentSearch();
        rentSearch.setCityEnName("bj");
        rentSearch.setStart(0);
        rentSearch.setSize(10);
//        rentSearch.setKeywords("国贸");
        ServiceMultiResult<Long> serviceResult = searchService.query(rentSearch);
        Assert.assertEquals(8,serviceResult.getTotal());
//        Assert.assertTrue(serviceResult.getTotal() > 0);
    }
}
