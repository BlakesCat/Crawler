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
  [空] 
  点击：录入                                                   成功录入信息
                                                               展示获取的信息
                                                               
测试用例02：查看模板库中的模板
  输入网址 localhost:8080/crawler_web/                         进入主页
  点击：测试                                                   进入模板录入页面
  点击：查看                                                   进入修改删除页面
                                                              列出已有的模板
                                                              

测试用例03：修改模板库中的模板
   输入网址 localhost:8080/crawler_web/                          进入主页
    点击：测试                                                   进入模板录入页面
    点击：查看                                                   进入修改删除页面
    输入要修改的模板名
    输入该模板要修改的url
    点击修改                                                     修改完成
                                                                页面显示修改后的信息
                                                                
测试用例03：删除模板库中的模板
   输入网址 localhost:8080/crawler_web/                          进入主页
    点击：测试                                                   进入模板录入页面
    点击：查看                                                   进入修改删除页面
    输入要修改的模板名
    点击删除                                                     删除完成
                                                                页面显示修改后的信息
