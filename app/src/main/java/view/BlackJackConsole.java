package view;

import android.util.Log;

import model.Card;
import model.Color;
import model.Value;

public class BlackJackConsole {

    public BlackJackConsole(){
        String tag = "Oui";
        Card[] tab = {new Card(Value.TWO, Color.HEART), new Card(Value.JACK, Color.SPADE)};
        for (Card c : tab){
            Log.e(tag,"This card is a " + c + " worth " + c.getPoints() + " points." );
            Log.e(tag,"It's a name " + c.getColorName());
            switch (c.getColorSymbole()){
                case "\u2665" : Log.e(tag, "symbole : heart ");break;
                case "\u2660" : Log.e(tag, "symbole : spade ");break;
                case "\u2663" : Log.e(tag, "symbole : club ");break;
                case "\u2666" : Log.e(tag, "symbole : diamond ");break;
            }
            if(c.getValueSymbole().matches("[JQK]")){
                Log.e(tag,"it's a face !");
            }else{
                Log.e(tag, "It's not a face.");
            }
        }
    }
}
