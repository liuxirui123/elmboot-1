##### elmboot

## 待实现功能

### 1 商家位置

#### 概述

增加商家位置信息、用户位置信息、订单配送距离

#### 后端设计

#### 数据库设计

##### Business

| No  | 字段名        | 数据类型    | size  | 默认値 | 约束  | 说明   |
|-----|------------|---------|-------|-----|-----|------|
| 1   | longitudes | decimal | (9.6) |     | NN  | 商家经度 |
| 2   | latitudes  | decimal | (8,6) |     | NN  | 商家纬度 |
##### User

| No   | 字段名   | 数据类型 | size | 默认値 | 约束 | 说明   |
| ---- | -------- | -------- | ---- | ------ | ---- |------|
| 1   | longitudes | decimal | (9.6) |     | NN  | 用户经度 |
| 2   | latitudes  | decimal | (8,6) |     | NN  | 用户纬度 |

##### Order

| No  | 字段名      | 数据类型 | size | 默认値 | 约束  | 说明                  |
|-----|----------|--|------|-----|-----|---------------------|
| 1   | distance | int |  |     | NN  | 配送距离 /m |

### 2 静态地图

### 3 动态地图

### 4 评价系统

#### 概述

实现评价系统

#### 前端设计

#### 后端设计(Controller)

##### Judgement

###### ListJudgementByBusinessId

根据商家Id获得评价列表

###### GetJudgementById

根据Id获得评价

###### CreateJudgement

建立评价

##### Business

###### listBusinessByOrderTypeId(已有，重构)

列举一个种类的商家按评分排序

#### 数据库设计

##### Business

| No   | 字段名     | 数据类型 | size  | 默认値 | 约束 | 说明       |
| ---- | ---------- | -------- | ----- | ------ | ---- | ---------- |
| 1    | judgeLevel | decimal  | (2,1) | 5.0    | NN   | 商家总评分 |

##### Order

|  No  |   字段名    | 数据类型 | size | 默认値 | 约束 |   说明   |
| :--: | :---------: | :------: | :--: | :----: | :--: | :------: |
|  1   | JudgementId |   int    |      |        |  FK  | 评价编号 |

##### Judgement

| No   | 字段名         | 数据类型 | size | 默认值 | 约束       | 说明            |
| ---- | -------------- | -------- | ---- | ------ | ---------- | --------------- |
| 1    | judgementId    | int      |      |        | PK、NN、AI | 评价编号        |
| 2    | orderId        | int      |      |        | FK、NN     | 所属订单        |
| 3    | content        | varchar  | 200  | NULL   |            | 评价详情        |
| 4    | judgementLevel | int      |      | 5      | NN         | 评价星级（1-5） |

