package umb.fasilkom.sendirisyariah;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/*
* author by SendiriSyariah
* 23-april-2019
* */
public class CustomAdapter extends BaseAdapter {
    Context context;
    String myAccountItem[];
    int icons[];
    LayoutInflater inflater;

    public CustomAdapter(Context applicationContext, String[] myAccountItem, int[] icons){
        this.context = context;
        this.myAccountItem = myAccountItem;
        this.icons = icons;
        inflater = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount(){
        return myAccountItem.length;
    }
    @Override
    public Object getItem(int i){
        return null;
    }
    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup){
        view = inflater.inflate(R.layout.custom_list_view, null);
        TextView myAccount = (TextView) view.findViewById(R.id.custom_list_text);
        ImageView icon = (ImageView) view.findViewById(R.id.icon);
        myAccount.setText(myAccountItem[i]);
        icon.setImageResource(icons[i]);
        return view;
    }
}
