package com.hansecom.abt.presentation.screens.home.faremedia.autoload;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.autoload.Autoload;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class c implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f36269A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f36270B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Autoload.State f36271z;

    public /* synthetic */ c(Autoload.State state, Function0 function0, int i2) {
        this.f36271z = state;
        this.f36269A = function0;
        this.f36270B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return AutoloadScreenKt.p(this.f36271z, this.f36269A, this.f36270B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
