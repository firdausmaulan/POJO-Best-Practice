package com.playing.mdl.automateparse;

import com.google.gson.Gson;
import com.playing.mdl.kdc2.User;

import org.json.JSONObject;

public class AutomateParse {

    public User getUser(JSONObject response){
        return new Gson().fromJson(response.toString(), User.class);
    }

}
