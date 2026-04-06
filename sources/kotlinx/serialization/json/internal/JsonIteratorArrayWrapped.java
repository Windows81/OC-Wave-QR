package kotlinx.serialization.json.internal;

import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.internal.StreamingJsonDecoder;

@Metadata
final class JsonIteratorArrayWrapped<T> implements Iterator<T>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public final ReaderJsonLexer f42385A;

    /* renamed from: B  reason: collision with root package name */
    public final DeserializationStrategy f42386B;
    public boolean C;
    public boolean D;

    /* renamed from: z  reason: collision with root package name */
    public final Json f42387z;

    public boolean hasNext() {
        if (this.D) {
            return false;
        }
        if (this.f42385A.H() == 9) {
            this.D = true;
            this.f42385A.k((byte) 9);
            if (this.f42385A.E()) {
                if (this.f42385A.H() != 8) {
                    this.f42385A.v();
                } else {
                    AbstractJsonLexer.x(this.f42385A, "There is a start of the new array after the one parsed to sequence. ARRAY_WRAPPED mode doesn't merge consecutive arrays.\nIf you need to parse a stream of arrays, please use WHITESPACE_SEPARATED mode instead.", 0, (String) null, 6, (Object) null);
                    throw new KotlinNothingValueException();
                }
            }
            return false;
        } else if (this.f42385A.E() || this.D) {
            return true;
        } else {
            AbstractJsonLexer.z(this.f42385A, (byte) 9, false, 2, (Object) null);
            throw new KotlinNothingValueException();
        }
    }

    public Object next() {
        if (this.C) {
            this.C = false;
        } else {
            this.f42385A.l(',');
        }
        return new StreamingJsonDecoder(this.f42387z, WriteMode.OBJ, this.f42385A, this.f42386B.a(), (StreamingJsonDecoder.DiscriminatorHolder) null).C(this.f42386B);
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
