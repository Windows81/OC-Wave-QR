package com.hansecom.abt.presentation.screens.home.faremedia.fareCapping;

import com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCapping;
import com.hansecom.abt.ui.components.fareCapping.FareCappingCardState;
import com.hansecom.mapi.models.CappingPot;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;

@Metadata
public final class FareCappingViewModel$1$1$1$1 implements Function1<FareCapping.State, FareCapping.State> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f36740z;

    public FareCappingViewModel$1$1$1$1(List list) {
        this.f36740z = list;
    }

    /* renamed from: b */
    public final FareCapping.State invoke(FareCapping.State state) {
        Intrinsics.i(state, "$this$update");
        Iterable<CappingPot> iterable = this.f36740z;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(iterable, 10));
        for (CappingPot b2 : iterable) {
            arrayList.add(FareCappingCardState.f38173u.b(b2));
        }
        return FareCapping.State.b(state, (String) null, ExtensionsKt.e(arrayList), false, false, 9, (Object) null);
    }
}
