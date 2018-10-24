package com.example.adnanshakeel.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    //ProductAdapter productAdpapter;
    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        productList = new ArrayList<>();
        recyclerView = (RecyclerView) findViewById(R.id.RecyclerView);
        recyclerView.setHasFixedSize(true);
        StaggeredGridLayoutManager gridLayoutManager = new StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(gridLayoutManager);

        productList.add(
                new Product(
                        R.drawable.pakistan, "Pakistan"
                )
        );

        productList.add(
                new Product(
                        R.drawable.canada1, "Canada"
                )
        );
        productList.add(
                new Product(
                        R.drawable.france, "France"
                )
        );
        productList.add(
                new Product(
                        R.drawable.germany, "Germany"
                )
        );
        productList.add(
                new Product(
                        R.drawable.sweden, "Sweden"
                )
        );
        productList.add(
                new Product(
                        R.drawable.nz, "New Zealand"
                )
        );
        productList.add(
                new Product(
                        R.drawable.china, "China"
                )
        );
        productList.add(
                new Product(
                        R.drawable.bangladesh, "Bangladesh"
                )
        );
        productList.add(
                new Product(
                        R.drawable.japan, "Japan"
                )
        );
        productList.add(
                new Product(
                        R.drawable.australia, "Australia"
                )
        );
        productList.add(
                new Product(
                        R.drawable.srilanka, "Srilanka"
                )
        );
        productList.add(
                new Product(
                        R.drawable.iran, "Iran"
                )
        );
        productList.add(
                new Product(
                        R.drawable.italy, "Italy"
                )
        );
        productList.add(
                new Product(
                        R.drawable.brazil1, "Brazil"
                )
        );
        productList.add(
                new Product(
                        R.drawable.peru, "Peru"
                )
        );
        productList.add(
                new Product(
                        R.drawable.oman, "Oman"
                )
        );
        ProductAdapter productAdpapter = new ProductAdapter(this, productList);
        recyclerView.setAdapter(productAdpapter);

//        recyclerView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {
//                Intent mIntent=new Intent(MainActivity.this,DetailActivity.class);
//                mIntent.putExtra("Browser Name",countryNames[i]);
//                mIntent.putExtra("Browser Image",countryFlags[i]);
//                startActivity(mIntent);
//            }
//        });



    }
}

