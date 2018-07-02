package cn.yirenzhuang.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "tb_user_wxinfo")
@Data
public class TBUserWxinfo {
  @Column(name = "id")
  private Integer id;
  @ApiModelProperty(value = "openId")
  @Column(name = "open_id")
  private String openId;
  @ApiModelProperty(value = "昵称")
  @Column(name = "nick_name")
  private String nickName;
  @ApiModelProperty(value = "性别，0未知，1男性，2女性")
  @Column(name = "gender")
  private String gender;
  @ApiModelProperty(value = "国家")
  @Column(name = "country")
  private String country;
  @ApiModelProperty(value = "省份")
  @Column(name = "province")
  private String province;
  @ApiModelProperty(value = "城市")
  @Column(name = "city")
  private String city;
  @ApiModelProperty(value = "语言")
  @Column(name = "language")
  private Date language;
}