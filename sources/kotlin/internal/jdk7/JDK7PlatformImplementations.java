package kotlin.internal.jdk7;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.internal.PlatformImplementations;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public class JDK7PlatformImplementations extends PlatformImplementations {

    @Metadata
    public static final class ReflectSdkVersion {

        /* renamed from: a  reason: collision with root package name */
        public static final ReflectSdkVersion f40755a = new ReflectSdkVersion();

        /* renamed from: b  reason: collision with root package name */
        public static final Integer f40756b;

        static {
            Integer num;
            Integer num2 = null;
            try {
                Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get((Object) null);
                if (obj instanceof Integer) {
                    num = (Integer) obj;
                    if (num != null && num.intValue() > 0) {
                        num2 = num;
                    }
                    f40756b = num2;
                }
            } catch (Throwable unused) {
            }
            num = null;
            num2 = num;
            f40756b = num2;
        }
    }

    private final boolean d(int i2) {
        Integer num = ReflectSdkVersion.f40756b;
        return num == null || num.intValue() >= i2;
    }

    public void a(Throwable th, Throwable th2) {
        Intrinsics.i(th, "cause");
        Intrinsics.i(th2, "exception");
        if (d(19)) {
            th.addSuppressed(th2);
        } else {
            super.a(th, th2);
        }
    }

    public List c(Throwable th) {
        Intrinsics.i(th, "exception");
        if (!d(19)) {
            return super.c(th);
        }
        Throwable[] suppressed = th.getSuppressed();
        Intrinsics.h(suppressed, "getSuppressed(...)");
        return ArraysKt.d(suppressed);
    }
}
