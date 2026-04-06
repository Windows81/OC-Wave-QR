package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.R;

public class StringResourceValueReader {

    /* renamed from: a  reason: collision with root package name */
    public final Resources f24910a;

    /* renamed from: b  reason: collision with root package name */
    public final String f24911b;

    public StringResourceValueReader(Context context) {
        Preconditions.m(context);
        Resources resources = context.getResources();
        this.f24910a = resources;
        this.f24911b = resources.getResourcePackageName(R.string.f24406a);
    }

    public String a(String str) {
        int identifier = this.f24910a.getIdentifier(str, "string", this.f24911b);
        if (identifier == 0) {
            return null;
        }
        return this.f24910a.getString(identifier);
    }
}
