# MiniWeather

by 苏恒

## 1、主要功能介绍

MiniWeather是一款中颜值天气APP，可以自动定位查询当前位置天气，也可以通过搜索城市查询城市天气。

**· **	全国每日和逐小时天气预报，包括：天气状况、温度、大气压、相对湿度、降水量、风力风速风向等具体天气信息。

**· **	中国城市与AQI空气质量数据

**· **	城市搜索

## 2、主要功能界面实现方法

### 1、APP主界面

设置了开始界面，需点击“+”号添加城市显示天气信息。
点击“+”号后进入SearchCityActivity，搜索框下会显示当前位置信息，可以进行点击获取天气详情，跳转回mainactivity，由cityfragment进行数据显示。
主要天气信息在MainActivity中进行显示。
CityFragment布局文件使用了ScrollView进行滑动操作，UI设计参考了各大主流天气APP，使用方块模块化显示天气信息，每个模块独立操作。
在Adapter中存放了各个功能所需的适配器，将json数据解析并显示。

### 3、天气图标抓取

天气图标是根据weatherCode字段，然后请求不同的链接，weatherCode字段是如同 "00" "01"之类的字符串
比如00表示晴转晴，01表示晴转多云。

判断白天黑夜的方法：抓取时间转为小时，白天时间为06:00-18:00

## 3、项目中引用的第三方

```
	implementation 'com.google.code.gson:gson:2.8.6'//gson解析
    // https://mvnrepository.com/artifact/com.squareup.okhttp3/okhttp
    implementation 'com.squareup.okhttp3:okhttp:3.14.6'//网络框架
    // https://mvnrepository.com/artifact/com.github.bumptech.glide/glide
    implementation group: 'com.github.bumptech.glide', name: 'glide', version: '4.11.0'//Glide获取图片
```

## 4、项目结构说明

|  文件夹   |              对应内容              |
| :-------: | :--------------------------------: |
|   bean    |             存放实体类             |
|    res    |            存放资源文件            |
|   util    |             存放工具类             |
|   view    | 存放activity，fragment，自定义view |
| txweather |    存放各类接口，网络请求helper    |
|    db     |             存放数据库             |

## 5、兼容适配

Android 5.0+