package com.google.android.gms.common.internal;

import android.net.Uri;

public final class zzu {

    /* renamed from: a  reason: collision with root package name */
    public static final Uri f25010a;

    /* renamed from: b  reason: collision with root package name */
    public static final Uri f25011b;

    static {
        Uri parse = Uri.parse("https://plus.google.com/");
        f25010a = parse;
        f25011b = parse.buildUpon().appendPath("circles").appendPath("find").build();
    }
}
