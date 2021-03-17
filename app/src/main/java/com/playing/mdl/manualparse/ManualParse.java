package com.playing.mdl.manualparse;

import com.playing.mdl.manualpojo.User;

import org.json.JSONObject;

public class ManualParse {

    public User getUser(JSONObject response) {
        User user = new User();

        user.setLogin(response.optString("login"));
        user.setAvatarUrl(response.optString("avatar_url"));
        user.setBio(response.optString("bio"));
        user.setBlog(response.optString("blog"));
        user.setCollaborators(response.optInt("collaborators"));
        user.setCompany(response.optString("company"));
        user.setDiskUsage(response.optInt("disk_usage"));

        return user;
    }

}
