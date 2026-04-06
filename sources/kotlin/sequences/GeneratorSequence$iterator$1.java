package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class GeneratorSequence$iterator$1 implements Iterator<T>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public int f41037A = -2;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ GeneratorSequence f41038B;

    /* renamed from: z  reason: collision with root package name */
    public Object f41039z;

    public GeneratorSequence$iterator$1(GeneratorSequence generatorSequence) {
        this.f41038B = generatorSequence;
    }

    private final void b() {
        Object obj;
        if (this.f41037A == -2) {
            obj = this.f41038B.f41035a.invoke();
        } else {
            Function1 c2 = this.f41038B.f41036b;
            Object obj2 = this.f41039z;
            Intrinsics.f(obj2);
            obj = c2.invoke(obj2);
        }
        this.f41039z = obj;
        this.f41037A = obj == null ? 0 : 1;
    }

    public boolean hasNext() {
        if (this.f41037A < 0) {
            b();
        }
        return this.f41037A == 1;
    }

    public Object next() {
        if (this.f41037A < 0) {
            b();
        }
        if (this.f41037A != 0) {
            Object obj = this.f41039z;
            Intrinsics.g(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f41037A = -1;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
