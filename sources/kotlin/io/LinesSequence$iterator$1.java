package kotlin.io;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class LinesSequence$iterator$1 implements Iterator<String>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public boolean f40798A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ LinesSequence f40799B;

    /* renamed from: z  reason: collision with root package name */
    public String f40800z;

    public LinesSequence$iterator$1(LinesSequence linesSequence) {
        this.f40799B = linesSequence;
    }

    /* renamed from: b */
    public String next() {
        if (hasNext()) {
            String str = this.f40800z;
            this.f40800z = null;
            Intrinsics.f(str);
            return str;
        }
        throw new NoSuchElementException();
    }

    public boolean hasNext() {
        if (this.f40800z == null && !this.f40798A) {
            String readLine = this.f40799B.f40797a.readLine();
            this.f40800z = readLine;
            if (readLine == null) {
                this.f40798A = true;
            }
        }
        return this.f40800z != null;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
