package kdy.xunwu.service;

import kdy.xunwu.base.HouseSubscribeStatus;
import kdy.xunwu.service.ServiceMultiResult;
import kdy.xunwu.service.ServiceResult;
import kdy.xunwu.web.dto.HouseDTO;
import kdy.xunwu.web.dto.HouseSubscribeDTO;
import kdy.xunwu.web.form.DatatableSearch;
import kdy.xunwu.web.form.HouseForm;
import kdy.xunwu.web.form.MapSearch;
import kdy.xunwu.web.form.RentSearch;
import org.springframework.data.util.Pair;

import java.util.Date;

/**
 * 房屋管理服务接口
 * Created by BigK.
 */
public interface IHouseService {
    /**
     * 新增
     * @param houseForm
     * @return
     */
    ServiceResult<HouseDTO> save(HouseForm houseForm);

    ServiceMultiResult<HouseDTO>adminQuery(DatatableSearch searchBody);

    ServiceResult<HouseDTO> findCompleteOne(Long id);

    ServiceResult update(HouseForm houseForm);

    /**
     * 移除图片
     * @param id
     * @return
     */
    ServiceResult removePhoto(Long id);

    /**
     * 更新封面
     * @param coverId
     * @param targetId
     * @return
     */
    ServiceResult updateCover(Long coverId, Long targetId);

    /**
     * 新增标签
     * @param houseId
     * @param tag
     * @return
     */
    ServiceResult addTag(Long houseId, String tag);

    /**
     * 移除标签
     * @param houseId
     * @param tag
     * @return
     */
    ServiceResult removeTag(Long houseId, String tag);

    /**
     * 更新房源状态
     * @param id
     * @param status
     * @return
     */
    ServiceResult updateStatus(Long id, int status);

    /**
     * 查询房源信息集
     * @param rentSearch
     * @return
     */
    ServiceMultiResult<HouseDTO> query(RentSearch rentSearch);


    /**
     * 全地图查询
     * @param mapSearch
     * @return
     */
       ServiceMultiResult<HouseDTO> wholeMapQuery(MapSearch mapSearch);

    /**
     * 精确范围数据查询
     * @param mapSearch
     * @return
     */
    ServiceMultiResult<HouseDTO> boundMapQuery(MapSearch mapSearch);
}
