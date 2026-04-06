package com.hansecom.abt.ui.components.circleIcons;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.hansecom.abt.ui.components.circleIcons.CircleIconStyle;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class a implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f38107A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f38108B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CircleIconStyle.Type f38109z;

    public /* synthetic */ a(CircleIconStyle.Type type, Modifier modifier, int i2, int i3, int i4) {
        this.f38109z = type;
        this.f38107A = modifier;
        this.f38108B = i2;
        this.C = i3;
        this.D = i4;
    }

    public final Object m(Object obj, Object obj2) {
        return CircleIconKt.c(this.f38109z, this.f38107A, this.f38108B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
