
function openChart(simbor){
   var chart= new TradingView.widget(
        {
        "autosize": true,
        "symbol": "BINANCE:"+simbor,
        "interval": "D",
        "timezone": "Etc/UTC",
        "theme": "dark",
        "style": "1",
        "locale": "kr",
        "toolbar_bg": "#f1f3f6",
        "enable_publishing": false,
        "studies": [
          "Volume@tv-basicstudies",
          "RSI@tv-basicstudies",
          "MASimple@tv-basicstudies"
        ],
        "container_id": "tradingview_3c03c"
      }
        );

      return chart;
        
}