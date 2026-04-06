package com.hansecom.abt.data.useCases.configurations;

import com.hansecom.abt.data.config.featureConfig.FareCategoryColorConfig;
import com.hansecom.abt.util.ColorExt;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.ranges.RangesKt;

@Metadata
public final class GetFareCategoryColorsUseCaseKt {
    public static final Map b(List list) {
        Iterable<FareCategoryColorConfig> iterable = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.e(MapsKt.e(CollectionsKt.x(iterable, 10)), 16));
        for (FareCategoryColorConfig fareCategoryColorConfig : iterable) {
            Pair a2 = TuplesKt.a(Integer.valueOf(fareCategoryColorConfig.b()), ColorExt.f39002a.a(fareCategoryColorConfig.a()));
            linkedHashMap.put(a2.e(), a2.f());
        }
        return linkedHashMap;
    }
}
