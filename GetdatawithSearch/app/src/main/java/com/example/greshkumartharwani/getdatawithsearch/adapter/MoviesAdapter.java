package com.example.greshkumartharwani.getdatawithsearch.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.greshkumartharwani.getdatawithsearch.R;
import com.example.greshkumartharwani.getdatawithsearch.model.offers;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gresh Kumar Tharwani on 12/30/2017.
 */

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MovieViewHolder> implements Filterable {

    private List<offers> movies;
    private List<offers> mFilteredList;
    private int rowLayout;
    private Context context;


    public static class MovieViewHolder extends RecyclerView.ViewHolder {
        LinearLayout moviesLayout;
        TextView movieTitle;
        ImageView data;
        TextView movieDescription;



        public MovieViewHolder(View v) {
            super(v);
            moviesLayout = (LinearLayout) v.findViewById(R.id.movies_layout);
            movieTitle = (TextView) v.findViewById(R.id.title);
            data = (ImageView) v.findViewById(R.id.img);
            movieDescription = (TextView) v.findViewById(R.id.description);

        }
    }

    public MoviesAdapter(List<offers> movies, int rowLayout, Context context) {
        this.movies = movies;
        this.rowLayout = rowLayout;
        this.context = context;
        this.mFilteredList = movies;
    }

    @Override
    public MoviesAdapter.MovieViewHolder onCreateViewHolder(ViewGroup parent,
                                                            int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new MovieViewHolder(view);
    }


    @Override
    public void onBindViewHolder(MovieViewHolder holder, final int position) {
        holder.movieTitle.setText(movies.get(position).getOffer_title());
        Picasso.with(context).load("http://www.savrrr.com/"+movies.get(position).getThumbnail().getLink().toString()).into(holder.data);

        holder.movieDescription.setText(movies.get(position).getOffer_description());

    }

    @Override
    public Filter getFilter() {

        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {

                String charString = charSequence.toString();

                if (charString.isEmpty()) {

                    movies = mFilteredList;
                } else {

                    ArrayList<offers> filteredList = new ArrayList<>();

                    for (offers androidVersion : mFilteredList) {

                        if (androidVersion.getOffer_title().toLowerCase().contains(charString) || androidVersion.getOffer_description().toLowerCase().contains(charString)) {

                            filteredList.add(androidVersion);
                        }
                    }

                    movies = filteredList;
                }

                FilterResults filterResults = new FilterResults();
                filterResults.values = movies;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                movies = (ArrayList<offers>) filterResults.values;
                notifyDataSetChanged();
            }
        };
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

}