package cn.yirenzhuang.model.VO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class GoodsSpecListVO {
  @ApiModelProperty(value = "规格")
  private Set<String> norms;
  @ApiModelProperty(value = "尺码")
  private Set<String> sizes;

  @ApiModelProperty(value = "商品规格列表")
  private List<GoodsSpecVO> goodsSpec;
}