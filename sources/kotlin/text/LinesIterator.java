package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
final class LinesIterator implements Iterator<String>, KMappedMarker {
    public static final State E = new State((DefaultConstructorMarker) null);

    /* renamed from: A  reason: collision with root package name */
    public int f41163A;

    /* renamed from: B  reason: collision with root package name */
    public int f41164B;
    public int C;
    public int D;

    /* renamed from: z  reason: collision with root package name */
    public final CharSequence f41165z;

    @Metadata
    public static final class State {
        public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public State() {
        }
    }

    public LinesIterator(CharSequence charSequence) {
        Intrinsics.i(charSequence, "string");
        this.f41165z = charSequence;
    }

    /* renamed from: b */
    public String next() {
        if (hasNext()) {
            this.f41163A = 0;
            int i2 = this.C;
            int i3 = this.f41164B;
            this.f41164B = this.D + i2;
            return this.f41165z.subSequence(i3, i2).toString();
        }
        throw new NoSuchElementException();
    }

    public boolean hasNext() {
        int i2;
        int i3 = this.f41163A;
        if (i3 != 0) {
            return i3 == 1;
        }
        int i4 = 2;
        if (this.D < 0) {
            this.f41163A = 2;
            return false;
        }
        int length = this.f41165z.length();
        int i5 = this.f41164B;
        int length2 = this.f41165z.length();
        while (true) {
            if (i5 >= length2) {
                i4 = -1;
                break;
            }
            char charAt = this.f41165z.charAt(i5);
            if (charAt != 10 && charAt != 13) {
                i5++;
            } else if (!(charAt == 13 && (i2 = i5 + 1) < this.f41165z.length() && this.f41165z.charAt(i2) == 10)) {
                i4 = 1;
            }
        }
        i4 = 1;
        length = i5;
        this.f41163A = 1;
        this.D = i4;
        this.C = length;
        return true;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
