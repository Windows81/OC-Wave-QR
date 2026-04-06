package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.R;
import com.google.android.gms.common.internal.Preconditions;

public final class zzhq {

    /* renamed from: a  reason: collision with root package name */
    public final Resources f26475a;

    /* renamed from: b  reason: collision with root package name */
    public final String f26476b;

    public zzhq(Context context, String str) {
        Preconditions.m(context);
        this.f26475a = context.getResources();
        if (!TextUtils.isEmpty(str)) {
            this.f26476b = str;
        } else {
            this.f26476b = a(context);
        }
    }

    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.f24406a);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public final String b(String str) {
        int identifier = this.f26475a.getIdentifier(str, "string", this.f26476b);
        if (identifier == 0) {
            return null;
        }
        try {
            return this.f26475a.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
