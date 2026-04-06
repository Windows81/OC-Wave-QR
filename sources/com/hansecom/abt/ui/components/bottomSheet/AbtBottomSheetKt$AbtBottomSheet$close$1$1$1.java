package com.hansecom.abt.ui.components.bottomSheet;

import androidx.compose.material3.SheetState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.ui.components.bottomSheet.AbtBottomSheetKt$AbtBottomSheet$close$1$1$1", f = "AbtBottomSheet.kt", l = {65}, m = "invokeSuspend")
public final class AbtBottomSheetKt$AbtBottomSheet$close$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ SheetState E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbtBottomSheetKt$AbtBottomSheet$close$1$1$1(SheetState sheetState, Continuation continuation) {
        super(2, continuation);
        this.E = sheetState;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AbtBottomSheetKt$AbtBottomSheet$close$1$1$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new AbtBottomSheetKt$AbtBottomSheet$close$1$1$1(this.E, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            SheetState sheetState = this.E;
            this.D = 1;
            if (sheetState.r(this) == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f40552a;
    }
}
