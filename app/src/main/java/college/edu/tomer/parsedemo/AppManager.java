package college.edu.tomer.parsedemo;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by master on 23/12/15.
 */
public class AppManager extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("Application is running");
        // [Optional] Power your app with Local Datastore.
        // For more info, visit:
        // https://parse.com/docs/android/guide#local-datastore
        Parse.enableLocalDatastore(this);
        Parse.initialize(this);
    }
}
