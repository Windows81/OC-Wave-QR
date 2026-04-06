package com.hansecom.abt.presentation.screens.helpRequest;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* renamed from: com.hansecom.abt.presentation.screens.helpRequest.m  reason: case insensitive filesystem */
public final /* synthetic */ class C0436m implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f34930A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f34931B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ HelpRequestViewModel f34932z;

    public /* synthetic */ C0436m(HelpRequestViewModel helpRequestViewModel, Function0 function0, int i2, int i3) {
        this.f34932z = helpRequestViewModel;
        this.f34930A = function0;
        this.f34931B = i2;
        this.C = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return HelpRequestScreenKt.n0(this.f34932z, this.f34930A, this.f34931B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
