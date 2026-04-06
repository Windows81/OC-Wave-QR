package kotlinx.serialization.descriptors;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.ExperimentalSerializationApi;

@Metadata
@ExperimentalSerializationApi
public abstract class PolymorphicKind extends SerialKind {

    @Metadata
    public static final class OPEN extends PolymorphicKind {

        /* renamed from: a  reason: collision with root package name */
        public static final OPEN f42027a = new OPEN();

        public OPEN() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata
    public static final class SEALED extends PolymorphicKind {

        /* renamed from: a  reason: collision with root package name */
        public static final SEALED f42028a = new SEALED();

        public SEALED() {
            super((DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ PolymorphicKind(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public PolymorphicKind() {
        super((DefaultConstructorMarker) null);
    }
}
