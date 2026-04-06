package com.hansecom.abt.presentation.screens.payment;

import androidx.compose.runtime.Composer;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class C implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f37727A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f37728B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ Function0 D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f37729z;

    public /* synthetic */ C(List list, List list2, String str, Function1 function1, Function0 function0, int i2, int i3) {
        this.f37729z = list;
        this.f37727A = list2;
        this.f37728B = str;
        this.C = function1;
        this.D = function0;
        this.E = i2;
        this.F = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return ChoosePaymentNavigationKt.e(this.f37729z, this.f37727A, this.f37728B, this.C, this.D, this.E, this.F, (Composer) obj, ((Integer) obj2).intValue());
    }
}
