package com.shakkib.crypto.CryptoConstant;

import java.util.List;

public class CryptoConstant {
    public static final String GET_COINS_API = "https://coinranking1.p.rapidapi.com/coins?referenceCurrencyUuid=yhjMzLPhuIDl&timePeriod=24h&tiers%5B0%5D=1&orderBy=marketCap&orderDirection=desc&limit=50&offset=0";
    public static final String GET_COIN_HISTORY_API = "https://coinranking1.p.rapidapi.com/coin/";
    public static final String COIN_HISTORY_TIME_PERIOD_PARAM = "/history?timePeriod=";
    public static final List<String> timePeriods = List.of("24h", "7d", "30d", "3m", "1y", "3y", "5y");
    public static final String REDIS_KEY_COINS = "coins";
    public  static String apiHost = "coinranking1.p.rapidapi.com";
    public  static String apiKey = "88ccb36550mshd9637b8b7221a61p1863ddjsn0beb5b24d6bf";
    public static String timeZone = "GMT";
    
}
