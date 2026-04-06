package com.google.common.collect;

import com.google.common.base.Predicate;
import java.util.Collection;
import java.util.Map;

public final /* synthetic */ class a implements Predicate {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Predicate f28682z;

    public /* synthetic */ a(Predicate predicate) {
        this.f28682z = predicate;
    }

    public final boolean apply(Object obj) {
        return this.f28682z.apply(Multisets.g(((Map.Entry) obj).getKey(), ((Collection) ((Map.Entry) obj).getValue()).size()));
    }
}
