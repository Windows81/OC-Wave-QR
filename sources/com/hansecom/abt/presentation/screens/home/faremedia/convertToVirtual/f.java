package com.hansecom.abt.presentation.screens.home.faremedia.convertToVirtual;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.convertToVirtual.ConvertToVirtual;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

public final /* synthetic */ class f implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f36667A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Flow f36668B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ Function0 D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ConvertToVirtual.State f36669z;

    public /* synthetic */ f(ConvertToVirtual.State state, Function1 function1, Flow flow, Function0 function0, Function0 function02, int i2) {
        this.f36669z = state;
        this.f36667A = function1;
        this.f36668B = flow;
        this.C = function0;
        this.D = function02;
        this.E = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return ConvertToVirtualCardDialogKt.k(this.f36669z, this.f36667A, this.f36668B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
