package com.sample6.app;

import android.app.Activity;
import android.os.Bundle;


import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import android.widget.Toast;
import android.widget.AdapterView;
import android.view.View;


import com.sample6.app.R;

public class MainActivity extends Activity {

    ListView listView;
    SimpleAdapter adapter;
    HashMap<String, String> map;
    ArrayList<HashMap<String, String>> mylist;
    String[] jdl;
    String[] ktr;
    String[] img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.list_view);
        jdl = new String[] {
            "Sampokong","Waterpark","Mangkang","Wonderia","Gereja Blenduk","Monas"
        };
        ktr = new String[]{
          "Tempat Wisata","Tempat Wisata","Tempat Wisata","Tempat Wisata","Tempat Wisata","Tempat Wisata","Tempat Wisata"
        };
        img = new String[]{
          Integer.toString(R.drawable.sampokong),Integer.toString(R.drawable.waterpark),Integer.toString(R.drawable.mangkang),
                Integer.toString(R.drawable.wonderia),Integer.toString(R.drawable.gerejablenduk),Integer.toString(R.drawable.sampokong)
        };
        mylist = new ArrayList<HashMap<String, String>>();

        for (int i=0; i<jdl.length; i++){
            map = new HashMap<String, String>();
            map.put("judul", jdl[i]);
            map.put("Keterangan", ktr[i]);
            map.put("Gambar", img[i]);
            mylist.add(map);
        }
        adapter = new SimpleAdapter(this, mylist, R.layout.item_list,
                new String[]{"judul", "Keterangan", "Gambar"}, new int[]{R.id.txt_judul,(R.id.txt_keterangan),(R.id.img)});
        listView.setAdapter(adapter);

listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
   @Override
   public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
     
     //Toast.makeText(getApplicationContext(), adapter.getItem(position), Toast.LENGTH_SHORT).show();
     
     Toast toast = Toast.makeText(getApplicationContext(),
        "This is a message displayed in a Toast",
        Toast.LENGTH_SHORT);
    
toast.show();
     
     
      
   } 
});





    }

}
