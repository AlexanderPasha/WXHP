package com.mannydev.wexhelper.view;

import android.view.View;
import android.widget.TextView;

import com.mannydev.wexhelper.R;
import com.mannydev.wexhelper.model.Coin;


public class BitcoinViewHolder extends MyViewHolder {
    TextView txtCoinName,txtUsdBuy,txtUsdSell,txtRubBuy,
            txtRubSell,txtUsdSpread,txtRubSpread,txtBrn,txtSrn,
            txtEurBuy,txtEurSell,txtEurSprd;

    public BitcoinViewHolder(View itemView) {
        super(itemView);
        txtCoinName = itemView.findViewById(R.id.txtCoinName);
        txtUsdBuy = itemView.findViewById(R.id.txtUsdBuy);
        txtUsdSell = itemView.findViewById(R.id.txtUsdSell);
        txtRubBuy = itemView.findViewById(R.id.txtRubBuy);
        txtRubSell = itemView.findViewById(R.id.txtRubSell);
        txtUsdSpread = itemView.findViewById(R.id.txtUsdSpread);
        txtRubSpread = itemView.findViewById(R.id.txtRubSpread);



        txtEurBuy = itemView.findViewById(R.id.txtEurBuy);
        txtEurSell = itemView.findViewById(R.id.txtEurSell);
        txtEurSprd = itemView.findViewById(R.id.txtEurSprd);



        txtBrn = itemView.findViewById(R.id.txtBrn);
        txtSrn = itemView.findViewById(R.id.txtSrn);

    }

    public void onBindCoinHolder(Coin coin){

        txtCoinName.setText(coin.getName());
        txtUsdBuy.setText(String.valueOf(coin.getUsdBuy()));
        txtUsdSell.setText(String.valueOf(coin.getUsdSell()));
        txtRubBuy.setText(String.valueOf(coin.getRurBuy()));
        txtRubSell.setText(String.valueOf(coin.getRurSell()));
        txtUsdSpread.setText(coin.getUsdSprd());
        txtRubSpread.setText(coin.getRurSprd());
        txtBrn.setText(coin.getRightNowBuyUsdProfit());
        txtSrn.setText(coin.getRightNowSellUsdProfit());


        txtEurBuy.setText(String.valueOf(coin.getEurBuy()));
        txtEurSell.setText(String.valueOf(coin.getEurSell()));
        txtEurSprd.setText(String.valueOf(coin.getEurSprd()));


        if(coin.getBestBuyProfit().equals("USD")){
            txtUsdBuy.setBackgroundColor(itemView.getContext().getResources().getColor(R.color.colorGreen));
            txtRubBuy.setBackgroundColor(itemView.getContext().getResources().getColor(R.color.colorTextWhite));
            txtEurBuy.setBackgroundColor(itemView.getContext().getResources().getColor(R.color.colorTextWhite));
        }else if(coin.getBestBuyProfit().equals("RUB")){
            txtRubBuy.setBackgroundColor(itemView.getContext().getResources().getColor(R.color.colorGreen));
            txtUsdBuy.setBackgroundColor(itemView.getContext().getResources().getColor(R.color.colorTextWhite));
            txtEurBuy.setBackgroundColor(itemView.getContext().getResources().getColor(R.color.colorTextWhite));
        }else if (coin.getBestBuyProfit().equals("EUR")){
            txtEurBuy.setBackgroundColor(itemView.getContext().getResources().getColor(R.color.colorGreen));
            txtUsdBuy.setBackgroundColor(itemView.getContext().getResources().getColor(R.color.colorTextWhite));
            txtRubBuy.setBackgroundColor(itemView.getContext().getResources().getColor(R.color.colorTextWhite));
        }

        if(coin.getBestSellProfit().equals("USD")){
            txtUsdSell.setBackgroundColor(itemView.getContext().getResources().getColor(R.color.colorGreen));
            txtRubSell.setBackgroundColor(itemView.getContext().getResources().getColor(R.color.colorTextWhite));
            txtEurSell.setBackgroundColor(itemView.getContext().getResources().getColor(R.color.colorTextWhite));
        }else if (coin.getBestSellProfit().equals("RUB")){
            txtRubSell.setBackgroundColor(itemView.getContext().getResources().getColor(R.color.colorGreen));
            txtUsdSell.setBackgroundColor(itemView.getContext().getResources().getColor(R.color.colorTextWhite));
            txtEurSell.setBackgroundColor(itemView.getContext().getResources().getColor(R.color.colorTextWhite));
        }else if (coin.getBestSellProfit().equals("EUR")){
            txtEurSell.setBackgroundColor(itemView.getContext().getResources().getColor(R.color.colorGreen));
            txtUsdSell.setBackgroundColor(itemView.getContext().getResources().getColor(R.color.colorTextWhite));
            txtRubSell.setBackgroundColor(itemView.getContext().getResources().getColor(R.color.colorTextWhite));
        }

    }

    static String roundResult(double d) {
        return String.format("%.5f", d);
    }
}
