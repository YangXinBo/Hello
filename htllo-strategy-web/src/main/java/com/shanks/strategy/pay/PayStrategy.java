package com.shanks.strategy.pay;

import java.util.Map;

/**
 * FileName    : com.shanks.strategy
 * Description :
 *
 * @author : shanks
 * @version : 1.0
 * Create Date : 2021/3/17 22:15
 * @Copyright : shanks
 * @Company : shanks
 **/
public interface PayStrategy {

    Map<String, String> strategyMap();

    String pay();

}
