package com.hansecom.abt.presentation.screens.home.faremedia.fareCapping;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCapping;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class b implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f36748A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f36749B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareCapping.State f36750z;

    public /* synthetic */ b(FareCapping.State state, Function1 function1, int i2) {
        this.f36750z = state;
        this.f36748A = function1;
        this.f36749B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return FareCappingScreenKt.h(this.f36750z, this.f36748A, this.f36749B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
