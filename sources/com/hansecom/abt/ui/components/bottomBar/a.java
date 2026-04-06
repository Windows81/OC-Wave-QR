package com.hansecom.abt.ui.components.bottomBar;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class a implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f38011A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f38012B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f38013z;

    public /* synthetic */ a(boolean z2, Function0 function0, Modifier modifier, int i2, int i3) {
        this.f38013z = z2;
        this.f38011A = function0;
        this.f38012B = modifier;
        this.C = i2;
        this.D = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return BarcodeButtonKt.d(this.f38013z, this.f38011A, this.f38012B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
