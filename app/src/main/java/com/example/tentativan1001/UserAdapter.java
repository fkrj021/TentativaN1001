package com.example.tentativan1001;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    private List<User> users;

    public UserAdapter(List<User> users) {
        this.users = users;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_main, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User user = users.get(position);
        holder.nameTextView.setText(user.getNome());
        holder.emailTextView.setText(user.getEmail());
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    static class UserViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView;
        TextView emailTextView;

        TextView ixTextView;


        UserViewHolder(View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.name_text_view);
            emailTextView = itemView.findViewById(R.id.email_text_view);
            ixTextView = itemView.findViewById(R.id.id_text_view);        }

    }
}