package com.hansecom.abt.ui.components.notificationBox;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class b implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ CharSequence f38575A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f38576B;
    public final /* synthetic */ long C;
    public final /* synthetic */ long D;
    public final /* synthetic */ String E;
    public final /* synthetic */ Function0 F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Painter f38577z;

    public /* synthetic */ b(Painter painter, CharSequence charSequence, Modifier modifier, long j2, long j3, String str, Function0 function0, int i2, int i3) {
        this.f38577z = painter;
        this.f38575A = charSequence;
        this.f38576B = modifier;
        this.C = j2;
        this.D = j3;
        this.E = str;
        this.F = function0;
        this.G = i2;
        this.H = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return AbtNotificationBoxKt.f(this.f38577z, this.f38575A, this.f38576B, this.C, this.D, this.E, this.F, this.G, this.H, (Composer) obj, ((Integer) obj2).intValue());
    }
}
