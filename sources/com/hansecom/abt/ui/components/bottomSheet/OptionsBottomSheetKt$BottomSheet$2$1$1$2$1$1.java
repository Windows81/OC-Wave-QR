package com.hansecom.abt.ui.components.bottomSheet;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata
public final class OptionsBottomSheetKt$BottomSheet$2$1$1$2$1$1 implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Object f38045A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f38046B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f38047z;

    public OptionsBottomSheetKt$BottomSheet$2$1$1$2$1$1(Function1 function1, Object obj, Function0 function0) {
        this.f38047z = function1;
        this.f38045A = obj;
        this.f38046B = function0;
    }

    public final void b() {
        this.f38047z.invoke(this.f38045A);
        this.f38046B.invoke();
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        b();
        return Unit.f40552a;
    }
}
