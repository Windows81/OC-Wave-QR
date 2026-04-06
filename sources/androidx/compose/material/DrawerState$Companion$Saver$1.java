package androidx.compose.material;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DrawerState$Companion$Saver$1 extends Lambda implements Function2<SaverScope, DrawerState, DrawerValue> {

    /* renamed from: z  reason: collision with root package name */
    public static final DrawerState$Companion$Saver$1 f7788z = new DrawerState$Companion$Saver$1();

    public DrawerState$Companion$Saver$1() {
        super(2);
    }

    /* renamed from: b */
    public final DrawerValue m(SaverScope saverScope, DrawerState drawerState) {
        return drawerState.d();
    }
}
