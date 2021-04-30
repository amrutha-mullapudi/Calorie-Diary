package com.example.burn;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import javax.xml.namespace.QName;

/*@Database(entities = {foodnote.class},version = 1)
public abstract class FoodDatabase extends RoomDatabase {
    private static FoodDatabase instance;
    private static String name;

    public abstract fooddao foodiee();

    public static synchronized FoodDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    FoodDatabase.class, "food_database").fallbackToDestructiveMigration()
                    .addCallback(roomCallback)
                    .build();
        }
        return instance;
    }

    private static RoomDatabase.Callback roomCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            new Populatetask(instance).execute();
        }
    };

    private static class Populatetask extends AsyncTask<Void, Void, Void> {
        private fooddao foodao;

        private Populatetask(FoodDatabase fd) {
            foodao = fd.foodiee();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            foodao.insert(new foodnote("idli",23));
            foodao.insert(new foodnote("idli",23));
            foodao.insert(new foodnote("idli",23));
            foodao.insert(new foodnote("idli",23));
            foodao.insert(new foodnote("idli",23));
            foodao.insert(new foodnote("idli",23));
            foodao.insert(new foodnote("idli",23));
            foodao.insert(new foodnote("idli",23));

            return null;
        }
    }

} */
