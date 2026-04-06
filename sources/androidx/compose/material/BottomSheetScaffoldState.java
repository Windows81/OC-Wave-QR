package androidx.compose.material;

import kotlin.Metadata;

@Metadata
public final class BottomSheetScaffoldState {

    /* renamed from: a  reason: collision with root package name */
    public final BottomSheetState f7408a;

    /* renamed from: b  reason: collision with root package name */
    public final SnackbarHostState f7409b;

    public BottomSheetScaffoldState(BottomSheetState bottomSheetState, SnackbarHostState snackbarHostState) {
        this.f7408a = bottomSheetState;
        this.f7409b = snackbarHostState;
    }

    public final BottomSheetState a() {
        return this.f7408a;
    }

    public final SnackbarHostState b() {
        return this.f7409b;
    }
}
