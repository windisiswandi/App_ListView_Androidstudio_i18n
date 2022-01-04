package com.example.uts_pemrogramanmobile.model;

import android.content.Context;

import com.example.uts_pemrogramanmobile.R;

import java.util.ArrayList;

public class DataFood {

    static ArrayList<Foods> foods = new ArrayList<>();

    public static ArrayList<Foods> getDataFoodByJenis (String jenis_food, Context ctx)
    {
        foods.clear();
        switch (jenis_food.toLowerCase()) {
            case "padang food":
                dataPadangFood(ctx); break;
            case "lombok food":
                dataLombokFood(ctx); break;
            case "palembang food":
                dataPalembangFood(ctx); break;
            case "aceh food":
                dataAcehFood(ctx); break;
        }

        return foods;
    }

   static void dataPadangFood(Context ctx)
   {
        foods.add(
            new Foods(ctx.getString(R.string.padang_satepadang_name), ctx.getString(R.string.padang_satepadang_price),
                    ctx.getString(R.string.padang_satepadang_descpripsi), ctx.getString(R.string.padang_satepadang_size), R.drawable.sate_padang)
        );
       foods.add(
           new Foods(ctx.getString(R.string.padang_dendengbalado_name), ctx.getString(R.string.padang_dendengbalado_price),
                   ctx.getString(R.string.padang_dendengbalado_descpripsi), ctx.getString(R.string.padang_dendengbalado_size), R.drawable.dendeng_balado_padang)
       );
       foods.add(
           new Foods(ctx.getString(R.string.padang_sotopadang_name), ctx.getString(R.string.padang_sotopadang_price),
                   ctx.getString(R.string.padang_sotopadang_descpripsi), ctx.getString(R.string.padang_sotopadang_size), R.drawable.soto_padang)
       );
       foods.add(
           new Foods(ctx.getString(R.string.padang_ikanbalado_name), ctx.getString(R.string.padang_ikanbalado_price),
                   ctx.getString(R.string.padang_ikanbalado_descpripsi), ctx.getString(R.string.padang_ikanbalado_size), R.drawable.ikan_balado)
       );
    }

    static void dataLombokFood(Context ctx) {
        foods.add(
            new Foods(ctx.getString(R.string.lombok_pelecinglombok_name), ctx.getString(R.string.lombok_pelecinglombok_price),
                    ctx.getString(R.string.lombok_pelecinglombok_descpripsi), ctx.getString(R.string.lombok_pelecinglombok_size), R.drawable.pelecing_lombok)
        );
        foods.add(
            new Foods(ctx.getString(R.string.lombok_ayamtaliwang_name), ctx.getString(R.string.lombok_ayamtaliwang_price),
                    ctx.getString(R.string.lombok_ayamtaliwang_descpripsi), ctx.getString(R.string.lombok_ayamtaliwang_size), R.drawable.ayam_taliwang_lombok)
        );
        foods.add(
            new Foods(ctx.getString(R.string.lombok_satebulayak_name), ctx.getString(R.string.lombok_satebulayak_price),
                    ctx.getString(R.string.lombok_satebulayak_descpripsi), ctx.getString(R.string.lombok_satebulayak_size), R.drawable.sate_bulayak_lombok)
        );
        foods.add(
            new Foods(ctx.getString(R.string.lombok_nasicampur_name), ctx.getString(R.string.lombok_nasicampur_price),
                    ctx.getString(R.string.lombok_nasicampur_descpripsi), ctx.getString(R.string.lombok_nasicampur_size), R.drawable.nasi_campur_lombok)
        );
    }

    static void dataPalembangFood(Context ctx) {
        foods.add(
            new Foods(ctx.getString(R.string.palembang_pempekpalembang_name), ctx.getString(R.string.palembang_pempekpalembang_price),
                    ctx.getString(R.string.palembang_pempekpalembang_descpripsi), ctx.getString(R.string.palembang_pempekpalembang_size), R.drawable.pempek_palembang)
        );
        foods.add(
            new Foods(ctx.getString(R.string.palembang_tekwan_name), ctx.getString(R.string.palembang_tekwan_price),
                    ctx.getString(R.string.palembang_tekwan_descpripsi), ctx.getString(R.string.palembang_tekwan_size), R.drawable.tekwan_palembang)
        ); foods.add(
            new Foods(ctx.getString(R.string.palembang_burgopalembang_name), ctx.getString(R.string.palembang_burgopalembang_price),
                    ctx.getString(R.string.palembang_burgopalembang_descpripsi), ctx.getString(R.string.palembang_burgopalembang_size), R.drawable.burgo_palembang)
        );
        foods.add(new Foods(ctx.getString(R.string.palembang_miecelor_name), ctx.getString(R.string.palembang_miecelor_price),
                ctx.getString(R.string.palembang_miecelor_descpripsi), ctx.getString(R.string.palembang_miecelor_size), R.drawable.mie_celor_palembang)
        );

    }

    static void dataAcehFood(Context ctx) {
        foods.add(
            new Foods(ctx.getString(R.string.aceh_mieaceh_name), ctx.getString(R.string.aceh_mieaceh_price),
                    ctx.getString(R.string.aceh_mieaceh_descpripsi), ctx.getString(R.string.aceh_mieaceh_size), R.drawable.mie_aceh)
        );
        foods.add(
                new Foods(ctx.getString(R.string.aceh_nasigurih_name), ctx.getString(R.string.aceh_nasigurih_price),
                        ctx.getString(R.string.aceh_nasigurih_descpripsi), ctx.getString(R.string.aceh_nasigurih_size), R.drawable.nasih_gurih_aceh)
        );
        foods.add(
                new Foods(ctx.getString(R.string.aceh_ayamtangkap_name), ctx.getString(R.string.aceh_ayamtangkap_price),
                        ctx.getString(R.string.aceh_ayamtangkap_descpripsi), ctx.getString(R.string.aceh_ayamtangkap_size), R.drawable.ayam_tangkap_aceh)
        );
        foods.add(
                new Foods(ctx.getString(R.string.aceh_sambelasamudeung_name), ctx.getString(R.string.aceh_sambelasamudeung_price),
                        ctx.getString(R.string.aceh_sambelasamudeung_descpripsi), ctx.getString(R.string.aceh_ayamtangkap_size), R.drawable.sambal_asam_aceh)
        );

    }
}
