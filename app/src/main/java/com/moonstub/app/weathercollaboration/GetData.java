package com.moonstub.app.weathercollaboration;

import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;

import java.io.IOException;
import java.net.HttpURLConnection;

/**
 * Created by Micah on 9/29/2015.
 */
public class GetData {

    Uri mUri;

    public GetData(){

    }

    public class DownloadData extends AsyncTask<String, Void, String>{

        private final String LOG_TAG = DownloadData.class.getSimpleName();

        HttpURLConnection urlConnection = null;


        @Override
        protected void onPostExecute(String data) {
            //super.onPostExecute(data);
        }

        @Override
        protected String doInBackground(String... params) {
           /* try{
                //TODO IMPLEMENT GET DATA
            }catch (IOException ioE){
                Log.e(LOG_TAG, "Error downloading Data, ", ioE);
            }
            */
            return null;
        }
    }

}
