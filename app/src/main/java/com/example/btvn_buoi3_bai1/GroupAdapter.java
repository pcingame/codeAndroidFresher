package com.example.btvn_buoi3_bai1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GroupAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{


    public GroupAdapter(ArrayList<Group> groupArrayList, Context context) {
        this.groupArrayList = groupArrayList;
        this.context = context;
    }

    private ArrayList<Group> groupArrayList;
    private Context context;




    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        if(viewType == 1){
            View view = LayoutInflater.from(context).inflate(R.layout.item_closed_group, parent, false);
            CloseGroupViewHolder closeGroupViewHolder = new CloseGroupViewHolder(view);
            return closeGroupViewHolder;
        }
        else if(viewType == 2){
            View view = LayoutInflater.from(context).inflate(R.layout.item_open_group, parent, false);
            OpenGroupViewHolder openGroupViewHolder = new OpenGroupViewHolder(view);
            return openGroupViewHolder;
        }else {
            View view = LayoutInflater.from(context).inflate(R.layout.item_secret_group, parent, false);
            SecretGroupViewHolder secretGroupViewHolder = new SecretGroupViewHolder(view);
            return secretGroupViewHolder;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull  RecyclerView.ViewHolder holder, int position) {
        Group group = groupArrayList.get(position);

        if(holder instanceof CloseGroupViewHolder){
            CloseGroupViewHolder closeGroupViewHolder = (CloseGroupViewHolder) holder;
            closeGroupViewHolder.imageView.setImageResource(group.getIdImage());
            closeGroupViewHolder.tvName.setText(group.getName() + "");
            closeGroupViewHolder.tvFan.setText(group.getFan() + "");
            closeGroupViewHolder.tvPost.setText(group.getPost() + "");
            //closeGroupViewHolder.tvGroup.setText(group.getIdGroup() + "Nhóm đóng");
        }
        else if(holder instanceof OpenGroupViewHolder){
            OpenGroupViewHolder openGroupViewHolder = (OpenGroupViewHolder) holder;
            openGroupViewHolder.imageView.setImageResource(group.getIdImage());
            openGroupViewHolder.tvName.setText(group.getName() + "");
            openGroupViewHolder.tvFan.setText(group.getFan() + "");
            openGroupViewHolder.tvPost.setText(group.getPost() + "");
           // openGroupViewHolder.tvGroup.setText(group.getIdGroup() + "Nhóm mở");
        }else {
            SecretGroupViewHolder secretGroupViewHolder = (SecretGroupViewHolder) holder;
            secretGroupViewHolder.imageView.setImageResource(group.getIdImage());
            secretGroupViewHolder.tvName.setText(group.getName() + "");
            secretGroupViewHolder.tvFan.setText(group.getFan() + "");
            secretGroupViewHolder.tvPost.setText(group.getPost() + "");
            //secretGroupViewHolder.tvGroup.setText(group.getIdGroup() + "Nhóm kín");
        }
    }

    @Override
    public int getItemViewType(int position) {
        Group group = groupArrayList.get(position);
        if(group.getIdGroup() == 1){
            return 1; //1 là nam
        }else if(group.getIdGroup() == 2) {
            return 2;
        }else {
            return 3;
        }

    }

    @Override
    public int getItemCount() {
        return groupArrayList.size();
    }

    class CloseGroupViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView tvName;
        private TextView tvFan;
        private TextView tvPost;
        private TextView tvGroup;


        public CloseGroupViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.closedImage);
            tvName = itemView.findViewById(R.id.closedName);
            tvFan = itemView.findViewById(R.id.closedFan);
            tvPost = itemView.findViewById(R.id.closedPosts);
            tvGroup = itemView.findViewById(R.id.closedGroup);
        }
    }

    class OpenGroupViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView tvName;
        private TextView tvFan;
        private TextView tvPost;
        private TextView tvGroup;


        public OpenGroupViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.openImage);
            tvName = itemView.findViewById(R.id.openName);
            tvFan = itemView.findViewById(R.id.openFan);
            tvPost = itemView.findViewById(R.id.openPosts);
            tvGroup = itemView.findViewById(R.id.openGroup);
        }
    }

    class SecretGroupViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView tvName;
        private TextView tvFan;
        private TextView tvPost;
        private TextView tvGroup;


        public SecretGroupViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.secretImage);
            tvName = itemView.findViewById(R.id.secretName);
            tvFan = itemView.findViewById(R.id.secretFan);
            tvPost = itemView.findViewById(R.id.secretPosts);
            tvGroup = itemView.findViewById(R.id.secretGroup);
        }
    }
}
