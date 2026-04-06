package com.hansecom.abt.data.repositories.base;

import com.hansecom.abt.data.preferences.base.BaseLocalDataProvider;
import com.hansecom.abt.data.preferences.base.CacheValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class MultipleValueRepository$createNewParameterRepository$1$localBaseRepository$1 extends BaseLocalDataProvider<T> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MultipleValueRepository f33595a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f33596b;

    public MultipleValueRepository$createNewParameterRepository$1$localBaseRepository$1(MultipleValueRepository multipleValueRepository, Object obj) {
        this.f33595a = multipleValueRepository;
        this.f33596b = obj;
    }

    public Flow d() {
        return this.f33595a.k().o(this.f33596b);
    }

    public Object j(CacheValue cacheValue, Continuation continuation) {
        Object t2 = this.f33595a.k().t(this.f33596b, cacheValue, continuation);
        return t2 == IntrinsicsKt.f() ? t2 : Unit.f40552a;
    }
}
