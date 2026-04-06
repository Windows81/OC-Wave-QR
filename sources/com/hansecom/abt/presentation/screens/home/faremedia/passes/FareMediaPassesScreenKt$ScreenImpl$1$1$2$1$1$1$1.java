package com.hansecom.abt.presentation.screens.home.faremedia.passes;

import com.hansecom.abt.presentation.screens.home.faremedia.passes.FareMediaPasses;
import com.hansecom.abt.ui.components.passCard.PassCardState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata
public final class FareMediaPassesScreenKt$ScreenImpl$1$1$2$1$1$1$1 implements Function1<Boolean, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PassCardState f37004A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f37005z;

    public FareMediaPassesScreenKt$ScreenImpl$1$1$2$1$1$1$1(Function1 function1, PassCardState passCardState) {
        this.f37005z = function1;
        this.f37004A = passCardState;
    }

    public final void b(boolean z2) {
        this.f37005z.invoke(new FareMediaPasses.Action.OnAutoLoadClick(this.f37004A.f(), !this.f37004A.j()));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((Boolean) obj).booleanValue());
        return Unit.f40552a;
    }
}
