package io.quantum.trading.brokers.forex.mt5protocol.mtapi.mt5;

class SymbolMarketData
{
    public int Id;
    public long UpdateMask;
    public long Time;
    //private int s14;
    public long Bid;
    public long BidHigh;
    public long BidLow;
    public long Ask;
    public long AskHigh;
    public long AskLow;
    public long Last;
    public long LastHigh;
    public long LastLow;
    public long Volume;
    public long VolumeHigh;
    public long VolumeLow;
    public long Deals;
    public long DealsVolume;
    public long Turnover;
    public long OpenInterest;
    public long BuyOrders;
    public long BuyVolume;
    public long SellOrders;
    public long SellVolume;
    public long OpenPrice;
    public long ClosePrice;
    public long AverageWeightPrice;
    public long PriceChange;
    public long PriceVolatility;
    public long PriceTheoretical;
    public long TimeMs;
    public long PriceDelta;
    public long PriceTheta;
    public long PriceGamma;
    public long PriceVega;
    public long PriceRho;
    public long PriceOmega;
    public long PriceSensitivity;
}