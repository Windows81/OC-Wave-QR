package coil.decode;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class ExifData {

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f23366c = new Companion((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final ExifData f23367d = new ExifData(false, 0);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f23368a;

    /* renamed from: b  reason: collision with root package name */
    public final int f23369b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public ExifData(boolean z2, int i2) {
        this.f23368a = z2;
        this.f23369b = i2;
    }

    public final int a() {
        return this.f23369b;
    }

    public final boolean b() {
        return this.f23368a;
    }
}
