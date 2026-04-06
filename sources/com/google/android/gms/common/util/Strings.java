package com.google.android.gms.common.util;

import java.util.regex.Pattern;

public class Strings {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f25126a = Pattern.compile("\\$\\{(.*?)\\}");

    public static boolean a(String str) {
        return str == null || str.trim().isEmpty();
    }
}
