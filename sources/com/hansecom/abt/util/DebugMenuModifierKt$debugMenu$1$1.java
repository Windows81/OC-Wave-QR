package com.hansecom.abt.util;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;

@Metadata
public final class DebugMenuModifierKt$debugMenu$1$1 implements PointerInputEventHandler {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f39004A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f39005z;

    public DebugMenuModifierKt$debugMenu$1$1(int i2, Function0 function0) {
        this.f39005z = i2;
        this.f39004A = function0;
    }

    public static final Unit b(int i2, Function0 function0, int i3) {
        if (i3 == i2) {
            function0.invoke();
        }
        return Unit.f40552a;
    }

    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        Object b2 = DebugMenuModifierKt.d(pointerInputScope, new c(this.f39005z, this.f39004A), continuation);
        return b2 == IntrinsicsKt.f() ? b2 : Unit.f40552a;
    }
}
