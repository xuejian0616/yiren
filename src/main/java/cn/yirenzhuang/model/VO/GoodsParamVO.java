package cn.yirenzhuang.model.VO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Data
public class GoodsParamVO {
  private Integer id;
  @ApiModelProperty(value = "商品ID")
  private Integer goodsId;
  @ApiModelProperty(value = "商品类目ID")
  private Integer goodsCategoryId;
  @ApiModelProperty(value = "规格")
  private String norms;
  @ApiModelProperty(value = "尺码")
  private String size;
  @ApiModelProperty(value = "数量")
  private Integer num;
}