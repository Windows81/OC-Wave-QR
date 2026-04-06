package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.IntIterator;

@Metadata
public final class IntProgressionIterator extends IntIterator {

    /* renamed from: A  reason: collision with root package name */
    public final int f40960A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f40961B;
    public int C;

    /* renamed from: z  reason: collision with root package name */
    public final int f40962z;

    public IntProgressionIterator(int i2, int i3, int i4) {
        this.f40962z = i4;
        this.f40960A = i3;
        boolean z2 = false;
        if (i4 <= 0 ? i2 >= i3 : i2 <= i3) {
            z2 = true;
        }
        this.f40961B = z2;
        this.C = !z2 ? i3 : i2;
    }

    public int b() {
        int i2 = this.C;
        if (i2 != this.f40960A) {
            this.C = this.f40962z + i2;
        } else if (this.f40961B) {
            this.f40961B = false;
        } else {
            throw new NoSuchElementException();
        }
        return i2;
    }

    public boolean hasNext() {
        return this.f40961B;
    }
}
