package com.hansecom.abt.presentation.screens.home.faremedia.autoload;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.autoload.Autoload;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class g implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f36277A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f36278B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Autoload.State f36279z;

    public /* synthetic */ g(Autoload.State state, Function1 function1, int i2) {
        this.f36279z = state;
        this.f36277A = function1;
        this.f36278B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return AutoloadScreenKt.n(this.f36279z, this.f36277A, this.f36278B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
