package cn.yirenzhuang.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "tb_goods_desc")
@Data
public class TBGoodsDesc {
  @ApiModelProperty(value = "商品ID")
  @Column(name = "goods_id")
  private Integer goodsId;
  @ApiModelProperty(value = "商品详情")
  @Column(name = "goods_desc")
  private String goodsDesc;
  @ApiModelProperty(value = "创建时间")
  @Column(name = "created")
  private Date created;
  @ApiModelProperty(value = "更新时间")
  @Column(name = "updated")
  private Date updated;
}