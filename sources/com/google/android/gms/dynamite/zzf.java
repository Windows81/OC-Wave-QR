package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class zzf implements DynamiteModule.VersionPolicy {
    public final DynamiteModule.VersionPolicy.SelectionResult a(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int a2 = iVersions.a(context, str, true);
        selectionResult.f25238b = a2;
        if (a2 != 0) {
            selectionResult.f25239c = 1;
        } else {
            int b2 = iVersions.b(context, str);
            selectionResult.f25237a = b2;
            if (b2 != 0) {
                selectionResult.f25239c = -1;
            }
        }
        return selectionResult;
    }
}
