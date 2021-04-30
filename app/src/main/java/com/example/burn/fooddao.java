package com.example.burn;

import android.os.Build;

import androidx.annotation.RequiresApi;
import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

/*@Dao
public interface fooddao {
    @Insert
    void insert(foodnote note);

    @Update
    void update(foodnote note);

    @Delete
    void delete(foodnote note);

    @Query("SELECT * FROM food_table ORDER BY fooditems DESC")
    LiveData<List<foodnote>> getallNotes();
    
}
*/