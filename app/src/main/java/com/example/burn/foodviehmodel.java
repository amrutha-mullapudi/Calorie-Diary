package com.example.burn;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

/*public class foodviehmodel extends AndroidViewModel {
    private foodrepository foodrep;
    private LiveData<List<foodnote>> allnote;
    public foodviehmodel(@NonNull Application application) {
        super(application);
        foodrep = new foodrepository(application);
        allnote = foodrep.getallNotes();
    }
    public void insert(foodnote note){
        foodrep.insert(note);
    }
    public void update(foodnote note){
        foodrep.update(note);
    }

    public void delete(foodnote note){
        foodrep.delete(note);

    }

}
*/