package com.cewong.parsetodolist;

/**
 * Created by cewon_000 on 11/9/2015.
 */

import android.app.Application;
import com.parse.Parse;

public class App extends Application {

    @Override public void onCreate() {
        super.onCreate();
// Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "WXnh68qlLARZtqQHPrWqK3zRftQcfpMo5lvQ1vix", "6Ck4j71AsSzzOmgzFNCwQP6suaeegea6af8u4BDE");
    }
}