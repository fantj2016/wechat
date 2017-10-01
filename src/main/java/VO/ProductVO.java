package VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

/**
 * Created by Fant.J on 2017/9/26.
 */
@Data
public class ProductVO {

    @JsonProperty("name")  //将categoryName重命名为name发送给前端
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
