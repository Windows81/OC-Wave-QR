package androidx.compose.foundation.pager;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class DefaultPagerState extends PagerState {
    public static final Companion M = new Companion((DefaultConstructorMarker) null);
    public static final Saver N = ListSaverKt.b(DefaultPagerState$Companion$Saver$1.f5227z, DefaultPagerState$Companion$Saver$2.f5228z);
    public MutableState L;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver a() {
            return DefaultPagerState.N;
        }

        public Companion() {
        }
    }

    public DefaultPagerState(int i2, float f2, Function0 function0) {
        super(i2, f2);
        this.L = SnapshotStateKt__SnapshotStateKt.e(function0, (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    public int H() {
        return ((Number) ((Function0) this.L.getValue()).invoke()).intValue();
    }

    public final MutableState q0() {
        return this.L;
    }
}
