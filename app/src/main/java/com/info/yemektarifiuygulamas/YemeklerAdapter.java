package com.info.yemektarifiuygulamas;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class YemeklerAdapter extends RecyclerView.Adapter<YemeklerAdapter.CardTasarimTutucu> {
    private Context mContext;
    private List<Yemekler> yemeklerListesi;

    public YemeklerAdapter(Context mContext, List<Yemekler> yemeklerListesi) {
        this.mContext = mContext;
        this.yemeklerListesi = yemeklerListesi;
    }

    public class CardTasarimTutucu extends RecyclerView.ViewHolder {
        public TextView yemekAdi,yemekTarif;
        public CardView yemekCard;
        public ImageView yemekResim;

        public CardTasarimTutucu(View view) {
            super(view);
            yemekAdi = view.findViewById(R.id.yemekAdi);
            yemekTarif = view.findViewById(R.id.yemekTarif);
            yemekCard =  view.findViewById(R.id.yemekCard);
            yemekResim = view.findViewById(R.id.yemekResim);
        }
    }


    @Override
    public CardTasarimTutucu onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.yemek_cardview, parent, false);

        return new CardTasarimTutucu(itemView);
    }

    @Override
    public int getItemCount() {
        return yemeklerListesi.size();
    }

    @Override
    public void onBindViewHolder(final CardTasarimTutucu holder,final int position) {
        final Yemekler yemek = yemeklerListesi.get(position);

        holder.yemekAdi.setText(yemek.getYemek_adi());
        holder.yemekTarif.setText(yemek.getYemek_tarif());

        holder.yemekCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mContext.startActivity(new Intent(mContext,YemekGuncellemeActivity.class));
            }
        });
    }
}
