package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

@Metadata
public final class CoroutineLiveDataKt {
    public static final Object a(MediatorLiveData mediatorLiveData, LiveData liveData, Continuation continuation) {
        return BuildersKt.g(Dispatchers.c().H0(), new CoroutineLiveDataKt$addDisposableSource$2(mediatorLiveData, liveData, (Continuation) null), continuation);
    }
}
