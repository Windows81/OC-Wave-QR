package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ContextMenuState {

    /* renamed from: a  reason: collision with root package name */
    public final MutableState f3267a;

    @Metadata
    public static abstract class Status {

        @Metadata
        public static final class Closed extends Status {

            /* renamed from: a  reason: collision with root package name */
            public static final Closed f3268a = new Closed();

            public Closed() {
                super((DefaultConstructorMarker) null);
            }

            public String toString() {
                return "Closed";
            }
        }

        @Metadata
        public static final class Open extends Status {

            /* renamed from: a  reason: collision with root package name */
            public final long f3269a;

            public /* synthetic */ Open(long j2, DefaultConstructorMarker defaultConstructorMarker) {
                this(j2);
            }

            public final long a() {
                return this.f3269a;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Open)) {
                    return false;
                }
                return Offset.j(this.f3269a, ((Open) obj).f3269a);
            }

            public int hashCode() {
                return Offset.o(this.f3269a);
            }

            public String toString() {
                return "Open(offset=" + Offset.s(this.f3269a) + ')';
            }

            public Open(long j2) {
                super((DefaultConstructorMarker) null);
                this.f3269a = j2;
                if (!((j2 & 9223372034707292159L) != 9205357640488583168L)) {
                    InlineClassHelperKt.c("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
                }
            }
        }

        public /* synthetic */ Status(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Status() {
        }
    }

    public ContextMenuState(Status status) {
        this.f3267a = SnapshotStateKt__SnapshotStateKt.e(status, (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    public final Status a() {
        return (Status) this.f3267a.getValue();
    }

    public final void b(Status status) {
        this.f3267a.setValue(status);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ContextMenuState)) {
            return false;
        }
        return Intrinsics.d(((ContextMenuState) obj).a(), a());
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return "ContextMenuState(status=" + a() + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContextMenuState(Status status, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Status.Closed.f3268a : status);
    }
}
