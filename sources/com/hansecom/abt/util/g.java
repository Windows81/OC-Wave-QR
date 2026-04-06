package com.hansecom.abt.util;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class g implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f39049A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f39050z;

    public /* synthetic */ g(String str, int i2) {
        this.f39050z = str;
        this.f39049A = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return LaunchTracingKt.e(this.f39050z, this.f39049A, (Composer) obj, ((Integer) obj2).intValue());
    }
}
