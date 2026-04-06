package com.hansecom.abt.presentation.screens.main.lock;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class c implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f37684A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f37685B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LockViewModel f37686z;

    public /* synthetic */ c(LockViewModel lockViewModel, int i2, int i3) {
        this.f37686z = lockViewModel;
        this.f37684A = i2;
        this.f37685B = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return LockScreenKt.i(this.f37686z, this.f37684A, this.f37685B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
