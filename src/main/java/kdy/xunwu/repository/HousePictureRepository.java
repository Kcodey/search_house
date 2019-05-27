package kdy.xunwu.repository;

import kdy.xunwu.entity.HousePicture;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by BigK
 * 2019-03-19 20:30
 */
public interface HousePictureRepository extends CrudRepository<HousePicture,Long> {
    List<HousePicture>findAllByHouseId(Long id);

}
