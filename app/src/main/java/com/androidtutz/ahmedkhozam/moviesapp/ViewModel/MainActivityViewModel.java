package com.androidtutz.ahmedkhozam.moviesapp.ViewModel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.androidtutz.ahmedkhozam.moviesapp.model.Movie;
import com.androidtutz.ahmedkhozam.moviesapp.model.MovieRepository;

import java.util.List;


public class MainActivityViewModel extends AndroidViewModel {

   private MovieRepository movieRepository;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        movieRepository=new MovieRepository(application);
    }

    public LiveData<List<Movie>> getAllMovies(){

        return  movieRepository.getMoviesLiveData();
    }

    public void clear(){

        movieRepository.clear();
    }

}
