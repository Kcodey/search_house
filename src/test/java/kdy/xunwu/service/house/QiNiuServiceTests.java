package kdy.xunwu.service.house;

import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import kdy.xunwu.XunwuApplicationTests;
import kdy.xunwu.service.IQiNiuService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;

/**
 * Created by BigK
 * 2019-03-08 18:52
 */
public class QiNiuServiceTests extends XunwuApplicationTests {
    @Autowired
    private IQiNiuService qiNiuService;
    @Test
    public void testUploadFile() {
        String fileName = "C:\\graduate\\xunwu\\tmp\\1548725024845.jpg ";

        File file = new File(fileName);

        Assert.assertTrue(file.exists());

        try {
            Response response = qiNiuService.uploadFile(file);
            Assert.assertTrue(response.isOK());
        } catch (QiniuException e) {
            e.printStackTrace();
        }
    }


}
