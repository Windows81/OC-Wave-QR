package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class zzk implements DynamiteModule.VersionPolicy {
    public final DynamiteModule.VersionPolicy.SelectionResult a(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        selectionResult.f25237a = iVersions.b(context, str);
        int i2 = 1;
        int a2 = iVersions.a(context, str, true);
        selectionResult.f25238b = a2;
        int i3 = selectionResult.f25237a;
        if (i3 == 0) {
            i3 = 0;
            if (a2 == 0) {
                i2 = 0;
                selectionResult.f25239c = i2;
                return selectionResult;
            }
        }
        if (a2 < i3) {
            i2 = -1;
        }
        selectionResult.f25239c = i2;
        return selectionResult;
    }
}
