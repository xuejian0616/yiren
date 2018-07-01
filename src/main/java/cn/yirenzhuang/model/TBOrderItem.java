package cn.yirenzhuang.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "tb_order_item")
@Data
public class TBOrderItem {
  @Column(name = "id")
  private String id;
  @ApiModelProperty(value = "订单id")
  @Column(name = "order_id")
  private int orderId;
  @ApiModelProperty(value = "商品id")
  @Column(name = "goods_id")
  private int goodsId;
  @ApiModelProperty(value = "商品购买数量")
  @Column(name = "num")
  private int num;      
  @ApiModelProperty(value = "商品标题")
  @Column(name = "title")
  private String title;
  @ApiModelProperty(value = "商品单价，单位为：分")
  @Column(name = "price")
  private int price;
  @ApiModelProperty(value = "商品原价，单位为：分")
  @Column(name = "oldPrice")
  private int old_price;
  @ApiModelProperty(value = "商品折扣，单位为：分")
  @Column(name = "discount")
  private int discount;
  @ApiModelProperty(value = "商品总金额，单位为：分")
  @Column(name = "totalFee")
  private int total_fee;
  @ApiModelProperty(value = "商品图片地址")
  @Column(name = "picPath")
  private String pic_path;
}