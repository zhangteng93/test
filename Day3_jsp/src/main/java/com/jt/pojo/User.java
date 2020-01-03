package com.jt.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.experimental.Accessors;

@TableName(value = "user")//若对象名和表名名字一致 (value = "user")可以不写
@Data
@Accessors(chain = true)
public class User {
	@TableId(type=IdType.AUTO)		//标识主键
	private Integer id;				//主键自增
	//@TableField("name")			//如果名称一致（包含驼峰规则） 注解可以不写
	private String name;
	private Integer age;
	private String sex;
	
}
