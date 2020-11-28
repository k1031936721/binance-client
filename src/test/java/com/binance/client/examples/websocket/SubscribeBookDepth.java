package com.binance.client.examples.websocket;

import com.binance.client.SubscriptionClient;
import com.binance.client.SubscriptionListener;
import com.binance.client.examples.constants.PrivateConfig;
import com.binance.client.model.event.OrderBookEvent;
import com.binance.client.model.market.OrderBookEntry;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SubscribeBookDepth {

    public static void main(String[] args) {
        SubscriptionClient client = SubscriptionClient.create(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        client.subscribeBookDepthEvent("btcusdt", 5, ((event) -> {
            /*List<OrderBookEntry> entryList = event.getAsks();
            Double sum = 0.0;
            Double qty = 0.0;
            for(OrderBookEntry orderBookEntry:entryList){
                sum+=orderBookEntry.getPrice().doubleValue()*(orderBookEntry.getQty().doubleValue());
                qty+=orderBookEntry.getQty().doubleValue();
            }
            Double avg = sum/qty;
//            System.out.println(sum);
//            System.out.println(qty);
            System.out.println("均价:"+avg+"=============="+"数量:"+qty);*/
            System.out.println(event);
            client.unsubscribeAll();
        }), null);


    }

}
