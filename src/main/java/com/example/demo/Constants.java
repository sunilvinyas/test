package com.example.demo;

/**
 * Contains the client IDs and scopes for allowed clients consuming your API.
 */
public class Constants {
  public static final String WEB_CLIENT_ID = "703914324096-drubk915sshkgmcarbikisbjg1ju7kds.apps.googleusercontent.com";
  public static final String ANDROID_CLIENT_ID = "replace this with your Android client ID";
  public static final String IOS_CLIENT_ID = "703914324096-clss0rbdjds95fqtuuuci219tmmmd5fm.apps.googleusercontent.com";
  public static final String ANDROID_AUDIENCE = WEB_CLIENT_ID;

  public static final String EMAIL_SCOPE = "https://www.googleapis.com/auth/userinfo.email";
  
  public static final int SCRIPTS_PAGING = 2000;
  
  
  //Home screen API's
  public static final String HIGH52_URL = "http://www1.nseindia.com/products/dynaContent/equities/equities/json/online52NewHigh.json";
  public static final String LOW52_URL = "http://www1.nseindia.com/products/dynaContent/equities/equities/json/online52NewLow.json";
  
  public static final String GAINERS1_URL = "https://www1.nseindia.com/live_market/dynaContent/live_analysis/gainers/niftyGainers1.json";
  public static final String GAINERS2_URL = "https://www1.nseindia.com/live_market/dynaContent/live_analysis/gainers/jrNiftyGainers1.json";
  public static final String LOOSERS1_URL = "https://www1.nseindia.com/live_market/dynaContent/live_analysis/losers/niftyLosers1.json";
  public static final String LOOSERS2_URL = "https://www1.nseindia.com/live_market/dynaContent/live_analysis/losers/jrNiftyLosers1.json";
  
  public static final String MOREVOLUME_GAINERS_URL = "https://www.nseindia.com/live_market/dynaContent/live_analysis/most_active/allTopVolume1.json";
  
  //python Api's
  public static final String SCRIPT_PYTHON_API="http://ec2-13-234-113-202.ap-south-1.compute.amazonaws.com:7000/quotes/?scriptcode=";
  public static final String TOP_100_SCRIPTS_API="http://ec2-13-234-113-202.ap-south-1.compute.amazonaws.com:7000/quotes/top100";
  public static final String SENSEX_NIFTY_API="http://ec2-13-234-113-202.ap-south-1.compute.amazonaws.com:7000/quotes/indexes";
  public static final String SESSION_API = "https://equitynotify.com/vittusers/session";
  		
  
  public static final String HEADER_USER_AGENT = "User-Agent";
  public static final String HEADER_USER_AGENT_VALUE = "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2228.0 Safari/537.36";
  
  public final static String AUTH_KEY_FCM = "AAAAttHbopY:APA91bHNBCJW3iU0Pm65AS0TVBozO0ereADPUMQbIHUsEreLzh9MR73NGV3FSuNveGgTyw7maqd5DnAYSjhY3_8cbDtJMBQ63lro8huOGUF7e5da2xiUvSBII3ohWc4WovF4tj80k6CO";
  public final static String API_URL_FCM = "https://fcm.googleapis.com/fcm/send";
  public final static String MSG_TO_TOPIC_URL = "https://gcm-http.googleapis.com/gcm/send";

  
  public static final String TESTING_BASE_URL ="https://stockbootest.appspot.com";
  public static final String LOCAL_URL="https://equitynotify.com/service";
  
  public static final String APP_SERVICE_MAIL_ID ="muralikrishnab22.1997@gmail.com";
  public static final String APP_SERVICE_PASSWORD ="8123287987";
  
  public static final int CORPORATE_PAGING=100;
  public static final String CORPORATE_ALERTS_ATTACHMENT_URL="https://www.bseindia.com/xml-data/corpfiling/AttachLive/";

  public static final int DEFAULT_CORP_START=0;
  public static final int DEFAULT_CORP_END=10;
  
  
}
