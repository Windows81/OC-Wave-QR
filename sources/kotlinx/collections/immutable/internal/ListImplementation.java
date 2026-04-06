package kotlinx.collections.immutable.internal;

import kotlin.Metadata;

@Metadata
public final class ListImplementation {

    /* renamed from: a  reason: collision with root package name */
    public static final ListImplementation f41357a = new ListImplementation();

    public static final void a(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
        }
    }

    public static final void b(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
        }
    }

    public static final void c(int i2, int i3, int i4) {
        if (i2 < 0 || i3 > i4) {
            throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + i4);
        } else if (i2 > i3) {
            throw new IllegalArgumentException("fromIndex: " + i2 + " > toIndex: " + i3);
        }
    }
}
