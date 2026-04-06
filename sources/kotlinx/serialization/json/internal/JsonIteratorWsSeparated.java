package kotlinx.serialization.json.internal;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.internal.StreamingJsonDecoder;

@Metadata
final class JsonIteratorWsSeparated<T> implements Iterator<T>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public final ReaderJsonLexer f42389A;

    /* renamed from: B  reason: collision with root package name */
    public final DeserializationStrategy f42390B;

    /* renamed from: z  reason: collision with root package name */
    public final Json f42391z;

    public boolean hasNext() {
        return this.f42389A.E();
    }

    public Object next() {
        return new StreamingJsonDecoder(this.f42391z, WriteMode.OBJ, this.f42389A, this.f42390B.a(), (StreamingJsonDecoder.DiscriminatorHolder) null).C(this.f42390B);
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
