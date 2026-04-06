package com.hansecom.abt.ui.webView;

import android.net.Uri;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class a implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Uri f38989A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f38990B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f38991z;

    public /* synthetic */ a(String str, Uri uri, Function0 function0, int i2, int i3) {
        this.f38991z = str;
        this.f38989A = uri;
        this.f38990B = function0;
        this.C = i2;
        this.D = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return LocalWebViewScreenKt.c(this.f38991z, this.f38989A, this.f38990B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
