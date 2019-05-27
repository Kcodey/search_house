package kdy.xunwu.repository;

import kdy.xunwu.entity.HouseDetail;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by BigK
 * 2019-03-19 20:29
 */
public interface HouseDetailRepository extends CrudRepository<HouseDetail,Long> {
    HouseDetail findByHouseId(Long id);

    List <HouseDetail> findAllByHouseIdIn(List<Long> houseIds);
}
