package VO;

import com.laojiao.wechat.wechat.dataobject.ProductCategory;
import com.laojiao.wechat.wechat.dataobject.ProductInfo;
import lombok.Data;

/**
 * http返回的最外层对象
 * Created by Fant.J on 2017/9/26.
 */
@Data
public class ResultVO<T>{

    /*错误码**/
    private Integer code;

    /*提示信息**/
    private String msg;

    /*具体内容**/
    private T data;

}
