package com.hansecom.abt.ui.components.bottomSheet;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class e implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f38059A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f38060B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f38061z;

    public /* synthetic */ e(String str, Function0 function0, int i2) {
        this.f38061z = str;
        this.f38059A = function0;
        this.f38060B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return OptionsBottomSheetKt.m(this.f38061z, this.f38059A, this.f38060B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
