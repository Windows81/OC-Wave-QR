package com.hansecom.abt.data.useCases;

import com.hansecom.mapi.models.CappingPot;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;

@Metadata
public final class GetMostRelevantFareCappingFlowUseCase$invoke$lambda$3$lambda$2$$inlined$compareBy$1<T> implements Comparator {
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.d(((CappingPot) obj).d(), ((CappingPot) obj2).d());
    }
}
