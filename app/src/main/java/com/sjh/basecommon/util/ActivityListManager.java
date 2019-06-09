package com.sjh.basecommon.util;

import android.app.Activity;

import java.util.Stack;

/**
 * activity管理集合
 */
public class ActivityListManager {

    private Stack<Activity> activityStack;

    private static ActivityListManager instance;

    private ActivityListManager() { }

    public static ActivityListManager getInstance() {
        synchronized (ActivityListManager.class){
            if (instance == null) {
                instance = new ActivityListManager();
            }
        }
        return instance;
    }

    // 退出栈顶Activity
    public void popActivity(Activity activity) {
        if (activity != null) {
            // 在从自定义集合中取出当前Activity时，也进行了Activity的关闭操作
            //activity.finish();
            activityStack.remove(activity);
            activity = null;
        }
    }

    // 获得当前栈顶Activity
    public Activity currentActivity() {
        Activity activity = null;
        if (!activityStack.empty())
            activity = activityStack.lastElement();
        return activity;
    }

    // 将当前Activity推入栈中
    public void pushActivity(Activity activity) {
        if (activityStack == null) {
            activityStack = new Stack<Activity>();
        }
        activityStack.add(activity);
    }

}
