package kdy.xunwu.repository;

import kdy.xunwu.entity.HouseTag;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by BigK
 * 2019-03-19 20:32
 */
public interface HouseTagRepository extends CrudRepository<HouseTag,Long> {
    HouseTag findByNameAndHouseId(String name, Long houseId);

    List<HouseTag> findAllByHouseId(Long id);

    List<HouseTag> findAllByHouseIdIn(List<Long> houseIds);
}
