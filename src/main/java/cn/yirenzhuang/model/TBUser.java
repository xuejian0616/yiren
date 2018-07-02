package cn.yirenzhuang.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "tb_user")
@Data
public class TBUser {
  @Column(name = "id")
  private Integer id;
  @ApiModelProperty(value = "用户名")
  @Column(name = "username")
  private String userName;
  @ApiModelProperty(value = "密码，加密存储")
  @Column(name = "password")
  private String password;
  @ApiModelProperty(value = "微信id")
  @Column(name = "wxinfo_id")
  private Integer wxinfoId;
  @ApiModelProperty(value = "注册手机号")
  @Column(name = "phone")
  private String phone;
  @ApiModelProperty(value = "注册邮箱")
  @Column(name = "email")
  private String email;
  @ApiModelProperty(value = "创建时间")
  @Column(name = "created")
  private Date created;
  @ApiModelProperty(value = "更新时间")
  @Column(name = "updated")
  private Date updated;
}