package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmInline;

@Metadata
@JvmInline
public final class CursorAndWedgeAffinity {

    /* renamed from: a  reason: collision with root package name */
    public final long f6434a;

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6435a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.foundation.text.input.internal.WedgeAffinity[] r0 = androidx.compose.foundation.text.input.internal.WedgeAffinity.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.foundation.text.input.internal.WedgeAffinity r1 = androidx.compose.foundation.text.input.internal.WedgeAffinity.Start     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.foundation.text.input.internal.WedgeAffinity r1 = androidx.compose.foundation.text.input.internal.WedgeAffinity.End     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f6435a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity.WhenMappings.<clinit>():void");
        }
    }

    public static final int a(long j2) {
        return g(j2);
    }

    public static final WedgeAffinity b(long j2) {
        return h(j2);
    }

    public static long c(int i2) {
        return e((((long) i2) << 32) | (((long) -1) & 4294967295L));
    }

    public static long d(int i2, WedgeAffinity wedgeAffinity) {
        int i3 = -1;
        int i4 = wedgeAffinity == null ? -1 : WhenMappings.f6435a[wedgeAffinity.ordinal()];
        if (i4 != -1) {
            i3 = 1;
            if (i4 == 1) {
                i3 = 0;
            } else if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return e((((long) i2) << 32) | (((long) i3) & 4294967295L));
    }

    public static long e(long j2) {
        return j2;
    }

    public static boolean f(long j2, Object obj) {
        return (obj instanceof CursorAndWedgeAffinity) && j2 == ((CursorAndWedgeAffinity) obj).k();
    }

    public static final int g(long j2) {
        return (int) (j2 >> 32);
    }

    public static final WedgeAffinity h(long j2) {
        int i2 = (int) (j2 & 4294967295L);
        if (i2 < 0) {
            return null;
        }
        return i2 == 0 ? WedgeAffinity.Start : WedgeAffinity.End;
    }

    public static int i(long j2) {
        return Long.hashCode(j2);
    }

    public static String j(long j2) {
        return "CursorAndWedgeAffinity(value=" + j2 + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f6434a, obj);
    }

    public int hashCode() {
        return i(this.f6434a);
    }

    public final /* synthetic */ long k() {
        return this.f6434a;
    }

    public String toString() {
        return j(this.f6434a);
    }
}
