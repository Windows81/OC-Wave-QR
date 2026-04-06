package com.hansecom.abt.data.repositories.base;

import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;
import timber.log.Timber;

@Metadata
public final class BaseRepository$special$$inlined$CoroutineExceptionHandler$1 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ BaseRepository f33585A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseRepository$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key key, BaseRepository baseRepository) {
        super(key);
        this.f33585A = baseRepository;
    }

    public void m0(CoroutineContext coroutineContext, Throwable th) {
        Timber.Forest forest = Timber.f44337a;
        String v2 = this.f33585A.v();
        forest.d(th, v2 + " Caught exception while fetching in the background", new Object[0]);
    }
}
