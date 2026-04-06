package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class ReaderKind {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f15251b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final int f15252a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public static int a(int i2) {
        return i2;
    }

    public static boolean b(int i2, Object obj) {
        return (obj instanceof ReaderKind) && i2 == ((ReaderKind) obj).e();
    }

    public static int c(int i2) {
        return Integer.hashCode(i2);
    }

    public static String d(int i2) {
        return "ReaderKind(mask=" + i2 + ')';
    }

    public final /* synthetic */ int e() {
        return this.f15252a;
    }

    public boolean equals(Object obj) {
        return b(this.f15252a, obj);
    }

    public int hashCode() {
        return c(this.f15252a);
    }

    public String toString() {
        return d(this.f15252a);
    }
}
