package androidx.compose.runtime;

import androidx.compose.runtime.internal.PersistentCompositionLocalMapKt;
import kotlin.Metadata;

@Metadata
public interface CompositionLocalMap {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f14628a = Companion.f14629a;

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f14629a = new Companion();

        /* renamed from: b  reason: collision with root package name */
        public static final CompositionLocalMap f14630b = PersistentCompositionLocalMapKt.a();

        public final CompositionLocalMap a() {
            return f14630b;
        }
    }

    Object a(CompositionLocal compositionLocal);
}
