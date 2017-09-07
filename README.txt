测试用例01：添加数据
  输入网址 localhost:8080/crawler_web/                         进入主页
  点击：测试                                                   进入模板录入页面
  输入模板信息：
  哔哩哔哩
  https://www.bilibili.com/
  class="v-title"
  class="usname"
  class="tminfo" > time
  class="v_desc report-scroll-module report-wrap-module"
  class="link"
  点击：录入                                                   成功录入信息
                                                               展示获取的信息
 
 测试用例02：添加错误数据
  输入网址 localhost:8080/crawler_web/                         进入主页
  点击：测试                                                   进入模板录入页面
  输入模板信息：
  ！@#
  https://www.bilibili.com/
  class="v-title"
  class="usname"
  class="tminfo" > time
  class="v_desc report-scroll-module report-wrap-module"
  class="link"
  点击：录入                                                  显示：网站名字的字符非法
 
测试用例03：添加错误数据
  输入网址 localhost:8080/crawler_web/                         进入主页
  点击：测试                                                   进入模板录入页面
  输入模板信息：
  哔哩哔哩
  [空]
  class="v-title"
  class="usname"
  class="tminfo" > time
  class="v_desc report-scroll-module report-wrap-module"
  class="link"
  点击：录入                                                  显示：网站地址能为空！
 

测试用例04：查看模板库中的模板
  输入网址 localhost:8080/crawler_web/                         进入主页
  点击：测试                                                   进入模板录入页面
  点击：查看                                                   进入修改删除页面
                                                              列出已有的模板
                                                              

测试用例05：修改模板库中的模板
   输入网址 localhost:8080/crawler_web/                          进入主页
    点击：测试                                                   进入模板录入页面
    点击：查看                                                   进入修改删除页面
    输入要修改的模板名
    输入该模板要修改的url
    点击修改                                                     修改完成
                                                                页面显示修改后的信息

测试用例05：修改模板库中的模板
   输入网址 localhost:8080/crawler_web/                          进入主页
    点击：测试                                                   进入模板录入页面
    点击：查看                                                   进入修改删除页面
    输入要修改的模板名
    [空]
    点击修改                                                     显示：网站地址不能为空！

测试用例06：删除模板库中的模板
   输入网址 localhost:8080/crawler_web/                          进入主页
    点击：测试                                                   进入模板录入页面
    点击：查看                                                   进入修改删除页面
    输入要修改的模板名
    点击删除                                                     删除完成
                                                                页面显示修改后的信息
