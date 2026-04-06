package kotlinx.serialization.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;

@Metadata
public final class PairSerializer<K, V> extends KeyValueSerializer<K, V, Pair<? extends K, ? extends V>> {

    /* renamed from: c  reason: collision with root package name */
    public final SerialDescriptor f42166c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PairSerializer(KSerializer kSerializer, KSerializer kSerializer2) {
        super(kSerializer, kSerializer2, (DefaultConstructorMarker) null);
        Intrinsics.i(kSerializer, "keySerializer");
        Intrinsics.i(kSerializer2, "valueSerializer");
        this.f42166c = SerialDescriptorsKt.d("kotlin.Pair", new SerialDescriptor[0], new g(kSerializer, kSerializer2));
    }

    /* access modifiers changed from: private */
    public static final Unit l(KSerializer kSerializer, KSerializer kSerializer2, ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        Intrinsics.i(classSerialDescriptorBuilder, "$this$buildClassSerialDescriptor");
        ClassSerialDescriptorBuilder classSerialDescriptorBuilder2 = classSerialDescriptorBuilder;
        ClassSerialDescriptorBuilder.b(classSerialDescriptorBuilder2, "first", kSerializer.a(), (List) null, false, 12, (Object) null);
        ClassSerialDescriptorBuilder.b(classSerialDescriptorBuilder2, "second", kSerializer2.a(), (List) null, false, 12, (Object) null);
        return Unit.f40552a;
    }

    public SerialDescriptor a() {
        return this.f42166c;
    }

    /* renamed from: m */
    public Object f(Pair pair) {
        Intrinsics.i(pair, "<this>");
        return pair.e();
    }

    /* renamed from: n */
    public Object h(Pair pair) {
        Intrinsics.i(pair, "<this>");
        return pair.f();
    }

    /* renamed from: o */
    public Pair j(Object obj, Object obj2) {
        return TuplesKt.a(obj, obj2);
    }
}
