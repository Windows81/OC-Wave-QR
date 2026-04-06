package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@Metadata
final class CacheEntry<T> {

    /* renamed from: a  reason: collision with root package name */
    public final KSerializer f42080a;

    public CacheEntry(KSerializer kSerializer) {
        this.f42080a = kSerializer;
    }
}
