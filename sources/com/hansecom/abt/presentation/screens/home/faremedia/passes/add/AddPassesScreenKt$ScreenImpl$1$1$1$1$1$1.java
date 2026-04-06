package com.hansecom.abt.presentation.screens.home.faremedia.passes.add;

import com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPasses;
import com.hansecom.abt.ui.components.passCard.PassOfferCardState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata
public final class AddPassesScreenKt$ScreenImpl$1$1$1$1$1$1 implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PassOfferCardState f37035A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f37036z;

    public AddPassesScreenKt$ScreenImpl$1$1$1$1$1$1(Function1 function1, PassOfferCardState passOfferCardState) {
        this.f37036z = function1;
        this.f37035A = passOfferCardState;
    }

    public final void b() {
        this.f37036z.invoke(new AddPasses.Action.LessClick(this.f37035A.e()));
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        b();
        return Unit.f40552a;
    }
}
