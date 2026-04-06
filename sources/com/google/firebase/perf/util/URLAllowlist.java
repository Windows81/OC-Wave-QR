package com.google.firebase.perf.util;

import android.content.Context;
import android.content.res.Resources;
import com.google.firebase.perf.logging.AndroidLogger;
import java.net.URI;

public class URLAllowlist {

    /* renamed from: a  reason: collision with root package name */
    public static String[] f31136a;

    public static boolean a(URI uri, Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier == 0) {
            return true;
        }
        AndroidLogger.e().a("Detected domain allowlist, only allowlisted domains will be measured.");
        if (f31136a == null) {
            f31136a = resources.getStringArray(identifier);
        }
        String host = uri.getHost();
        if (host == null) {
            return true;
        }
        for (String contains : f31136a) {
            if (host.contains(contains)) {
                return true;
            }
        }
        return false;
    }
}
