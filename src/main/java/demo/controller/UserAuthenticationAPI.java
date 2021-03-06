package demo.controller;

/**
 * Created by Administrator on 2016/10/11.
 */

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import demo.service.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zhengyunfei on 2016/9/2.
 */
@RestController
@Api(value = "6:个人用户认证API接口", description = "个人用户认证",position = 6,produces = "application/json")
public class UserAuthenticationAPI {
    @Autowired
    UserMapper userMapper;

    @ApiOperation(httpMethod = "POST", value = "(<font color='blue'>用户认证第一步</font>)",position = 1,nickname = "用户认证第一步", notes = "<font color='green'>传递参数</font>" +
            "<table border=\"1\"><tr><th>字段</th><th>是否为空</th><th>\t备注</th></tr>" +
            "<tr><td>userName</td><td>否</td><td>用户名</td></tr>" +
            "<tr><td>sex</td><td>否</td><td>性别</td></tr>" +
            "<tr><td>maile</td><td>否</td><td>邮箱</td></tr>" +
            "<tr><td>idCard</td><td>否</td><td>身份证号码</td></tr>" +
            "<tr><td>token</td><td>否</td><td>token</td></tr></table>" +
            "<h4>返回结果情况如下：</h4>" +
            "1：<div class=\"block response_body json\"><pre class=\"json\"><code>{\r\"code\":1013,\n\"message\":\"用户名错误请输入3-20位字母或数字\",\n\"data\":null\n}</code></pre></div>" +
            "2：<div class=\"block response_body json\"><pre class=\"json\"><code>{\n\"code\":1015,\n\"message\":\"身份证格式错误\",\n\"data\":null\n}</code></pre></div>" +
            "3：<div class=\"block response_body json\"><pre class=\"json\"><code>{\n\"code\":1014,\n\"message\":\"邮箱格式错误\",\n\"data\":null\n}</code></pre></div>" +
            "4：<div class=\"block response_body json\"><pre class=\"json\"><code>{\n\"code\":1005,\n\"message\":\"token无效\",\n\"data\":null\n}</code></pre></div>" +
            "5：<div class=\"block response_body json\"><pre class=\"json\"><code>{\n\"code\":0,\n\"message\":\"成功\",\n\"data\":null\n}</code></pre></div>" )
    /*
	 * 用户认证API接口 第一步
	 */
    @RequestMapping(value = "/api/urz/step1", method = RequestMethod.POST)
    @ResponseBody
    public Object step1(@RequestParam String userName, @RequestParam String sex, @RequestParam String maile,@RequestParam String idCard,@RequestParam String token, HttpServletRequest request) {
        String myJsonData="";
        return myJsonData;
    }

    @ApiOperation(httpMethod = "POST", value = "(<font color='blue'>用户认证第二步</font>)",position = 2,nickname = "用户认证第二步", notes = "<font color='green'>传递参数</font>:<br>" +
            "<table border=\"1\"><tr><th>字段</th><th>是否为空</th><th>\t备注</th></tr>" +
            "<tr><td>company</td><td>否</td><td>公司名称</td></tr>" +
            "<tr><td>position</td><td>否</td><td>职位</td></tr>" +
            "<tr><td>assest</td><td>否</td><td>金融资产量</td></tr>" +
            "<tr><td>arpm</td><td>否</td><td>近三年平均收入</td></tr>" +
            "<tr><td>token</td><td>否</td><td>token</td></tr></table>" +
            "<h4>assest字段解析</h4>" +
            "<div class=\"block response_body json\"><pre class=\"json\"><code>"+
            "\n" +
            "{\"assest\":{\n" +
            "\"1\":\"200万以下\",\n" +
            "\"2\":\"200-500万元\",\n" +
            "\"3\":\"500-1000万元\",\n" +
            "\"4\":\"1000万以上\",\n" +
            "}}"+
            "</code></pre></div>"+
            "<h4>arpm字段解析</h4>" +
            "<div class=\"block response_body json\"><pre class=\"json\"><code>"+
            "\n" +
            "{\"arpm\":{\n" +
            "\"1\":\"20万以下\",\n" +
            "\"2\":\"20-50万元\",\n" +
            "\"3\":\"50-100万元\",\n" +
            "\"4\":\"200万以上\",\n" +
            "}}"+
            "</code></pre></div>"+
            "<div><h4>返回结果：</h4></div>"+
            "1:<div class=\"block response_body json\"><pre class=\"json\"><code>{\n\"code\":1005,\n\"message\":\"token无效\",\n\"data\":null\n}</code></pre></div>"+
            "2:<div class=\"block response_body json\"><pre class=\"json\"><code>{\n\"code\":0,\n\"message\":\"成功\",\n\"data\":null\n}</code></pre></div>"
    )
    /*
	 * 用户认证API接口 第二步
	 */
    @RequestMapping(value = "/api/urz/step2", method = RequestMethod.POST)
    @ResponseBody
    public Object step2(@RequestParam String company, @RequestParam String position, @RequestParam String assest,@RequestParam String arpm,@RequestParam String token, HttpServletRequest request) {
        String myJsonData="";
        return myJsonData;
    }


