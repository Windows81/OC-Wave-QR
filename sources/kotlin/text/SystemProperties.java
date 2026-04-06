package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class SystemProperties {

    /* renamed from: a  reason: collision with root package name */
    public static final SystemProperties f41189a = new SystemProperties();

    /* renamed from: b  reason: collision with root package name */
    public static final String f41190b;

    static {
        String property = System.getProperty("line.separator");
        Intrinsics.f(property);
        f41190b = property;
    }
}
