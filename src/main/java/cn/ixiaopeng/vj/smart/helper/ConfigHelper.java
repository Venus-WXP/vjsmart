package cn.ixiaopeng.vj.smart.helper;

import cn.ixiaopeng.vj.smart.utils.PropertiesUtil;

/**
 * 配置文件助手类
 * @author venus
 * @since 1.0.0
 * @version 1.0.0
 */
public final class ConfigHelper {
    // 整个应用配置加载项
    private static final PropertiesUtil.Parser CONFIG_PROPERTIES = PropertiesUtil.loadProps(ConfigConstant.CONFIG_FILE);

    /**
     * 获取jdbc驱动
     * @return 返回jdbc驱动类名
     */
    public static String getJdbcDriver () {
        return CONFIG_PROPERTIES.getString(ConfigConstant.JDBC_DRIVER);
    }

    /**
     * 获取jdbc URL
     * @return 返回url字符串
     */
    public static String getJdbcUrl () {
        return CONFIG_PROPERTIES.getString(ConfigConstant.JDBC_URL);
    }

    /**
     * 获取jdbc用户名
     * @return 返回用户名
     */
    public static String getJdbcUsername () {
        return CONFIG_PROPERTIES.getString(ConfigConstant.JDBC_USERNAME);
    }

    /**
     * 获取jdbc密码
     * @return 返回密码
     */
    public static String getJdbcPassword () {
        return CONFIG_PROPERTIES.getString(ConfigConstant.JDBC_PASSWORD);
    }

    /**
     * 获取应用基础包名
     * @return 返回包名
     */
    public static String getAppBasePackage () {
        return CONFIG_PROPERTIES.getString(ConfigConstant.APP_BASE_PACKAGE);
    }

    /**
     * 获取应用JSP路径
     * @return JSP路径
     */
    public static String getAppJspPath () {
        return CONFIG_PROPERTIES.getString(ConfigConstant.APP_JSP_PATH, "/WEB-INF/view/");
    }

    /**
     * 获取应用静态资源路径
     * @return 静态资源路径
     */
    public static String getAppAssetPath () {
        return CONFIG_PROPERTIES.getString(ConfigConstant.APP_ASSET_PATH, "/asset/");
    }
}