    @ApiOperation(httpMethod = "POST", value = "(<font color='blue'>用户认证第三步</font>)",position = 3,nickname = "用户认证第三步", notes = "<font color='green'>传递参数</font>:<br>" +
            "<table border=\"1\"><tr><th>字段</th><th>是否为空</th><th>\t备注</th></tr>" +
            "<tr><td>USERCARD_IMAGE</td><td>否</td><td>名片：需要将form-data; name=USERCARD_IMAGE</td></tr>" +
            "<tr><td>IDCARD_IMAGE</td><td>否</td><td>身份证照片：需要将form-data; name=IDCARD_IMAGE</td></tr>" +
            "<tr><td>token</td><td>否</td><td>token</td></tr></table>" )
    /*
	 * 用户认证API接口 第三步
	 */
    @RequestMapping(value = "/api/urz/step3", method = RequestMethod.POST)
    @ResponseBody
    public Object step3(@RequestParam String USERCARD_IMAGE, @RequestParam String IDCARD_IMAGE,@RequestParam String token, HttpServletRequest request) {
        String myJsonData="";
        return myJsonData;
    }

    /**
     * 批量更新用户信息接口
     * @param sex
     * @param company
     * @param position
     * @param assest
     * @param arpm
     * @param token
     * @param request
     * @return
     */
    @ApiOperation(httpMethod = "POST", value = "(<font color='blue'>批量更新用户信息接口</font>)",position = 4,nickname = "批量更新用户信息接口", notes = "<font color='green'>传递参数</font>:<br>" +
            "<table border=\"1\"><tr><th>字段</th><th>是否为空</th><th>\t备注</th></tr>" +
            "<tr><td>userName</td><td>否</td><td>用户名</td></tr>" +
            "<tr><td>sex</td><td>否</td><td>性别</td></tr>" +
            "<tr><td>maile</td><td>否</td><td>邮箱</td></tr>" +
            "<tr><td>idCard</td><td>否</td><td>身份证号码</td></tr>" +
            "<tr><td>company</td><td>否</td><td>公司名称</td></tr>" +
            "<tr><td>position</td><td>否</td><td>职位</td></tr>" +
            "<tr><td>assest</td><td>否</td><td>金融资产量</td></tr>" +
            "<tr><td>arpm</td><td>否</td><td>近三年平均收入</td></tr>" +
            "<tr><td>userCardUrl</td><td>否</td><td>名片:需要先调用接口/api/upload/image获取data:{'key':value}，将取得到的value保存为字段userCardUrl的值传递给接口</td></tr>" +
            "<tr><td>idCardUrl</td><td>否</td><td>身份证照片：需要先调用接口/api/upload/image获取data:{'key':value}，将取得到的value保存为字段idCardUrl的值传递给接口</td></tr>" +
            "<tr><td>token</td><td>否</td><td>token</td></tr></table>"+
            "<h4>assest字段解析</h4>" +
            "<div class=\"block response_body json\"><pre class=\"json\"><code>"+
            "\n" +
            "{\"assest\":{\n" +
            "\"1\":\"200万以下\",\n" +
            "\"2\":\"200-500万元\",\n" +
            "\"3\":\"500-1000万元\",\n" +
            "\"4\":\"1000万以上\",\n" +
            "}}"+
            "</code></pre></div>"+
            "<h4>arpm字段解析</h4>" +
            "<div class=\"block response_body json\"><pre class=\"json\"><code>"+
            "\n" +
            "{\"arpm\":{\n" +
            "\"1\":\"20万以下\",\n" +
            "\"2\":\"20-50万元\",\n" +
            "\"3\":\"50-100万元\",\n" +
            "\"4\":\"200万以上\",\n" +
            "}}"+
            "</code></pre></div>"
    )
    /*
	 * 用户认证API接口 第三步
	 */
    @RequestMapping(value = "/api/urz/step4", method = RequestMethod.POST)
    @ResponseBody
    public Object step4(@RequestParam String userName, @RequestParam String sex, @RequestParam String maile,@RequestParam String idCard,@RequestParam String company, @RequestParam String position, @RequestParam String assest,@RequestParam String arpm,@RequestParam String userCardUrl, @RequestParam String idCardUrl,@RequestParam String token, HttpServletRequest request) {
        String myJsonData="";
        return myJsonData;
    }
}
