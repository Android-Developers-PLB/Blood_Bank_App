package com.example.blood_bank_app.LifeSavers.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.blood_bank_app.LifeSavers.Adapters.RequestAdapter;
import com.example.blood_bank_app.LifeSavers.DataModels.RequestDataModel;
import com.example.blood_bank_app.R;

import java.util.ArrayList;
import java.util.List;

public class RequestsActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<RequestDataModel> requestDataModels;
    private RequestAdapter requestAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_requests);
        Toolbar toolbar=findViewById(R.id.toolbar_requests);

        requestDataModels=new ArrayList<>();

        recyclerView=findViewById(R.id.recyclerView_Requests);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        requestAdapter=new RequestAdapter(requestDataModels,this);
        recyclerView.setAdapter(requestAdapter);

        populatePage();
    }

    private void populatePage(){
        RequestDataModel requestDataModel=new RequestDataModel("Lorem ipsum, or lipsum as it is sometimes known, is dummy text used in laying out print, graphic or web designs","https://i.pinimg.com/564x/48/d1/18/48d1186e8d5436b39d4f1a0116042a6f.jpg");
        requestDataModels.add(requestDataModel);
        requestDataModels.add(requestDataModel);
        requestDataModels.add(requestDataModel);
        requestDataModels.add(requestDataModel);
        requestDataModels.add(requestDataModel);
        requestDataModels.add(requestDataModel);
        requestDataModels.add(requestDataModel);
        requestDataModels.add(requestDataModel);
        requestAdapter.notifyDataSetChanged();
    }
}