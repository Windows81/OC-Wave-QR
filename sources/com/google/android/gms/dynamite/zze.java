package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class zze implements DynamiteModule.VersionPolicy.IVersions {
    public final int a(Context context, String str, boolean z2) {
        return DynamiteModule.f(context, str, z2);
    }

    public final int b(Context context, String str) {
        return DynamiteModule.a(context, str);
    }
}
