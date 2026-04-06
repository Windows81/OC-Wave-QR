package com.hansecom.abt.presentation.screens.home.faremedia.convertToVirtual;

import com.hansecom.abt.presentation.screens.home.faremedia.convertToVirtual.ConvertToVirtual;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class ConvertToVirtualCardDialogKt$ConvertToVirtualCardDialog$1$1 extends FunctionReferenceImpl implements Function1<ConvertToVirtual.Action, Unit> {
    public ConvertToVirtualCardDialogKt$ConvertToVirtualCardDialog$1$1(Object obj) {
        super(1, obj, ConvertToVirtualCardViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((ConvertToVirtual.Action) obj);
        return Unit.f40552a;
    }

    public final void v(ConvertToVirtual.Action action) {
        Intrinsics.i(action, "p0");
        ((ConvertToVirtualCardViewModel) this.f40885A).k(action);
    }
}
