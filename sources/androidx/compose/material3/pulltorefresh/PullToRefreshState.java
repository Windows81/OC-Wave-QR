package androidx.compose.material3.pulltorefresh;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
public interface PullToRefreshState {
    Object a(Continuation continuation);

    float b();

    boolean c();

    Object d(float f2, Continuation continuation);

    Object e(Continuation continuation);
}
