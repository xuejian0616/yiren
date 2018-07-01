package cn.yirenzhuang.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "tb_content")
@Data
public class TBContent {
  @Column(name = "id")
  private int id;
  @ApiModelProperty(value = "内容类目ID")
  @Column(name = "category_id")
  private int categoryId;
  @ApiModelProperty(value = "内容标题")
  @Column(name = "title")
  private String title;
  @ApiModelProperty(value = "子标题")
  @Column(name = "sub_title")
  private String subTitle;
  @ApiModelProperty(value = "标题描述")
  @Column(name = "title_desc")
  private String titleDesc;
  @ApiModelProperty(value = "链接")
  @Column(name = "url")
  private String url;
  @ApiModelProperty(value = "图片绝对路径")
  @Column(name = "pic")
  private String pic;
  @ApiModelProperty(value = "图片2")
  @Column(name = "pic2")
  private String pic2;
  @ApiModelProperty(value = "内容")
  @Column(name = "content")
  private String content;
  @ApiModelProperty(value = "创建时间")
  @Column(name = "created")
  private Date created;
  @ApiModelProperty(value = "创建时间")
  @Column(name = "updated")
  private Date updated;
}