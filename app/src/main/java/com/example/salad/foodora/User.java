package com.example.salad.foodora;

import android.widget.ImageView;

import java.util.UUID;

/**
 * Created by salad on 2/5/16.
 */
public class User {

    public String mTitle;
    public String mDesc;
    public String mDate;
    public boolean mIsParking;
    public boolean mIsFood;
    public ImageView mIcon;
    public UUID mId;

    User()
    {

    }
    User(String title, String desc, String date, boolean isFood, boolean isParking)
    {
        mTitle = title;
        mDesc = desc;
        mDate = date;
        mId = UUID.randomUUID();
        mIsFood = isFood;
        mIsParking = isParking;
    }

    public String getTitle()
    {
        return  mTitle;
    }

    public String getDesc()
    {
        return mDesc;
    }

    public String getDate()
    {
        return mDate;
    }

    public boolean isFood()
    {
        return mIsFood;
    }

    public boolean isParking()
    {
        return mIsParking;
    }
    public void setTitle(String title)
    {
        mTitle = title;
    }

    public void setDesc(String desc)
    {
        mDesc = desc;
    }

    public void setDate(String date)
    {
        mDate = date;
    }

    public void setIsParking(boolean i)
    {
        mIsParking = i;
    }

    public void setIsFood(boolean f)
    {
        mIsFood = f;
    }
}
