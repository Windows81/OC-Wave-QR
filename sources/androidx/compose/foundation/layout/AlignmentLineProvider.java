package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class AlignmentLineProvider {

    @Metadata
    public static final class Block extends AlignmentLineProvider {

        /* renamed from: a  reason: collision with root package name */
        public final Function1 f3729a;

        public Block(Function1 function1) {
            super((DefaultConstructorMarker) null);
            this.f3729a = function1;
        }

        public int a(Placeable placeable) {
            return ((Number) this.f3729a.invoke(placeable)).intValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Block) && Intrinsics.d(this.f3729a, ((Block) obj).f3729a);
        }

        public int hashCode() {
            return this.f3729a.hashCode();
        }

        public String toString() {
            return "Block(lineProviderBlock=" + this.f3729a + ')';
        }
    }

    @Metadata
    public static final class Value extends AlignmentLineProvider {

        /* renamed from: a  reason: collision with root package name */
        public final AlignmentLine f3730a;

        public Value(AlignmentLine alignmentLine) {
            super((DefaultConstructorMarker) null);
            this.f3730a = alignmentLine;
        }

        public int a(Placeable placeable) {
            return placeable.f0(this.f3730a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Value) && Intrinsics.d(this.f3730a, ((Value) obj).f3730a);
        }

        public int hashCode() {
            return this.f3730a.hashCode();
        }

        public String toString() {
            return "Value(alignmentLine=" + this.f3730a + ')';
        }
    }

    public /* synthetic */ AlignmentLineProvider(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int a(Placeable placeable);

    public AlignmentLineProvider() {
    }
}
