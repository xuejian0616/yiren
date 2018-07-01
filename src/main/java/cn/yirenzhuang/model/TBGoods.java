package cn.yirenzhuang.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "tb_goods")
@Data
public class TBGoods {
  @ApiModelProperty(value = "商品id")
  @Column(name = "id")
  private int id;
  @ApiModelProperty(value = "商品名称")
  @Column(name = "name")
  private String name;
  @ApiModelProperty(value = "商品标题")
  @Column(name = "title")
  private String title;
  @ApiModelProperty(value = "商品原价，单位为：分")
  @Column(name = "old_price")
  private int oldPrice;
  @ApiModelProperty(value = "商品现价，单位为：分")
  @Column(name = "price")
  private int price;
  @ApiModelProperty(value = "商品最低价，单位为：分")
  @Column(name = "lower_price")
  private int lowerPrice;
  @ApiModelProperty(value = "商品折扣：0.75")
  @Column(name = "discount")
  private float discount;     
  @ApiModelProperty(value = "单位")
  @Column(name = "unit")
  private String unit;
  @ApiModelProperty(value = "销量")
  @Column(name = "sales_num")
  private int salesNum;
  @ApiModelProperty(value = "库存数量")
  @Column(name = "stock_num")
  private int stockNum;
  @ApiModelProperty(value = "商品条形码")
  @Column(name = "barcode")
  private String barcode;
  @ApiModelProperty(value = "小图")
  @Column(name = "small_pic")
  private String smallPic;
  @ApiModelProperty(value = "主图一")
  @Column(name = "pic_one")
  private String picOne;
  @ApiModelProperty(value = "主图二")
  @Column(name = "pic_two")
  private String picTwo;
  @ApiModelProperty(value = "主图三")
  @Column(name = "pic_three")
  private String picThree;
  @ApiModelProperty(value = "主图四")
  @Column(name = "pic_four")
  private String picFour;
  @ApiModelProperty(value = "主图五")
  @Column(name = "pic_five")
  private String picFive;
  @ApiModelProperty(value = "一级类目")
  @Column(name = "first_cid")
  private String firstCid;
  @ApiModelProperty(value = "二级类目")
  @Column(name = "subCid")
  private String subCid;
  @ApiModelProperty(value = "三级类目")
  @Column(name = "third_cid")
  private String thirdCid;
  @ApiModelProperty(value = "商品状态，0-待上架，1-正常，2-下架，3-删除")
  @Column(name = "status")
  private int status;
  @ApiModelProperty(value = "创建时间")
  @Column(name = "created")
  private Date created;
  @ApiModelProperty(value = "更新时间")
  @Column(name = "updated")
  private Date updated;
}