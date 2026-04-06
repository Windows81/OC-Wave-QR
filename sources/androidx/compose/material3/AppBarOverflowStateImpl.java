package androidx.compose.material3;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class AppBarOverflowStateImpl implements AppBarOverflowState {

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f9203c = new Companion((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final Saver f9204d = SaverKt.e(new A(), new B());

    /* renamed from: a  reason: collision with root package name */
    public final MutableIntState f9205a = SnapshotIntStateKt.a(0);

    /* renamed from: b  reason: collision with root package name */
    public final MutableIntState f9206b = SnapshotIntStateKt.a(0);

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public static final List g(SaverScope saverScope, AppBarOverflowStateImpl appBarOverflowStateImpl) {
        return CollectionsKt.p(Integer.valueOf(appBarOverflowStateImpl.a()), Integer.valueOf(appBarOverflowStateImpl.c()));
    }

    public static final AppBarOverflowStateImpl h(List list) {
        AppBarOverflowStateImpl appBarOverflowStateImpl = new AppBarOverflowStateImpl();
        appBarOverflowStateImpl.b(((Number) list.get(0)).intValue());
        appBarOverflowStateImpl.d(((Number) list.get(1)).intValue());
        return appBarOverflowStateImpl;
    }

    public int a() {
        return this.f9205a.e();
    }

    public void b(int i2) {
        this.f9205a.k(i2);
    }

    public int c() {
        return this.f9206b.e();
    }

    public void d(int i2) {
        this.f9206b.k(i2);
    }
}
