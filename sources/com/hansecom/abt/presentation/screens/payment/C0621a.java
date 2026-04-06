package com.hansecom.abt.presentation.screens.payment;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* renamed from: com.hansecom.abt.presentation.screens.payment.a  reason: case insensitive filesystem */
public final /* synthetic */ class C0621a implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f37822A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f37823B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f37824z;

    public /* synthetic */ C0621a(boolean z2, Function0 function0, int i2) {
        this.f37824z = z2;
        this.f37822A = function0;
        this.f37823B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return ChoosePaymentMethodScreenKt.B(this.f37824z, this.f37822A, this.f37823B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
