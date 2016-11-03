package com.htcursos.lista05_listview.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.htcursos.lista05_listview.R;
import com.htcursos.lista05_listview.models.User;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by carlos on 03/11/2016.
 */

public class UserListAdapter extends ArrayAdapter<User> {

    public UserListAdapter(Context context, ArrayList<User> userList) {
        super(context, R.layout.activity_itemlist , userList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder holder ;

        //se item nao existe
        if(convertView == null){
            //inflar a view , criar a view .
            convertView = View.inflate(getContext() , R.layout.activity_itemlist, null);
            //acesso aos itens da lista .
            holder = new ViewHolder();
            //onde estao os binds e aquem eu quero liga-los .
            ButterKnife.bind(holder, convertView);
            //colocar uma identificacao para um item da lista
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }

        //coloca os itens do array em seus lugares certos, seta em um aposicao da ListView .
        final User user = getItem(position);

        if(user != null){
            holder.nome.setText(user.getNome());
            holder.cargo.setText(user.getCargo());
        }

        return convertView;
    }

    public class ViewHolder{
        @BindView(R.id.text_nome)
        TextView nome;

        @BindView(R.id.text_cargo)
        TextView cargo;
    }

}
