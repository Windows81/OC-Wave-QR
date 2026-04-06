package kotlinx.coroutines.internal;

import kotlin.Metadata;

@Metadata
final /* synthetic */ class SystemPropsKt__SystemPropsKt {

    /* renamed from: a  reason: collision with root package name */
    public static final int f41870a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f41870a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
