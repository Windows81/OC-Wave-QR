package retrofit2;

import java.util.concurrent.Executor;
import retrofit2.BuiltInFactories;
import retrofit2.Reflection;

final class Platform {

    /* renamed from: a  reason: collision with root package name */
    public static final Executor f44219a;

    /* renamed from: b  reason: collision with root package name */
    public static final Reflection f44220b;

    /* renamed from: c  reason: collision with root package name */
    public static final BuiltInFactories f44221c;

    static {
        String property = System.getProperty("java.vm.name");
        property.hashCode();
        if (property.equals("RoboVM")) {
            f44219a = null;
            f44220b = new Reflection();
            f44221c = new BuiltInFactories();
        } else if (!property.equals("Dalvik")) {
            f44219a = null;
            f44220b = new Reflection.Java8();
            f44221c = new BuiltInFactories.Java8();
        } else {
            f44219a = new AndroidMainExecutor();
            f44220b = new Reflection.Android24();
            f44221c = new BuiltInFactories.Java8();
        }
    }
}
