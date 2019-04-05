package com.ws.config;

public class ServerConfig {

    public static final String defaultHost = "192.168.0.106";
    public static final String defaultName = "ChinaIndustryStandard";
    public static final String defaultPort = "8080";
    // public static final String defaultServer =
    // "http://192.168.0.107:8080/ChinaIndustryStandard/";

    public final static String system = "ChinaIndustryStandard";

    public static String host = "http://" + defaultHost + ":" + defaultPort
            + "/" + defaultName + "/";
    public static String server = host + "api/";
    public static String url = server + "v1";
    public static String imageUrl = host + "img/";
    public static String uploadImgUrl = host + "api/upload_img";

}
