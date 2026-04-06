package androidx.compose.material;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BackdropScaffoldState$Companion$Saver$1 extends Lambda implements Function2<SaverScope, BackdropScaffoldState, BackdropValue> {

    /* renamed from: z  reason: collision with root package name */
    public static final BackdropScaffoldState$Companion$Saver$1 f7271z = new BackdropScaffoldState$Companion$Saver$1();

    public BackdropScaffoldState$Companion$Saver$1() {
        super(2);
    }

    /* renamed from: b */
    public final BackdropValue m(SaverScope saverScope, BackdropScaffoldState backdropScaffoldState) {
        return (BackdropValue) backdropScaffoldState.c().s();
    }
}
