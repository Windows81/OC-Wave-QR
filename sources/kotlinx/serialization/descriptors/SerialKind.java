package kotlinx.serialization.descriptors;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.ExperimentalSerializationApi;

@Metadata
@ExperimentalSerializationApi
public abstract class SerialKind {

    @Metadata
    @ExperimentalSerializationApi
    public static final class CONTEXTUAL extends SerialKind {

        /* renamed from: a  reason: collision with root package name */
        public static final CONTEXTUAL f42056a = new CONTEXTUAL();

        public CONTEXTUAL() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata
    @ExperimentalSerializationApi
    public static final class ENUM extends SerialKind {

        /* renamed from: a  reason: collision with root package name */
        public static final ENUM f42057a = new ENUM();

        public ENUM() {
            super((DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ SerialKind(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        String e2 = Reflection.b(getClass()).e();
        Intrinsics.f(e2);
        return e2;
    }

    public SerialKind() {
    }
}
