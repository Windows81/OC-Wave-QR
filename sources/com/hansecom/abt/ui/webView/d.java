package com.hansecom.abt.ui.webView;

import android.net.Uri;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class d implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Uri f38995A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f38996B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f38997z;

    public /* synthetic */ d(String str, Uri uri, Function0 function0, int i2, int i3) {
        this.f38997z = str;
        this.f38995A = uri;
        this.f38996B = function0;
        this.C = i2;
        this.D = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return WebViewScreenKt.g(this.f38997z, this.f38995A, this.f38996B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
