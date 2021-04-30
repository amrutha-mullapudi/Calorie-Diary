package com.example.burn;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import java.util.List;

/*public class foodrepository {
    private fooddao fooddao;
    private LiveData<List<foodnote>> allnote;

    public foodrepository(Application application){
        FoodDatabase database= FoodDatabase.getInstance(application);
        fooddao = database.foodiee();
        allnote = fooddao.getallNotes();
    }
    public void insert(foodnote note){
        new Insertnodeasnyctaak(fooddao).execute(note);
    }
    public void update(foodnote note){
        new Updatenodeasnyctaak(fooddao).execute(note);
    }
    public void delete(foodnote note){
        new Deletenodeasnyctaak(fooddao).execute(note);
    }
    public LiveData<List<foodnote>> getallNotes(){
        return allnote;
    }

    private static class Insertnodeasnyctaak extends AsyncTask<foodnote,Void,Void>{
        private fooddao foodie;
        private Insertnodeasnyctaak(fooddao foodie){
            this.foodie = foodie;
        }
        @Override
        protected Void doInBackground(foodnote... foodnotes) {
            return null;
        }
    }


    private static class Updatenodeasnyctaak extends AsyncTask<foodnote,Void,Void>{
        private fooddao foodie;
        private Updatenodeasnyctaak(fooddao foodie){
            this.foodie = foodie;
        }
        @Override
        protected Void doInBackground(foodnote... foodnotes) {
            return null;
        }
    }

    private static class Deletenodeasnyctaak extends AsyncTask<foodnote,Void,Void>{
        private fooddao foodie;
        private Deletenodeasnyctaak(fooddao foodie){
            this.foodie = foodie;
        }
        @Override
        protected Void doInBackground(foodnote... foodnotes) {
            return null;
        }
    }
}
*/