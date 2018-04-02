package common;

/**
 * @auther Fighter Created on 2018/4/2.
 */
public interface LoginServiceInterface {
    //协议版本号
    long versionID = 1L;
    String login(String username,String passwd);
}
