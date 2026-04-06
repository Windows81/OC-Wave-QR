package com.hansecom.abt.presentation.screens.auth.welcome;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.auth.welcome.Welcome;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class b implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f34676A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f34677B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ Function0 D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Welcome.State f34678z;

    public /* synthetic */ b(Welcome.State state, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i2) {
        this.f34678z = state;
        this.f34676A = function0;
        this.f34677B = function02;
        this.C = function03;
        this.D = function04;
        this.E = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return WelcomeScreenKt.d(this.f34678z, this.f34676A, this.f34677B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
