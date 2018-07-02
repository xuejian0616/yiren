package cn.yirenzhuang.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "tb_goods_param")
@Data
public class TBGoodsParam {
  @Column(name = "id")
  private Integer id;
  @ApiModelProperty(value = "商品ID")
  @Column(name = "goods_id")
  private Integer goodsId;
  @ApiModelProperty(value = "商品类目ID")
  @Column(name = "goods_category_id")
  private Integer goodsCategoryId;
  @ApiModelProperty(value = "规格")
  @Column(name = "norms")
  private String norms;
  @ApiModelProperty(value = "尺码")
  @Column(name = "size")
  private String size;
  @ApiModelProperty(value = "数量")
  @Column(name = "num")
  private Integer num;      
  @Column(name = "created")
  private Date created;
  @Column(name = "updated")
  private Date updated;
}