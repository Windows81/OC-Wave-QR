package com.google.android.gms.common.sqlite;

import android.database.AbstractWindowedCursor;
import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;

public class CursorWrapper extends android.database.CursorWrapper implements CrossProcessCursor {

    /* renamed from: z  reason: collision with root package name */
    public AbstractWindowedCursor f25102z;

    public void fillWindow(int i2, CursorWindow cursorWindow) {
        this.f25102z.fillWindow(i2, cursorWindow);
    }

    public CursorWindow getWindow() {
        return this.f25102z.getWindow();
    }

    public final /* synthetic */ Cursor getWrappedCursor() {
        return this.f25102z;
    }

    public final boolean onMove(int i2, int i3) {
        return this.f25102z.onMove(i2, i3);
    }
}
