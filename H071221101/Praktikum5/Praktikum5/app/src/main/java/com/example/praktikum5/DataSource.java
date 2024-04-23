package com.example.praktikum5;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<Model> models = generateDummyModels();

    private static ArrayList<Model> generateDummyModels() {
        ArrayList<Model> models = new ArrayList<>();
        models.add(new Model("Armin Arlert","Armin Arlert ___ ★₊˚﹟\uD83E\uDE90","A Person Who Cannot Sacrifice Everything, Cannot Change Anything.",R.drawable.armin_pp,R.drawable.armin_post));
        models.add(new Model("Akaashi Keiji", "Akaashi Keiji `✦ˑ ִֶ \uD80C\uDC83⊹","No matter what other people may say, we are the Protagonists of the world",R.drawable.akaashi_pp,R.drawable.akaashi_post));
        models.add(new Model("Nanami Kento", "Nanami Kento ‧˚꒰\uD83D\uDC3E꒱༘⋆","You Take It From Here, Season 2, Episode 18",R.drawable.nanami_pp, R.drawable.nanami_post));
        models.add(new Model("Do Kyung Soo ", "d.o.hkyungsoo ˚ ༘ ೀ⋆｡˚","후회는 모두 잊어버리세요. 그냥 움직이고 두려워하지 마세요.",R.drawable.do_pp,R.drawable.do_post));
        models.add(new Model("Xiao ⭒❃.✮:▹","Xiao  ⭒❃.✮:▹","only you can evaluate the result of this trial you will progress further that way",R.drawable.xiao_pp, R.drawable.xiao_post));

        return models;
    }
}
