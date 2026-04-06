package com.hansecom.abt.ui.components.notificationBox;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class a implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Painter f38572A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ CharSequence f38573B;
    public final /* synthetic */ Modifier C;
    public final /* synthetic */ String D;
    public final /* synthetic */ Function0 E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AbtNotificationBoxType f38574z;

    public /* synthetic */ a(AbtNotificationBoxType abtNotificationBoxType, Painter painter, CharSequence charSequence, Modifier modifier, String str, Function0 function0, int i2, int i3) {
        this.f38574z = abtNotificationBoxType;
        this.f38572A = painter;
        this.f38573B = charSequence;
        this.C = modifier;
        this.D = str;
        this.E = function0;
        this.F = i2;
        this.G = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return AbtNotificationBoxKt.d(this.f38574z, this.f38572A, this.f38573B, this.C, this.D, this.E, this.F, this.G, (Composer) obj, ((Integer) obj2).intValue());
    }
}
