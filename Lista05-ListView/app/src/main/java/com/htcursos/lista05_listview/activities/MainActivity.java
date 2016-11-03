package com.htcursos.lista05_listview.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.htcursos.lista05_listview.R;
import com.htcursos.lista05_listview.adapters.UserListAdapter;
import com.htcursos.lista05_listview.models.User;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by carlos on 03/11/2016.
 */

public class MainActivity extends AppCompatActivity{

    @BindView(R.id.list_view)
    ListView listView;

    UserListAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        User user01 = new User("jao" , "programador");
        User user02 = new User("ana" , "fisioterapeuta");
        User user03 = new User("gabriela" , "engenheira");
        User user04 = new User("gab" , "psicologa");
        User user05 = new User("leandro" , "estudante");
        User user06 = new User("carolina" , "gerente");
        User user07 = new User("josé" , "desenvolvedor android");
        User user08 = new User("giovana" , "advogada");

        final ArrayList<User> list = new ArrayList<User>();

        list.add(user01);
        list.add(user02);
        list.add(user03);
        list.add(user04);
        list.add(user05);
        list.add(user06);
        list.add(user07);
        list.add(user08);

        adapter = new UserListAdapter(this , list);

        listView.setAdapter(adapter);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                toast(list.get(position).getCargo().toString());
                return true;
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                toast(list.get(position).getNome().toString());
            }
        });

    }

    public void toast(String msg){
        Toast.makeText(getApplicationContext() , msg , Toast.LENGTH_SHORT).show();
    }
}
