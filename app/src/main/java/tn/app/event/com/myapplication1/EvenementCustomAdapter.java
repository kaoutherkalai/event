package tn.app.event.com.myapplication1;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class EvenementCustomAdapter extends ArrayAdapter<Evenement> {
    Context context;
    int layoutResourceId;
    ArrayList<Evenement> data = new ArrayList<Evenement>();
    public EvenementCustomAdapter(Context context, int layoutResourceId,
                                  ArrayList<Evenement> data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        EvenementHolder holder = null;
        if (row == null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);
            holder = new EvenementHolder();
            holder.textNom = (TextView) row.findViewById(R.id.textView1);
            holder.textRemarque = (TextView) row.findViewById(R.id.textView2);
            holder.imgRow = (ImageView) row.findViewById(R.id.imgRow);
            holder.date = (TextView) row.findViewById(R.id.date);


            row.setTag(holder);
        } else {
            holder = (EvenementHolder) row.getTag();
        }
        Evenement evenement = data.get(position);
        holder.textNom.setText(evenement.getName());
        holder.textRemarque.setText(evenement.getRemarque());
        holder.imgRow.setBackgroundResource(evenement.getImgRow());
        holder.date.setText(evenement.getDate());


        return row;
    }
    static class EvenementHolder {
        TextView textNom;
        TextView textRemarque;
        ImageView imgRow;
        TextView date;



    }
}