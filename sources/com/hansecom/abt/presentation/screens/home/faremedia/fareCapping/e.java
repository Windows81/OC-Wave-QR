package com.hansecom.abt.presentation.screens.home.faremedia.fareCapping;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCapping;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

public final /* synthetic */ class e implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f36756A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Flow f36757B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareCapping.State f36758z;

    public /* synthetic */ e(FareCapping.State state, Function1 function1, Flow flow, int i2, int i3) {
        this.f36758z = state;
        this.f36756A = function1;
        this.f36757B = flow;
        this.C = i2;
        this.D = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return FareCappingScreenKt.m(this.f36758z, this.f36756A, this.f36757B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
