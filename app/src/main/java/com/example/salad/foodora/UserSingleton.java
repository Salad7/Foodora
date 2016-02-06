package com.example.salad.foodora;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by salad on 2/5/16.
 */
public class UserSingleton {
    private static UserSingleton sUserSingleton;
    private List<User> mUsers;


    public static UserSingleton get(Context ctx)
    {
        if(sUserSingleton == null)
        {
            sUserSingleton = new UserSingleton(ctx);
        }
        return sUserSingleton;
    }

    private UserSingleton (Context ctx)
    {
        mUsers = new ArrayList<User>();
        for (int i = 0; i < 100; i++) {
            User user = new User();
            user.setTitle("Crime #" + i);
            user.setDesc("Fill in");
            user.setIsFood(true);
            user.setIsParking(false);
            user.setDate("5/7 - 3:30PM WW Hall");
            mUsers.add(user);
        }
    }

    public List<User> getUsers()
    {
        return mUsers;
    }

    private User getUser(UUID id)
    {
        for (int i = 0; i < mUsers.size(); i++)
        {
            if(id.equals(mUsers.get(i).mId))
            {
                return mUsers.get(i);
            }
        }
        return null;
    }
}
