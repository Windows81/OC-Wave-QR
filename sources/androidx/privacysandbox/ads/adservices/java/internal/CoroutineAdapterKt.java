package androidx.privacysandbox.ads.adservices.java.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Deferred;

@Metadata
public final class CoroutineAdapterKt {
    public static final ListenableFuture b(Deferred deferred, Object obj) {
        Intrinsics.i(deferred, "<this>");
        ListenableFuture a2 = CallbackToFutureAdapter.a(new a(deferred, obj));
        Intrinsics.h(a2, "getFuture { completer ->…        }\n    }\n    tag\n}");
        return a2;
    }

    public static /* synthetic */ ListenableFuture c(Deferred deferred, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return b(deferred, obj);
    }

    public static final Object d(Deferred deferred, Object obj, CallbackToFutureAdapter.Completer completer) {
        Intrinsics.i(deferred, "$this_asListenableFuture");
        Intrinsics.i(completer, "completer");
        deferred.S(new CoroutineAdapterKt$asListenableFuture$1$1(completer, deferred));
        return obj;
    }
}
