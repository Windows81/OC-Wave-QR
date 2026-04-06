package androidx.compose.material;

import kotlin.Metadata;

@Metadata
public final class ScaffoldState {

    /* renamed from: a  reason: collision with root package name */
    public final DrawerState f8292a;

    /* renamed from: b  reason: collision with root package name */
    public final SnackbarHostState f8293b;

    public ScaffoldState(DrawerState drawerState, SnackbarHostState snackbarHostState) {
        this.f8292a = drawerState;
        this.f8293b = snackbarHostState;
    }

    public final DrawerState a() {
        return this.f8292a;
    }

    public final SnackbarHostState b() {
        return this.f8293b;
    }
}
