package com.example.myapplication;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<Instagram> instagrams = generateDummyInstagram();

    //kembalikan arraylist dari objek Instagram
    private static ArrayList<Instagram> generateDummyInstagram() {
        ArrayList<Instagram> instagrams1 = new ArrayList<>();
        instagrams1.add(new Instagram("Armin Arlert ___ ★₊˚﹟\uD83E\uDE90", "Nikah neng?", R.drawable.armin, R.drawable.armin_post, R.drawable.armin_story,"18,5 M", "5"));
        instagrams1.add(new Instagram("Akaashi Keiji `✦ˑ ִֶ \uD80C\uDC83⊹", "Punggung yang akan jadi tempatmu bersandar", R.drawable.akaashi, R.drawable.akaashi_post, R.drawable.akaashi_story, "13.5 M", "6"));
        instagrams1.add(new Instagram("Nanami Kento ‧˚꒰\uD83D\uDC3E꒱༘⋆", "Malaysia - Kuanta", R.drawable.nanami, R.drawable.nanami_post, R.drawable.nanami_story, "10,3 M", "172"));
        instagrams1.add(new Instagram("Killua Zoldyck ┊ ˚➶ ｡˚ ☁", "Menatap ayang", R.drawable.killua, R.drawable.killua_post, R.drawable.killua_story, "6.9 M", "1"));
        instagrams1.add(new Instagram("Tsukishima Kei *ੈ✩‧₊˚", "he he he (sarkas)", R.drawable.tsuki, R.drawable.tsuki_post, R.drawable.tsuki_story, "9.9 M", "0"));
        instagrams1.add(new Instagram("yong.lixx  ˚ ༘♡ ⋆｡˚ ꕥ", "Lucu ga? ><", R.drawable.felix, R.drawable.felix_post, R.drawable.felix_story, "17.9 M", "9"));
        instagrams1.add(new Instagram("d.o.hkyungsoo ˚ ༘ ೀ⋆｡˚", "turu", R.drawable.do_p, R.drawable.do_post, R.drawable.do_story, "3,4 M", "0"));
        instagrams1.add(new Instagram("Wanderer˚ ༘♡ ⋆｡˚ ❀", "Lagi di kampung emak", R.drawable.scara, R.drawable.scara_post, R.drawable.scara_story, "5,4 M", "10"));
        instagrams1.add(new Instagram("Xiao ⭒❃.✮:▹", "An adeptus", R.drawable.xiao, R.drawable.xiao_post, R.drawable.xiao_story, "9.4 M", "1"));
        instagrams1.add(new Instagram("Xavier \uD81A\uDDB9ׂ \uD80C\uDE12 \uD83D\uDC07 ／ ⋆ ۪", "ngantuk...", R.drawable.xavier, R.drawable.xavier_post, R.drawable.xavier_story, "8,4 M", "12"));
        return instagrams1;
    }
}