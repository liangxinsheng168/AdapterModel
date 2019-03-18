package com.gupaoedu.designPattern.AdapterModel;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public interface LoginForThirdWay {

    void LoginByQQ(String code);

    void LoginByWechat(String code);

    void LoginBySina(String code);

}
