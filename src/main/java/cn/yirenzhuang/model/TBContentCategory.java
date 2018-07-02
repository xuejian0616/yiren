package cn.yirenzhuang.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "tb_content_category")
@Data
public class TBContentCategory {
  @ApiModelProperty(value = "类目ID")
  @Column(name = "id")
  private Integer id;
  @ApiModelProperty(value = "父类目ID=0时，代表的是一级的类目")
  @Column(name = "parent_id")
  private Integer parentId;
  @ApiModelProperty(value = "分类名称")
  @Column(name = "name")
  private String name;
  @ApiModelProperty(value = "状态。可选值:1(正常),2(删除)")
  @Column(name = "status")
  private Integer status;         
  @ApiModelProperty(value = "排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数")
  @Column(name = "sort_order")
  private Integer sortOrder;
  @ApiModelProperty(value = "该类目是否为父类目，1为true，0为false")
  @Column(name = "is_parent")
  private Integer isParent;
  @ApiModelProperty(value = "创建时间")
  @Column(name = "created")
  private Date created;
  @ApiModelProperty(value = "更新时间")
  @Column(name = "updated")
  private Date updated;
}