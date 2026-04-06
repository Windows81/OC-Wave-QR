package com.hansecom.abt.ui.components.bottomSheet;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class a implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f38049A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f38050B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f38051z;

    public /* synthetic */ a(String str, Function0 function0, int i2) {
        this.f38051z = str;
        this.f38049A = function0;
        this.f38050B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return AbtBottomSheetKt.g(this.f38051z, this.f38049A, this.f38050B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
