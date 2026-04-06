package com.hansecom.abt.data.useCases;

import com.hansecom.mapi.models.CappingPot;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;

@Metadata
public final class GetMostRelevantFareCappingFlowUseCase$invoke$lambda$3$lambda$2$$inlined$thenByDescending$1<T> implements Comparator {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Comparator f33737z;

    public GetMostRelevantFareCappingFlowUseCase$invoke$lambda$3$lambda$2$$inlined$thenByDescending$1(Comparator comparator) {
        this.f33737z = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        int compare = this.f33737z.compare(obj, obj2);
        return compare != 0 ? compare : ComparisonsKt.d(((CappingPot) obj2).a(), ((CappingPot) obj).a());
    }
}
