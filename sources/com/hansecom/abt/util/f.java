package com.hansecom.abt.util;

import android.app.Activity;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class f implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Activity f39042A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f39043z;

    public /* synthetic */ f(String str, Activity activity) {
        this.f39043z = str;
        this.f39042A = activity;
    }

    public final Object invoke(Object obj) {
        return LaunchTracingKt.d(this.f39043z, this.f39042A, (DisposableEffectScope) obj);
    }
}
