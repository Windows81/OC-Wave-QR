package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;
import com.google.firebase.platforminfo.KotlinDetector;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.ArrayList;
import java.util.List;

public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static /* synthetic */ String e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    public static /* synthetic */ String f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
    }

    public static /* synthetic */ String g(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : "";
    }

    public static /* synthetic */ String h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? i(installerPackageName) : "";
    }

    public static String i(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    public List getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DefaultUserAgentPublisher.c());
        arrayList.add(DefaultHeartBeatController.f());
        arrayList.add(LibraryVersionComponent.b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(LibraryVersionComponent.b("fire-core", "21.0.0"));
        arrayList.add(LibraryVersionComponent.b("device-name", i(Build.PRODUCT)));
        arrayList.add(LibraryVersionComponent.b("device-model", i(Build.DEVICE)));
        arrayList.add(LibraryVersionComponent.b("device-brand", i(Build.BRAND)));
        arrayList.add(LibraryVersionComponent.c("android-target-sdk", new c()));
        arrayList.add(LibraryVersionComponent.c("android-min-sdk", new d()));
        arrayList.add(LibraryVersionComponent.c("android-platform", new e()));
        arrayList.add(LibraryVersionComponent.c("android-installer", new f()));
        String a2 = KotlinDetector.a();
        if (a2 != null) {
            arrayList.add(LibraryVersionComponent.b("kotlin", a2));
        }
        return arrayList;
    }
}
