package com.lokalise.sdk.utils;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import javax.annotation.Nullable;

public class LokaliseUtils {
    @Nullable
    private static String getCurrentProcessName() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        try {
            return (String) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", (Class[]) null).invoke((Object) null, (Object[]) null);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static String getMainProcessName(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return context.getApplicationInfo().processName;
    }

    public static boolean isNotMainProcess(Context context) {
        return !getMainProcessName(context).equals(getCurrentProcessName());
    }
}
