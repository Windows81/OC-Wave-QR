package com.hansecom.abt.ui.webView;

import android.app.Activity;
import android.net.Uri;
import android.webkit.GeolocationPermissions;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.LocalActivityKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class WebViewScreenKt {
    public static final void c(String str, Uri uri, Function0 function0, Composer composer, int i2, int i3) {
        int i4;
        String str2;
        String str3;
        Uri uri2 = uri;
        Function0 function02 = function0;
        int i5 = i2;
        Intrinsics.i(function02, "onUp");
        Composer q2 = composer.q(-1425218684);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i5 | 6;
            str2 = str;
        } else if ((i5 & 6) == 0) {
            str2 = str;
            i4 = (q2.W(str2) ? 4 : 2) | i5;
        } else {
            str2 = str;
            i4 = i5;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i5 & 48) == 0) {
            i4 |= q2.l(uri2) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i5 & 384) == 0) {
            i4 |= q2.l(function02) ? 256 : 128;
        }
        if ((i4 & 147) != 146 || !q2.t()) {
            ManagedActivityResultLauncher managedActivityResultLauncher = null;
            String str4 = i6 != 0 ? null : str2;
            if (ComposerKt.P()) {
                ComposerKt.Y(-1425218684, i4, -1, "com.hansecom.abt.ui.webView.WebViewScreen (WebViewScreen.kt:30)");
            }
            q2.X(-376597751);
            Object g2 = q2.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                g2 = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                q2.N(g2);
            }
            MutableState mutableState = (MutableState) g2;
            q2.M();
            Activity activity = (Activity) q2.C(LocalActivityKt.a());
            q2.X(-376592999);
            if (activity != null) {
                ActivityResultContracts.RequestMultiplePermissions requestMultiplePermissions = new ActivityResultContracts.RequestMultiplePermissions();
                q2.X(1715822572);
                Object g3 = q2.g();
                if (g3 == companion.a()) {
                    g3 = new c(mutableState);
                    q2.N(g3);
                }
                q2.M();
                managedActivityResultLauncher = ActivityResultRegistryKt.a(requestMultiplePermissions, (Function1) g3, q2, 48);
            }
            q2.M();
            str3 = str4;
            ScaffoldKt.f((Modifier) null, ComposableLambdaKt.e(-1013233592, true, new WebViewScreenKt$WebViewScreen$1(str4, function02), q2, 54), (Function2) null, (Function2) null, (Function2) null, 0, 0, 0, (WindowInsets) null, ComposableLambdaKt.e(1136399123, true, new WebViewScreenKt$WebViewScreen$2((LifecycleOwner) q2.C(LocalLifecycleOwnerKt.c()), managedActivityResultLauncher, uri2, mutableState), q2, 54), q2, 805306416, 509);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
            str3 = str2;
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new d(str3, uri, function0, i2, i3));
        }
    }

    public static final Pair d(MutableState mutableState) {
        return (Pair) mutableState.getValue();
    }

    public static final void e(MutableState mutableState, Pair pair) {
        mutableState.setValue(pair);
    }

    public static final Unit f(MutableState mutableState, Map map) {
        Intrinsics.i(map, "permissions");
        Pair d2 = d(mutableState);
        if (d2 != null) {
            String str = (String) d2.a();
            GeolocationPermissions.Callback callback = (GeolocationPermissions.Callback) d2.b();
            Boolean bool = Boolean.FALSE;
            callback.invoke(str, ((Boolean) map.getOrDefault("android.permission.ACCESS_FINE_LOCATION", bool)).booleanValue() || ((Boolean) map.getOrDefault("android.permission.ACCESS_COARSE_LOCATION", bool)).booleanValue(), false);
            e(mutableState, (Pair) null);
        }
        return Unit.f40552a;
    }

    public static final Unit g(String str, Uri uri, Function0 function0, int i2, int i3, Composer composer, int i4) {
        c(str, uri, function0, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
