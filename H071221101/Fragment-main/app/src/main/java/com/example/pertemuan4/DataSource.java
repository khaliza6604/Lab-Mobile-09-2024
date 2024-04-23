package com.example.pertemuan4;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<Instagram> instagrams = generateDummyInstagrams();

    private static ArrayList<Instagram> generateDummyInstagrams() {
        ArrayList<Instagram> instagrams1 = new ArrayList<>();
        instagrams1.add(new Instagram("Armin Arlert ___ ★₊˚﹟\uD83E\uDE90","Armin Arlert"
                ,"A Person Who Cannot Sacrifice Everything, Cannot Change Anything."
                ,R.drawable.armin_pp,R.drawable.armin));

        instagrams1.add(new Instagram("Akaashi Keiji `✦ˑ ִֶ \uD80C\uDC83⊹", "Akaashi Keiji"
                ,"No matter what other people may say, we are the Protagonists of the world"
                ,R.drawable.akaashi_pp,R.drawable.akaashi));

        instagrams1.add(new Instagram("Nanami Kento ‧˚꒰\uD83D\uDC3E꒱༘⋆", "Nanami Kento"
                ,"You Take It From Here, Season 2, Episode 18"
                ,R.drawable.nanami_pp, R.drawable.nanami));

        instagrams1.add((new Instagram("Killua Zoldyck ┊ ˚➶ ｡˚ ☁","Killua Zoldyck"
                ,"I promise. I'll never betray them. Never."
                ,R.drawable.killua_pp,R.drawable.killua)));

        instagrams1.add(new Instagram("Tsukishima Kei *ੈ✩‧₊˚", "Tsukishima Kei"
                ,"彼の目はすべてを物語っている"
                ,R.drawable.tsuki_pp,R.drawable.tsuki));

        instagrams1.add(new Instagram("yong.lixx  ˚ ༘♡ ⋆｡","Lee Felix"
                ,"\uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D"
                ,R.drawable.felix_pp, R.drawable.felix));

        instagrams1.add(new Instagram("d.o.hkyungsoo ˚ ༘ ೀ⋆｡˚","Do Kyung Soo"
                , "후회는 모두 잊어버리세요. 그냥 움직이고 두려워하지 마세요."
                ,R.drawable.do_pp,R.drawable.do_post));

        instagrams1.add(new Instagram("Wanderer˚ ༘♡ ⋆｡˚ ❀","Wanderer"
                ,"you think ive got sharp tobgue? i just tell it like it is. if someone cant handle it, maybe thats their problem"
                ,R.drawable.scara_pp, R.drawable.scara));

        instagrams1.add(new Instagram("Xiao ⭒❃.✮:▹", "Xiao"
                ,"only you can evaluate the result of this trial you will progress further that way "
                ,R.drawable.xiao_pp, R.drawable.xiao));

        instagrams1.add(new Instagram("Xavier \uD81A\uDDB9ׂ \uD80C\uDE12 \uD83D\uDC07 ／ ⋆ ۪", "Xavier"
                ,"If you have nowhere to go, nowhere to rest your weary self… you can stay with me."
                ,R.drawable.xavier_pp, R.drawable.xavier));
        return instagrams1;
    }
}
