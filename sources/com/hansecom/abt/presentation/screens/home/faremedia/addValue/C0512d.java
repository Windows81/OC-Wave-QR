package com.hansecom.abt.presentation.screens.home.faremedia.addValue;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* renamed from: com.hansecom.abt.presentation.screens.home.faremedia.addValue.d  reason: case insensitive filesystem */
public final /* synthetic */ class C0512d implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f36195A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Flow f36196B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ Function0 D;
    public final /* synthetic */ Function0 E;
    public final /* synthetic */ Function0 F;
    public final /* synthetic */ int G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareMediaAddValue.State f36197z;

    public /* synthetic */ C0512d(FareMediaAddValue.State state, Function1 function1, Flow flow, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i2) {
        this.f36197z = state;
        this.f36195A = function1;
        this.f36196B = flow;
        this.C = function0;
        this.D = function02;
        this.E = function03;
        this.F = function04;
        this.G = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return FareMediaAddValueScreenKt.C(this.f36197z, this.f36195A, this.f36196B, this.C, this.D, this.E, this.F, this.G, (Composer) obj, ((Integer) obj2).intValue());
    }
}
