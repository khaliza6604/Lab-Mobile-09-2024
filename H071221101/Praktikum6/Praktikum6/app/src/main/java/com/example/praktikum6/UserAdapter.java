package com.example.praktikum6;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {
    public static List<User> userList;

    public UserAdapter(List<User> userList) {
        this.userList = userList;
    }

    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_item, parent, false);
        return new UserViewHolder(view);
    }

    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User user = userList.get(position);
        holder.bind(user);
    }

    public int getItemCount() {
        return userList.size();
    }

    public void addUsers(List<User> users) {
        // add all new users into userList
        userList.addAll(users);
        // tell RecyclerView that data has changed
        notifyDataSetChanged();
    }

    public static class UserViewHolder extends RecyclerView.ViewHolder {
        private ImageView avatarImageView;
        private TextView nameTextView;
        private TextView emailTextView;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            avatarImageView = itemView.findViewById(R.id.avatarImageView);
            nameTextView = itemView.findViewById(R.id.nameTextView);
            emailTextView = itemView.findViewById(R.id.emailTextView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //get position item that clicks
                    int position = getAdapterPosition();
                    // make sure the position is valid
                    if (position != RecyclerView.NO_POSITION) {
                        // get users from userList based on position
                        User clickedUser = userList.get(position);
                        // make intent for start DetailActivity
                        Intent intent = new Intent(itemView.getContext(), DetailActivity.class);
                        // add data users into intent as extra
                        intent.putExtra("USER_ID", clickedUser.getId());
                        // start DetailActivity with Intent that already made
                        itemView.getContext().startActivity(intent);
                    }
                }
            });
        }

        public void bind(User user) {
            Picasso.get().load(user.getAvatar()).into(avatarImageView);
            nameTextView.setText(user.getFirst_name() + " " + user.getLast_name());
            emailTextView.setText(user.getEmail());
        }
    }
}
