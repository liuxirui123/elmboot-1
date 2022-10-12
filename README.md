# elmboot

## elm_1.0(initial 版本介绍)

## elm_1.1 success

### Business

#### listBusiness

列举所有商家，通过BusinessId排序

## elm_2.0

### 概述

### 前端设计

静态地图

### 后端设计

#### Business



### 数据库设计

#### addressPo

Id 经纬度 地址描述

#### business

经纬度

#### deliveryAddress

经纬度  

添加delTag
删除后，查询Orders依旧可以查询到

#### Order

起点经纬度 商家  
终点经纬度 配送地址

## elm_3.0 动态地图

## elm_4.0 评价系统

### 概述

实现评价系统

### 前端设计

### 后端设计

#### Judgement

##### ListJudgementByBusinessId

根据商家Id获得评价列表

##### GetJudgementById

根据Id获得评价

##### CreateJudgement

建立评价

#### Business

##### listBusinessByOrderTypeId(已有，重构)

列举一个种类的商家按评分排序

### 数据库设计

#### Business

| No  | 字段名        | 数据类型    | size  | 默认値 | 约束  |  说明   |
|-----|------------|---------|-------|-----|-----|:-----:|
| 1   | judgeLevel | decimal | (2,1) | 5.0 | NN  | 商家总评分 |

#### Order

| No  | 字段名         | 数据类型 | size | 默认値 | 约束  | 说明   |
|-----|-------------|------|------|-----|-----|------|
| 1   | JudgementId | int  |      |     | FK  | 评价编号 |

#### Judgement

| No  |      字段名       |  数据类型   | size | 默认值  | 约束       | 说明        |
|-----|:--------------:|:-------:|:----:|------|----------|-----------|
| 1   |  judgementId   |   int   |      |      | PK、NN、AI | 评价编号      |
| 2   |    orderId     |   int   |      |      | FK、NN    | 所属订单      |
| 3   |    content     | varchar | 200  | NULL |          | 评价详情      |
| 4   | judgementLevel |   int   |      | 5    | NN       | 评价星级（1-5） |

test