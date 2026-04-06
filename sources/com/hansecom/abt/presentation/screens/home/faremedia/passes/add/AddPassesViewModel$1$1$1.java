package com.hansecom.abt.presentation.screens.home.faremedia.passes.add;

import com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPasses;
import com.hansecom.abt.ui.components.passCard.PassOfferCardStateKt;
import com.hansecom.mapi.models.FareProductOffer;
import com.hansecom.mapi.models.GroupConstraints;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;

@Metadata
public final class AddPassesViewModel$1$1$1 implements Function1<AddPasses.State, AddPasses.State> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f37048z;

    public AddPassesViewModel$1$1$1(List list) {
        this.f37048z = list;
    }

    /* renamed from: b */
    public final AddPasses.State invoke(AddPasses.State state) {
        Intrinsics.i(state, "$this$update");
        Iterable<FareProductOffer> iterable = this.f37048z;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(iterable, 10));
        for (FareProductOffer fareProductOffer : iterable) {
            GroupConstraints b2 = fareProductOffer.b();
            arrayList.add(PassOfferCardStateKt.a(fareProductOffer, b2 != null ? b2.b() : null));
        }
        return state.a(false, ExtensionsKt.e(arrayList));
    }
}
