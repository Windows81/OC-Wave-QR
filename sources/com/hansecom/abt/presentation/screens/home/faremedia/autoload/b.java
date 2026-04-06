package com.hansecom.abt.presentation.screens.home.faremedia.autoload;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.autoload.Autoload;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

public final /* synthetic */ class b implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f36266A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Flow f36267B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Autoload.State f36268z;

    public /* synthetic */ b(Autoload.State state, Function1 function1, Flow flow, Function1 function12, int i2) {
        this.f36268z = state;
        this.f36266A = function1;
        this.f36267B = flow;
        this.C = function12;
        this.D = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return AutoloadScreenKt.t(this.f36268z, this.f36266A, this.f36267B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
