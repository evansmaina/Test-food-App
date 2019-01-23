package com.example.test2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    GridView grdVw;
    String [] foodTxt={"Burger","Pizza","HotDogs","SuppaGhetti","Meat","Meat Pie","Mahindi Choma","Kuku","Veg","Kebab","Ugali","Pilau","Githeri",
            "Fish","Stew"};
    int [] image={R.drawable.burger,R.drawable.pizza,R.drawable.hotdog,R.drawable.suppaghetti,R.drawable.meat,R.drawable.meat_pie,R.drawable.mahindi_choma,
            R.drawable.kuku,R.drawable.veg,R.drawable.kebab,R.drawable.sembe,R.drawable.pilau,R.drawable.githeri,R.drawable.fish,R.drawable.stew};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grdVw=findViewById(R.id.grdVw);
        CustomAdapter adapt= new CustomAdapter();
        grdVw.setAdapter(adapt);
    }

    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return image.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view=getLayoutInflater().inflate(R.layout.custom_adapter,null);
            ImageView imgVw= view.findViewById(R.id.imgVw);
            TextView txtVw=view.findViewById(R.id.txtVw);

            imgVw.setImageResource(image[position]);
            txtVw.setText(foodTxt[position]);
            return view;
        }
    }
}
