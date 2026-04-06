package com.hansecom.abt.util;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

public final /* synthetic */ class b implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f39033A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ PointerInputScope f39034B;
    public final /* synthetic */ Function1 C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f39035z;

    public /* synthetic */ b(Ref.IntRef intRef, Ref.LongRef longRef, PointerInputScope pointerInputScope, Function1 function1) {
        this.f39035z = intRef;
        this.f39033A = longRef;
        this.f39034B = pointerInputScope;
        this.C = function1;
    }

    public final Object invoke(Object obj) {
        return DebugMenuModifierKt.e(this.f39035z, this.f39033A, this.f39034B, this.C, (Offset) obj);
    }
}
