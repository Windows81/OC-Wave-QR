package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;
import androidx.cursoradapter.widget.CursorFilter;

public abstract class CursorAdapter extends BaseAdapter implements Filterable, CursorFilter.CursorFilterClient {

    /* renamed from: A  reason: collision with root package name */
    public boolean f20473A;

    /* renamed from: B  reason: collision with root package name */
    public Cursor f20474B;
    public Context C;
    public int D;
    public ChangeObserver E;
    public DataSetObserver F;
    public CursorFilter G;
    public FilterQueryProvider H;

    /* renamed from: z  reason: collision with root package name */
    public boolean f20475z;

    public class ChangeObserver extends ContentObserver {
        public ChangeObserver() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z2) {
            CursorAdapter.this.i();
        }
    }

    public class MyDataSetObserver extends DataSetObserver {
        public MyDataSetObserver() {
        }

        public void onChanged() {
            CursorAdapter cursorAdapter = CursorAdapter.this;
            cursorAdapter.f20475z = true;
            cursorAdapter.notifyDataSetChanged();
        }

        public void onInvalidated() {
            CursorAdapter cursorAdapter = CursorAdapter.this;
            cursorAdapter.f20475z = false;
            cursorAdapter.notifyDataSetInvalidated();
        }
    }

    public CursorAdapter(Context context, Cursor cursor, boolean z2) {
        f(context, cursor, z2 ? 1 : 2);
    }

    public CharSequence a(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    public void b(Cursor cursor) {
        Cursor j2 = j(cursor);
        if (j2 != null) {
            j2.close();
        }
    }

    public Cursor c() {
        return this.f20474B;
    }

    public Cursor d(CharSequence charSequence) {
        FilterQueryProvider filterQueryProvider = this.H;
        return filterQueryProvider != null ? filterQueryProvider.runQuery(charSequence) : this.f20474B;
    }

    public abstract void e(View view, Context context, Cursor cursor);

    public void f(Context context, Cursor cursor, int i2) {
        boolean z2 = false;
        if ((i2 & 1) == 1) {
            i2 |= 2;
            this.f20473A = true;
        } else {
            this.f20473A = false;
        }
        if (cursor != null) {
            z2 = true;
        }
        this.f20474B = cursor;
        this.f20475z = z2;
        this.C = context;
        this.D = z2 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i2 & 2) == 2) {
            this.E = new ChangeObserver();
            this.F = new MyDataSetObserver();
        } else {
            this.E = null;
            this.F = null;
        }
        if (z2) {
            ChangeObserver changeObserver = this.E;
            if (changeObserver != null) {
                cursor.registerContentObserver(changeObserver);
            }
            DataSetObserver dataSetObserver = this.F;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return h(context, cursor, viewGroup);
    }

    public int getCount() {
        Cursor cursor;
        if (!this.f20475z || (cursor = this.f20474B) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f20475z) {
            return null;
        }
        this.f20474B.moveToPosition(i2);
        if (view == null) {
            view = g(this.C, this.f20474B, viewGroup);
        }
        e(view, this.C, this.f20474B);
        return view;
    }

    public Filter getFilter() {
        if (this.G == null) {
            this.G = new CursorFilter(this);
        }
        return this.G;
    }

    public Object getItem(int i2) {
        Cursor cursor;
        if (!this.f20475z || (cursor = this.f20474B) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.f20474B;
    }

    public long getItemId(int i2) {
        Cursor cursor;
        if (!this.f20475z || (cursor = this.f20474B) == null || !cursor.moveToPosition(i2)) {
            return 0;
        }
        return this.f20474B.getLong(this.D);
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f20475z) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f20474B.moveToPosition(i2)) {
            if (view == null) {
                view = h(this.C, this.f20474B, viewGroup);
            }
            e(view, this.C, this.f20474B);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i2);
        }
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    public boolean hasStableIds() {
        return true;
    }

    public void i() {
        Cursor cursor;
        if (this.f20473A && (cursor = this.f20474B) != null && !cursor.isClosed()) {
            this.f20475z = this.f20474B.requery();
        }
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.f20474B;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            ChangeObserver changeObserver = this.E;
            if (changeObserver != null) {
                cursor2.unregisterContentObserver(changeObserver);
            }
            DataSetObserver dataSetObserver = this.F;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f20474B = cursor;
        if (cursor != null) {
            ChangeObserver changeObserver2 = this.E;
            if (changeObserver2 != null) {
                cursor.registerContentObserver(changeObserver2);
            }
            DataSetObserver dataSetObserver2 = this.F;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.D = cursor.getColumnIndexOrThrow("_id");
            this.f20475z = true;
            notifyDataSetChanged();
        } else {
            this.D = -1;
            this.f20475z = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
