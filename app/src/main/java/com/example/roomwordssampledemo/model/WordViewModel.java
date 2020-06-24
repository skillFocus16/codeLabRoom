package com.example.roomwordssampledemo.model;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.roomwordssampledemo.repository.WordRepository;

import java.util.List;

public class WordViewModel extends AndroidViewModel {

    private WordRepository mRepository;
    private LiveData<List<Word>> mAllwords;

    public WordViewModel(@NonNull Application application){
        super(application);
        mRepository = new WordRepository(application);
        mAllwords = mRepository.getAllWords();
    }

    public LiveData<List<Word>> getAllWords(){
        return mAllwords;
    }

    public void insert(Word word) {
        mRepository.insert(word);
    }

    void deleteAll() {mRepository.deleteAll();}

    public void deleteWord(Word word){
        mRepository.deleteWord(word);
    }
}

