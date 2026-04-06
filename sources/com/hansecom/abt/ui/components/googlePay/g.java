package com.hansecom.abt.ui.components.googlePay;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class g implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f38407A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f38408B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f38409z;

    public /* synthetic */ g(Function0 function0, Modifier modifier, boolean z2, int i2, int i3) {
        this.f38409z = function0;
        this.f38407A = modifier;
        this.f38408B = z2;
        this.C = i2;
        this.D = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return GoogleWalletButtonKt.e(this.f38409z, this.f38407A, this.f38408B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
