package com.hansecom.abt.presentation.screens.main;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.main.Main;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

public final /* synthetic */ class s implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f37700A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Flow f37701B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Main.State f37702z;

    public /* synthetic */ s(Main.State state, Function1 function1, Flow flow, int i2, int i3) {
        this.f37702z = state;
        this.f37700A = function1;
        this.f37701B = flow;
        this.C = i2;
        this.D = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return MainScreenKt.o(this.f37702z, this.f37700A, this.f37701B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
