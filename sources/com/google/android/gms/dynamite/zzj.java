package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class zzj implements DynamiteModule.VersionPolicy {
    public final DynamiteModule.VersionPolicy.SelectionResult a(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) {
        int i2;
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int b2 = iVersions.b(context, str);
        selectionResult.f25237a = b2;
        int i3 = 1;
        int i4 = 0;
        if (b2 != 0) {
            i2 = iVersions.a(context, str, false);
            selectionResult.f25238b = i2;
        } else {
            i2 = iVersions.a(context, str, true);
            selectionResult.f25238b = i2;
        }
        int i5 = selectionResult.f25237a;
        if (i5 != 0) {
            i4 = i5;
        } else if (i2 == 0) {
            i3 = 0;
            selectionResult.f25239c = i3;
            return selectionResult;
        }
        if (i4 >= i2) {
            i3 = -1;
        }
        selectionResult.f25239c = i3;
        return selectionResult;
    }
}
