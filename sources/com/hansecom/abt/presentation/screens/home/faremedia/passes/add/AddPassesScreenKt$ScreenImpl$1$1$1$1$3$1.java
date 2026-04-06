package com.hansecom.abt.presentation.screens.home.faremedia.passes.add;

import com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPasses;
import com.hansecom.abt.ui.components.passCard.PassOfferCardState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata
public final class AddPassesScreenKt$ScreenImpl$1$1$1$1$3$1 implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PassOfferCardState f37039A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f37040z;

    public AddPassesScreenKt$ScreenImpl$1$1$1$1$3$1(Function1 function1, PassOfferCardState passOfferCardState) {
        this.f37040z = function1;
        this.f37039A = passOfferCardState;
    }

    public final void b() {
        this.f37040z.invoke(new AddPasses.Action.AddPassClick(this.f37039A.e(), Integer.valueOf(this.f37039A.d())));
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        b();
        return Unit.f40552a;
    }
}
