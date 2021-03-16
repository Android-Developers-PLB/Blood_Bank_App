package com.example.blood_bank_app.LifeSavers.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.blood_bank_app.LifeSavers.DataModels.RequestDataModel;
import com.example.blood_bank_app.R;

import java.util.List;

public class RequestAdapter extends RecyclerView.Adapter<RequestAdapter.ViewHolder> {

    private List<RequestDataModel> dataSet;
    private Context context;

    public RequestAdapter(List<RequestDataModel> dataSet, Context context) {
        this.dataSet = dataSet;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.request_item_layout, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder,final int position) {
        holder.message.setText(dataSet.get(position).getMessage());
        Glide.with(holder.profile_image.getContext()).load(dataSet.get(position).getImageUrl()).into(holder.profile_image);

        holder.call_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //for later
            }
        });

        holder.share_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //for later
            }
        });
    }


    @Override
    public int getItemCount() {
        return dataSet.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        TextView message;
        ImageView profile_image,call_button,share_button;
        ViewHolder(final View itemView) {
            super(itemView);
            message=itemView.findViewById(R.id.textView_message);
            profile_image=itemView.findViewById(R.id.profile_image);
            call_button=itemView.findViewById(R.id.call_button);
            share_button=itemView.findViewById(R.id.share_button);

        }

    }

}