package kotlin.internal.jdk8;

import kotlin.Metadata;
import kotlin.internal.jdk7.JDK7PlatformImplementations;
import kotlin.random.Random;
import kotlin.random.jdk8.PlatformThreadLocalRandom;

@Metadata
public class JDK8PlatformImplementations extends JDK7PlatformImplementations {

    @Metadata
    public static final class ReflectSdkVersion {

        /* renamed from: a  reason: collision with root package name */
        public static final ReflectSdkVersion f40757a = new ReflectSdkVersion();

        /* renamed from: b  reason: collision with root package name */
        public static final Integer f40758b;

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
                    f40758b = num2;
                }
            } catch (Throwable unused) {
            }
            num = null;
            num2 = num;
            f40758b = num2;
        }
    }

    public Random b() {
        return d(34) ? new PlatformThreadLocalRandom() : super.b();
    }

    public final boolean d(int i2) {
        Integer num = ReflectSdkVersion.f40758b;
        return num == null || num.intValue() >= i2;
    }
}
