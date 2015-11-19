package atchley.chris.ribbot;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParseObject;
import com.parse.ParseUser;

import atchley.chris.ribbot.utils.ParseConstants;

/**
 * Created by Chris on 11/3/2015.
 */
public class RibbotApplication extends Application {
    @Override
    public void onCreate(){
        super.onCreate();

        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "MqpI8YbCxg9wLbZMYaaPhPkW1JN4mYkkZDOf5LGp", "SNVwdBDorraRXWhYPmLzSVfF5YaLJe9vNpv9mv1E");
        ParseInstallation.getCurrentInstallation().saveInBackground();


    }

    public static void updateParseInstallation(ParseUser user){

        ParseInstallation installation = ParseInstallation.getCurrentInstallation();
        installation.put(ParseConstants.KEY_USER_ID, user.getObjectId());
        installation.saveInBackground();
    }



}
